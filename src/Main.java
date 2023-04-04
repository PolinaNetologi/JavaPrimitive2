public class Main {
    public static void main(String[] args) {

        int initialBalance = 100;
        int addent = 1100;

        int bonus = 11;

        if (addent > 1000) {
            bonus = addent / 100;

        }

        int finalBalance = initialBalance + addent + bonus;
        System.out.println("Итог: " + finalBalance);
        System.out.println("Бонус: " + bonus);
    }
}