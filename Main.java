package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("homepage.fxml"));//TicketBooking.fxm lhomepage.fxml
        primaryStage.setTitle("OMR Bus Ticketing System");
        primaryStage.setScene(new Scene(root, 900, 700));
        primaryStage.show();
    }


    public static void main(String[] args) {

        launch(args);

    }
}
