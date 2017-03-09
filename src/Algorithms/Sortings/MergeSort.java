package Algorithms.Sortings;

/**
 * Created by User on 23.02.2017.
 */

import java.util.*;

public class MergeSort {
    public static void main(String args[]){
        /*int[] array1 = new int[12];
        int[] array2 = new int[11];

        for(int i = 0; i<array1.length; i++){
            array1[i] = i*2;
        }
        for(int i=0; i<array2.length; i++){
            array2[i] = i*2+1;
        }

        for (int i : array1){
            System.out.print(i+" ");
        }

        System.out.println();

        for (int i : array2){
            System.out.print(i+" ");
        }

        int array[] = merge(array1, array2);

        for(int i : array){
            System.out.print(i+" ");
        }*/

        Integer[] array =new Integer[12];

        for (int i =1; i<=array.length; i++){
            array[array.length-i] = i*2;
        }


        mergeSort(array);

        for (int i : array)
            System.out.println(i);
    }


    private static void merge(Comparable[ ] a, Comparable[ ] tmp, int left, int right, int rightEnd )
    {
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;

        while(left <= leftEnd && right <= rightEnd)
            if(a[left].compareTo(a[right]) <= 0)
                tmp[k++] = a[left++];
            else
                tmp[k++] = a[right++];

        while(left <= leftEnd)
            tmp[k++] = a[left++];

        while(right <= rightEnd)
            tmp[k++] = a[right++];

        for(int i = 0; i < num; i++, rightEnd--)
            a[rightEnd] = tmp[rightEnd];
    }


    private static void mergeSort(Comparable [ ] a, Comparable [ ] tmp, int left, int right)
    {
        if( left < right )
        {
            int center = (left + right) / 2;
            mergeSort(a, tmp, left, center);
            mergeSort(a, tmp, center + 1, right);
            merge(a, tmp, left, center + 1, right);
        }
    }

    public static void mergeSort(Comparable [ ] a)
    {
        Comparable[] tmp = new Comparable[a.length];
        mergeSort(a, tmp,  0,  a.length - 1);
    }

}
