package entities;

public class Employee {
    private Integer id;
    private String name;
    private Integer hour;
    private Double valuePerHour;

    public Employee(){
    }
    public Employee(Integer id, String name,Integer hour, Double valuePerHour){
        this.id = id;
        this.name = name;
        this.hour = hour;
        this.valuePerHour = valuePerHour;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

   public Double payment(){
        return hour * valuePerHour;
   }
   @Override
   public String toString(){
       return getName()+ " - " + String.format("%.2f", payment());
   }
}
