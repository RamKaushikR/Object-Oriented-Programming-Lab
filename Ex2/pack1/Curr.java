package pack1;
public class Curr
{
    public double convert(double n, int c)
    {
	if(c==1)
	    return (n*70.0);
	else if(c==2)
	    return (n/70.0);
	else if(c==3)
	    return (n*84.0);
	else if(c==4)
	    return (n/84.0);
	else if(c==5)
	    return (n*0.6);
	else if(c==6)
	    return (n/0.6);
	return 0.0;
    }
}

