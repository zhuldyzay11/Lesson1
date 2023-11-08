import java.util.Scanner;

public class scanner {
    public static Scanner scanner = new Scanner(System.in);
//public static void zadacha() {
//    int a = scanner.nextInt();
//    int b = scanner.nextInt();
//    int c = scanner.nextInt();
//    int d = (a + b + c) / 3;
//    System.out.println("среднее число:" + d);



    public static void main(String[] args) {
    zadachka3();
    zadacha2();
//        int F = scanner.nextInt();
//        int c = ((F - 32) * 5/9);
//        System.out.println("Celcium:"+c);
    }
    public static void zadacha2() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int V = a * b * c;
        System.out.println("обьем:" + V);
    }

public static void zadachka3(){
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int S = 2 * (a * b + b * c + a * c);
    System.out.print("площадь:" + S);

}



}

