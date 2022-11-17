import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("This is a simple dice game");
        System.out.println("Number of players : 2-4");
        System.out.println("Enter the number of players: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfPlayers = Integer.parseInt(scanner.nextLine());

        String name1 = new String();
        String name2 = new String();
        String name3 = new String();
        String name4 = new String();
        if (numberOfPlayers == 2) {
            System.out.println("Enter the name of the first player:");
            name1 = scanner.nextLine();
            System.out.println("Enter the name of the second player:");
            name2 = scanner.nextLine();
        } else if (numberOfPlayers == 3) {
            System.out.println("Enter the name of the first player:");
            name1 = scanner.nextLine();
            System.out.println("Enter the name of the second player:");
            name2 = scanner.nextLine();
            System.out.println("Enter the name of the third player:");
            name3 = scanner.nextLine();
        } else if (numberOfPlayers == 4) {
            System.out.println("Enter the name of the first player:");
            name1 = scanner.nextLine();
            System.out.println("Enter the name of the second player:");
            name2 = scanner.nextLine();
            System.out.println("Enter the name of the third player:");
            name3 = scanner.nextLine();
            System.out.println("Enter the name of the fourth player:");
            name4 = scanner.nextLine();
        } else {
            System.out.println("Not legal value of players.");
            return;
        }

    /*
        int i = 0;
        for (i = 0; i <= numberOfPlayers; i++){
            System.out.println(name1 + "  " + "press enter to roll your dices.");
            scanner.nextLine();
            double random = Math.random();
            System.out.println(random);
            int max = 6;
            int min = 1;
            Double randomFrom1To6 = getRandomFromMinToMax(max, min);
            int dice1 = getRandomFromMinToMax(max, min).intValue();
            System.out.println(dice1);
            int dice2 = getRandomFromMinToMax(max, min).intValue();
            System.out.println(dice2);
        } */


        if (numberOfPlayers == 2) {
            System.out.println(name1 + "  " + "press enter to roll your dices.");
            scanner.nextLine();

            int max = 6;
            int min = 1;
            Double randomFrom1To6 = getRandomFromMinToMax(max, min);
            int dice1 = getRandomFromMinToMax(max, min).intValue();
            System.out.println(dice1);
            int dice2 = getRandomFromMinToMax(max, min).intValue();
            System.out.println(dice2);

            System.out.println(name2 + "  " + "press enter to roll your dices.");
            scanner.nextLine();
            int dice3 = getRandomFromMinToMax(max, min).intValue();
            System.out.println(dice3);
            int dice4 = getRandomFromMinToMax(max, min).intValue();
            System.out.println(dice4);
            System.out.println();
            if (dice1 + dice2 > dice3 + dice4){
                System.out.println(name1+ " " + "WON !");
            }else if (dice3 + dice4 > dice1 + dice2){
                System.out.println(name2+" "+"WON !");
            }else {
                System.out.println("Equals.");
            }
        } else if (numberOfPlayers == 3) {
            System.out.println(name1 + "  " + "press enter to roll your dices.");
            scanner.nextLine();

            int max = 6;
            int min = 1;
            Double randomFrom1To6 = getRandomFromMinToMax(max, min);
            int dice1 = getRandomFromMinToMax(max, min).intValue();
            System.out.println(dice1);
            int dice2 = getRandomFromMinToMax(max, min).intValue();
            System.out.println(dice2);

            System.out.println(name2 + "  " + "press enter to roll your dices.");
            scanner.nextLine();
            int dice3 = getRandomFromMinToMax(max, min).intValue();
            System.out.println(dice3);
            int dice4 = getRandomFromMinToMax(max, min).intValue();
            System.out.println(dice4);

            System.out.println(name3 + "  " + "press enter to roll your dices.");
            scanner.nextLine();
            int dice5 = getRandomFromMinToMax(max, min).intValue();
            System.out.println(dice5);
            int dice6 = getRandomFromMinToMax(max, min).intValue();
            System.out.println(dice6);
            System.out.println();
            if (dice1 + dice2 > dice3 + dice4 && dice1 + dice2 > dice5 + dice6){
                System.out.println(name1+ " " + "WON !");
            }else if (dice3 + dice4 > dice1 + dice2 && dice3 + dice4 > dice5 + dice6){
                System.out.println(name2+" "+"WON !");
            }else if (dice5 + dice6 > dice1 + dice2 && dice5 + dice6 > dice3 + dice4){
                System.out.println(name3+" "+"WON !");
            }else {
                System.out.println("Equals.");
            }
        } else if (numberOfPlayers == 4) {
            System.out.println(name1 + "  " + "press enter to roll your dices.");
            scanner.nextLine();

            int max = 6;
            int min = 1;
            Double randomFrom1To6 = getRandomFromMinToMax(max, min);
            int dice1 = getRandomFromMinToMax(max, min).intValue();
            System.out.println(dice1);
            int dice2 = getRandomFromMinToMax(max, min).intValue();
            System.out.println(dice2);

            System.out.println(name2 + "  " + "press enter to roll your dices.");
            scanner.nextLine();
            int dice3 = getRandomFromMinToMax(max, min).intValue();
            System.out.println(dice3);
            int dice4 = getRandomFromMinToMax(max, min).intValue();
            System.out.println(dice4);

            System.out.println(name3 + "  " + "press enter to roll your dices.");
            scanner.nextLine();
            int dice5 = getRandomFromMinToMax(max, min).intValue();
            System.out.println(dice5);
            int dice6 = getRandomFromMinToMax(max, min).intValue();
            System.out.println(dice6);

            System.out.println(name4 + "  " + "press enter to roll your dices.");
            scanner.nextLine();
            int dice7 = getRandomFromMinToMax(max, min).intValue();
            System.out.println(dice7);
            int dice8 = getRandomFromMinToMax(max, min).intValue();
            System.out.println(dice8);

            System.out.println();
            if (dice1 + dice2 > dice3 + dice4 && dice1 + dice2 > dice5 + dice6 && dice1 + dice2 > dice7 + dice8){
                System.out.println(name1+ " " + "WON !");
            }else if (dice3 + dice4 > dice1 + dice2 && dice3 + dice4 > dice5 + dice6 && dice3 + dice4 > dice7 + dice8){
                System.out.println(name2+" "+"WON !");
            }else if (dice5 + dice6 > dice1 + dice2 && dice5 + dice6 > dice3 + dice4 && dice5 + dice6 > dice7 + dice8){
                System.out.println(name3+" "+"WON !");
            }else if (dice7 + dice8 > dice1 + dice2 && dice7 + dice8 > dice3 + dice4 && dice7 + dice8 > dice5 + dice6){
                System.out.println(name4+" "+"WON !");
            }else {
                System.out.println("Equals.");
            }
        }
    }

    private static Double getRandomFromMinToMax(int max, int min)
    {
        return min + Math.random() * ((max - min) + 1);
    }
}
