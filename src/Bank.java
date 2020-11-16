import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Чтобы узнать информацию по кредитной истории. Введите сумму кредита");
        double credit = Double.parseDouble(scanner.next());
        System.out.println("Сумма платежа");
        double payment = Double.parseDouble(scanner.next());

        creditInfo(credit, payment);



    }



    public static void creditInfo (double credit, double payment) {

        if (credit>payment){
            double loanBalance = credit-payment;
            System.out.println("Кредит не выплачен. Задолженность составляет: " + loanBalance + " грн.");
            System.out.println("Если хотите осуществить еще один платеж, внесите суму далее. Если хотите завершить работу введите 0");
            Scanner scanner = new Scanner(System.in);
            payment = Double.parseDouble(scanner.next());
            if (payment!=0) {
                creditInfo(loanBalance, payment);
            } else {
                System.out.println("Досвидания.");
            }
        } else if (payment>credit){
            System.out.println("Кредит погашен. На счету на данный момент : " + (payment-credit) + " грн.");
        } else {
            System.out.println("Нет задолженности. Кредит погашен. Досвидания.");
        }



    }

}