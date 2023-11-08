import java.util.Scanner;

public class HomeTaskLesson2 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

     task8();

    }


    public static void task1(){
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a<b){
            System.out.println("maximim is:" + b);
        }
        else if (a>b){
            System.out.println("max is:" + a);
        }
        else {
            System.out.println( "equal or try again");
        }
    }

    public static void task2(){
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max;

        if (a<b){
            max = b;
        } else {
            max = a;
        }

        if (max>c) {
            System.out.println(max);
        } else {
            System.out.println(c);
        }

    }
    public static void task3(){
        int a = scanner.nextInt();
        if(a<0){
            System.out.println("Negative:" );
        }
        else if(a>0){
            System.out.println("Positive:");

        }
        else{
            System.out.println("zero");
        }
    }


    public static void task4(){
        int a = scanner.nextInt();

        if ((a%5 == 0) && (a%11 == 0)){
            System.out.println("delitsya na 5 i 11");
        }
        else {
            System.out.println("ne delitsya na 5 and 11:");
        }

    }
    public static void task5() {
        int a = scanner.nextInt();
        if(a%2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void task6(){
        int a = scanner.nextInt();
        int leapYear = 2024;
        if(a%4==0){
            System.out.println("This is LeapYear:");
        }
        else{
            System.out.println("This is Normal year with 365 days.");
        }
    }


    public static void task7(){
        char c = '*';
        System.out.println("It is Symbol");
    }


    public static void task8(){
        String a = scanner.next();
        char ch = 'i';
        char ch1 = 'e';
        char ch2 = 'a';
        char ch3 = 'o';
        char ch5 = 'u';

        if (a.equals("a") || a.equals("e") || a.equals("i") || a.equals("o") || a.equals("u")) {
            System.out.println("VOWEL");
        }
        else{
            System.out.println("Consonant");
        }


    }



}


