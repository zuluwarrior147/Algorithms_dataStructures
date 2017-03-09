package Algorithms.Sortings;

/**
 * Created by User on 24.02.2017.
 */
public class QuickSort {
    public static void main(String args[]) {
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

        Integer[] array = new Integer[12];

        for (int i = 1; i <= array.length; i++) {
            array[array.length - i] = i * 2;
        }

        stableQuickSort(array, 0 , array.length-1);

        for (int i : array)
            System.out.println(i);
    }

    public static void quickSort(Comparable[] a, int lo, int hi){
        if(hi>lo){
            int j = partition(a, lo, hi);
            quickSort(a, lo, j-1);
            quickSort(a, j+1, hi);
        }
    }

    public static void stableQuickSort(Comparable[] a, int lo, int hi){
        if (hi>lo){
            int lt = lo, i = lo+1, gt = hi;
            Comparable v = a[lo];

            while (i<=gt){
                int cmp = a[i].compareTo(v);

                if(cmp<0) swap(a, lt++, i++);
                else if(cmp>0) swap(a, i, gt--);
                else i++;
            }
            stableQuickSort(a, lo, lt-1);
            stableQuickSort(a, gt+1, hi);
        }
    }

    private static int partition(Comparable[] a, int lo, int hi ){
        int i = lo; int j = hi+1;
        Comparable v = a[lo];
        while(true) {
            while (a[++i].compareTo(v) <= 0) if (i == hi) break;
            while (v.compareTo(a[--j]) <= 0) if (j == lo) break;

            if(i>=j) break;

            swap(a, i,j);
        }
        swap(a,lo,j);
        return j;
    }

    private static void swap(Comparable a[], int i, int j){
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
