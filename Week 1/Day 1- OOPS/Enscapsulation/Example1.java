public class Example1 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Aditya");
        System.out.println(p.getName());
    }
}

class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public  String getName() {
        return name;
    }
}