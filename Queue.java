package DataStructure;
import DataStructure.*;
public class Queue
{
    /*2 pointers front and back*/
    Node front;
    Node back;
    public void enqueue(Node data)
    {
        if(front==null)
        {
            front = new Node(data);
            back = front;
        }
        else
        {
            back.left = new Node(data);
            back = back.left;
        }
    }
    
    public Node dequeue()
    {
        if(front!=null)
        {
             Node ret = front;
            front = front.left;
            return ret;
        }
        return null;
    }
}