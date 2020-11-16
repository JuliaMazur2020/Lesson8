import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите колличество клиентов:");
        int clients = scanner.nextInt();
        System.out.println(" Колличество маршрутов: " + routesCounter(clients));


    }


    public static int routesCounter ( int clients) {
        if (clients==0) {
            return 1;
        }
        return clients * routesCounter(clients-1);
    }


}