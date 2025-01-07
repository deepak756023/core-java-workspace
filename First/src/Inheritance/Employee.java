package Inheritance;

public class Employee {
    private int baseSalary;
    private int hourlyRates;
    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRates * extraHours);
    }
    public Employee(int baseSalary, int hourlyRates){
        setBaseSalary(baseSalary);
        setHourlyRates(hourlyRates);
    }
    public void setBaseSalary(int baseSalary){
        if(baseSalary <= 0)
            throw new IllegalArgumentException("Enter baseSalary correctly");
        this.baseSalary = baseSalary;
    }
    private int getBaseSalary(){
        return baseSalary;
    }
    public void setHourlyRates(int hourlyRates){
        if(hourlyRates <= 0)
            throw new IllegalArgumentException("Wrong inputs in hourlyRates");
        this.hourlyRates = hourlyRates;
    }
    private int getHourlyRates(){
        return hourlyRates;
    }
}
