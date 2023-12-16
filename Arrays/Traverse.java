package Arrays;

import java.util.*;

public class Traverse
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[6];

        System.out.println("Enter the elements \n");
        for (int i = 0; i<6; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Printing the elements \n");
        for(int i :arr)
        {
            System.out.println(i + " ");
        }
    }
}