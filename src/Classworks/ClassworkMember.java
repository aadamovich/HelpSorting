package Classworks;

public class ClassworkMember {
    public static void main(String[] args) {

        Employee employee = new Employee();
        Manager manager = new Manager();

        employee.name = "John";
        employee.age = 35;
        employee.phoneNumber = "+ 2 15464321654";
        employee.address = "Klavu street";
        employee.salary = 2000;
        employee.specialization = "Driver";

        employee.printSalary();

        manager.name = "Monta";
        manager.age = 40;
        manager.phoneNumber = "+ 2 354646535465";
        manager.address = "Kirsu street";
        manager.salary = 15465;
        manager.department = "Logistis";


        manager.generalInfo();
        employee.generalInfo();

    }
}
