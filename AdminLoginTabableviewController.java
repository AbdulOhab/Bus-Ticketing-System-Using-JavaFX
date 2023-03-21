package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


  public class AdminLoginTabableviewController implements Initializable {
      public Button bt_cancel;
      @FXML
        private TableView<person2> table;

        @FXML
        private TableColumn<person2, String> Customername;

        @FXML
        private TableColumn<person2, String> Phone;

        @FXML
        private TableColumn<person2, String> Date;

        @FXML
        private TableColumn<person2, String> From;

        @FXML
        private TableColumn<person2, String> To;

        @FXML
        private TableColumn<person2, String> Seat;

        @FXML
        private TableColumn<person2, String> Price;

        ObservableList<person2> list = FXCollections.observableArrayList(
                new person2("abdul ohab","01954031128","10","Dhaka","Rajshihi","1","500"),
                new person2("rejoan","01954031129","10","Dhaka","Rajshihi","1","500"),
                new person2("mesbah","01954031110","10","Dhaka","Rajshihi","1","500")

        );
        @Override
        public void initialize(URL location, ResourceBundle resources) {
            Customername.setCellValueFactory(new PropertyValueFactory<person2,String>("Customername"));
            Phone.setCellValueFactory(new PropertyValueFactory<person2,String>("Phone"));
            Date.setCellValueFactory(new PropertyValueFactory<person2,String>("Date"));
            From.setCellValueFactory(new PropertyValueFactory<person2,String>("From"));
            To.setCellValueFactory(new PropertyValueFactory<person2,String>("To"));
            Seat.setCellValueFactory(new PropertyValueFactory<person2,String>("Seat"));
            Price.setCellValueFactory(new PropertyValueFactory<person2,String>("Price"));

            table.setItems(list);
        }


      public void AccountInformation_onAction(ActionEvent event) throws IOException {
          Parent AccountInformationParent = FXMLLoader.load(getClass().getResource("AdminLogin_tableview2st.fxml"));
          Scene  AccountScene = new Scene(AccountInformationParent,900,700);
          Stage AccountStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
          AccountStage.setScene(AccountScene);
          AccountStage.show();

      }

      public void gotohomepage_onAction(ActionEvent event) throws IOException {
          Parent gotohomepage = FXMLLoader.load(getClass().getResource("homepage.fxml"));
          Scene  gotohomepageScene = new Scene(gotohomepage,900,700);
          Stage gotohomepageStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
          gotohomepageStage.setScene(gotohomepageScene);
          gotohomepageStage.show();
      }

      public void ONaction_Cancel(ActionEvent event) {
          Stage Cancel = (Stage) bt_cancel.getScene().getWindow();
          Cancel.close();
      }
  }

