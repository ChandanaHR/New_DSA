//Even numbers
import java.io.*;
import java.util.*;
import java.lang.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mid = n/2-1;
		for(int i=0;i<n;i++) {
		    String str = "";
		    for(int j=0;j<n;j++) {
		        if((i==0||i==mid))
		            str = str + "*";
		        else if((i!=0||i!=mid) && j==0)
		            str = str + "*";
		    }
		    System.out.println(str);
		}
	}
}

//Odd numbers
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
		        if((i==0||i==mid))
		            str = str + "*";
		        else if((i!=0||i!=mid) && j==0)
		            str = str + "*";
		    }
		    System.out.println(str);
		}
	}
}
