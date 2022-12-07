package lecture6;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercise6_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<4;i++){
            list.add(rand.nextInt(6 + 1));
        }
        System.out.println("さいころを5つ振りました.");
        System.out.println("何番目のさいころの値を確認しますか？");
        try {
            var num = scanner.nextInt();
            System.out.println(num + "番目のサイコロの目は" + list.get(num));
        }catch (IndexOutOfBoundsException e){
            System.out.println("ArrayListの範囲外アクセスを確認しました.");
            System.out.println("プログラムを終了します.");
        }
    }
}
