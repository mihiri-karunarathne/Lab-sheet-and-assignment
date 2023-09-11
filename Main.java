public class Main {
    public static void main(String []args){
        Student s1=new Student();
        Student s2=new Student("kik",23,'A');
        System.out.println("student 1 info:");
        s1.displayInfo();
        System.out.println();        
        System.out.println("student 2 info:");
        s2.displayInfo();
    }
}
