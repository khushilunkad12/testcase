public class UserService {

    public static void main(String[] args) {

        // Initialize with a default value to prevent NullPointerException
        String name = "Guest";

        // Defensive check to ensure name is not null before accessing its properties
        if (name != null) {
            System.out.println("User Name Length: " + name.length());
        } else {
            System.out.println("User Name is not available.");
        }

    }
}