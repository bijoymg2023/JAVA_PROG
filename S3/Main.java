import java.io.*;
import java.util.*;

class Prime extends Thread{

Prime(int a){
System.out.println("PRIME:"+a);
 }

}

class Composite extends Thread{

Composite(int a){
System.out.println("COMPOSITE:"+a);
 
}
 

}

class Main{
    public static void main(String args[]){
        int flag = 2;
        Random rand = new Random();
        int n = rand.nextInt(10);
        

        if(n<=1){
            System.out.println("NEITHER PRIME NOR COMPOSITE:"+n);
        }
        else{
        for(int i = 2; i<=n/2 ; i++){
            
            if(n%i == 0){
                flag=1;
                break;
            }
            else{
                flag=0;
            }
       }
    }


       if (flag == 0){
        Prime t1 = new Prime(n);
        t1.start();
       }
       else if (flag == 1){
        Composite t2 = new Composite(n);
        t2.start();
       }


       



         

    }
}