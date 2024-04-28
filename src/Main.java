//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");   // немного не понял суть задания. Отсутствие избыточных проверок подразумевает под собой использование простого else, как сделано у меня?
        }                                                                               // Или же имелось ввиду, что нужно прописать через else if конкретный случай, если переменная == 1?
        System.out.println("Задание 2");
        int clientDeviceYear = 2012;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        System.out.println("задание 3");
        int year = 2021;
        if (year % 4 == 0 && year > 1584 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println("Задание 4");
        int distance = 95;
        int deliveryDays = 0;
        if (distance > 100) {
            System.out.println("На такое расстояние доставка не осуществляется");
        }
        else {
            if (distance <= 20) {
                deliveryDays = 1;
            }
            if (distance > 20 && distance <= 60) {
                deliveryDays = 2;
            }
            if (distance > 60 && distance <= 100) {
                deliveryDays = 3;
            }
        }
        System.out.println("Потребуется дней : " + deliveryDays);


        System.out.println("Задание 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Сейчас зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сейчас осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }
}