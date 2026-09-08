class Practice1 {
    public static void main(String[] args) {
     Student s1 = new Student();
     s1.name = "Vedant";
     s1.rollno = 1;
     s1.age = 20;
     s1.College = "ABC College";
     s1.markAttendance();
     s1.print();
    }
}

class Student{
    String name; 
    int rollno;
    int age;
    String College;
    void markAttendance(){
        System.out.println("Attendance marked for " + name);
    }
    void print(){
        System.out.println("Name: " + name + ", Roll No: " + rollno + ", Age: " + age + ", College: " + College);
    }
}