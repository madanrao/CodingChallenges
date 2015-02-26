import DataStructure.*;
public class StackWithMin
{
    /*
     * Have 2 stacks. One for the actual elements and other to store min element at each level.
     * This works because the function only asks for the min value and not to pop the min value.
     * All 3 functions popFn, pushFn and minFn are Big-O(1) functions
     */
    Stack A = new Stack();
    Stack A1 = new Stack();
    
    public void pushFn(int data)
    {
        if(A1.isEmpty())
        {
            
            A1.push(data);
        }
        else
        {
            int currMin = A1.pop();
            if(currMin > data)
            {
                A1.push(data);
            }
            else
                A1.push(currMin);
                
        }
        
        A.push(data);
        
        System.out.println("Pushed "+data);
    }
    
    
    public int popFn()
    {
        if(A.isEmpty())
        return -1;
        
        int topNum = A.pop();
        A1.pop();
        
        return topNum;
    }
    
    public int minFn()
    {
        if(A1.isEmpty())
        return -1;
        
        int d = A1.pop();
        A1.push(d);
        return d;
    }
    
    
    public static void main(String args[])
    {
        StackWithMin o = new StackWithMin();
        System.out.println(o.popFn());
        o.pushFn(8);
        o.pushFn(3);
        o.pushFn(5);
        o.pushFn(9);
        System.out.println("Minimum is:"+o.minFn());
        System.out.println("Popped:"+o.popFn());
    }
}