package Algorithms.Sortings;

/**
 * Created by User on 26.02.2017.
 */

import Data_Structures.LinkedList.*;

import java.util.Scanner;

public class BucketSort {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner( System.in );
        System.out.println("Bucket Sort Test");
        int n, i;
        System.out.println("Enter number of integer elements");
        n = scan.nextInt();
        int arr[] = new int[ n ];
        System.out.println("nEnter "+ n +" integer elements");
        for (i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        BucketSort(arr);
        System.out.println("nElements after sorting ");
        for (i = 0; i < n; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }


    public static void BucketSort(int[] a){
        //creating array of lists
        LinkedList[] buckets = new LinkedList[a.length];

        //searching the maximum
        int m = a[0];
        for (int i : a){
            if (i > m)
                m = i;
        }

        //inserting elements from a to buckets in right order
        for(int i = 0; i < a.length; i++){
            int index = Math.abs((a[i]*a.length))/(m+1);
            if(buckets[index] == null)
                buckets[index] = new LinkedList();
            buckets[index].insert(a[i]);
        }

        //put sorted elements
        int count = 0;
        for(LinkedList i : buckets){
            if (i == null)
                continue;
            while(!i.isEmpty()){
                a[count++] = i.removeFirst();
            }
        }
    }
}
