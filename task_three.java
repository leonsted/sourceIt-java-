
public class task_three {
	/*
	 * 3. Объявить массив из несколько элементов, содержащих текущий курс валют (3-4 штуки).
	 *  Сконвертировать 5000 грн в валюту по курсу, указанному в массиве для каждой валюты. 
	 *  Результат вывести в консоль.
	 */
	double money = 5000;
	
	
	double course[] = new double[3];
	course[0]= 26.9827;
	course[1]= 28.7727;
	course[2]=0.4183;
	
	System.out.println("5000 грн в долларах США: " + money/course[0]);
	System.out.println("5000 грн в Евро: " +money/course[1]);
	System.out.println("5000 грн в долларах росийских рублях: " +money/course[2]);
	
}
}
