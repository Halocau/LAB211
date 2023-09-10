/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J1SP0001;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J1SP0001 {

    private static final Scanner sc = new Scanner(System.in);

    //Check input number user exeption
    private static int checkInput() {
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
                if (result <= 0) {
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

    // check user enter number of array
    private static int sizeInput() {
        System.out.println("Enter number of array: ");
        int n = checkInput();
        return n;
    }

    // use ramdom becase test array
    private static int[] RandomArray(int[] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100); // You can adjust the range as needed
        }
      return arr;
    }

    // bubble sort
    private static void arrayBubbleSort(int[] arr) {
        System.out.print("Unsorted array: ");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.println(arr[i] + "]");
            }
        }

        System.out.print("Sorted array: ");
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
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
        int n = sizeInput(); // Get the number of array elements from the user|| elsments: phan tu
        int[] arr = new int[n];//Create a new array with size n
        RandomArray(arr);
        arrayBubbleSort(arr); // Sort the array

    }

}
