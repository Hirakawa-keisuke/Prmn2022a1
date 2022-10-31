package lecture01;

public class Kadai5 {
    public static void main(String[] args) {
        int[] score = {41, 85, 72, 38, 80};
        int minScore = min(score);
        int maxScore = max(score);
        double averageScore = average(score);

        for(int i = 0;i < score.length;i++){
            if(100 >= score[i] && score[i] >= 90) {
                System.out.println(i + "番" + score[i] + "点" + " 秀");
            }else if(90 > score[i] && score[i] >= 80) {
                System.out.println(i + "番" + score[i] + "点" + " 優");
            }else if(80 > score[i] && score[i] >= 70) {
                System.out.println(i + "番" + score[i] + "点" + " 良");
            }else if(70 > score[i] && score[i] >= 60) {
                System.out.println(i + "番" + score[i] + "点" + " 可");
            }else {
                System.out.println(i + "番" + score[i] + "点" + " 不可");
            }
        }
        System.out.println("・・・・・");
        System.out.println("最高点：" + maxScore + "点");
        System.out.println("最低点" + minScore + "点");
        System.out.println("平均点" + averageScore + "点");
        System.out.println("・・・・・");
    }

    static int min(int[] array){
        int minScore = array[0];
        for(int i = 1;i < array.length;i++){
            if(minScore > array[i]){
                minScore = array[i];
            }
        }
        return minScore;
    }

    static int max(int[] array){
        int maxScore = array[0];
        for(int i = 1;i < array.length;i++){
            if(maxScore < array[i]){
                maxScore = array[i];
            }
        }
        return maxScore;
    }

    static double average(int[] array){
        double sum = 0;
        for(int i = 0;i < array.length;i++){
            sum += array[i];
        }
        double averageScore = sum / array.length;
        return averageScore;
    }
}
