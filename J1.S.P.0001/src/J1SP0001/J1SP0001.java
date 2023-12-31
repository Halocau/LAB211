package J1SP0001;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J1SP0001 {

    private static final Scanner sc = new Scanner(System.in);
    // no override. Help user don't change input date source
    //Check input number user exeption

    private static int checkInput() {
        //creates an infinite loop, until the user enters a positive integer
        //tạo một vòng lặp vô hạn, cho đến khi người dùng nhập một số nguyên dương
        while (true) {
            try {
                int result = Integer.parseInt(sc.next().trim());
                /*
                1.
                sc.next() => return String
                trim() => remove character white space enter by user
                2. Integer.parseInt(): convert String to int
                Example: enter string "  123  " => 123 
                         enter string  "nsf" = > exeption
                 */
                //mistake negative
                if (result < 0) {
                    System.err.println("Please enter a positive number");
                    System.out.println("Enter again: ");
                } else {
                    return result;
                }
            } catch (NumberFormatException e) {
                //When a string cannot be converted to an integer, an error is reported
                System.err.println("Please enter a positive number");
                System.out.println("Enter again: ");
            }
        }
    }

    // use ramdom becase test array
    private static int[] RandomArray(int[] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(201) - 100;
            //r.nextInt 0 -> 200
            // r.nextInt(201) - 100 || -100 -> 100
            // nếu giáo viên bảo muốn chạy ramdom ko giới hạn thì sửa lại r.nextInt
        }
        return arr;
    }

    // Sort the array using by BubbleSort
    private static void arrayBubbleSort(int[] arr) {
        //Show unsorted array
        System.out.print("Unsorted array: ");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.println(arr[i] + "]");
            }
        }
        //After using by BubbleSort
        System.out.print("Sorted array: ");
        int temp;
        boolean check;
        for (int i = 0; i < arr.length; i++) {
            check = false;
            for (int j = 0; j < arr.length - i  -1; j++) {
                 if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    check = true;
                 }
            }
            if(check==false){
                break;
            }
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.println(arr[i] + "]");
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter number of array: ");
        int n = checkInput(); // Get the number of array elements from the user|| elsments: phan tu
        int[] arr = new int[n];//Create a new array with size n
        RandomArray(arr);
        arrayBubbleSort(arr); // Sort the array

    }

}