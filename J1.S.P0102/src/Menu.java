package J1SP0102;

import java.util.Date;

public class Menu {

    public void display() {
        Validation vaild = new Validation();
        DateProcess dateProcess = new DateProcess();
        Date enterDate = vaild.inputDate("Please enter date with format [dd/mm/yyyy]:");
        System.out.println("Your day is " + dateProcess.getDayOfWeek(enterDate));
    }
}
