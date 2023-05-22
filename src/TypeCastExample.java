import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TypeCastExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("vinod");
		list.add("vinod");
		list.add("vukkalam");
		list.add("nevaan");
		list.add("varun");

		for (String item : list) {
			System.out.println(item);

		}

		Set<String> set = new HashSet<String>(list);
		System.out.println("**************************************************");

		for (String item : set) {
			System.out.println(item);

		}
	}

}
