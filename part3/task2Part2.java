import java.util.Scanner;


public class task2Part2 {
	/*
	 * Дана программа для конвертации валют по введенному курсу (JavaExampleI.java). 
	 * 
	 * 2 На её основе необходимо сделать программу для
	 * конвертации трёх валют (например доллар, евро, рубль) в трёх разных
	 * банках (например, курс приватБанка, ОщадБанка, и банка ПУМБ).
	 * Возможные курсы валют и имена банков должны быть заданы константами.
	 * Название банка и валюты для конвертации вводятся в консоли.
	 */
	Scanner sc = new Scanner(System.in);
	double money = sc.nextDouble();
	System.out.println("Введите сумму в грн: ");
	String nameB = sc.nextLine();
	System.out.println("Введите название банка");
	String course = sc.nextLine();
	System.out.println("Введите курс по которому хотите конвертировать деньги: ");
	
	final String PB = "приватБанка";
	final String OB = "ОщадБанка";
	final String PUMB = "ПУМБ";
	
	final String USD = "USD";
	final String EUR = "EUR";
	final String RUB = "RUB";
    
	final double[] coursePB = {26.90,35.90,0.4450};
	final double[] courseOB = {27.00,30.00,0.4350};
	final double[] coursePUMB = {28.00,32.00,0.4166};
	
	if (nameB == PB && course == USD ){
		System.out.println("курс доллара США приватБанка: " + money / coursePB[0]);
	
	}else if(nameB == PB && course == EUR ){
		System.out.println("курс евро приватБанка: " + money / coursePB[1]);
	}else if(nameB == PB && course == RUB ){
		System.out.println("курс рубля приватБанка: " + money / coursePB[2]);
	}else if(nameB == OB && course == USD){
		System.out.println("курс доллара США ОщадБанка: " + money / courseOB[0]);
	}else if(nameB == OB && course == EUR){
		System.out.println("курс евро ОщадБанка: " + money / courseOB[1]);
	}else if(nameB == OB && course == RUB){
		System.out.println("курс рубля ОщадБанка: " + money / courseOB[2]);
	}else if(nameB == PUMB && course == USD){
		System.out.println("курс доллара США ПУМБ: " + money / coursePUMB[0]);
	}else if(nameB == PUMB && course == EUR){
		System.out.println("курс Евро ПУМБ: " + money / coursePUMB[1]);
	}else if(nameB == PUMB && course == RUB){
		System.out.println("курс Рубля ПУМБ: " + money / coursePUMB[2]);
	}else {
		System.out.println("Такого банка или курса валюты нет");
	}
	
}

}
