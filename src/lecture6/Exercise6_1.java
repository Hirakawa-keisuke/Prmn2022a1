package lecture6;

import java.util.Scanner;

public class Exercise6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("小数値を入力してください:");
        try {
            var scna = scanner.nextDouble();
            System.out.println("入力した値: " + scna);
        }catch (Exception e){
            System.out.println("エラー.");
        }
    }
}
