import com.hosting.corejava.*;

public class Classes {
    public static void main(String[] args) {
        Employee emp = new Employee("John", 150000.50);
        System.out.println(emp.toString());
        Person person = new Person("John");
        System.out.println(person.toString());

    }
}
