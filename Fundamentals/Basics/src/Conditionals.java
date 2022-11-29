public class Conditionals {
    public static void main(String[] args) {
        WHILE_WITH_LABEL();
    }

    public static void IF() {
        System.out.print("This is an If loop");
        String name = "John";
        if (name == "John") {
            System.out.println(name);
        }
    }

    public static void WHILE() {
        System.out.print("This is a while loop");
        int num = 10;
        while (num != 10) {
            System.out.println(num);
        }
    }

    public static void DOWHILE() {
        System.out.print("This is a Do while loop");
        int num = 1;
        do {
            System.out.println(num);
            num++;
        } while (num != 10);
    }

    public static void FOR() {
        System.out.print("This is For loop");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void CASE() {
        System.out.print("This a Case conditional");
        String name = "Hello";
        switch (name) {
            case "Hello":
                System.out.println("Hello was the text");
                break;
            default:
                System.out.println("Nothing was found");
                break;
        }
    }

    public static void WHILE_WITH_LABEL() {
        System.out.print("This is while with label");
        int num = 1;

        loop: while (num != 5) {
            if (num == 3) {
                break loop;
            }
            System.out.println(num);
            num++;
        }
    }
}
