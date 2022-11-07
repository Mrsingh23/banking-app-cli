package com.console.app.banking.menu;

import com.console.app.banking.dto.BaseIO;

public class CustomerMenu extends BaseIO {
    public CustomerMenu() {
        displayMessage("You are at customer section");
        System.out.println("Welcome to Customer section....");
        System.out.println("1) Customer Edit ");
        System.out.println("2) Customer List ");
        System.out.println("3) Exit Customer Section ");
        int optionSelected = Integer.parseInt(readField("Please enter option for you choice"));
        boolean status = true;
        while (status) {
            switch (optionSelected) {
                case 1:
                    displayMessage("Create Customer ");
                    break;
                case 2:
                    displayMessage("Update Customer ");
                    break;
                case 3:
                    status = false;
                    displayMessage("List Customer list");
                    break;
                default:
                    displayMessage("Invalid Entry. Please try again....");
            }
        }
    }
}
