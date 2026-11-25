public class Main4 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();

        if (first.equals(second)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        scanner.close();
    }
}
