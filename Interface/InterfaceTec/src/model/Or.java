package model;

public class Or implements IOperation {

    private IOperation p1, p2;

    public Or(IOperation p1, IOperation p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public Boolean value() {
        return this.p1.value() || this.p2.value();
    }

}
