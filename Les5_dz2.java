import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Les5_dz2 {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList("Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина",
                "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова",
                "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова",
                "Иван Мечников", "Петр Петин", "Иван Ежов");

        Map<String, Integer> countMap = new HashMap<>();
        for (String employee : employees) {
            String name = employee.split(" ")[0];
            countMap.put(name, countMap.getOrDefault(name, 0) + 1);
        }

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(countMap.entrySet());
        Collections.sort(entries, (a, b) -> b.getValue().compareTo(a.getValue()));
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            } else {
                System.out.println(entry.getKey() + ": 1");
            }
        }
    }

}
