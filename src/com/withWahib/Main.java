package com.withWahib;
import java.util.Scanner;
import java.lang.*;
class Human {
    String name,major;
    double wight;
    double heghit;
    int age ;
    void sleep(){
        System.out.println("zzz");
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        Human wahib=new Human();
        wahib.name="وهيب هائل عبدالوارث مقبل ";
        wahib.major=" هندسة حاسوب  ";
        wahib.heghit=167.50;
        wahib.wight=64;
        wahib.age=25;
        System.out.println(" الاسم :"+wahib.name );
        System.out.println(" التخصص : "+wahib.major );
        System.out.println(" الوزن : "+wahib.wight  );
        System.out.println(" الطول : "+wahib.heghit );
        System.out.println(" العمر : "+wahib.age );
        wahib.sleep();
        Human hael=new Human();
        hael.name=" هائل عبدالوارث مقبل ";
        hael.major=" هندسة مكانيك   ";
        hael.heghit=150.50;
        hael.wight=64;
        hael.age=25;
        System.out.println(" الاسم : " +hael.name );
        System.out.println(" التخصص : "+hael.major );
        System.out.println(" الوزن : "+hael.wight  );
        System.out.println(" الطول : "+hael.heghit );
        System.out.println(" العمر : "+hael.age );
        hael.sleep();


    }
}