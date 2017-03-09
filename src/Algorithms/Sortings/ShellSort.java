package Algorithms.Sortings;

/**
 * Created by User on 24.02.2017.
 */
public class ShellSort {
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

        int[] array =new int[12];

        for (int i =1; i<=array.length; i++){
            array[array.length-i] = i*2;
        }


        ShellSort(array);

        for (int i : array)
            System.out.println(i);
    }



    public static void ShellSort(int array[]){
        int inner, outer, temp;
        int h = 1;

        while(h <= array.length/3){
            h =h*3+1;
        }

        while(h>0){
            for(outer=h; outer<array.length; outer++){
                temp = array[outer];
                inner = outer;

                while(inner> h-1 && temp < array[inner-h]){
                    array[inner] = array[inner-h];
                    inner-=h;
                }
                array[inner] = temp;
            }
            h=(h-1)/3;
        }


    }
}
