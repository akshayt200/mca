
import java.util.regex.*;

public class PasswordValidator {
    public static void main(String[] args) {
        String password = "MyP@ss1"; // Replace with the password you want to check

        if (isPasswordValid(password)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is not valid.");
        }
    }

    public static boolean isPasswordValid(String password) {
        // Define the regular expression pattern for the password criteria
        String regex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!])(.{7,8})$";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(regex);

        // Create a Matcher object
        Matcher matcher = pattern.matcher(password);

        // Check if the password matches the pattern
        return matcher.matches();
    }
}
