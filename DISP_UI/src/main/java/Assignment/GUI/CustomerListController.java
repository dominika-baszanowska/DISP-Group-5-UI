package Assignment.GUI;
import Assignment.Data.CompanyData;
import Assignment.Model.Customer;
import Assignment.Model.Product;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class CustomerListController implements Initializable {

    @FXML
    public TableView<Customer> tableview;

    public TableColumn<Customer, String> colFirstName;
    public TableColumn<Customer, String> colLastName;
    public TableColumn<Customer, String> colCustomerId;
    public TableColumn<Customer, String> colVipStatus;
    public TableColumn<Customer, String> colPostcode;
    public TableColumn<Customer, String> colPhoneNumber;
    public TableColumn<Customer, String> colEmailAddress;
    public TableColumn<Customer, String> colAddress;
    public TextField textFirstName;
    public TextField textLastName;
    public TextField textCustomerId;
    public TextField textVipStatus;
    public TextField textPostcode;
    public TextField textPhoneNumber;
    public TextField textEmailAddress;
    public TextField textAddress;
    public Button buttonSearch;
    public Button buttonApplyChanges;
    public Button buttonManageVipStatus;

    private TableRow<Customer> selectedRow;

    ObservableList<Product> observableList = new CompanyData().loadData();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        colFirstName.setCellValueFactory(new PropertyValueFactory<>("FirstName"));
        colLastName.setCellValueFactory(new PropertyValueFactory<>("LastName"));
        colCustomerId.setCellValueFactory(new PropertyValueFactory<>("CustomerId"));
        colVipStatus.setCellValueFactory(new PropertyValueFactory<>("VipStatus"));
        colPostcode.setCellValueFactory(new PropertyValueFactory<>("Postcode"));
        colPhoneNumber.setCellValueFactory(new PropertyValueFactory<>("PhoneNumber"));
        colEmailAddress.setCellValueFactory(new PropertyValueFactory<>("EmailAddress"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("Address"));
        tableview.setItems(observableList);

        tableview.setEditable(true);
        colVipStatus.setCellFactory(TextFieldTableCell.forTableColumn());

        tableview.setRowFactory(customerTableView -> {
            final TableRow<Customer> row = new TableRow<>();

            row.addEventFilter(MouseEvent.MOUSE_PRESSED, mouseEvent -> {
                final int i = row.getIndex();

                // If user clicked on selected row within range
                if (i >= 0 && i < tableview.getItems().size() && tableview.getSelectionModel().isSelected(i)) {

                    tableview.getSelectionModel().clearSelection();
                    clearDisplayedItems();
                    mouseEvent.consume();
                }
                // If user clicked on unselected row within range
                else if (i >= 0 && i < tableview.getItems().size()) {
                    processSelectedRow(row);
                }
            });
            return row;
        });
    }
    public void processSelectedRow(TableRow<Customer> row) {
        selectedRow = row;
        Customer customer = row.getItem();

        textFirstName.setText(String.valueOf(customer.getFirstName()));
        textLastName.setText(String.valueOf(customer.getLastName()));
        textCustomerId.setText(String.valueOf(customer.getCustomerId()));
        textVipStatus.setText(String.valueOf(customer.getVipStatus()));
        textPostcode.setText(String.valueOf(customer.getPostcode()));
        textPhoneNumber.setText(String.valueOf(customer.getPhoneNumber()));
        textEmailAddress.setText(String.valueOf(customer.getEmailAddress()));
        textAddress.setText(String.valueOf(customer.getAddress()));
        textCustomerId.setDisable(true);
        textFirstName.setDisable(true);
        textLastName.setDisable(true);

    }
    // Create a method for deleting a row in the table
    public void clearDisplayedItems() {
        selectedRow = null;

        textFirstName.setText("");
        textLastName.setText("");
        textCustomerId.setText("");
        textVipStatus.setText("");
        textPostcode.setText("");
        textPhoneNumber.setText("");
        textEmailAddress.setText("");
        textAddress.setText("");
        textCustomerId.setText("");
    }

    // Create a method for saving all the changes done to a single row
    public void buttonApplyChanges(ActionEvent actionEvent){

    }
}

