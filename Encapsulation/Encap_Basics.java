class Student{
    private String name;
     private int age;
//    public void setName(String name) {
//        this.name = name;
//    }
    public String getName() {
        return name;
    }
//    public void setAge(int age) {
//        this.age = age;
//    }

    public int getAge() {
        return age;
    }

    public void show(){
//        setData();
        System.out.println(name+" "+age);
    }
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
}
public class Encap_Basics {
    public static void main(String[] args) {
        Student obj=new Student("Aditya",20);  //call to constructor
        Student obj1=new Student("Rahul",30);
//        obj.show();
//        obj.name="Aditya Raj";
//        obj.age=20;
//        obj.setName("RAJ");
//        obj.setAge(25);
//        obj1.setName("Aditya");
//        obj1.setAge(18);
        obj.show();
        obj1.show();
        String studName=obj.getName();
        int studAge=obj.getAge();
        System.out.println(studName+" "+studAge);
    }
}
