package studio2;

import java.awt.datatransfer.SystemFlavorMap;
import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.print("Start Amount: ");
		double startAmount = in.nextDouble();
		System.out.print("Win Chance: ");
		double winChance = in.nextDouble();
		System.out.print("Win Limit: ");
		double winLimit = in.nextDouble();
		int totalSim = 0;
		int Loss = 0;

		
		while (0<startAmount && startAmount<winLimit) {
			double chance = Math.random()*winChance;
			if (chance>= 0.5 * winChance) {
				startAmount++;
				System.out.println("Simulation " + totalSim + ": Win");
			}
			else {
				startAmount--;
				Loss++;
				System.out.println("Simulation " + totalSim + ": Lose");
			}
			totalSim++;
		}
		System.out.println("Losses: " + Loss);
		System.out.println("Simulations: " + totalSim);
		System.out.println("Ruin Rate from Simulation: " + winChance);
		double expectedRuinRate = 1 - (startAmount/winLimit);
		System.out.println("Expected Ruin Rate: " + expectedRuinRate);

	}

}
