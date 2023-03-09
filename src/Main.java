public class Main {
    public static void main(String[] args) {
        int balance = 50;
        int DepositAmount = 2500;
        int bonus;
        if (DepositAmount > 1000) {
            bonus = DepositAmount / 100;
        } else {
            bonus = 0;
        }
        int FinalBalance = balance + DepositAmount + bonus;
        System.out.println("Баланс: " + FinalBalance + " руб.");
        System.out.println("Бонус: " + bonus + " руб.");


    }
}