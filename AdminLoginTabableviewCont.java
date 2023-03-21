package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminLoginTabableviewCont implements Initializable {
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




    //--------------------






    ObservableList<person2> list = FXCollections.observableArrayList(
            new person2("abdul ohab","01954031128","10","Dhaka","Rajshihi","A","500"),
            new person2("rejoan","01954031129","10","Dhaka","Rajshihi","B","500"),
            new person2("mesbah","01954031110","10","Dhaka","Rajshihi","C","500")
            //new person("01954031128","dddd","rejoan","rejoan1234@gmail.com","Md rejoan Rahman" ),
            //new person("01954031127","abcd","mesbah","mesbah1234@gmail.com","Md Mesbahur Rahman" )
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

    public void doLogin(ActionEvent event) throws IOException {
        Parent hParent = FXMLLoader.load(getClass().getResource("AdminLogin.fxml"));
        Scene hoScene = new Scene(hParent,900,700);
        Stage hoStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        hoStage.setScene(hoScene);
        hoStage.show();
    }

    public void Admin_backOnAction(ActionEvent event) {
    }
}