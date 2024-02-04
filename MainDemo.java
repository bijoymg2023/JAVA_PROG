package Other;
import java.io.*;

class Demo{
    synchronized void display(int a){
        System.out.println("NO:"+a);
    }
}

class Thread1 extends Thread{
    Demo d;
    int a;
    Thread1(int a){
        this.a=a;
        this.d = new Demo();
    }
    void run(){
        d.display(a);
    }
}

class Thread2 extends Thread{
    Demo d;
    int a;
    Thread2(int a){
        this.a=a;
        this.d = new Demo();
    }
    void run(){
        d.display(a);
    }
}

class Thread3 extends Thread{
    Demo d;
    int a;
    Thread3(int a){
        this.a=a;
        this.d = new Demo();
    }
    void run(){
        d.display(a);
    }
}

class MainDemo{
    public static void main(String[] args) {
        Thread1 t1 = new Thread1(1);
        Thread2 t2 = new Thread2(2);
        Thread3 t3 = new Thread3(3);

        t1.start();
        t2.start();
        t3.start();
    }
}