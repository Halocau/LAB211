/*
  Hướng làm: Trong class check xem có ngoại lệ or giải quyết vấn đề(Validation)
  Ngoại lệ:
         1. hàm rỗng
         2. Nhập chữ
         3. Nhập sai fomat
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Validation {

    public static Date inputDate(String msg) {
        Scanner sc = new Scanner(System.in);

        String input;
        Date date = null;
        while (true) {
            System.out.println(msg);
            SimpleDateFormat dateFomat = new SimpleDateFormat("dd/MM/yyyy");
            dateFomat.setLenient(false);

            input = sc.nextLine();
            // Check xem có rỗng không
            if (input.isEmpty()) {
                System.err.println("Input must not be empty !!!");
                continue;
            }
            // Nếu đúng fomat là số
            else if(!checkContainCharacter(input)){
                // \d{1,2}: có thể có 1 hoặc 2 số
                // \d{4} : có 4 số
                // [/] : chứa cái kí tự /
                
                String patternDate = "\\d{1,2}[/]\\d{1,2}[/]\\d{4}";
                
                 // nếu input không đúng format của pattern mình đưa vào
                if(!input.matches(patternDate)){
                    System.err.println("Date is wrong format date !!!");
                    continue;
                }
                
                try {
                    //chuyển đổi chuỗi input thành một đối tượng Date
                    date = dateFomat.parse(input);
                    break; // // Thoát khỏi vòng lặp nếu đã có giá trị hợp lệ
                    
                    //Nếu việc chuyển đổi không thành công (ném ra ngoại lệ ParseException)
                } catch (ParseException e) {
                    System.err.println("Date does not existed !!!");
                    continue;
                }
            }
             // nếu nó chứa chữ
             else {
                System.err.println("Input contain character !!!");
                continue;
            }
        }
        return date;
    }
    

    // Check xem có nhập kí tự nào không
    public static boolean checkContainCharacter(String input) {
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);// chuyển Input qua ký tự
            if (Character.isLetter(c)) {//isletter: Kiểm tra ký tự char có phải là một ký tự hay không
                return true;// có ký tự chữ
            }
        }
        return false;// không có ký tự chữ
    }
}
