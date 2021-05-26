
import java.util.Scanner;
import java.util.Base64;
import java.io.UnsupportedEncodingException;

public class AccountMain {
    static String userId = "admin";
    static String password = "Admint@123";

    public static String encodePassword() {
        String base64encodePassword = "";

        try {
            base64encodePassword = Base64.getEncoder().encodeToString(password.getBytes("utf-8"));
            System.out.println("Base64 Encoded String (Basic)" + base64encodePassword);

        } catch (UnsupportedEncodingException e) {
            System.out.println("Error : " + e.getMessage());
        }
        return base64encodePassword;
    }

    public static String decodePassword() {
        String encodePassword = encodePassword();
        String base64DecodePassword = new String();

        try {
            byte[] decodedPassword = Base64.getDecoder().decode(encodePassword);

            System.out.println("Original String : " + new String(decodedPassword, "utf-8"));
            base64DecodePassword = new String(decodedPassword, "utf-8");

        } catch (UnsupportedEncodingException e) {
            // TODO: handle exception
            System.out.println("Error : " + e.getMessage());
        }
        return base64DecodePassword;
    }

    public static Boolean validatePassword(Account objAccount) {
        boolean output;
        String decodePassword = decodePassword();
        String inputPassword = objAccount.getPassword();

        output = decodePassword.equals(inputPassword);
        return output;
    }

    public static void main(String[] args) {
        String inPassword;
        Scanner input = new Scanner(System.in);

        Account objAccount = new Account();
        objAccount.setUserId(userId);
        inPassword = input.nextLine();
        objAccount.setPassword(inPassword);
        if (validatePassword(objAccount)) {
            System.out.println("Adimit pass is successfully validated");
            System.out.println(objAccount.toString());
        } else {
            System.out.println("Invalid password");
        }
    }
}
