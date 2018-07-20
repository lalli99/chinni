package sample;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Match {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern compile=Pattern.compile("[a-z]*[.][a-z]*[.][a-z]*");
		Matcher m=compile.matcher("yaah.com.co");
		while(m.find())
		{
			System.out.println(m.group());
		}
			}


	}
