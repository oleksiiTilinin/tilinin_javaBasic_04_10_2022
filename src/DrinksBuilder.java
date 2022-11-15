
import java.util.Scanner;

public class DrinksBuilder {

    public static void main(String[] args) {
//#7 Пользователь должен иметь возможность заказать несколько напитков
        String answer;
        boolean yn;
        int sum = 0;
        int drinkCount = 0;

        System.out.print("Do you want some drink? Please type 'y' for YES or 'n' for NO: ");
        while (true) {
            Scanner in = new Scanner(System.in);
            answer = in.nextLine().trim().toLowerCase();
            if (answer.equals("y")) {
                System.out.println("YES");

// #6 Добавьте возможность выбора напитка для пользователя, и в зависимости от выбора делайте ему напиток;
                Scanner inp = new Scanner(System.in);
                System.out.println("Enter number:");
                System.out.println("1. Tea ");
                System.out.println("2. Coffee ");
                System.out.println("3. Mojito ");
                System.out.println("4. Lemonade ");
                System.out.println("5. Mineral ");
                System.out.println("6. Coca Cola ");
                int drinksChoice = inp.nextInt();

//#5 Сделайте switch-case оператор который будет делать напиток(вызывая соответствующий метод) в зависимости от выбора клиента;
                switch (drinksChoice) {
                    case 1 -> {
                        Drinks.setTea();
//#3 Сделайте подсчет количества сделанных напитков и общей суммы которую должен заплатить клиент;
                        sum = sum + Drinks.TEA;
                        drinkCount++;
                    }
                    case 2 -> {
                        Drinks.setCoffee();
                        sum = sum + Drinks.COFFEE;
                        drinkCount++;
                    }
                    case 3 -> {
                        Drinks.setMojito();
                        sum = sum + Drinks.MOJITO;
                        drinkCount++;
                    }
                    case 4 -> {
                        Drinks.setLemonade();
                        sum = sum + Drinks.LEMONADE;
                        drinkCount++;
                    }
                    case 5 -> {
                        Drinks.setMineral();
                        sum = sum + Drinks.MINERAL;
                        drinkCount++;
                    }
                    case 6 -> {
                        Drinks.setCocaCola();
                        sum = sum + Drinks.COCA_COLA;
                        drinkCount++;
                    }
                    default -> System.out.println("Error ");
                }
                yn = true;
                System.out.println("You've already bought " + drinkCount + " drinks, it's worth: " + sum);
                System.out.print("Do you want more drinks? Please type 'y' for YES or 'n' for NO: ");

            } else if (answer.equals("n")) {

//#8 и в конце увидеть сколько денег он должен заплатить;
                System.out.println("Thanks for your order! You bought: " + drinkCount + " drinks.  Final sum: " + sum);
                yn = false;
                break;
            } else {
                System.out.println("Sorry, I didn't catch that. Please answer y/n");
            }
        }

    }

    // #1 сделайте enum DrinksMachine, который умеет делать КОФЕ, ЧАЙ, ЛИМОНАД, МОХИТО, МИНЕРАЛКУ, КОКА_КОЛУ;
    enum DrinksMachine {
        TEA, COFFEE, MOJITO, LEMONADE, MINERAL, COCA_COLA
    }


    // #2 Сделайте класс Drinks, в котором константами задайте цену напитка;
    static class Drinks {
        DrinksMachine drinksMachine;

        static final int TEA = 10;
        static final int COFFEE = 20;
        static final int MOJITO = 30;
        static final int LEMONADE = 40;
        static final int MINERAL = 50;
        static final int COCA_COLA = 60;


        public Drinks(DrinksMachine drinksMachine) {
            this.drinksMachine = drinksMachine;
        }

        //#4 Сделайте метод для приготовления каждого напитка;
        public static void setTea() {
            System.out.println("Drink name: '" + DrinksMachine.TEA.name() + "', price: " + Drinks.TEA);
        }

        public static void setCoffee() {
            System.out.println("Drink name: '" + DrinksMachine.COFFEE.name() + "', price: " + Drinks.COFFEE);
        }

        public static void setMojito() {
            System.out.println("Drink name: '" + DrinksMachine.MOJITO.name() + "', price: " + Drinks.MOJITO);
        }

        public static void setLemonade() {
            System.out.println("Drink name: '" + DrinksMachine.LEMONADE.name() + "', price: " + Drinks.LEMONADE);
        }

        public static void setMineral() {
            System.out.println("Drink name: '" + DrinksMachine.MINERAL.name() + "', price: " + Drinks.MINERAL);
        }

        public static void setCocaCola() {
            System.out.println("Drink name: '" + DrinksMachine.COCA_COLA.name() + "', price: " + Drinks.COCA_COLA);
        }
    }
}