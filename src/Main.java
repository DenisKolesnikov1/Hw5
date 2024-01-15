public class Main {
    public static void main(String[] args) {
        //Задача 1
        int clientOs = 0;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Неизвестная операционная система");
        }
        //Задача 2
        {
            int clientOS = 0;
            int clientDeviseYear = 2015;

            if (clientOs != 0 && clientOS != 1) {
                System.out.println("Неизвестная операционная система");
            } else {
                String operationSystem;
                if (clientOs == 0) {
                    operationSystem = "ios";
                } else {
                    operationSystem = " Android";
                }
                String message;
                if (clientDeviseYear < 2015) {
                    message = "Установите облегченную версию прприложения для " + operationSystem +
                            " по ссылке";
                } else {
                    message = "Установите облегченную версию приложения для " + operationSystem +
                            " по ссылке";
                }
                System.out.println(message);
            }
            //Задача 3

            int year = 2021;
            boolean isLeap = false;
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    isLeap = true;
                } else {
                    isLeap = true;
                }
            }
            if (isLeap) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
            //Задача 4

            int deliveryDistance = 95;
            int deliveryTime = 1;

            if (deliveryDistance > 100) {
                System.out.println("Доставки нет");
            } else {
                if (deliveryDistance > 20 && deliveryDistance <= 60) {
                    deliveryTime++;
                } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
                    deliveryTime += 2;
                }
            }
            System.out.println("Потребуется дней: " + deliveryTime);
        }
             //Задача 5

        int monthNumber = 13;
        String season = null;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                season = "зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "осень";
                break;
            default:
                System.out.println("Неверный номер месяца.");
        }
        if (season != null) {
            System.out.println("Месяц номер " + monthNumber + " принадлежит к сезону " + season + ".");
        }
    }
}
