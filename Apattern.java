//For odd numbers
import java.io.*;
import java.util.*;
import java.lang.*;

public class Main
{
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  int row = n;
	  int col = n+(n-1);
	  int newval = n-1;
	  int mid = n/2;
	  for(int i=0;i<row;i++) {
	      String str = "";
	      for(int j=0;j<col;j++) {
	          if(j<=newval && (j+i)==newval && i!=mid){
	              str = str + "*";
	          }
	          else if(j>newval && (j-i)==newval && i!=mid) {
	              str = str + "*";
	          }
	          else if(j<=newval && (j+i)>=newval && i==mid) {
	              str = str + "*";
	          }
	          else if(j>newval && (j-i)<=newval && i==mid) {
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

//For even numbers
import java.io.*;
import java.util.*;
import java.lang.*;

public class Main
{
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  int row = n;
	  int col = n+(n-1);
	  int newval = n-1;
	  int mid = n/2-1;
	  for(int i=0;i<row;i++) {
	      String str = "";
	      for(int j=0;j<col;j++) {
	          if(j<=newval && (j+i)==newval && i!=mid){
	              str = str + "*";
	          }
	          else if(j>newval && (j-i)==newval && i!=mid) {
	              str = str + "*";
	          }
	          else if(j<=newval && (j+i)>=newval && i==mid) {
	              str = str + "*";
	          }
	          else if(j>newval && (j-i)<=newval && i==mid) {
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
