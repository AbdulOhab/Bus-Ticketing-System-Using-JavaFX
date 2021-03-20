package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.Paths;

public class UserLoginController {
    public Label lb_need_an_account;
    public Hyperlink hlink_create_id;
    public Button bt_user_login;
    public TextField tf_username;
    public PasswordField f_password;
    public Button bt_create_account;
    public Button bt_back_to_home;
    public Button bt_userlogin;


    public void doLogin(ActionEvent event) throws IOException {
        /*
        //Just a static login
       Button loginButton = bt_userlogin;
        String username = tf_username.getText();
        String password = pf_password.getText();

        if(username.equals("omr") && password.equals("omr")) {

            Parent ticketBookingPageParent = FXMLLoader.load(getClass().getResource("TicketBooking.fxml"));
            Scene ticketBookingPageScene = new Scene(ticketBookingPageParent,900,700);
            Stage ticketBookingPageStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            ticketBookingPageStage.setScene(ticketBookingPageScene);
            ticketBookingPageStage.show();

        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
             alert.setTitle("Login Error");
             alert.setContentText("Check Your Credentials");
             alert.show();
        }*/
        Path path = Paths.get("C:\\Users\\Abdul Ohab\\Desktop\\booking System Commit 1 Rejoan\\NotLogical\\src\\sample\\CreateAccount.txt");

        long count = Files.lines(path).count();

        for (int i = 0; i < count; i++) {
            String line = Files.readAllLines(path).get(i);
            if (!line.trim().equals("")) {

                //According to format Name, Email, Password, Age, Gender
                String[] profile = line.split(",");

                String name = profile[0];
                String email = profile[1];
                String password = profile[2];


                //Email Matched!
                if (name.trim().equals(tf_username.getText())) {
                    if (password.trim().equals(f_password.getText())) {

//                        Alert msg = new Alert(Alert.AlertType.CONFIRMATION);
//                        msg.setTitle(tf_username.getText());
//                        msg.setContentText("Email and password matched");
//                        msg.showAndWait();

                        //Store values
                        CreateAccountStroage.setUsernaeme(name);
                        CreateAccountStroage.setEmail(email);
                        CreateAccountStroage.setPassword(password);

                        Parent createAccountPageParent = FXMLLoader.load(getClass().getResource("TicketBooking.fxml"));
                        Scene createAccountPageScene = new Scene(createAccountPageParent,900,700);
                        Stage createAccountPageStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        createAccountPageStage.setScene(createAccountPageScene);
                        createAccountPageStage.show();
                        //start();
                        //creatAccountFrom();
                       break;
                    }


                }

            }
        }

    }
//    public void creatAccountFrom(){
//        try{
//
//            Parent t = FXMLLoader.load(getClass().getResource("login.fxml"));
//            Stage register = new Stage();
//            register.initStyle(StageStyle.UNDECORATED);
//            register.setScene(new Scene(t, 520,480));
//            register.show();
//
//        } catch(Exception e) {
//            e.printStackTrace();
//            e.getCause();
//        }
//    }
//    public void start() throws IOException {
//        Stage tStage = new Stage();
//        Parent ma = FXMLLoader.load(getClass().getResource("TicketBooking.fxml"));//TicketBooking.fxml
//        tStage.setTitle("OMR Bus Ticketing System");
//        tStage.setScene(new Scene(ma, 900, 700));
//        tStage.show();
//    }


    public void bt_take_to_create_account(ActionEvent actionEvent) throws IOException {
        Button button = bt_create_account;

        Parent createAccountPageParent = FXMLLoader.load(getClass().getResource("CreateAccount.fxml"));
        Scene createAccountPageScene = new Scene(createAccountPageParent,700,700);
        Stage createAccountPageStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        createAccountPageStage.setScene(createAccountPageScene);
        createAccountPageStage.show();
        }

    public void back_to_homeOnAction(ActionEvent event) throws IOException {
        Parent homePageParent = FXMLLoader.load(getClass().getResource("homepage.fxml"));
        Scene homePageScene = new Scene(homePageParent,900,700);
        Stage homePageStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        homePageStage.setScene(homePageScene);
        homePageStage.show();
    }
}
