public class Student{
    String name;
    int age;
    char grade;

   
    Student(){
     name="miki";
    age=24;
    grade='B';
    }
    Student(String n,int a, char g){
    name=n;
    age=a;
    grade=g;
    }
    public void displayInfo(){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("grade: "+grade);
    }
}