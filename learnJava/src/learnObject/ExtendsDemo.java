class Person{
    String name;
    int age;
}

class Student extends Person{
    public void study(){
        System.out.println("study");
    }
}

class Worker extends Person{
    public void work(){
        System.out.println("work");
    }
}



public class ExtendsDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "hah";
        System.out.println(s.name);
    }
}
