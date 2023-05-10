public class Main {
    public static void main(String[] args) {
        int bb = 1000; //начальный баланс на счету клиента
        int amountIn = 4500; // сумма пополнения
        int bonusCriteria = 100; // ставка бонуса
        int bonusRate = 1; // бонус в рублях за каждые 100 рублей пополнения
        int bonusAmount = amountIn / bonusCriteria * bonusRate; //итоговая сумма бонуса
        int amountOut = bb + amountIn + bonusAmount; // итоговая сумма на счету

        if (amountIn > 1000) {
            System.out.println("Сумма бонуса за пополнение составила: " + bonusAmount);
        } else {
            System.out.println("Сумма бонуса за пополнение составила: 0");
        }
        System.out.println("Итоговая сумма на счету: " + amountOut);

    }
}
