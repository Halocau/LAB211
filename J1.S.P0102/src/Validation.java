
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Validation {

    public static Date inputDate(String msg) {
    Scanner sc = new Scanner(System.in);
    String input;
    Date date = null; // Khởi tạo date ban đầu là null

    while (true) {
        System.out.println(msg);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);

        input = sc.nextLine(); // Sử dụng nextLine() để đọc toàn bộ dòng

        // Kiểm tra xem dữ liệu có rỗng không
        if (input.isEmpty()) {
            System.out.println("Input must not be empty !!!");
            continue;
        } 

        // Kiểm tra xem có chứa ký tự chữ không
        if (checkContainCharacter(input)) {
            System.out.println("Input contains characters !!!");
            continue;
        }

        // Kiểm tra định dạng ngày tháng
        String patternDate = "\\d{1,2}[/]\\d{1,2}[/]\\d{4}";
        if (!input.matches(patternDate)) {
            System.err.println("Date is in the wrong format!");
            continue;
        }

        try {
            date = dateFormat.parse(input);
            break; // Thoát khỏi vòng lặp nếu đã có giá trị hợp lệ
        } catch (ParseException e) {
            System.err.println("Date does not exist");
        }
    }

    return date; // Trả về giá trị date
}


    // Check input have letter characters
    public static boolean checkContainCharacter(String input) {
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                return true;
            }
        }
        return false;
    }
}
