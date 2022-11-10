package lecture03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<2;i++){
            System.out.println(i+1 + "つ目の整数を入力してください:");
             list.add(scan.nextInt());
        }
        int sum = list.get(0) + list.get(1);
        System.out.println(list.get(0) + " + " + list.get(1) + " = " + sum);
    }
}
