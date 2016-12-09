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
	}

	static class Bank {
		String name;
		double usd;
		double eur;
	}

	static void initBanks() {
		for (int i = 0; i < banks.length; i++) {
			Bank newBank = new Bank();
			newBank.usd = 27.1 + 0.1 * i;
			newBank.eur = 29.01 + 0.1 * i;
			banks[i] = newBank;
		}

	}

}

