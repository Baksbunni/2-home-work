public class Task6 {
    public static void main(String[] args) {
        //"Работа в классе"
        int i;
        for (i = 0; i <= 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
        for (int i1 = 2020; i1 < 2070; i1 = i1 + 4) {
            System.out.println("Високосный год " + i1);
        }
        for (int i2 = 5; i2 > 0; i2--) {
            System.out.println(i2);
        }
        for (int i3 = 0; i3 <= 10; i3 = i3 + 2) {
            System.out.println(i3);
        }
        int salary = 65535;
        int total = 0;
        for (int i4 = 0; i4 < 12; i4++) {
            total = total + salary;
            System.out.println(total);
        }
        int salary1 = 65535;
        total = 0;
        for (int i5 = 0; i5 < 12; i5++) {
            total = total + total / 100;
            total = total + salary1;
            System.out.println("Месяц " + i5 + " Итого " + total);
        }
        //Задача 1.
        int y;
        for (y = 1; y <= 10; y++) {
            System.out.println(y);
        }
        //Задача 2.
        int u;
        for (u = 10; u >= 1; u--) {
            System.out.println(u);
        }
        // Задача 3.
        int o;
        for (o = 0; o <= 17; o = o + 2) {
            System.out.println(o);
        }
        // Задача 4.
        for (int f = 10; f >= -10; f--) {
            System.out.println(f);
        }
        // Задача 5.
        int leapYear;
        for (int z = 1904; z <= 2096; z = z + 4) {
            System.out.println(z + " год является високосным");
        }
        // Задача 6.
        int sequenceOfNumbers;
        for (int a = 7; a <= 98; a = a + 7) {
            System.out.println(a);
        }
        // Задача 7.
        int sequenceOfNumbers2  ;
        for (int x = 8; x <= 512; x = x * 2) {
            System.out.println(x);
        }
        // Задача 8.
        int solary1 = 29000;
        int total1 = 0;
        for (int c = 0; c < 12; c++) {
            total1 = total1 + solary1;
            System.out.println("Месяц " + c + " сумма накоплений равна " + total1 + " рублей");
        }
        // Задача 9.
        int solary2 = 29000;
        int total2 = 0;
        for (int v = 0; v < 12; v++) {
            total2 = total2 + total2 / 100;
            total2 = total2 + solary2;
            System.out.println("Месяц " + v + " сумма накоплений равна " + total2 + " рублей");
        }
        // Задача 10.
        int multiplicationTable = 2;
        for (int b = 1; b <= 10; b++) {
            System.out.println(multiplicationTable + " * " + b + " = " + multiplicationTable * b );
        }

    }
}


