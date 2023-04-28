package Assignment.Model;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;


public class Customer {
    @FXML
    private SimpleStringProperty firstName;
    private SimpleStringProperty lastName;
    private SimpleStringProperty customerId;
    private SimpleBooleanProperty vipStatus;
    private SimpleStringProperty postcode;
    private SimpleStringProperty phoneNumber;
    private SimpleStringProperty emailAddress;
    private SimpleStringProperty address;

    public Customer(String firstName, String lastName, String customerId, boolean vipStatus, String postcode, String phoneNumber, String emailAddress, String address){
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.customerId = new SimpleStringProperty(customerId);
        this.vipStatus = new SimpleBooleanProperty(vipStatus);
        this.postcode = new SimpleStringProperty(postcode);
        this.phoneNumber = new SimpleStringProperty(phoneNumber);
        this.emailAddress = new SimpleStringProperty(emailAddress);
        this.address = new SimpleStringProperty(address);
    }

    public void setFirstName(String firstName) {
        this.firstName = new SimpleStringProperty(firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = new SimpleStringProperty(lastName);
    }

    public void setCustomerId(String customerId) {
        this.customerId = new SimpleStringProperty(customerId);
    }

    public void setPostcode(String postcode) {
        this.postcode = new SimpleStringProperty(postcode);
    }

    public void setVipStatus(boolean vipStatus) {
        this.vipStatus = new SimpleBooleanProperty(vipStatus);
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = new SimpleStringProperty(emailAddress);
    }

    public void setAddress(String address) {
        this.address = new SimpleStringProperty(address);
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = new SimpleStringProperty(phoneNumber);
    }

    public String getFirstName() {
        return firstName.get();
    }

    public String getLastName() {
        return lastName.get();
    }

    public String getCustomerId() {
        return customerId.get();
    }

    public String getPhoneNumber() {
        return phoneNumber.get();
    }

    public String getPostcode() {
        return postcode.get();
    }

    public String getAddress() {
        return address.get();
    }

    public String getEmailAddress() {
        return emailAddress.get();
    }

    public boolean getVipStatus(){
        return vipStatus.get();
    }
}
