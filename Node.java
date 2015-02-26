package DataStructure;

public class Node
{
    public int data;
    public Node left;
    public Node right;
    public Node(int i)
    {
        data = i;
        left = right = null;
    }
    public Node(Node d)
    {
     this.data = d.data;
     left = right = null;
    }
}