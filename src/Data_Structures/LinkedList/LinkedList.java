package Data_Structures.LinkedList;

/**
 * Created by User on 19.02.2017.
 */
public class LinkedList {
    private Link first;

    public LinkedList(){
        this.first = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void insertFirst(int data){
        Link newLink = new Link(data);
        newLink.next = first;
        first = newLink;
    }

    public void insert(int key){
        Link newLink = new Link(key);
        Link previous = null;
        Link current = first;

        while(current!=null && key > current.data){
            previous = current;
            current = current.next;
        }
        if(previous == null)
            first = newLink;
        else
            previous.next = newLink;
        newLink.next = current;
    }

    public int removeFirst(){
        Link temp = first;
        first = temp.next;
        return temp.data;
    }

    public void displayList(){
        Link current = first;

        while (current!=null) {
            current.displayLink();
            current = current.next;
        }
    }

    public Link find(int key)
    {
        Link current = first;
        while(current.data != key)
        {
            if(current.next == null)
                return null;
            else
                current = current.next;
        }
        return current;
    }
}
