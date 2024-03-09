package Other;
class Employee {
    String name;
    String address;
    int age;
    int pnum;
    int salary;
}

class Officer extends Employee {
    String specialization;

    Officer() {
        specialization = "ENGINEER";
        name = "ROHIT";
        age = 30;
        salary = 20000;
        pnum = 7302358;
        address = "SECTOR 10, MG ROAD";
    }

    void officer() {
        System.out.println("SPECIALIZATION: " + specialization);
        System.out.println("NAME: " + name);
        System.out.println("AGE: " + age);
        System.out.println("SALARY: " + salary);
        System.out.println("PHONE NO: " + pnum);
        System.out.println("ADDRESS: " + address);
    }
}

class Manager extends Employee {
    String department;

    Manager() {
        department = "LOGISTICS";
        name = "RAM";
        age = 29;
        salary = 21000;
        pnum = 73340458;
        address = "SECTOR 7, MG ROAD";
    }

    void manager() {
        System.out.println("DEPARTMENT: " + department);
        System.out.println("NAME: " + name);
        System.out.println("AGE: " + age);
        System.out.println("SALARY: " + salary);
        System.out.println("PHONE NO: " + pnum);
        System.out.println("ADDRESS: " + address);
    }
}

class EmployeeDemo {
    public static void main(String args[]) {
        Officer b1 = new Officer();
        Manager b2 = new Manager();
        System.out.println("OFFICER DETAILS\n");
        b1.officer();
        System.out.println("\nMANAGER DETAILS");
        b2.manager();
    }
}


