import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int seats = Integer.parseInt(scan.nextLine());
        int profit = 0;

        String input = scan.nextLine();

        while (!"Movie time!".equals(input)) {
            int people = Integer.parseInt(input);
            if (seats - people >= 0) {
                seats -= people;
                profit += people * 5;
                if (people % 3 == 0) {
                    profit -= 5;
                }
            } else {
                System.out.println("The cinema is full.");
                break;
            }
            input = scan.nextLine();
        }

        if ("Movie time!".equals(input)) {
            System.out.println(String.format("There are %d seats left in the cinema.", seats));
        }

        System.out.println(String.format("Cinema income - %d lv.", profit));
    }
}
