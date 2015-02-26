package DataStructure;
import DataStructure.*;


public class Stack
{
   
   Node top;
   
   public Stack()
   {
       top = null;
    }
    
    public void push(int data)
    {
        if(top==null)
        top = new Node(data);
        else
        {
            Node temp = new Node(data);
            temp.left = top;
            top = temp;
        }
    }
    
    public int pop()
    {
        if(top==null)
        return -1;
        else
        {
            int temp = top.data;
            top = top.left;
            return temp;
        }
      
    }
    
    public boolean isEmpty()
    {
        if(top==null)
        return true;
        
        return false;
    }
}
