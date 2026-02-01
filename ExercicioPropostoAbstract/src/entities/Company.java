package entities;

public class Company extends TaxPayer{

    private Integer numberOfEmployees;

    public Company(){
        super();
    }

    public Company(String name, Double anualIncome, Integer numberOfEmployee) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployee;
    }

    public Integer getNumberOfEmployee() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployee(Integer numberOfEmployee) {
        this.numberOfEmployees = numberOfEmployee;
    }

    @Override
    public double tax() {
        double taxValue = 0.0;
        if(numberOfEmployees <= 10) {
            taxValue = getAnualIncome() * 0.16;
        } else {
            taxValue = getAnualIncome() * 0.14;
        }
        return taxValue;
    }
}
