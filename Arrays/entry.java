//WAP to insert elements in array
//this code has errors
//Working on it -> The function ToPrintOrNotToPrint() is not printing the array 
package Arrays;

import java.util.*;

public class entry {

    static void ToPrintOrNotToPrint(int b, int a[]) {
        int B = b;
        int i = 0;
        while (B >= i) {
            System.out.print(a[i] + "\t");
            i++;
        }
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = 9, i = 0;
        int[] a = new int[b];
        System.out.print("Enter the elements");
        while (b >= i) {
            a[i] = sc.nextInt();
            b--;
        }
        System.out.println("oops! out of storage space. \n Press 1 to show elements and 0 to exit");
        int choice = sc.nextInt();

        if (choice == 1)
            ToPrintOrNotToPrint(b, a);
        else
            System.out.println("Adios");
    }
}
