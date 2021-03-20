package sample;

import javafx.scene.control.TextField;

public class CreateAccountStroage {
    private static String Full_Name;
    private static String Phone;
    private static String Email;
    private static String Usernaeme;
    private static String password;


    public static String getUsernaeme() {
        return Usernaeme;
    }

    public static void setUsernaeme(String usernaeme) {
        Usernaeme = usernaeme;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        CreateAccountStroage.password = password;
    }

    public static String getFull_Name() {
        return Full_Name;
    }

    public static void setFull_Name(String full_Name) {
        Full_Name = full_Name;
    }

    public static String getPhone() {
        return Phone;
    }

    public static void setPhone(String phone) {
        Phone = phone;
    }

    public static String getEmail() {
        return Email;
    }

    public static void setEmail(String email) {
        Email = email;
    }


}
