import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PasswordManager {
    private static Map<String, String> passwordMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Store Password\n2. Retrieve Password\n3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    storePassword(scanner);
                    break;
                case 2:
                    retrievePassword(scanner);
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }

    private static void storePassword(Scanner scanner) {
        System.out.print("Enter website: ");
        String website = scanner.nextLine();
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        String encryptedPassword = encrypt(password);
        passwordMap.put(website, encryptedPassword);
        System.out.println("Password stored securely.");
    }

    private static void retrievePassword(Scanner scanner) {
        System.out.print("Enter website: ");
        String website = scanner.nextLine();

        String encryptedPassword = passwordMap.get(website);
        if (encryptedPassword != null) {
            String decryptedPassword = decrypt(encryptedPassword);
            System.out.println("Website: " + website);
            System.out.println("Password: " + decryptedPassword);
        } else {
            System.out.println("Password not found.");
        }
    }

    private static String encrypt(String text) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : text.toCharArray()) {
            encrypted.append((char) (c + 1));
        }
        return encrypted.toString();
    }

    private static String decrypt(String encryptedText) {
        StringBuilder decrypted = new StringBuilder();
        for (char c : encryptedText.toCharArray()) {
            decrypted.append((char) (c - 1));
        }
        return decrypted.toString();
    }
}
