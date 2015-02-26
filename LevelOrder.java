package DataStructure; 

public class LevelOrder
{
    public void printLevel(Node root)
    {
        if(root==null) return;
        
        int height = getHeight(root);
        System.out.println("Height = "+height);
        for(int i=1;i<=height;i++)
        {
            printGivenLevel(root,i);
        }
    }
    public void printGivenLevel(Node root,int level)
    {
        if(root==null) return;
        if(level==1)
            System.out.print(root.data);
        else
        {
            System.out.println();
            printGivenLevel(root.left,level-1);
            printGivenLevel(root.right,level-1);
        }
    }
    
    public int getHeight(Node root)
    {
        if(root==null) 
            return 0;
        return 1 + Math.max(getHeight(root.left),getHeight(root.right));
    }
    public static void main(String args[])
    {
        LevelOrder o = new LevelOrder();
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        
        o.printLevel(root);
    }
}
