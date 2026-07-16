import java.io.*;
import java.util.*;
import java.lang.*;

public class Main
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   int con = 0;
	   int mid = n/2;
	   int newmid = mid+1;
	   if(n%2!=0) 
	       con = mid;
	   else
	       con = mid-1;
	   for(int i=0;i<n;i++) {
	       String str = " ";
	       for(int j=0;j<n+1;j++) {
	           if((i==0||i==con) && j<=newmid)
	               str = str + "*";
	           else if(i>con && ((j-1)==i || j==0))
	               str = str + "*";
	           else if((i>0&&i<con) && (j==0||j==n-1))
	               str = str + "*";
	           else {
	               str = str + " ";
	           }
	       }
	       System.out.println(str);
	   }
	}
}
