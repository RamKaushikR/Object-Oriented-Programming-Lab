package pack1;
public class Dist
{
    public double convert(double n,int c)
    {
	if(c==1)
	    return (n*1000.0);
	else if(c==2)
	    return (n/1000.0);
	else if(c==3)
	    return (n/1.6);
	else if(c==4)
	    return (n*1.6);
	return 0.0;
    }
}
