public class file2 {
    public static void main(String[] args) {
        System.out.println("BOUNDARY VALUE ANALYSIS: AGE VALIDATION\n");
        checkAge(17);
        checkAge(18);
        checkAge(30);
        checkAge(60);
        checkAge(61);
    }

    public static void checkAge(int age) {
        if (age >= 18 && age <= 60) {
            System.out.println("Valid age: " + age);
        } else {
            System.out.println("Invalid age: " + age);
        }
    }
}
