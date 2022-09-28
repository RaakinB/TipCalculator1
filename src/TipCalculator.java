
import java.text.DecimalFormat;
import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        DecimalFormat formatter = new DecimalFormat("#.##");

        System.out.println("Welcome Customer.");

        System.out.print("How many people are in your group? ");
        int numPeople = scan.nextInt();

        System.out.print("What's the tip percentage? (0-100): ");
        int tipPercent = scan.nextInt();

        System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
        double number = scan.nextDouble();

        double totalCost = 0;

        while (number != -1) {
            totalCost += number;
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            number = scan.nextDouble();

        }


        double tipAmount = totalCost *  (tipPercent / 100.0);
        String formattedTip = formatter.format(tipAmount);

        double billAfterTip = (totalCost + tipAmount);
        String formattedBillafterTip = formatter.format(billAfterTip);

        double TipPerPerson = (tipAmount / numPeople);
        String TipPer = formatter.format(TipPerPerson);

        String totalCosting = formatter.format(totalCost);

        double perPersonCostBTip = (totalCost / numPeople);
        String perPersonB4Tip = formatter.format(perPersonCostBTip);

        double perPersonTotal = ((totalCost + tipAmount) / numPeople);
        String CostPerPerson = formatter.format(perPersonTotal);

        System.out.println("------------------------------------------------");
        System.out.println("Total Bill Before Tip: $" + totalCosting);
        System.out.println("Tip Percentage: " + tipPercent + "%");
        System.out.println("Total Tip: $" + formattedTip);
        System.out.println();
        System.out.println("Total Bill After Tip: $" + formattedBillafterTip);
        System.out.println("Per Person Cost Before Tip: $" + perPersonB4Tip);
        System.out.println("Tip Per Person: $" + TipPer);
        System.out.println("Total Cost Per Person: $" + CostPerPerson);
        System.out.println("------------------------------------------------");

    }
}
