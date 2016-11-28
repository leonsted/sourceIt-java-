
public class task_two {

	/*
	 * 2. Объявить несколько переменных, хранящих площадь нескольких стран мира (3-5 штук) в кв. километрах. 
	 * Рассчитать площадь в кв. метрах и кв. милях. Результат вывести в консоль.
	 */
	
	double gerpl = 357021;
	double ukrpl = 603549;
	double spainpl = 504782;
	double italianpl = 301340;
	double usapl = 9519431;
	
	double gerpl_metr = gerpl*1000000;
	double gerpl_mile = gerpl*0.3861;
	
	double ukrpl_metr = ukrpl*1000000;
	double ukrpl_mile = ukrpl*0.3861;
	
	double spainpl_metr = spainpl*1000000;
	double spainpl_mile = spainpl*0.3861;
	
	double italianpl_metr = italianpl*1000000;
	double italianpl_mile = italianpl*0.3861;

	double usapl_metr = usapl*1000000;
	double usapl_mile = usapl*0.3861;
	
	System.out.println("Площадь Германии в метрах квадратных: "+gerpl_metr);
	System.out.println("Площадь Германии в милях квадратных: "+gerpl_mile);
	
	System.out.println("Площадь Украины в метрах квадратных: "+ukrpl_metr);
	System.out.println("Площадь Украины в милях квадратных: "+ukrpl_mile);
	
	System.out.println("Площадь Испании в метрах квадратных: "+spainpl_metr);
	System.out.println("Площадь Испании в милях квадратных: "+spainpl_mile);
	
	System.out.println("Площадь Украины в метрах квадратных: "+italianpl_metr);
	System.out.println("Площадь Украины в милях квадратных: "+italianpl_mile);
	
	System.out.println("Площадь США в метрах квадратных: "+usapl_metr);
	System.out.println("Площадь США в милях квадратных: "+usapl_mile);
}
