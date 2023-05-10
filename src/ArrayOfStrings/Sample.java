package ArrayOfStrings;

import java.util.Arrays;
import java.util.List;

public class Sample {
	
	public static void main(String[]args) {
		List<String>arr=Arrays.asList("A","B","Y","B","Z");
		arr.stream().sorted().forEach(n->System.out.println(n));
	}

}
