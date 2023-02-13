import java.util.Scanner;

public class BikeInfrastructure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of bike lanes in kilometers: ");
        double length = sc.nextDouble();

        System.out.print("Enter the cost per kilometer for building bike lanes: ");
        double costPerKm = sc.nextDouble();

        double totalCost = length * costPerKm;

        System.out.println("The total cost of building bike lanes in the city is $" + totalCost);
    }
}

