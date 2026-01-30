package entities;

public class Person {
    private String name;
    private int yearsOld;

    public Person(String name, int yearsOld) {
        this.name = name;
        this.yearsOld = yearsOld;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }
}
