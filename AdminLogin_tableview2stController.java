package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminLogin_tableview2stController {
    public Button bt_Goto_AdminPanel;

    public void Goto_AdminPanel_OnAction(ActionEvent event) throws IOException {
        Parent AdminLogin = FXMLLoader.load(getClass().getResource("AdminLogin_tableview1st.fxml"));
        Scene AdminLoginScene = new Scene(AdminLogin,900,700);
        Stage AdminLoginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        AdminLoginStage.setScene(AdminLoginScene);
        AdminLoginStage.show();
    }
}
