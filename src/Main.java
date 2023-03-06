import java.util.function.Function;
public class Main
{
	public static void main(String[] args)
	{
		Function<Integer, Integer> function = integer -> integer * integer;
		int number = 8;
		System.out.println(function.apply(number));
	}
}