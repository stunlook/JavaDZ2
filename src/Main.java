public class Main {
    public static void main(String[] args) {

        int startingScore = 100;
        int replenishmentAmount = 2750;

        int bonus;
        if (replenishmentAmount >= 1000) {
            bonus = replenishmentAmount / 100;
        } else {
            bonus = 0;
        }
        int result = startingScore + bonus + replenishmentAmount;

        System.out.println("Бонус: " + bonus);
        System.out.println("Итоговый баланс: " + result);
    }
}