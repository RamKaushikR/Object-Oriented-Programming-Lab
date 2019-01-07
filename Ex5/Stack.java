import java.util.Scanner;
interface stack
{
    int is_empty();
    int is_full(int size);
    void push(int size,int val);
    int pop();
}
class StackArray implements stack
{
    int[] a=new int[10];
    int top=-1;
    public int is_empty()
    {
	if(top==-1)
	    return 0;
	else
	    return 1;
    }
    public int is_full(int size){
	if(top==size-1)
	    return 0;
	else
	    return 1;
    }
    public void push(int size,int val){
	if(is_full(size)==0)
	    System.out.println("Stack is full");
	else
	    a[++top]=val;
    }
    public int pop(){
	if(is_empty()==0)
	{
	    System.out.println("Stack is empty");
	    return -1;
	}
	else
	{
	    int x=top;
	    --top;
	    return x;
	}
    }
}
class Stack
{
    public static void main(String[] args)
    {
	int option;
	Scanner in=new Scanner(System.in);
	String val;
	int size=10;
	StackArray s=new StackArray();
	char ch;
	do
	{
	    System.out.println("1.Push 2.Pop 3.Display");
	    System.out.println("Enter option:");
	    option=in.nextInt();
	    switch(option){
	    case 1:
		val=in.next();
		try
		{
		    s.push(size,Integer.parseInt(val));
		}
		catch(NumberFormatException e)
		{
		    System.out.println("Only integers can be pushed");
		    break;
		}
		break;
	    case 2:
		int x=s.pop();
		if(x==-1)
		    System.out.println("No elements to be popped");
		else
		    System.out.println("Popped element:"+s.a[x]);
		break;
	    case 3:
		System.out.println(s.a[s.top]);
		break;
	    default:
		System.out.println("Invalid choice:");
	    }
	    System.out.println("Do you want to continue?y/n");
	    ch=in.next().charAt(0);
	}while(ch=='y');	
    }
}

		
	
