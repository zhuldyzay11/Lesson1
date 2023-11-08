import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class HomeTaskLesson1 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4A();
        task4B();
        task4C();
        task4D();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1(){
        System.out.println("Hello");
        System.out.println("Zhuldyzay Kairolla");
    }


    public static void task2(){
        int a = 74;
        int b = 36;
        int sum = a + b;
        System.out.print("sum: "+ sum);
    }


    public static void task3(){
        int l = 50;
        int c = 3;
        int div = l / c;
        System.out.print("div: " + div);
    }

    public static void task4A(){
        int m = -5;
        int n = 8;
        int p = 6;
        double a1 = -5 + 8 * 6;
        System.out.println(a1);
    }


    public static void task4B(){
        int h = 55;
        int x = 9;
        double x1 = (h+x)%x;
        System.out.println(x1);
    }

    public static void task4C(){
        int a2 = 20;
        int b2 = 3;
        int c2 = 5;
        int d2 = 8;
        int y = a2 +(-b2*c2/d2);
        System.out.println(y);
    }

    public static void task4D(){
        // 4 task - D point: 5 + 15 / 3 * 2 - 8 % 3
    System.out.println(5+15/3*2-8%3);
    }

    public static void task5() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a * b);
    }

    public static void task6(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a*b);
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a%b);
    }

    public static void task7(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 1; i <= 10 ; i++) {    //i это на сколько раз надо прибавлять каждый раз
            System.out.println(a*i);
        }
    }


    public static void task8(){
        System.out.println("   J    a   v     v  a");
        System.out.println("   J   a a   v   v  a a ");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
    }


    public static void task9(){
        //   ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
        double a = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println(a);
    }


    public static void task10(){
        // 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
        double a = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println(a);
    }
}