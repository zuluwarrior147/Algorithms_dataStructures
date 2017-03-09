package Algorithms.Sortings;

import java.util.Scanner;

/**
 * Created by User on 25.02.2017.
 */
public class RadixSort {

    public static void RadixSort(int[] a){
        int i, m = a[0], exp = 1, n = a.length;
        int[] b = new int[a.length];
        for (i = 1; i < n; i++)
            if (a[i] > m)
                m = a[i];
        while (m / exp > 0)
        {
            int[] bucket = new int[a.length];

            for (i = 0; i < n; i++)
                bucket[(a[i] / exp) % 10]++;
            for (i = 1; i < 10; i++)
                bucket[i] += bucket[i - 1];
            for (i = n - 1; i >= 0; i--)
                b[--bucket[(a[i] / exp) % 10]] = a[i];
            for (i = 0; i < n; i++)
                a[i] = b[i];
            exp *= 10;
        }
    }



        public static void main(String[] args)
        {
            Scanner scan = new Scanner( System.in );
            System.out.println("Radix Sort Testn");
            int n, i;
            System.out.println("Enter number of integer elements");
            n = scan.nextInt();
            int arr[] = new int[ n ];
            System.out.println("nEnter "+ n +" integer elements");
            for (i = 0; i < n; i++)
                arr[i] = scan.nextInt();
            RadixSort(arr);
            System.out.println("nElements after sorting ");
            for (i = 0; i < n; i++)
                System.out.print(arr[i]+" ");
            System.out.println();
        }
    }
