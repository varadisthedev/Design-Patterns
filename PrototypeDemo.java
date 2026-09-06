// Prototype creates a new object by copying an existing object

class Student implements Cloneable {
    String name;

    Student(String name) {
        this.name = name;
    }

    @Override 
    public Student clone()  {
        try{
            return (Student) super.clone();

        }catch(CloneNotSupportedException e){
            System.out.println(e);
        }
        return null;
    }
}

public class PrototypeDemo {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("Varad");

        Student s2 = s1.clone();

        System.out.println(s1.name);
        System.out.println(s2.name);

        System.out.println(s1.equals(s2)); // false
    }
}