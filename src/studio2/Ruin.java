package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int startAmount = in.nextInt();
		double winChance = in.nextDouble();
		double winLimit = in.nextDouble();
		int currentAmount = startAmount;
		
		while (currentAmount > 0 && currentAmount < winLimit) {
		double Chance = Math.random(); 
		if (Chance < winChance) {
			currentAmount = currentAmount + 1;
			System.out.println("You won");
		}
		if (Chance > winChance) {
			currentAmount = currentAmount - 1;
			System.out.println("You lost");
		}
		}}}
