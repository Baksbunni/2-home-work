public class Task7 {
    public static void main(String[] args) {
        // Работа в классе.
        int solary = 65535;
        int total = 0;
        while (total < 1_000_000) {
            total = total + total / 100;
            total = total + solary;
            System.out.println(total);
        }
        int start = 5;
        while (start > 0) {
            System.out.println(start);
            start = start - 1;
        }
        int days = 10; // изначальное кол-во дней в Париже
        if (days == 0) {
            System.out.println("Желаем приятной поездки");
        } else {
            while (days > 0) {
                days--;
                System.out.println("До конца поездки осталось " + days + " дней");
            }
            System.out.println("Путишествие окончено. Пора возвращаться домой");
        }
        int start1 = 5;
        do {
            System.out.println(start1);
            start1 = start1 - 1;
        }
        while (start1 > 0);

        int userWantsToContinue = 1;
        // Переменная, обозначающая, что юзер хочет продолжить игру
        // 1 - хочет продолжить, 0 - не хочет продолжать играть
        int level = 1;
        // Переменная со значением номера уровня
        do {
            System.out.println("Завершен уровень " + level);
            // Выводим текст с номером уровня игры
            System.out.println("Хотите продолжить?");
            // Спрашиваем, хочет ли юзер продолжить игру
            level++;
            // К переменной level прибавляем + 1, это следующий уровень
        }
        while (userWantsToContinue == 1 && level < 5);

        int points = 10;
        do {
            System.out.println("Осталось " + points + " баллов ");
            points--;
        } while (points >= 0);
        System.out.println("Игра окончена!");
        int i = 8;
        do {
            System.out.println(i);
            i++;
        } while (i < 7);
        int q = 5;
        while (q < 9) {
            System.out.println(q);
            q++;
        }
        int w = 5;
        // Начинаем цикл
        do {
            System.out.println(w);
            // Выводим результат
            w++;
            // Увеличим пременную цикла
        } while (w < 9);
        //Проверяем условие цикла
        for (int dayNumber = 1; dayNumber <= 31; dayNumber++) {
            if (dayNumber % 3 == 0) {
                System.out.println("Сегодня отдыхаем ");
                continue;
            }
            System.out.println("Сегодня рабочий день ");
        }
        // Задача 1
        int goal = 2_459_000;
        int haveMany = 0;
        int solary1 = 15000;
        int time = 0;
        while (haveMany < goal) {
            haveMany += 15000;
            time++;
            System.out.println("Месяц " + time + " сумма накоплений равна " + haveMany);
        }
        // Задача 2.
        int t = 0;
        while (t < 10) {
            t++;
            System.out.print(" " + t + " ");
        }
        System.out.println();
        for (; t > 0; t--) {
            System.out.print(" " + t + " ");
        }
        System.out.println();
        // Задача 3.
        int humanFertility = 17;// Рождаемость
        int mortalityRatePeople = 8;//Смертность
        int a = 12_000_000;
        for (int year = 1; year <= 10; year++) {
            int births = humanFertility * a / 1000;
            int death = mortalityRatePeople * a / 1000;
            int growth = births - death;
            a += growth;
            System.out.println("Год " + year + " численность населения составляет " + a);
        }
        //Задача 4.
        int initialDepositAmount = 15000;
        int z = 0;
        int m = 0;
        int money = 12_000_000;
        while (z < money) {
            m++;
            z = z + z / 100 * 7;
            z = z + initialDepositAmount;
            System.out.println("Месяц " + m + " накопление за этот месяц " + z);
        }
        // Задача 5.
        double f = 15000;
        double g = 12_000_000;
        double h = f;
        int months = 0;

        while (h < g) {
            months++;
            h *= 1.07;
            if (months % 6 == 0) {
                System.out.printf("Month %d: %.2f\n", months, h);
            }
        }
        // Задача 6.
        int n = 15000;
        int l = 9;
        int p = l * 12;
        for (int counter = 1; counter <= p; counter++) {
            n *= 1.07;
            if (counter % 6 == 0) {
                System.out.println("Месяц " + counter + " сумма накоплений равна " + n);
            }
        }
        // Задача 7.
        int firstFriday = 5;
        int daysMonth = 31;
        for (int j = firstFriday; j <= daysMonth; j += 7) {
            System.out.println("Сегодня пятница " + j + "-е число. Необходимо подготовить отчет");
        }
        // Задача 8.
        int ourYear = 2024;
        int twoHundredYear = ourYear - 200;
        int obeHundredYear = ourYear + 100;
        int cometAppearance = 0;
        int cometAppearanceRate = 79;
        while (cometAppearance < obeHundredYear) {
            if (cometAppearance > twoHundredYear) {
                System.out.println(cometAppearance);
            }
            cometAppearance+=cometAppearanceRate;
        }
    }
}
