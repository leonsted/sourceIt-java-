import java.util.Scanner;


public class Bank {

	String name;
	String courseUsd = "USD";
	String courseEur = "EUR";
	String courseRub = "RUB";
	double usd;
	double eur;
	double rub;
	
	public void initBanks() {
		Bank pb = new Bank();
		Bank mb = new Bank();
		Bank pumb = new Bank();

		// название банков
		pb.name = "ПриватБанк";
		mb.name = "МегаБанк";
		pumb.name = "ПУМБ";

		// курс USD
		pb.usd = 27.54;
		mb.usd = 26.78;
		pumb.usd = 27.56;

		// курс EUR
		pb.eur = 35.24;
		mb.eur = 36.58;
		pumb.eur = 34.25;

		// курс RUB
		pb.rub = 0.44;
		mb.rub = 0.48;
		pumb.rub = 0.45;
	}
	
	public String CheckBank(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите название банк");
		String myBank = sc.nextLine();
		if(myBank == "ПриватБанк"){
			System.out.println("Вы выбрали приватбанк");
		}if(myBank == "МегаБанк"){
			System.out.println("Вы выбрали МегаБанк");
		}if(myBank == "МегаБанк"){
			System.out.println("Вы выбрали ПУМБ");
		}else{
			System.out.println("такого банка нет");
		}
		return myBank;
	}
	public String CheckCourse(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите курс валют");
		String cours = sc.nextLine();
		if(cours == "USD"){
			System.out.println("Вы выбрали курс долларов США");
		}else if(cours == "EUR"){
			System.out.println("Вы выбрали курс евро");
		}else if(cours == "RUB"){
			System.out.println("Вы выбрали курс рубля");
		}else{
			System.out.println("нет выбранного курса валют");
		}
		return cours;
	}

}
