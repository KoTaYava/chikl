public class Main {
    public static void main(String[] args) {
       // Задача 1
        System.out.println("Задача 1");
        for(int i = 0;i <= 10; ++i) {
            System.out.println(i);
        }
        //Задача 2
        System.out.println("Задача 2");
        for (int n = 10; n > 0; --n){
            System.out.println(n);
        }
        //Задача 3
        System.out.println("Задача 3");
        for (int a = 0; a < 17; a = a +2){
            System.out.println(a);
        }
        //Задача 4
        System.out.println("Задача 4");
        for (int s = 10; s >= -10; --s){
            System.out.println(s);
        }
        //Задача 5
        System.out.println("Задача 5");
        for (int d = 1904; d <=2096; d = d +4){
            System.out.println(d);
        }
        //Задача 6
        System.out.println("Задача 6");
        for (int q = 7; q <= 98; q = q + 7){
            System.out.println(q);
        }
        //Задача 7
        System.out.println("Задача 7");
        for (int e = 1; e <= 512; e = e *2){
            System.out.println(e);
        }
        System.out.println("Задача 8");
        int salary = 29000;
        int total = 0;
        for (int r = 1; r <= 12; r++){
            total = total + salary;
            System.out.println("Месяц " + r + " сумма накоплений равна " + total + " рублей");

        }
        //Задача 9
        System.out.println("Задача 9");
        int salaryPro = 29000;
        int tot = 0;
        for (int p = 1; p <=12; p++){
            tot = tot + tot / 100;
            tot = tot + salaryPro;
            System.out.println("Месяц " + p + " сумма накоплений равна " + tot + " рублей");
        }

    }

}