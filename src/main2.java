import java.time.LocalDate;

public class main2 {
    public static void main(String[] args) {
        int deliveryDistance = 15;

        int deliveryTime = getDeliveryTime(deliveryDistance);

        if (deliveryTime == -1) {
            System.out.println("Доставки нет");

        } else {
            System.out.println("Потребуется дней " + deliveryTime);

        }
    }

    private static int getDeliveryTime(int deliveryDistance) {
        int deliveryTime = 1;
        if (deliveryDistance > 100) {
            deliveryTime = -1;
        } else {
            if (deliveryDistance > 20 && deliveryDistance <= 60) {
                deliveryTime++;
            } else if (deliveryDistance > 60) {
                deliveryTime += 2;
            }
        }
        return deliveryTime;
    }

    private static void task2 () {
            int clientOs = 0;
            int clientDeviseYear = 2015;

            recommenendAppVersion(clientOs, clientDeviseYear);
        }

        private static void recommenendAppVersion ( int clientOs, int clientDeviseYear){
            if (clientOs != 0 && clientOs != 1) {
                System.out.println("Неизвестная операционная система");
            } else {
                String operationSystem;
                if (clientOs == 0) {
                    operationSystem = "ios";
                } else {
                    operationSystem = "Android";
                }
                String message;
                if (isDeviceOld(clientDeviseYear)) {
                    message = "Установите облегченную версию для " + operationSystem + " по ссылке";
                } else {
                    message = "Установите облегченную версию для " + operationSystem + " по ссылке";
                }
                System.out.println(message);
            }
        }

        private static boolean isDeviceOld ( int clientDeviseYear){
            int currentYear = LocalDate.now().getYear();
            return clientDeviseYear <= currentYear;
        }
    private static void task1() {
        printIsLeapYearResult(2021);
        printIsLeapYearResult(2022);
        printIsLeapYearResult(2023);
        printIsLeapYearResult(2024);
    }

        private static void printIsLeapYearResult ( int year){
            if (isLeap(year)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        }

    private static boolean isLeap ( int year){
            return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        }
    }
