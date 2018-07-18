import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pattern compile=Pattern.compile("[0-9]{2}[A-Z]{2}[0-9][A-Z][0-9]{4}");
Matcher m=compile.matcher("16EM1A0535");
while(m.find())
{
	System.out.println(m.group());
}
	}

}
