public class Main {
    public static void main(String[] args) {
        task1(1);
        task2(10);
        task3(0);
        task4(10);
        task5(1904);
        task6(7);







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



    public static void task5(int i) {
        for (; i <= 2096; i = i + 4) {
            System.out.println(i);
        }
    }



    public static void task6(int i) {
        for (; i <= 98; i = i + 7) {
            System.out.println(i);
        }
    }
}
