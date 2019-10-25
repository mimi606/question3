/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.question3;
import java.util.*;
/**
 *
 * @author uwtsd-student
 */
public class question3 
{
    private static Scanner stdin = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        double amount;
        String currency;
        
        System.out.printf("Please enter the amount:\n");
        amount = Double.parseDouble(stdin.nextLine());
        
        System.out.printf("Please enter the currency:\n");
        currency = stdin.nextLine();
        
        if (currency.equals("Pounds"))
        {
            System.out.printf("%f pounds equals to %f dollars:\n",amount,amount*1.25);
            System.out.printf("%f pounds equals to %f euros:\n",amount,amount*1.15);
        }
        else if(currency.equals("Dollars"))
        {
            System.out.printf("%f dollars equals to %f pounds:\n",amount,amount/1.25);
            System.out.printf("%f dollars equals to %f euros:\n",amount,amount/1.10);
        }
        else
        {
            System.out.printf("%f euros equals to %f pounds:\n",amount,amount/1.15);
            System.out.printf("%f euros equals to %f dollars:\n",amount,amount*1.10);
        }
    }
}
