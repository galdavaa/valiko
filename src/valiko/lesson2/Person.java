package valiko.lesson2;

public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void game(int hours) {
        System.out.println("gaming " + hours + " hours");
    }

    public void eat(int minutes, String name, String sajmeli ) {
        System.out.println(name + " eating " + minutes + " minutes " + sajmeli );
    }

    public void sleep(int hours) {
        System.out.println("sleeping " + hours + " hours");
    }

    public void go(String d) {
        System.out.println(" going " + d);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "სახელი='" + name + '\'' +
                ", ასაკი=" + age +
                '}';
    }
}
