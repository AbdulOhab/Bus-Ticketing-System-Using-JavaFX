package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.stage.Stage;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class homepageLoginController implements Initializable {
    public Label lb_OMR;
    public Button bt_home_user;
    public Button bt_home_admin;
    public Label lb_create_account;
    public Button bt_home_create_account;

public void take_to_userlogin(ActionEvent actionEvent) throws IOException {

    Parent userLoginPageParent = FXMLLoader.load(getClass().getResource("UserLogin.fxml"));
    Scene userLoginPageScene = new Scene(userLoginPageParent,900,700);
    Stage userLoginPageStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
    userLoginPageStage.setScene(userLoginPageScene);
    userLoginPageStage.show();
    // userLoginPageStage.showAndWait();
}

    public void take_to_adminlogin(ActionEvent actionEvent) throws IOException {

        Parent adminLoginPageParent = FXMLLoader.load(getClass().getResource("AdminLogin.fxml"));
        Scene adminLoginPageScene = new Scene(adminLoginPageParent,900,700);
        Stage adminLoginPageStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        adminLoginPageStage.setScene(adminLoginPageScene);
        adminLoginPageStage.show();

    }




    public void take_to_createaccount(ActionEvent actionEvent) throws IOException {

        Parent createAccountPageParent = FXMLLoader.load(getClass().getResource("CreateAccount.fxml"));
        Scene createAccountPageScene = new Scene(createAccountPageParent,700,700);
        Stage createAccountPageStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        createAccountPageStage.setScene(createAccountPageScene);
        createAccountPageStage.show();
        // userLoginPageStage.showAndWait();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
