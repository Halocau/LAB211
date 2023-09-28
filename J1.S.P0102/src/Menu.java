import java.util.Date;

class Menu {
    public void display() {
        Validation valid = new Validation();
        DateProcess dateProcess = new DateProcess();
        Date inputDate = valid.inputDate("Please enter date with format [dd/mm/yyyy]:");
        System.out.println("Your day is " + dateProcess.getDayOfWeek(inputDate));
    }
}
