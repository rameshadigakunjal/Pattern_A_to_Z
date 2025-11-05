
import java.util.StringTokenizer;

public class Tokenizer {

	public static void main(String[] args) {
		
		String s= "java python C# C++ C";
		StringTokenizer st = new StringTokenizer(s);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
