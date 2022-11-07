package com.console.app.banking.menu;

import com.console.app.banking.dto.BaseIO;

public class OptionMenu extends BaseIO {
    public OptionMenu(){
        /*parseInt() @param must be a number*/
        displayMessage("*******Welcome to banking application****");
        boolean status = true;
        while(status){
            displayMessage("1) Customer Section ");
            displayMessage("2) Account Section ");
            displayMessage("3) Exit Section ");
            int optionSelected  = Integer.parseInt(readField("Please enter option for you choice"));
            switch (optionSelected){
                case 1:
                   new CustomerMenu();
                   break;
                case 2:
                    displayMessage("You are at Account Section Now");
                    break;
                case 3:
                    status = false;
                    displayMessage("Thanks for using the chase app...Goodbye");
                    break;
                default:
                    displayMessage("Invalid Entry. Please try again....");
            }
        }


    }
}
