public class Main {
    public static void main(String[] args) {
        int score = 100;
        int cash = 1211;
        boolean offer = cash >= 1000;

        int bonus = offer ? cash / 100 : 0;
        int balance = offer ? bonus + cash + score : score + cash;

        System.out.println("Вы пополнили баланс на " + cash +  " рублей.");
        System.out.println();
        System.out.println("Ваш баланс составляет: " + balance + " рублей. " + "Вам начисленно " + bonus + " бонусных рублей.");
    }




    }
