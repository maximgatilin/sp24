// LoginApp.java
import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) {
        UserService userService = new UserService();
        	Scanner scanner = new Scanner(System.in);

    	// запрашиваем логин
        System.out.print("Введите логин: ");
        String username = scanner.nextLine();

        // запрашиваем пароль
        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();

        boolean auth = userService.authenticate(username, password);

        if (auth) {
        	// todo проверить что пароль и логин не пустые
            System.out.println("Успешный логин!");
        } else {
            System.out.println("Неправльный логин или пароль.");
        }

        scanner.close();
    }
}