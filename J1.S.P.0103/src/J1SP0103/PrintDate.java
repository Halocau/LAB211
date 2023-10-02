/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J1SP0103;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class PrintDate {

    public void display() {
        Validation vaild = new Validation();
        DateProcess dateProcess = new DateProcess();
        Date firstDate = vaild.inputDate("Please enter the first date: ");
        Date secondDate = vaild.inputDate("Please enter the second date: ");

        int compareResult = dateProcess.compareDate(firstDate, secondDate);

        if(compareResult == 0){
            System.out.println("Date1 is equal Date2");
        }else if(compareResult > 0){
            System.out.println("Date2 is before Date1");
        }else{
            System.out.println("Date1 is before Date2");
        }
    }
}
