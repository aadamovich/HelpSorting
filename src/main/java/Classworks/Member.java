package Classworks;

class Member {
    // Fields

    String name;
    int age;
    String phoneNumber;
    String address;
    int salary;

   public void printSalary(){
        System.out.println("Member salary: " + salary);
    }
    public void generalInfo(){
        System.out.println("Name: " + name + "\n Age: " + age + " \nPhone " + phoneNumber + "\n Address: " + address + "\nSalary: " + salary);
    }
}

 class Employee extends Member{
    String specialization;
}

class Manager extends Member{
    String department;
}

