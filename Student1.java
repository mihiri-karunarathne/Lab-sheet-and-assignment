public class Student1 {
    String name;
    int age;
    char grade;

    Student1(){
     name="mikiki";
    age=24;
    grade='B';
    }
    Student1(String n,int a,char g){
    name=n;
    age=a;
    grade=g;
    }
    Student1(String na,int ag){
        name=na;
        age=ag;
        grade='N';
    }
    public void displayInfo(){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("grade: "+grade);
    }
}
