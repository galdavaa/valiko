package valiko.lesson2;

public class Main {
    public static void main(String[] args) {
        Person nika = new Person("nika", 17);
        System.out.println(nika);
        nika.game(2);
        nika.go("school");


        Person luka = new Person("luka", 17);
        luka.eat(20 , "luka","shaurma" );
        nika.eat(30, "nika", "shaurma" );




    }
}
