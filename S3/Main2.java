class Person{
String Name;
int Age;
String Pnum;
String Address;

void displayDetails(){
System.out.println("NAME: "+Name);
System.out.println("AGE: "+Age);
System.out.println("PHONENO: "+Pnum);
System.out.println("ADDRESS "+Address);

 }

}

class Student extends Person{
String studentID;

Student(){
    Name = "RAHUL";
    Age = 18;
    Pnum = "99654375";
    Address = "MG ROAD";
    studentID = "MGP22UCS046";

}
void displayDetails(){
   
    super.displayDetails();
    System.out.println("STUDENTID:"+studentID);
}

}

class Teacher extends Person{
String subject;

Teacher(){
    Name = "RAM";
    Age = 29;
    Pnum = "99654374";
    Address = "MG ROAD";
    subject = "JAVA";

}

void displayDetails(){
   
    super.displayDetails();
    System.out.println("SUBJECT:"+subject);
}
}

class Main2{
    public static void main(String args[]){
        Student st = new Student();
        Teacher th = new Teacher();
        
        st.displayDetails();
        th.displayDetails(); 
    }
}