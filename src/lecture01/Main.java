package lecture01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int studentNumber = 2201980;
        System.out.println("B" + studentNumber + " Hirakawa Keisuke");

        System.out.println("年齢を入力");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if (age < 20){
            System.out.printf("I am " + age + " years old so I cannot drink liquor.");
        }else {
            System.out.printf("I am " + age + " years old so I can drink liquor.");
        }
    }

}
