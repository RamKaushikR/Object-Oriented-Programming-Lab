package pack1;
public class Time
{
    public double convert(double n, int c)
    {
	if(c==1)
	    return (n*60.0);
	else if(c==2)
	    return (n/60.0);
	else if(c==3)
	    return (n*3600.0);
	else if(c==4)
	    return (n/3600.0);
	else if(c==5)
	    return (n*60.0);
	else if(c==6)
	    return (n/60.0);
	return 0.0;
    }
}
