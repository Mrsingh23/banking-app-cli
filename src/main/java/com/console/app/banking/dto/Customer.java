package com.console.app.banking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    private String fullName;
    private String mobileNumber;
    private String emailAddress;
    private String idType;
    private Integer idNumber;
}
