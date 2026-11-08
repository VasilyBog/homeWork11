//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.time.LocalDate;

public class Main {
    //Exercise 1
    public static void checkIsLeapYear(int year) {
        boolean startYear = year <= 1584;
        boolean each400Year = year % 400 == 0;
        boolean each100Year = year % 100 != 0;
        boolean each4Year = year % 4 == 0;
        if (startYear) {
            System.out.println("В " + year + " году високосный год ещё не ввели");
        } else if ((each4Year && each100Year) || each400Year) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    //Exercise 2
    public static void defineAppVersion(int clientOs, int clientDeviceYear) {
        String mobileOsName = switch (clientOs) {
            case 0 -> "iOS";
            case 1 -> "Android";
            default -> "unknown OS";
        };
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear != currentYear) {
            System.out.println("Установите облегченную версию приложения для " + mobileOsName + " по ссылке");
        } else {
            System.out.println("Установите версию приложения для " + mobileOsName + " по ссылке");
        }
    }
    //Exercise 3
    public static void printCardDeliveryDistance(int deliveryDistance) {
        boolean dist20 = deliveryDistance <= 20;
        boolean dist60 = deliveryDistance > 20 && deliveryDistance <= 60;
        boolean dist100 = deliveryDistance > 60 && deliveryDistance <= 100;
        if (dist20) {
            System.out.println("Потребуется 1 день.");
        } else if (dist60) {
            System.out.println("Потребуется 2 дня.");
        } else if (dist100) {
            System.out.println("Потребуется 3 дня.");
        } else {
            System.out.println("Свыше 100 км доставки нет.");
        }
    }
    public static void main(String[] args) {
        //Exercise 1
        System.out.println("***Задача 1***");
        checkIsLeapYear(2022);
        checkIsLeapYear(2024);
        checkIsLeapYear(2026);

        //Exercise 2
        System.out.println("***Задача 2***");
        defineAppVersion(0, 2022);
        defineAppVersion(1, 2026);

        //Exercise 3
        System.out.println("***Задача 3***");
        printCardDeliveryDistance(90);
        printCardDeliveryDistance(190);
    }
}