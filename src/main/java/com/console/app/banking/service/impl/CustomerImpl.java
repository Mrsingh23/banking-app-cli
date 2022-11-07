package com.console.app.banking.service.impl;

import com.console.app.banking.dto.Customer;
import com.console.app.banking.service.GenericService;

import java.util.List;

public class CustomerImpl implements GenericService<Customer> {
    @Override
    public boolean createData(Customer customer) {
        return false;
    }

    @Override
    public boolean updateData(Customer customer) {
        return false;
    }

    @Override
    public List<Customer> findAllData() {
        return null;
    }
}
