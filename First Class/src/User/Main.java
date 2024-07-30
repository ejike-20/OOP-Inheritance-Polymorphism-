package User;

public class Main {
    public static void main(String[] args) {
        User user = new User();

        String loginResult = user.login();

        System.out.println(loginResult);
    }

    static class User {
        String username = "Daniel";
        String password = "0123456789";

        String login() {
            if (username.equals("Daniel") && password.equals("0123456789")) {
                return "Login successful!";
            } else {
                return "Invalid username or password. Please try again later.";
            }
        }
    }
}