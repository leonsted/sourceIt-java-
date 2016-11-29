
public class count_words {
	
	String searchMe = "peter piper picked";
	int max = searchMe.length();
	int count = 0;
	for (int i = 0; i< max;i++){
		if(searchMe.charAt(i) == ' ')
		{
			count++;
		}	
	}
	System.out.println(count+1);
	
}
