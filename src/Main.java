public class Main {
    public static void main(String[] args) {
        task1(1);
        task2(10);
        task3(0);
        task4(10);







    }
    public static void task1(int i) {
        for (; i <= 10; i++) {
            System.out.println(i);
        }
    }


    public static void task2(int i) {
        for (; i >= 1; i--) {
            System.out.println(i);
        }
    }


    public static void task3(int i) {
        for (; i <= 17; i = i +2) {
            System.out.println(i);
        }
    }


    public static void task4(int i) {
        for (; i >= -10; i --) {
            System.out.println(i);
        }
    }
}
