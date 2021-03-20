package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public  class CreateAccountController implements Initializable{
    public PasswordField tf_create_password;
    public Button bt_cancel;
    public TextField tf_create_email;
    public TextField tf_create_phone;
    public TextField tf_create_name;
    public TextField tf_create_username;
    public Button bt_create;
    public Button bt_back_to_home;
    public Label lb_message;
    public Label Register_Successfully_Massag;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tf_create_name.setText(CreateAccountStroage.getFull_Name());
        tf_create_phone.setText(CreateAccountStroage.getPhone());
        tf_create_email.setText(CreateAccountStroage.getEmail());
        tf_create_username.setText(CreateAccountStroage.getUsernaeme());
        tf_create_password.setText(CreateAccountStroage.getPassword());
    }


    public void doCancel(ActionEvent event) {
        Stage stage = (Stage) bt_cancel.getScene().getWindow();
        stage.close();
    }

    public void doCreate(ActionEvent event) {
        String line = " \n"+ tf_create_username.getText() +" ," + tf_create_email.getText()+","+ tf_create_password.getText() +" ," +
                tf_create_name.getText() +" ," +tf_create_phone.getText() +" ,";

        FileWriter file_writer;
        try {
            file_writer = new FileWriter("C:\\Users\\Abdul Ohab\\Desktop\\booking System Commit 1 Rejoan\\NotLogical\\src\\sample\\CreateAccount.txt",true);
            BufferedWriter buffered_Writer = new BufferedWriter(file_writer);
            buffered_Writer.write(line);
            buffered_Writer.flush();
            buffered_Writer.close();

        } catch (IOException e) {
            System.out.println("Add line failed!!" +e);
        }
        Register_Successfully_Massag.setText("Register Successfully");


    }


    public void back_to_home(ActionEvent actionEvent) throws IOException {
        Button button = bt_back_to_home;

        Parent homePageParent = FXMLLoader.load(getClass().getResource("homepage.fxml"));
        Scene homePageScene = new Scene(homePageParent,900,700);
        Stage homePageStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        homePageStage.setScene(homePageScene);
        homePageStage.show();

    }

}
