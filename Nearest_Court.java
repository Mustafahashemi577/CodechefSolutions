import java.util.*;
import java.lang.*;
import java.io.*;

class Nearest_Court
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int x = scan.nextInt();
		    int y = scan.nextInt();
		    int r = Math.abs(x-y);
		    if (r%2==0)
		    System.out.println(r/2);
		    else
		    System.out.println((r/2)+1);
		}

	}
}
