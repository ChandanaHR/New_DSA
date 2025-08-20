import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        String str = "STRING";
        for(int i=0;i<str.length();i++) {
            System.out.print(str.substring(i, str.length()));
            System.out.println();
        }
    }
}

STRING
TRING
RING
ING
NG
G
