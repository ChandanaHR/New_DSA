import java.io.*;
import java.util.*;
import java.lang.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mid = n/2;
		int row = n;
		int col = n+(2*mid);
		for(int i=0;i<row;i++) {
		    String str = "";
		    for(int j=0;j<col;j++) {
		        if((i==j) || ((i+j)==col-1))
		            str = str + "*";
		        else
		            str = str + " ";
		    }
		    System.out.println(str);
		}
	}
}
