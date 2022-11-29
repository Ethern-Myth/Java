
public class Enums {
    public static void main(String[] args) {
        Size s = Enum.valueOf(Size.class, "SMALL");
        System.out.println(s.abbreviation);
    }

    public enum Size {
        SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

        private String abbreviation;

        private Size(String abbreviation) {
            this.abbreviation = abbreviation;
        }

        public String getAbbreviation() {
            return abbreviation;
        }
    }
}
