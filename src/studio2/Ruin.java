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
		System.out.println("Simulation times: ");
		int totalSimulations = in.nextInt();
		int count = 0;
		// Count = number of plays
		
		
		for (int i = 1; i < totalSimulations + 1; i++) {
		while (currentAmount > 0 && currentAmount < winLimit) {
			
		double Chance = Math.random(); 
		if (Chance < winChance) {
			currentAmount = currentAmount + 1;
			count = count + 1;
		}
		else if (Chance > winChance) {
			currentAmount = currentAmount - 1;
			count = count + 1;
		}
	
		if (currentAmount == winLimit) {
			System.out.println("Simulation " + i + ": " + count + " WIN");
		}
		else if (currentAmount == 0) {
			System.out.println("Simulation " + i + ": " + count + " LOSE");
		
			}
		}
		count = 0;
		currentAmount = startAmount;
		}}}