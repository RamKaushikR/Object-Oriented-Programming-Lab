import java.util.Scanner;
class Search
{
    static int linearsearch(int[] a, int v)
    {
	for(int i=0;i<a.length;i++)
	{
	    if(a[i]==v)
		return i;
	}
	return -1;
    }
    static void sort(int[] a)
    {
	for(int i=0;i<a.length-1;i++)
	{
	    for(int j=i+1;j<a.length;j++)
	    {
		if(a[j]<a[i])
		{
		    int t=a[i];
		    a[i]=a[j];
		    a[j]=t;
		}
	    }
	}
    }
    static void display(int[] a)
    {
	for(int i=0;i<a.length;i++)
	    System.out.print(a[i]+" ");
    	System.out.print("\n");
    }
    static int binarysearch(int[] a, int v)
    {
	sort(a);
	System.out.println("Sorted Array: ");
	display(a);
	int b=0,e=a.length-1,m;
	while(b<=e)
	{
	    m=(b+e)/2;
	    if(a[m]==v)
		return m;
	    else if(a[m]<v)
		b=m+1;
	    else
		e=m-1;
	}
	return -1;
    }
    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
	int n,v,a[];
	System.out.println("Enter the size ");
	n = in.nextInt();
	a = new int[n];
	System.out.println("Enter the array ");
	for(int i=0;i<n;i++)
	    a[i] = in.nextInt();
	System.out.println("Enter the element to be searched ");
	v = in.nextInt();
	int l = linearsearch(a,v);
	int b = binarysearch(a,v);
	if(l==-1)
	    System.out.println("Element is absent");
	else
	{
	    System.out.println("Element is found at "+l+"&"+b);
	}
    }
}
	
