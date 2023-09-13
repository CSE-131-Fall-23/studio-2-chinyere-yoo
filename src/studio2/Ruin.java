package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Start amount: ");
		int startAmount = in.nextInt();
		System.out.println("Win Chance: ");
		double winChance = in.nextDouble();
		System.out.println("Win limit: ");
		double winLimit = in.nextDouble();
		int currentAmount = startAmount;
		
		
		while (currentAmount > 0 && currentAmount < winLimit) {
		double Chance = Math.random(); 
		if (Chance < winChance) {
			currentAmount = currentAmount + 1;
			System.out.println("You won");
			System.out.println("Current amount: " + "$" + currentAmount);
		}
		if (Chance > winChance) {
			currentAmount = currentAmount - 1;
			System.out.println("You lost");
			System.out.println("Current amount: " + "$" + currentAmount);
			
			// Simulations
			
			
		}
		}}}
