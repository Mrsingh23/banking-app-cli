package com.console.app.banking.service;

import java.util.List;
/*Interface for generic CRUD operation*/
public interface GenericService<T> {

    boolean createData(T t);
    boolean updateData(T t);
    List<T> findAllData();
}
