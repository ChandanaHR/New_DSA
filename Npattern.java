import java.io.*;
import java.lang.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
		    String str = " ";
		    for(int j=0;j<n;j++) {
		        if((j==0||j==n-1) || (i==j)) {
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
