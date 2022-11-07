package com.console.app.banking.dto;

import java.io.*;

public class BaseIO {
    /*This method takes input from console
    * BufferReader reads characters, uses buffering to avoid reading the same data multiples time which can be costly
    * does so by caching sort of mechanism.
    *
    * @param Reader (abstract class -> InputStreamReader extends it)
    * @return always String, even if input is a number
    *
    * */

    /*
     InputStreamReader isr = new InputStreamReader(System.in);
     BufferedReader br = new BufferedReader(isr);
     As inputStreamReader is only used once, just pass the whole obj as parameter to shorten the code
                       ||
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    * */


    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public BaseIO() {
    }

    void displayMessage(String message){
        System.out.println( message );
    }

    String readField(String message) {
        try {
            displayMessage(message);
            return bufferedReader.readLine();
        }
        catch (Exception exception){
            exception.printStackTrace();
            return null;
        }

    }

    String readCustomerChoice(String message) {
        try {
            displayMessage(message);
            return bufferedReader.readLine();
        }
        catch (Exception exception){
            exception.printStackTrace();
            return null;
        }

    }
}
