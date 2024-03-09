import java.io.*;
import java.util.*;

class Freqc{
    public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter string");    
    String s = sc.nextLine();

    System.out.println("Enter Charecter");
    char ch = sc.next().charAt(0);

    int count = 0;
    int len = s.length();
    for(int i=0 ; i< len ; i++){
        if(s.charAt(i)==ch){
            count++;
        }
    }

    System.out.println("FREQUENCY"+count);

}

}
