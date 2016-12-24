import java.awt.List;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

	/**
	 * @param args
	 * @param roominess 
	 */

	public static void main(String[] args) {
		
		/*
		 * Дан список статей. Каждая статья содержит год издания и заголовок. 
		 * Необходимо отсортировать список и вывести список в консоль, 
		 * отсортировав его по году (сначала самые старые, затем самые новые).
		 *  Если года публикации совпадают - сортируем по заголовку.
		 */
		
		Article article1 = new Article("afgdfg", 1999);
		Article article2 = new Article("ergter", 1999);
		 ArrayList<Article> art = new ArrayList<>();
		 art.add(article1);
		 art.add(article2);
		 
		 Collections.sort(art);
		 System.out.println(art);
	}
}
