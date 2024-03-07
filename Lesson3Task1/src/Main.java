import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1.Get username
        System.out.println("Hello, please enter your name.");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        // 2.Get user's surname
        System.out.println("Please enter your surname.");
        String userSurname = scanner.nextLine();

        // 3.Get user's profession
        System.out.println("Please enter your profession.");
        String userProfession = scanner.nextLine();

        // 4.Display user's name, surname, profession
        System.out.format("Your name is %s, your surname is %s, your profession is %s.", userName, userSurname, userProfession);

    }
}