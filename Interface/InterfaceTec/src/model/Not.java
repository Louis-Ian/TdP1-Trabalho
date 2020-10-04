package model;

public class Not implements IOperation {
    private IOperation p1;

    public Not(IOperation p){
        this.p1 = p;
    }

    public Boolean value(){
        return !this.p1.value();
    }
}
