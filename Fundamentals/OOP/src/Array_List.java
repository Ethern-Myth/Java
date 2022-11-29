import java.util.*;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Employee> staff = new ArrayList<>();
        staff.add(new Employee("John", 1000000));
        staff.add(new Employee("Dave", 1200000));
        staff.add(new Employee("Paul", 100000));
        staff.add(new Employee("Doe", 1045000));

        for (Employee e : staff) {
            System.out.println(e.toString());
        }
    }
}
