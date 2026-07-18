import java.io.*;
import java.util.*;
import java.lang.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mid = 0;
		if(n%2!=0)
		    mid = n/2;
		else
		    mid = (n/2)-1;
		System.out.println(mid);
		for(int i=0;i<n;i++) {
		    String str = " ";
		    for(int j=0;j<n;j++) {
		        if(i==0 || j==mid)
		            str = str+"*";
		        else
		            str = str+" ";
		    }
		    System.out.println(str);
		}
	}
}
