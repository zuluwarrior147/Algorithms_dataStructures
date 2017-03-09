package Algorithms.Search;


/**
 * Created by User on 23.02.2017.
 */
public class bSearch {
    public static int binarySearch(int[] array, int value){
        int low =0;
        int high = array.length-1;
        int middle;

        while(low < high){
            middle = (high+low)/2;

            if(array[middle] == value) {
                return middle + 1;
            }
            if(array[middle]<value){
                low = middle+1;
            }
            else
                high = middle-1;
        }
        return -1;
    }

    public static int recursionSearch(int[] array, int value){
        return rSearch(array, value, 0, array.length-1);
    }

    private static int rSearch(int[] array, int value, int low, int high){
        int middle = (high+low)/2;
        if(array[middle]==value)
            return middle+1;
        else if(low>high)
            return -1;

        if(array[middle] < value)
            return rSearch(array, value, middle+1, high);
        else
            return rSearch(array, value, low, middle-1);
    }
}
