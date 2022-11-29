import java.text.NumberFormat;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: " + name + " Is paid: " + Format();

    }

    public String Format() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return formatter.format(salary);
    }

    public void setBonus(double bonus) {
        // Does nothing
    }
}
