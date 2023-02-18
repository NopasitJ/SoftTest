package com.king.mongkut.testing.service;

import org.springframework.stereotype.Service;

@Service
public class CalculationService {

    public int plus(String number1, String number2) {
        return Integer.parseInt(number1) + Integer.parseInt(number2);
    }

    public int minus(String number1, String number2) {
        try {
            return Integer.parseInt(number1) - Integer.parseInt(number2);
        } catch (NumberFormatException exception) {
            return -1;
        }
    }
    public int multiple(String number1, String number2){
        return Integer.parseInt(number1) * Integer.parseInt(number2);
    }

    public double divide(String number1, String number2){
        
        try{
            if(Double.parseDouble (number2)== 0){
                return -1;
            }
            else
                return Double.parseDouble(number1) / Double.parseDouble(number2);
        }
        catch (NumberFormatException exception){
            return -1;
        }
        
        
    }
}
