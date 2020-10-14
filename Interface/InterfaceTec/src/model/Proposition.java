package model;

public class Proposition implements IOperation {

    private Boolean value;

    public Proposition(Boolean v) {
        this.value = v;
    }

    public void setValue(Boolean v) {
        this.value = v;
    }

    @Override
    public Boolean value() {
        return this.value;
    }
}
