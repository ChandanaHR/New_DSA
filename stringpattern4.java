import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        String str = "STRING";
        int n = str.length();
        for(int i=0;i<n;i++) {
            if(i==0) {
                System.out.println(str.charAt(i));
            }
            else {
                String os = str.substring(0,i+1);
                String news = str.substring(0,i);
                String st = new StringBuilder(news).reverse().toString();
                String ns = os+st;
                System.out.println(ns);
            }
        }
    }
}

S
STS
STRTS
STRIRTS
STRINIRTS
STRINGNIRTS
