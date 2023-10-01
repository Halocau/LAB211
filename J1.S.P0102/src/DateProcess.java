package J1SP0102;
// Chương trình hiểu thị ra mỗi THỨ
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateProcess{
    public static String getDayOfWeek(Date givenDate){
        SimpleDateFormat dateFomat = new SimpleDateFormat("EEEE");
        return dateFomat.format(givenDate); // chuyển đổi đối tượng Date -> String
    }
}
/* Vì sao luôn chuyển đối tượng Date -> String
Đối tượng Date không biểu thị ngày tháng dưới dạng văn bản dễ đọc.
Bằng cách chuyển đổi nó thành chuỗi văn bản,
bạn có thể dễ dàng hiển thị và in ra thông tin ngày tháng theo định dạng mong muốn.

Ví dụ, bạn muốn in ngày dưới dạng "Ngày thứ Hai, ngày 1 tháng 1 năm 2023",
thay vì một đối tượng Date số học
*/
 
