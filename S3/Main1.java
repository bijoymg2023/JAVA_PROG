import java.io.*;
import java.lang.*;

class UpperCase extends Thread{

public void run(){
try{
for( char i = 'a' ; i<= 'z' ; i++){
    System.out.println(i+" ");
   Thread.sleep(500);
}
}
catch(InterruptedException e){
System.out.println(e);
}
}
}


class LowerCase extends Thread{
    public void run(){
        try{
        for( char i = 'A' ; i<= 'Z' ; i++){
            System.out.println(i+" ");
           Thread.sleep(500);
        }
        }
        catch(InterruptedException e){
        System.out.println(e);
        }
        }

}

class Main1{
    public static void main(String args[]){
        UpperCase t1 = new UpperCase();
        LowerCase t2 = new LowerCase();
        t1.start();
        t2.start();    
    }
}