import java.io.*;
import java.util.*;
import java.lang.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mid = n/2;
		for(int i=0;i<n;i++) {
		    String str = "";
		    for(int j=0;j<n;j++) {
		        if(i<mid && j==n-i-1 || j==0)
		            str = str + "*";
		        else if(i>=mid && i==j || j==0)
		            str = str + "*";
		        else 
		            str = str + " ";
		    }
		    System.out.println(str);
		}
	}
}
