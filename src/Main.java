public class Main {
    public static void main(String[] args) {
        int bb = 1000; //начальный баланс на счету клиента
        int amount_in = 4500; // сумма пополнения
        int bonus_criteria = 100; // ставка бонуса
        int bonus_rate = 1; // бонус в рублях за каждые 100 рублей пополнения
        int bonus_amount = amount_in / bonus_criteria * bonus_rate; //итоговая сумма бонуса
        int amount_out = bb + amount_in + bonus_amount; // итоговая сумма на счету

        if (amount_in > 1000) {
            System.out.println("Сумма бонуса за пополнение составила: " + bonus_amount);
        } else {
            System.out.println("Сумма бонуса за пополнение составила: 0");
        }
        System.out.println("Итоговая сумма на счету: " + amount_out);

    }
}
