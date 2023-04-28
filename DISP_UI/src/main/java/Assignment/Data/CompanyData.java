package Assignment.Data;

import Assignment.Model.Customer;
import Assignment.Model.Product;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Arrays;
import java.util.List;

public class CompanyData {
    Customer customer = new Customer();

    List<Customer> listOfCustomers = Arrays.asList(
            new Customer("John","Baker", "7453f23a", true,
                    "BS3 6AT", "07532136543","john.baker@gmail.com","7 Victoria street")
    );

    public ObservableList<Product> loadData(){

        ObservableList<Product> observableList = FXCollections.observableArrayList();
        CompanyData accommodationData = new CompanyData();

}
