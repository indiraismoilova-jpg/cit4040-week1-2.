public class Calculator {
    public static void main(String[] args) {
        String role1 = "admin";
        String role2 = "user";
        String role3 = null;

        checkRole(role1);
        checkRole(role2);
        checkRole(role3);
    }

    public static void checkRole(String role) {
        if ("admin".equals(role)) {
            System.out.println("Access granted");
        }
    }
}










