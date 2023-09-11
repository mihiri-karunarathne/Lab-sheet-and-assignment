public class Main1 {
  
    public static void main(String []args){
        Student1 s1=new Student1();
        Student1 s2=new Student1("kik",23,'A');
        Student1 s3 = new Student1("won",25);
        System.out.println("student 1 info:");
        s1.displayInfo();
        System.out.println();
        System.out.println("student 2 info:");
        s2.displayInfo();
        System.out.println();
        System.out.println("student 3 info:");
        s3.displayInfo();
    }  
}
