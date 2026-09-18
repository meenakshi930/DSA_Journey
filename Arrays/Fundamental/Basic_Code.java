package fundamentals;

import java.util.Scanner;

public class Basic_Code {

    public static void main(String[] args) {

        // ==========================================
        // 1. Primitive Array
        // ==========================================

        // Primitive array (int, char, boolean, etc.)
        int[] arr = {10, 20, 30, 40};
        int n = arr.length;

        System.out.print("Primitive Array -> ");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();


        // ==========================================
        // 2. Non-Primitive Array
        // ==========================================

        // Non-primitive array (String, Integer, etc.)
        String[] names = {"Lakshit", "Rahul", "Pankaj"};

        System.out.print("Non-Primitive Array -> ");

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }

        System.out.println();


        // ==========================================
        // 3. Operations on Array Elements
        // ==========================================

        // 3.1 Access Array Elements

        System.out.print("Accessing element -> ");
        System.out.println(arr[3]);


        // 3.2 Update Array Elements

        System.out.print("Update and print element -> ");

        arr[0] = 90;

        System.out.println(arr[0]);


        // 3.3 Traverse Array

        int[] arr2 = {10, 20, 30, 40, 50};

        System.out.print("Traversing arr2 -> ");

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println();


        // ==========================================
        // 4. Input / Output
        // ==========================================

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");

        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];

        System.out.println("Enter " + n1 + " elements:");

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Input Array -> ");

        for (int i = 0; i < n1; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();


        // ==========================================
        // 5. Find Maximum Element
        // ==========================================

        int max = arr1[0];

        for (int i = 1; i < arr1.length; i++) {

            if (arr1[i] > max) {
                max = arr1[i];
            }
        }

        System.out.println("Maximum element -> " + max);


        sc.close();
    }
}