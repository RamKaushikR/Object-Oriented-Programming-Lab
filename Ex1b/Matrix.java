import java.util.Scanner;
class Matrix
{
    static int m,n,b[][],c[][],a[][],s[][],x,y,p,r[][],t[][],mu[][];
    static void matadd()
    {
	for(int i=0;i<b.length;i++)
	{
	    for(int j=0;j<b[i].length;j++)
	    {
		a[i][j]=c[i][j]+b[i][j];
	    }
	}
    }
    static void matsub()
    {
	for(int i=0;i<a.length;i++)
	{
	    for(int j=0;j<a[i].length;j++)
	    {
		s[i][j]=b[i][j]-c[i][j];
	    }
	}
    }
    static void matmul()
    {
	int m=r.length,p=t[0].length,n=r[0].length;
	for(int i=0;i<m;i++)
	{
	    for(int j=0;j<p;j++)
	    {
		mu[i][j]=0;
		for(int k=0;k<n;k++)
		{
		    mu[i][j]+=r[i][k]*t[k][j];
		}
	    }
	}
    }
    static void display(int[][] z)
    {
	for(int i=0;i<z.length;i++)
	{
	    for(int j=0;j<z[i].length;j++)
	    {
		System.out.print(z[i][j]+" ");
	    }
	    System.out.print("\n");
	}
    }
    public static void main(String[] args)
    {
	System.out.println("Enter the dimensions for + & -");
	Scanner in = new Scanner(System.in);
	m = in.nextInt();
	n = in.nextInt();
	b = new int[m][n];
	c = new int[m][n];
	a = new int[m][n];
	s = new int[m][n];
	System.out.println("Enter matrix A");
	for(int i=0;i<m;i++)
	{
	    for(int j=0;j<n;j++)
		b[i][j] = in.nextInt();
	}
	System.out.println("Enter matrix B");
	for(int i=0;i<m;i++)
	{
	    for(int j=0;j<n;j++)
		c[i][j] = in.nextInt();
	}
	matadd();
	matsub();
	System.out.println("Sum=");
	display(a);
	System.out.println("Difference=");
	display(s);
	System.out.println("Enter the dimensions for *");
	x=in.nextInt();
	y=in.nextInt();
	p=in.nextInt();
	r=new int[x][y];
	t=new int[y][p];
	mu=new int[x][p];
	System.out.println("Enter matrix A");
	for(int i=0;i<x;i++)
	{
	    for(int j=0;j<y;j++)
		r[i][j] = in.nextInt();
	}
	System.out.println("Enter matrix B");
	for(int i=0;i<y;i++)
	{
	    for(int j=0;j<p;j++)
		t[i][j] = in.nextInt();
	}
	matmul();
	System.out.println("Product=");
	display(mu);
    }
}
	
