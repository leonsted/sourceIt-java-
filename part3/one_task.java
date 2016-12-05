import java.util.Scanner;


public class one_task {
	/*
	 * Дана программа для конвертации валют по введенному курсу (JavaExampleI.java).
	 * На ее основе необходимо сделать программу для конвертации гривны в доллар по одному из заранее известных 
	 * (константы в программе) курсов (например, курс приватБанка, ОщадБанка, и банка ПУМБ), 
	 * название банка вводится с консоли.
	 */
			Scanner sc = new Scanner(System.in);
			double money = sc.nextDouble();
			System.out.println("Введите сумму в грн");
			
			
			final double PB_USD = 26.90; 
			final double PUMB_USD = 27.00;
			final double OB_USD = 28.00;
			
			
			System.out.println("курс долларах США приватБанка: " + money/PB_USD);
			System.out.println("курс долларах США ПУМБ: " +money/PUMB_USD);
			System.out.println("курс долларах США ОщадБанка: " +money/OB_USD);
}
