import java.text.NumberFormat;

public class Manager extends Employee {
    private String name;
    private double bonus;

    public Manager(String name, double salary) {
        super(name, salary);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Manager name is: " + name + " Is paid: " + super.Format() + " and receives bonus of: " + this.Format();
    }

    @Override
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String Format() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return formatter.format(bonus);
    }
}
