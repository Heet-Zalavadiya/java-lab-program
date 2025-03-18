class Member {
    String name;
    int age;
    int phonenumber;
    String address;
    double salary;

    Member(String name, int age, int phonenumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phonenumber = phonenumber;
        this.address = address;
        this.salary = salary;
    }

    void printSalary() {
        System.out.println("Salary of " + name + " is " + salary);
    }

}

class Employee extends Member {

    String specialization = "application developer";

    Employee(String name, int age, int phonenumber, String address, double salary) {
        super(name, age, phonenumber, address, salary);
    }

    void display() {
        System.out.println(name + " " + age + " " + phonenumber + " " + address + " " + specialization);
        super.printSalary();
    }
}

class Manager extends Member {
    String department = "IT";

    Manager(String name, int age, int phonenumber, String address, double salary) {
        super(name, age, phonenumber, address, salary);
    }

    void display() {
        System.out.println(name + " " + age + " " + phonenumber + " " + address + " " + department);
        super.printSalary();
    }
}

public class Member_main {
    public static void main(String[] args) {

        Employee e = new Employee("Hem", 25, 1234567890, "Puna", 200000000);
        Manager m = new Manager("Nilesh", 45, 1111111111, "Rajkot", 999999999);
        e.display();
        m.display();
    }
}
