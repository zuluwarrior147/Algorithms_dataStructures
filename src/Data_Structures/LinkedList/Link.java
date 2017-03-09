package Data_Structures.LinkedList;

/**
 * Created by User on 19.02.2017.
 */
public class Link {
    public int data;
    public Link next;

    public Link(int data){
        this.data = data;
    }

    public void displayLink()
    {
        System.out.print("{" + data + "} ");
    }
}
