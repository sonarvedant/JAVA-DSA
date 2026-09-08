public class Practice2 {
    public static void main(String[] args){
        Student s1 = new Student();   
        Student s2 = new Student("Krishna", 2, 21, "XYZ College");
        Student s3 = new Student("Rohit", 3, 22, "PQR College");
        Student s4 = new Student("Vedant", 1, 20);
        s1.printDetails();
        s2.printDetails();
        s3.printDetails();
        s4.printDetails();
    }
}

class Student{
    String name;
    int rollno;
    int age;    
    String College;

    Student(){
        // default constructor
    }

    Student(String name, int rollno, int age){
        // parameterized constructor
        this.name = name;
        this.rollno = rollno;
        this.age = age;
    }

    Student(String name, int rollno, int age, String College){
        // parameterized constructor
        this.name = name;
        this.rollno = rollno;
        this.age = age;
        this.College = College;
    }

    void printDetails(){
        System.out.println("Name= " + name + ", Roll No= " + rollno + ", Age= " + age + ", College= " + College);
    }

}