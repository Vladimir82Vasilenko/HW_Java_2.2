
public class Main {
    public static void main(String[] args) {

        int accountAmount = 350;
        int depositedAmount = 1700;
        int grandTotal = (accountAmount + depositedAmount);

        if (depositedAmount > 1000) {
            int bonus = (depositedAmount / 100);
            System.out.println("На Вашем счете " + (grandTotal + bonus) + " рублей, " + "сумма зачисленных бонусных рублей составила " + bonus + " рублей");
        } else {
            System.out.println("Сумма на вашем счете " + (grandTotal) + " рублей, бонусные рубли к зачислению отсутствуют");
        }
    }
}
