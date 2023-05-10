package ArrayOfIntegers;

import java.util.Arrays;
import java.util.List;

public class Sample {
	public static void main(String args[])
	{
		List<Integer> list = Arrays.asList(2,3,4,5,6);
		list.stream().filter(n->n%2==0).sorted().forEach(n->System.out.println(n));
	}
}
