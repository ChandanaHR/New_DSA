//For odd numbers
import java.io.*;
import java.util.*;
import java.lang.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int mid = n/2;
		for(int i=0;i<n;i++) {
		    String str = "";
		    for(int j=0;j<n;j++) {
		        if((i==0||i==mid||i==n-1) && (j!=n-1)) {
		            str = str + "*";
		        }
		        else if((j==0 || j==n-1) && (i!=0&&i!=mid&&i!=n-1)) {
		            str = str + "*";
		        }
		        else {
		            str = str + " ";
		        }
		    }
		    System.out.println(str);
		}
	}
}
