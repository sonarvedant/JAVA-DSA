public class vs{
    public static void main(String[] args) {
        Student s1 = new Student(); 
        s1.name = "vedant";
        s1.rollno = 1;
        s1.college = "abc";
        s1.markattendence();
        s1.print();

        Student s2 = new Student(); 
        s2.name = "krishna";
        s2.rollno = 2;
        s2.college = "abc";
        s2.markattendence();
        s2.print();
    }
}
    class Student{
        String name ;
        int rollno;
        String college;

        void markattendence(){
            System.out.println("attendence marked of "+ name);
        }
        void print(){
            System.out.println("name: "+ name + " rollno: "+ rollno + " college: "+ college);

        }
    }
