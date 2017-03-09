package Data_Structures.Arrays;

/**
 * Created by User on 12.02.2017.
 */
public class Array {
    private long  [] a;
    private int nElems;

    public Array(int max)
    {
        a = new long[max];
    }

    public boolean find(long searchKey)
    {
        int i;
        for (i=0; i<nElems; i++)
            if(a[i]==searchKey)
                break;
        if(i==nElems)
            return false;
        else
            return true;
    }

    public void insert(long value)
    {
        a[nElems++] = value;
    }

    public boolean delete(long value)
    {
        int i;
        for (i=0; i<nElems; i++)
            if (value==a[i])
                break;
        if(i == nElems)
            return false;
        else
        {
            for (int j=i; j<nElems; j++)
                a[j]=a[j+1];
            nElems--;
            return true;
        }

    }

    public void show()
    {
        for (int i=0; i<nElems; i++)
            System.out.println(a[i]);
    }
}
