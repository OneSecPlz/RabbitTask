public class Main {
    private static int N = 4, K = 3, count = 0;

    public static void main(String[] args) {
        prygok(N, 1,"");
        System.out.println("Всего путей :" + count);
    }

    private static void prygok(int remain, int prygokNumb, String path) {
        for (int i = 1; i <= K; i++) {
            if (remain - i >= 0) {
                System.out.println("Прыжок №" + prygokNumb + " на " + i + " ступеней");
                prygok(remain - i, prygokNumb + 1,path+i+"+");
                if ((remain - i) == 0) {
                    count++;
                    System.out.println("Найден путь №" + count);
                    System.out.println("Путь:" + path+i);
                }
            }
        }
    }
}