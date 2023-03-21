package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminLoginController {
    public Label lb_omr_poster;
    public Label lb_AdminLogin;
    public TextField tf_admin_name;
    public PasswordField pf_admin_password;
    public Button bt_user_login;

    public void doLogin(ActionEvent event) throws IOException {
        String adminName = tf_admin_name.getText();
        String password = pf_admin_password.getText();

        if(adminName.equals("java") && password.equals("java")) {

            Parent adminPanelPageParent = FXMLLoader.load(getClass().getResource("AdminLogin_tableview1st.fxml"));
            Scene adminPanelPageScene = new Scene(adminPanelPageParent,900,700);
            Stage adminPanelPageStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            adminPanelPageStage.setScene(adminPanelPageScene);
            adminPanelPageStage.show();

        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Login Error");
            alert.setContentText("Check Your Credentials");
            alert.show();
        }
    }

    public void Admin_backOnAction(ActionEvent event) throws IOException {
        Parent AdminParent = FXMLLoader.load(getClass().getResource("homepage.fxml"));
        Scene adminScene = new Scene(AdminParent,900,700);
        Stage adminStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        adminStage.setScene(adminScene);
        adminStage.show();

    }
}
