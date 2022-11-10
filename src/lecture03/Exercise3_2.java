package lecture03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("何行分入力しますか?");
        int num = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i<num; i++){
            System.out.println(i+1 + "行目:");
            list.add(scan.nextLine());
        }

        for(String string: list){
            System.out.println("[" + list.indexOf(string) + "] " + string);
        }
    }
}
