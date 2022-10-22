import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            task1();
            task2();
            task3();
    }
    static void task1(){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(isYearLeap(year));
    }
    static String isYearLeap(int year){
        if((year%4 == 0 && year%100 != 0) || year%400 ==0 ) return (year + " - високосный год");
        else return (year + " - не високосный год");
    }
    static void task2(){
        int clientOS = 0;
        int deviceYear = 1899;
        System.out.println(checkVersion(clientOS, deviceYear));
    }
    static String checkVersion(int clientOS, int clientDeviceYear){
        int currentYear = LocalDate.now().getYear();
        if(clientOS == 1 && clientDeviceYear < currentYear) return ("Установите облегченную версию приложения для Android по ссылке");
        if(clientOS == 0 && clientDeviceYear < currentYear) return ("Установите облегченную версию приложения для iOS по ссылке");
        if(clientOS==1) return ("Установите версию приложения для Android по ссылке");
        else return ("Установите версию приложения для iOS по ссылке");
    }
    static void task3(){
        int deliveryDistance = 21;
        System.out.println("Потребуется дней: " +getDeliveryDays(deliveryDistance));
    }
    static int getDeliveryDays(int deliveryDistance){
        int deliveryDays =1;
        if(deliveryDistance>20) deliveryDays++;
        if(deliveryDistance>60) deliveryDays++;
        return deliveryDays;
    }
}