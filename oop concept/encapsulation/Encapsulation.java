class Person{
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Prince");
        person.setAge(20);

        System.out.println("Name = " + person.getName());
        System.out.println("Age = " + person.getAge());
    }
    
}
