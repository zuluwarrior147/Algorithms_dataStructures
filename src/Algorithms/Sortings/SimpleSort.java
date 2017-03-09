package Algorithms.Sortings;

import com.sun.org.apache.bcel.internal.generic.Select;

import java.util.Scanner;

import Algorithms.Search.*;
/**
 * Created by User on 23.02.2017.
 */
public class SimpleSort {
    public static void main(String args[]){
        int[] array = new int[10];
        Scanner in = new Scanner(System.in);

        for(int i=0; i<array.length; i++){
            array[i] = in.nextInt();
        }

        System.out.println("Before:");

        for (int i : array){
            System.out.println(i);
        }

        InsertionSort(array);

        System.out.println("After");

        for (int i : array){
            System.out.println(i);
        }

        System.out.print(bSearch.recursionSearch(array, -4));
    }

    static void BubbleSort(int[] array){
        for(int i=1; i<array.length; i++){
            for(int j = 0; j<array.length-i; j++){
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    static void SelectionSort(int[] array){
        for (int i=0; i<array.length-1; i++){
            int min = i;
            for(int j=i+1; j<array.length; j++){
                if(array[min]>array[j]){
                    min = j;
                }

            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    static void InsertionSort(int[] array){
        int j;
        for (int i=1; i<array.length; i++){
            int out = array[i];
            j=i;
            while(j>0 && out<array[j-1]){
                array[j] = array[j-1];
                j--;
            }
            array[j]=out;
        }
    }
}
