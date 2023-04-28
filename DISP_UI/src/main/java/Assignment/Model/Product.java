package Assignment.Model;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;

public class Product {
    @FXML
    private final SimpleStringProperty orderNumber;
    private final SimpleIntegerProperty productCode;
    private final SimpleStringProperty productName;
    private final SimpleIntegerProperty numOfInStock;
    private final SimpleBooleanProperty availability;

    public Product(String orderNumber, int productCode, String productName, int numOfStock, boolean availability){
        this.orderNumber = new SimpleStringProperty(orderNumber);
        this.productCode = new SimpleIntegerProperty(productCode);
        this.productName = new SimpleStringProperty(productName);
        this.numOfInStock = new SimpleIntegerProperty(numOfStock);
        this.availability = new SimpleBooleanProperty(availability);
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber.set(orderNumber);
    }

    public void setProductName(String productName) {
        this.productName.set(productName);
    }

    public void setProductCode(int productCode) {
        this.productCode.set(productCode);
    }

    public void setAvailability(boolean availability) {
        this.availability.set(availability);
    }

    public void setNumOfInStock(int numOfInStock) {
        this.numOfInStock.set(numOfInStock);
    }

    public String getOrderNumber() {
        return orderNumber.get();
    }

    public int getNumOfInStock() {
        return numOfInStock.get();
    }

    public int getProductCode() {
        return productCode.get();
    }

    public String getProductName() {
        return productName.get();
    }

    public boolean getAvailability(){
        return availability.get();
    }
}
