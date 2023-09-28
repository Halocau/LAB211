
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
class Menu {

    public void display() {
        Validation valid = new Validation();
        DateProcess dateProcess = new DateProcess();
        Date inputDate = valid.inputDate("Please enter date with format [dd/mm/yyyy]:");
        System.out.println("Your day is " + dateProcess.getDayOfWeek(inputDate));
    }

}
