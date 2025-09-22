import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = n+3;
        int col = n*2-1;
        char[][] mat = new char[row][col];
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                mat[i][j] = '*';
            }
        }
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        int newrow = row-n;
        System.out.println(newrow);
        int nl = newrow;
        System.out.println(nl);
        int nr = newrow;
        System.out.println(nr);
        int mid = col/2;
        System.out.println(mid);
        for(int i=0;i<mid;i++) {
            nl++;
            for(int j=0;j<=i;j++) {
                mat[nl][j] = ' ';
             }
         }
         for(int i=col-1;i>mid;i--){
             nr++;
             for(int j=i;j<=col-1;j++) {
                 mat[nr][j] = ' ';
             }
         }
        System.out.println();
        System.out.println();
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<newrow;i++) {
            for(int j=0;j<col;j++) {
                mat[i][j] = ' ';
            }
        }
        System.out.println();
         for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        int newmid1 = mid-1,newmid2=mid*2;
        System.out.println(newmid2);
        for(int i=newrow-1;i>=0;i--) {
            for(int j=newrow-1-i;j<=newmid1;j++) {
                mat[i][j] = '*';
            }
            newmid1--;
        }
        System.out.println(newrow);
        for(int i=newrow-1;i>=0;i--) {
            for(int j=row-1-i;j<=newmid2;j++) {
                mat[i][j] = '*';
            }
            newmid2--;
        }
        System.out.println();
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
