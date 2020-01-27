import java.util.Scanner;

public class TryToCode {

    public static void main(String[] args) {

        boolean login = false;
        String logged = "Not Login";
        String username = "Greg";
        String password = "gr";

        Scanner scanner = new Scanner(System.in);
        username = scanner.nextLine();
        password = scanner.nextLine();

        if (username.equals("Greg") &&
                password.equals("gr")) {
            login = true;
            logged = "Logged";
            System.out.println("Logged");
        } else {
            login = false;
            logged = "Not Login";
            System.out.println("Not Logged");
        };
        if (login) System.out.println("Logged");
            else System.out.println("Not logged");

    }

}
