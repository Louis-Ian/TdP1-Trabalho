package model;

public class Not implements IOperation {
    private IOperation p1;

    public Boolean value(){
        return !this.p1.value();
    }
}
