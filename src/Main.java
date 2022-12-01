import phonebook.FullName;
import phonebook.PhoneBook;

import java.util.*;

public class Main {
    static HashMap<String, Integer> task3 = new HashMap<>();
    private static final Random RANDOM = new Random();
    static Map<String, List<Integer>> listMap =new HashMap<>();
    public void ListMap() {
        for (int i = 0; i < 5; i++) {
            listMap.put(String.valueOf(i), generateList());
        }
    }
//      Task 1_1
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPhone(new FullName("Федор", "Иванов"), "89378484920");
        phoneBook.addPhone(new FullName("Степан", "Петров"), "89874522124");
        phoneBook.addPhone(new FullName("Анастасия", "Фетисова"), "89777652176");
        phoneBook.addPhone(new FullName("Елизавета", "Колесникова"), "893747565532");
        phoneBook.addPhone(new FullName("Семен", "Пушкин"), "89278484920");
        phoneBook.addPhone(new FullName("Карл", "Леонидов"), "89578484920");
        phoneBook.addPhone(new FullName("Кирил", "Рожков"), "89378484543");
        phoneBook.addPhone(new FullName("Екатерина", "Бублик"), "89378487890");
        phoneBook.addPhone(new FullName("Сергей", "Артемов"), "89278487520");
        phoneBook.addPhone(new FullName("Юрий", "Петров"), "89874524124");
        phoneBook.addPhone(new FullName("Светлана", "Фетисова"), "89775652176");
        phoneBook.addPhone(new FullName("Виктория", "Колесникова"), "893747565832");
        phoneBook.addPhone(new FullName("Семен", "Пушкин"), "89278484950");
        phoneBook.addPhone(new FullName("Леонид", "Леонидов"), "89578484920");
        phoneBook.addPhone(new FullName("Кирил", "Рожков"), "89378484543");
        phoneBook.addPhone(new FullName("Екатерина", "Бублик"), "89378487890");
        phoneBook.addPhone(new FullName("Петр", "Артемов"), "89278487520");
        phoneBook.addPhone(new FullName("Анна", "Ширшова"), "89357848989");
        phoneBook.addPhone(new FullName("Евдакия", "Павлова"), "89738465652");
        phoneBook.addPhone(new FullName("Денис", "Федоров"), "89378484786");

        for (Map.Entry<FullName, String> entry : phoneBook.getEntries()) {
            System.out.printf("%s - %s%n", entry.getKey(), entry.getValue());
        }

        //Task 1_3

        task3.put("num1", 1);
        task3.put("num2", 2);
        task3.put("num3", 3);
        task3.put("num4", 4);

        System.out.println(task3);

        addToTask3("num3", 5);

        System.out.println(task3);

        //Task 2

        Map<Integer, String> orderedMap = new LinkedHashMap<>();
        orderedMap.put(5, "test5");
        orderedMap.put(3, "test3");
        orderedMap.put(2, "test2");
        orderedMap.put(4, "test4");
        orderedMap.put(1, "test1");
        orderedMap.put(6, "test6");
        orderedMap.put(7, "test7");
        orderedMap.put(10,"test10");
        orderedMap.put(9, "test9");
        orderedMap.put(8, "test8");

        for (Map.Entry<Integer, String> entry : orderedMap.entrySet()) {
            System.out.printf("%d:%s\n", entry.getKey(), entry.getValue());
        }
    }
    public static void addToTask3(String key, int value) {
        if (task3.containsValue(value) && task3.containsKey(key)) {
            throw new RuntimeException("Объект с таким значением уже присутствует");
        } else {
            task3.put(key, value);
        }
    }
    public Set<Map.Entry<String,List<Integer>>> getOriginalMapEntries() {
        return listMap.entrySet();
    }
    public Map<String,Integer> getTransformedCollection() {
        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry : listMap.entrySet()) {
            int sum = 0;
            for (Integer number : entry.getValue()) {
                sum += number;
            }
            result.put(entry.getKey(), sum);
        }
        return result;
    }

    private List<Integer> generateList() {
        List<Integer> list =  new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(RANDOM.nextInt(1001));
        }
        return list;
    }

}