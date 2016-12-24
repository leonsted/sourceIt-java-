
public class Article implements Comparable<Article> {
	String title;
	int year;
	
	public Article(String title, int year) {
		this.title = title;
		this.year = year;
	}
	
	

	@Override
	public String toString() {
		return "Article [title=" + title + ", year=" + year + "]";
	}



	@Override
	public int compareTo(Article o) {
		
		int result = year - o.year; 
		if(result != 0) {
			return result;
		}else{
			return title.compareTo(o.title);		
					}
		
		
	}
	
	
	

}
