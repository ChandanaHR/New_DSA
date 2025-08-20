import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        String str = "HELLO";
        for(int i=0;i<str.length();i++) {
            for(int j=0;j<str.length()-i;j++) {
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
}

HELLO
HELL
HEL
HE
H
