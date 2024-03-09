import java.io.*;
import java.util.*;

class FileExg{
    public static void main(String args[]){
    
    try{    
        File myobj1 = new File("test1.txt");
        File myobj2 = new File("test2.txt");
        
        if(myobj1.createNewFile()){
            System.out.println("NEW FILE CREATED"+myobj1.getName());
        }
        else{
            System.out.println("ALREADY EXIST"+myobj1.getName());
        }
        
        
        if(myobj2.createNewFile()){
            System.out.println("NEW FILE CREATED"+myobj2.getName());
        }
        else{
            System.out.println("ALREADY EXISTS"+myobj2.getName());
        }


        FileWriter writer1 = new FileWriter("test1.txt");
        Scanner isc = new Scanner(System.in);
        System.out.println("INPUT:");
        String inp = isc.nextLine();
        writer1.write(inp);
        writer1.close();
        isc.close();
        
        FileWriter writer2 = new FileWriter("test2.txt");
        Scanner sc = new Scanner(myobj1);
        while(sc.hasNextLine()){
            String data = sc.nextLine();
            writer2.write(data);
        }
        sc.close();
        writer2.close();
          
    }
    
    catch(IOException e){
        System.out.println("Error Occured");
        System.out.println("\n"+e);

    }

    finally
    {
        System.out.println("Copied Successfully");
    }

    }

}

