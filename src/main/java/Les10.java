import java.util.*;

public class Les10 {

    public static void main(String[] args) {
        ArrayList<String> listOfWords = new ArrayList<>();
        Collections.addAll(listOfWords, "A", "B", "C", "C", "D", "E", "F", "G", "H", "I",
                "J", "J", "K", "L", "L", "L", "D", "H");
        System.out.println("Начальный список слов: " + listOfWords);

        System.out.println("Список слов без повторений: " + new LinkedHashSet<>(listOfWords));

        LinkedHashMap<String, Integer> mapWordsCount = new LinkedHashMap<>();
        listOfWords.forEach(s -> mapWordsCount.compute(s, (key, val) -> (val == null) ? 1 : val + 1));
        mapWordsCount.forEach((key, val) -> System.out.println(key + ", количество: " + val));

        PhoneDirectory phoneDirectory = new PhoneDirectory().add("Василий", "+79239872421")
                .add("Иван", "+79233872421").add("Илья", "+79239111111")
                .add("Сергей", "+79249872421").add("Василий", "+79239872422");
        System.out.println("\nТелефонный справочник: " + phoneDirectory);

        System.out.println("\nНомера Василия: " + phoneDirectory.getPhonesByAbonentName("Василий"));
        System.out.println("Номера Сергея: " + phoneDirectory.getPhonesByAbonentName("Сергей"));
        System.out.println("Номера Алексея: " + phoneDirectory.getPhonesByAbonentName("Алексей"));
    }
}