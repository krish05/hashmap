package hashmap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap map = new HashMapImpl();
		map.put("a", "1");
		map.put("b", "2");
		System.out.println(map.get("a"));
		System.out.println(map.get("b"));
		System.out.println(map.get("c"));
	}
}
