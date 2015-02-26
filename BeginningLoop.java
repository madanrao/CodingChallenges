package LinkedListProblems;
import DataStructure.*;

public class BeginningLoop
{
   /*
    * Ratta Method: take 2 pointers n1 and n2. Move n1 one step forward and n2 two steps forward.
    * They will first meet at a point that is K steps away from the start of the LL. Move n1 to head.
    * Move both one step forward. This time n1 meets n2 at the starting point.
    */
   
   public void findStart(Node head)
   {
       Node n1 = head;
       Node n2 = n1;
       
       do{
          n1 = n1.left;
          n2 = n2.left.left;
        }while(n1!=n2);
        
        n1 = head;
        
        while(n1!=n2)
        {
            n1 = n1.left;
            n2 = n2.left;
        }
        
        System.out.print("Beginning : "+n1.data);
        
    }
   
   
   public static void main(String args[])
   {
       Node head = new Node(1);
       Node one = new Node(4);
       one.left = new Node(2);
       Node two = new Node(3);
       one.left.left = two;
       two.left = new Node(5);
       Node three = new Node(7);
       three.left = new Node(8);
       two.left.left = three;
       three.left.left = two;
       
       head.left = one;
       
       
       BeginningLoop loop = new BeginningLoop();
       
       loop.findStart(head);
   }
}
