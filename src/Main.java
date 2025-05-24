public class Main {
    public static void main(String[] args) {
        task1(1);
        task2(10);
        task3(0);
        task4(10);
        task5(1904);
        task6(7);
        task7(1);
        task8(29000, 0);
        task9(29000, 0);







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




    public static void task7(int i) {
        for (; i <= 512; i = i * 2) {
            System.out.println(i);
        }
    }



    public static void task8(int savings, int total) {
        for (int i = 1; i <= 12; i++) {
            total = total + savings;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + "рублей");
        }
    }



    public static void task9(int savings, int total) {
        for (int i = 1; i <= 12; i++) {
            total = total + total / 100;
            total = total + savings;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + "рублей");
        }
    }
}
