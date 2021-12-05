public class Main {
    public static void main(String[] args) {
        long initialBalance = 300;
        long amountPayment = 1200;
        long stepPayment = 1000;
        long ginniRatio = 10;

        if (amountPayment > stepPayment) {
            //вычисляем вознаграждение за превышение порога
            long total = (amountPayment - stepPayment) / ginniRatio + initialBalance;
            System.out.println("Поздравляем, Ваш баланс имеет премию! Сейчас доступно: " + total + " руб.");
        } else {
            long total = initialBalance + amountPayment;
            System.out.println("Ты нищеброд. Получи свой жалкий баланс: " + total + " руб.");
        }
        System.out.println("made by Dad, enjoy!");
    }
}
