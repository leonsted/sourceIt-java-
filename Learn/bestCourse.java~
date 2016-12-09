import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class main {

	/**
	 * @param args
	 */

	static Bank[] banks = new Bank[3];

	public static void main(String[] args) {
		initBanks();
		double uah = 5000;
		Bank myBank = getBestUSDCourse();
		double myUSD = uah/myBank.usd;
		System.out.println(myBank.name + " we can get "+myUSD+"s");
	}

	static class Bank {
		String name;
		double usd;
		double eur;
	}

	static void initBanks() {
		for (int i = 0; i < banks.length; i++) {
			Bank newBank = new Bank();
			newBank.name = "megaBank";
			newBank.usd = 27.1 + 0.1 * i;
			newBank.eur = 29.01 + 0.1 * i;
			banks[i] = newBank;
		}

	}
	static Bank getBestUSDCourse(){
		Bank greatBank = banks[0];
		for(int i =0; i<banks.length; i++){
			if(greatBank.usd < banks[i].usd){
				greatBank = banks[i];
			}
		}
				
		return greatBank;
		 
	}

}

