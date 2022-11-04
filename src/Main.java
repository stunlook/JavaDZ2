public class Main {
    public static void main(String[] args) {

        int starting_score = 100;
        int replenishment_amount = 1500;

        int bonus;
        if (replenishment_amount >= 1000) {
            bonus = replenishment_amount / 100;
        } else {
            bonus = 0;
        }
        int result = starting_score + bonus + replenishment_amount;

        System.out.println("Бонус: " + bonus);
        System.out.println("Итоговый баланс: " + result);
    }
}