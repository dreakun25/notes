package labs;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String bestName = "";
        double bestPrice = 1;
        double bestScore = 0;

        boolean more = true;
        while (more) {
            System.out.println("Doste onoma proiontos");
            String name = keyboard.nextLine();
            System.out.println("Doste timh proiontos");
            double price = keyboard.nextDouble();
            System.out.println("Doste skor proiontos");
            double score = keyboard.nextDouble();

            if (score / price > bestScore / bestPrice) {
                bestName = name;
                bestPrice = price;
                bestScore = score;
            }

            System.out.println("Eisagete allo proion? 1:Nai 2:Oxi");
            int yes = keyboard.nextInt();
            if (yes != 1) {
                more = false;
            }
            keyboard.nextLine();
        }
        System.out.println("To kalutero proion einai: " + bestName);
        System.out.println("Me timh: " + bestPrice);
        System.out.println("Kai skor: " + bestScore);

    }
}