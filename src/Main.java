public class Main {
    private static int N = 10, K = 3, count = 0;

    public static void main(String[] args) {
        for (int i = 1; i <= K; i++) {
            if ((N - i) >= 0) {
                System.out.println("первый прыжок " + i);
                prygok(N - i, 2);
            }
        }
        System.out.println("Всего путей :" + count);
    }

    private static void prygok(int remain, int prygokNumb) {
        for (int i = 1; i <= K; i++) {
            if (remain - i >= 0) {
                System.out.println("Прыжок №" + prygokNumb + "на " + i + "ступеней");
                prygok(remain - i, prygokNumb + 1);
                if ((remain - i) == 0) {
                    count++;
                    System.out.println("Найден путь №" + count);
                }
            }
        }
    }
}