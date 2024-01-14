public class Task5 {
    public static void main(String[] args) {
        // Работа в классе.
        int dayOfWeekNumber = 3;
        switch (dayOfWeekNumber) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверн");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Сббота");
                break;
            case 7:
                System.out.println("Воскресенье");
            default:
                System.out.println("Такого дня нету");
        }
        //Задача1
        int clientOs = 0;
        if (clientOs == 0) {
            System.out.println("Вы пользуетесь Ios. Установите версию приложения для Ios по ссылке");
        } else if (clientOs == 1) {
            System.out.println("Вы используете Android. Скачайте версию приложения для Android");
        }
        // Задача 2.
        int clientDeviceYear = 2015;
        if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченую версию приложения Ios" + clientOs + " по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android " + clientOs + " по ссылке");
        }
        //Задача 3.
        int year = 2021;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не являеться високосным");
        }
        // Задача 4.
        int deliveryDistance = 95;
        int deliveryTime = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка в пределах " + deliveryDistance + " занимает" + deliveryTime);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryTime++;
            System.out.println("Доставка в пределах  " + deliveryDistance + "доставка занимает" + deliveryTime);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime += 2;
            System.out.println("Доставка в пределах " + deliveryDistance + " доставка занимает " + deliveryTime);
        } else if (deliveryDistance > 100)
            System.out.println("Доставки нет");

        // Задача 5.
        int monthNumber = 12;
        String season = null;
        switch (monthNumber) {
            case 1:
            case 12:
            case 2:
                season = " зима ";
                break;
            case 3:
            case 4:
            case 5:
                season = " весна ";
                break;
            case 6:
            case 7:
            case 8:
                season = " лето ";
                break;
            case 9:
            case 10:
            case 11:
                season = " осень ";
                break;
            default:
                System.out.println("Неверный номер месяца.");
        }
        System.out.println(" Месяц номер " + monthNumber + " принадлежит к сезону " + season);

        }
    }











