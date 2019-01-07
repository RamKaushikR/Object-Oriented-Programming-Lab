import java.util.Scanner;
interface Array
{
    public int push(int top, int val);
    public int pop(int top);	    
}
class St implements Array
{
    int[] a = new int[10];
    public int push(int top, int val)
    {
	if(top<10)
	{
	    top++;
	    a[top]=val;
	}
	return top;
    }
    public int pop(int top)
    {
	if(top>=0)
	    top--;
	return top;
    }
    void display(int top)
    {
	System.out.println(a[top]);
    }
    void input()
    {
	int n,top=0,val;
	Scanner in = new Scanner(System.in);
	n=in.nextInt();
	for(int i=0;i<n;i++)
	{
	    val=in.nextInt();
	    top=push(top,val);
	}
	display(top);
	top=pop(top);
	display(top);
	val=in.nextInt();
	top=push(top,val);
	display(top);
    }
}
class Stack1
{
    public static void main(String[] args)
    {
	St s = new St();
	s.input();
    }
}
