public class Inheritance {
    public static void main(String[] args) {
        Employee manager = new Employee("John", 35480.00);
        manager = new Manager("David", 500000);
        manager = new Employee("Graig", 2158116);
        manager = new Manager("Doe", 500000);
        manager.setBonus(58787);
        System.out.println(manager.toString());
    }
}
