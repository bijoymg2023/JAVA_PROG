import java.io.*;
import java.util.*;

class Palin{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");
        String st =sc.nextLine(); 
        int len = st.length();
        int flag=0; 
        for(int i=0 ; i<=len/2 ; i++){
            if (st.charAt(i)!=st.charAt(len-1-i)){
                flag=1;
                break;
            }
        }

        if (flag==0){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }


    }
}
