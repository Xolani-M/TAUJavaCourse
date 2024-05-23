package chapter8;

import java.util.Scanner;

public class PasswordValidator {

    private String username;
    private String currentPassword;
    private boolean valid;
    private String errorMessage;

    static Scanner scanner = new Scanner(System.in);


    public PasswordValidator(String username,String currentPassword){
        this.username = username;
        this.currentPassword = currentPassword;
    }


    public static void main(String[] args){
        var validator = login();
        validator.printPasswordRules();

        do {
            var newPassword = validator.getNewPassword();
            validator.changePassword(newPassword);
            if (!validator.isValid()){
                System.out.println(validator.getErrorMessage());
            }

        }while(!validator.isValid());

        System.out.println("Password successful!");
    }


    public void printPasswordRules(){
        System.out.println("Your new password must meet the following requirements:");
        System.out.println("* at least 8 characters long");
        System.out.println("* contain an uppercase letter");
        System.out.println("* contain a special character");
        System.out.println("* not contain the username");
        System.out.println("* not the same as the old password");
        System.out.println();
    }


    public static PasswordValidator login(){
        String username = getUsername();
        String password = getPassword();
        return new PasswordValidator(username,password);
    }

    public static String getPassword(){
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        return password;
    }

    public static String getUsername(){
        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        return username;
    }

    public String getNewPassword(){
        System.out.println("Enter new password: ");
        String newPassword = scanner.nextLine();
        return newPassword;
    }

    public void changePassword(String newPassword){
        valid = true;
        errorMessage = "";

        if (newPassword.length() < 8){
            valid = false;
            errorMessage += "\n Password should be at least 8 characters";
        }

        if (newPassword.equals(newPassword.toLowerCase())){
            valid = false;
            errorMessage += "\n Password should contain at least one uppercase";
        }

        if (newPassword.matches("[a-zA-Z0-9 ]*")){
            valid = false;
            errorMessage += "\n Password should at least contain one special character";
        }

        if (newPassword.contains(username)){
            valid = false;
            errorMessage += "\n Password should not contain old username";
        }

        if (newPassword.contains(currentPassword)){
            valid = false;
            errorMessage += "\n Password should not contain old password";
        }
    }

    public boolean isValid(){
        return valid;
    }
    public String getErrorMessage(){
        return errorMessage;
    }
}
