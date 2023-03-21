package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.ComboBox;

public class TicketBookingController implements Initializable {

    public DatePicker dp_date;
    public TextField tf_name;
    public TextField tf_total_price;
    public TextField tf_phone;
    public TextField tf_seats;
    public TextArea ta_successful;
    public Button bt_cancel;
    public Button bt_book;
    public Label lb_omr;
    @FXML
    public ComboBox<String> ComB_box_from;
    public ComboBox<String> ComB_tf_to;
    ObservableList<String> names = FXCollections.observableArrayList("Dhaka", "Rajshahi", "Chittagong", "Sylhet");
    ObservableList<String> names_TO = FXCollections.observableArrayList("Mymensingh", "Barisal", "Rangpur", "Khulna");



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tf_name.setText(TicketBookingStorage.getM_Name());
        tf_phone.setText(TicketBookingStorage.getM_Phone());
        tf_seats.setText(TicketBookingStorage.getM_seats());
        tf_total_price.setText(TicketBookingStorage.getM_total_price());
        ComB_box_from.setItems(names);
        ComB_tf_to.setItems(names_TO);

//        if(TicketBookingStorage.getM_total_price()!=null)
//        {
//            tf_name.setDisable(true);
//            tf_phone.setDisable(true);
//            tf_from.setDisable(true);
//            tf_to.setDisable(true);
//            tf_seats.setDisable(true);
//            tf_total_price.setDisable(true);
//        }

    }

    public void bookTicket(ActionEvent event) {
        tf_name.setDisable(true);
        tf_phone.setDisable(true);
        ComB_box_from.setDisable(true);
        ComB_tf_to.setDisable(true);
        tf_seats.setDisable(true);
        tf_total_price.setDisable(true);
        dp_date.setDisable(true);
        conformFile();
        outputArea();

    }

    private void conformFile()
    {
        String Ticket= "\n "+ tf_name.getText() + " ," + tf_phone.getText() + " ," + dp_date.getValue()+ " ," +
                ComB_box_from.getSelectionModel().getSelectedItem() + " ," + ComB_tf_to.getSelectionModel().getSelectedItem() + " ," +
                tf_seats.getText() + " ," + tf_total_price.getText();

        FileWriter ticket_file;
        try {
            ticket_file= new FileWriter("C:\\Users\\Abdul Ohab\\Desktop\\NotLogical\\src\\sample\\Ticket.txt",true);
            BufferedWriter buffered_Writer = new BufferedWriter(ticket_file);
            buffered_Writer.write(Ticket);
            buffered_Writer.flush();
            buffered_Writer.close();

        }
       catch (IOException e) {
            //e.printStackTrace();
           System.out.println("Finish" +e);

        }
    }
    private void outputArea()
    {
        ta_successful.appendText("****************************************************************************"+"\n");
        ta_successful.appendText("\t\t\t\t\t\t BILL \t\t\t\t\t\t"+"\n");
        ta_successful.appendText("****************************************************************************"+"\n");
        ta_successful.appendText("Customer\t\t\t");
        ta_successful.appendText(tf_name.getText()+"\n");
        ta_successful.appendText("Total Seat\t\t\t");
        ta_successful.appendText(tf_seats.getText()+"\n");
        ta_successful.appendText("price \t\t\t");
        ta_successful.appendText(tf_total_price.getText()+"\n");
        ta_successful.appendText("Journey Path\t\t");
        ta_successful.appendText(ComB_box_from.getSelectionModel().getSelectedItem()+"\t");
        ta_successful.appendText("to\t");
        ta_successful.appendText(ComB_tf_to.getSelectionModel().getSelectedItem()+"\n");
        ta_successful.appendText("Date\t\t\t\t");
        ta_successful.appendText(dp_date.getValue()+"\n");
        ta_successful.appendText("\n");
        ta_successful.appendText("\n");
        ta_successful.appendText("****************************************************************************"+"\n");
        ta_successful.appendText("\t\t\tTHANK YOU COME AGAIN\t\t\t"+"\n");
        ta_successful.appendText("****************************************************************************"+"\n");
    }

    public void doCancel(ActionEvent event) {
        Stage stage = (Stage) bt_book.getScene().getWindow();
        stage.close();
    }


    public void tadate(ActionEvent event) {
    }
    public void taName(ActionEvent event) {
    }
    public void tprice(ActionEvent event) {
    }
}
