import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();

        list.add("Java");
        set.add(123);
        map.put("Ala", 5);

        System.out.println(list.get(0));
        System.out.println(set.contains(123));
        System.out.println(map.get("Ala"));
    }
}