package entities;

public class OutsourcedEmployee extends Employee {
    private double additionalCharge;

    public OutsourcedEmployee(){
        super();
    }
    public OutsourcedEmployee(Integer id, String name, Integer hour, Double valuePerHour, double additionalCharge) {
        super(id, name, hour, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
    @Override
    public final Double payment(){
        return super.payment() + additionalCharge * 1.1;
    }
}
