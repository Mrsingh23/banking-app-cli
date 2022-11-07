package com.console.app.banking.dto;

public class CustomerIO extends BaseIO{


    public Customer readCustomerDetails() {
        Customer customer = new Customer();
        customer.setFullName(readField("fullname"));
        customer.setFullName(readField("mobileNumber"));
        customer.setFullName(readField("emailAddress"));
        customer.setFullName(readField("idType"));
        return customer;
    }
}
