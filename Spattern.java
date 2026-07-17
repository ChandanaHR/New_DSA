import java.io.*;
import java.util.*;
import java.lang.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int newmid = 0;
		int mid = n/2;
	    if(n%2 == 0)
	        newmid = mid-1;
	    else
	        newmid = mid;
		for(int i=0;i<n;i++) {
		    String str = " ";
		    for(int j=0;j<n;j++) {
		        if(i==0 || i==newmid || i==n-1)
		            str = str + "*";
		        else if((i>0&&i<newmid) && j==0)
		            str = str + "*";
		        else if(i>newmid && j==n-1)
		            str = str + "*";
		        else
		            str = str + " ";
		    }
		    System.out.println(str);
		}
	}
}
