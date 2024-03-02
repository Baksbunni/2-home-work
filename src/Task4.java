public class Task4 {
    public static void main(String[] args) {
        // Задача 1.
        int age = 26;
        if (age > 18) {
            System.out.println("Если возраст человека = " + age + " то он совершенолетний ");
        } else {
            System.out.println("Если возраст человека меньше " + age + " то ему нужно подождать");
        }
        // Задача 2.
        int t = 12;
        if (t <= 5) {
            System.out.println("На улице меньше " + t + " грвдусов, то нужно надеть шапку");
        } else {
            System.out.println("Если температура больше " + t + " градуусоов, то можно идти без шапки");
        }
        //Задача 3.
        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость больше " + speed + " то придеться заплатить штраф");
        } else {
            System.out.println("Если скорость менише " + speed + " то можно ездить спокойно");
        }
        // Задача 4.
        int personeAge = 3;
        if (personeAge >= 2 && personeAge <= 6) {
            System.out.println("Если возраст человека равен " + personeAge + " то он должен ходить в сад");
        } else if (personeAge >= 7 && personeAge <= 17) {
            System.out.println("Если возраст человека равен " + personeAge + " то он должен ходить в школу");
        } else if (personeAge <= 18 && personeAge >= 24) {
            System.out.println("Если возраст человека больше " + personeAge + " то его место в университете");
        } else if (personeAge > 24) {
            System.out.println("Если человеку больше " + personeAge + " то ему пора ходить на работу");
        }
        // Задача 5.
        int ageChildren = 4;
        if (ageChildren < 5) {
            System.out.println("Если ребенку " + ageChildren + " То он не может кататься на атракционе");
        } else if (ageChildren > 5 || ageChildren < 14) {
            System.out.println("Если ребенку " + ageChildren + " То ребенок должен кататься в сопровождении взрослых");
        } else if (ageChildren > 14) {
            System.out.println("Если ребенку " + ageChildren + " То ребенок может кататься без сопровождения взролых");
        }
        // Задача 6.
        int seatPlace = 66;
        if (seatPlace < 60) {
            System.out.println("Если в вагоне меньше человек " + seatPlace + " то есть сидячие места");
        } else if (seatPlace > 60 || seatPlace == 102) {
            System.out.println("Если в вагоне больше человек " + seatPlace + " то сидячих мест нету");
        } else if (seatPlace >= 102) {
            System.out.println("Если в вагоне " + seatPlace + " то вагон заполнен");
        }
        // Задача 7.
        int one = 10;
        int two = 20;
        int three = 15;
        if (one > two && one > three) {
                System.out.println("Наивысшие число " + one);
            }else if (two > three) {
            System.out.println("Наибольшее число " + two);
        }else {
            System.out.println("Наибольшее число " + three);
        }
        }
    }


















