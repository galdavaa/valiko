package valiko.lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner skaneri = new Scanner(System.in);
       char c = '7';
        while(true) {
            if (c == '7')
           System.out.println("აირჩიეთ სასურველი ნომერი ");
           System.out.println("1.დედას სახელი");
           System.out.println("2.მამას სახელი");
           System.out.println("3.ბებიას სახელი");
           System.out.println("4.ბაბუას სახელი ");
           int i = skaneri.nextInt();


           switch (i) {
               case 1:
                   System.out.println("ვალერია");
                   System.out.println();
                   break;

               case 2:
                   System.out.println("ვალერიანე");
                   System.out.println();
                   break;

               case 3:
                   System.out.println("იზოლდა");
                   System.out.println();
                   break;

               case 4:
                   System.out.println("ჯონი");
                   System.out.println();
                   break;
               default:
                   System.out.println("შეიყვანეთ 1-დან 4-მდე ციფრი");
                   System.out.println();
                   break;
           }
       }
    }
}
