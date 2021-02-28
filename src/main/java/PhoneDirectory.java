import java.util.ArrayList;
import java.util.HashMap;

public class PhoneDirectory {
    private HashMap<String, ArrayList<String>> namesAndPhones = new HashMap<>();

    public ArrayList<String> getPhonesByAbonentName(String name) {
        return namesAndPhones.get(name);
    }

    public PhoneDirectory add(String abonentName, String phone) {
        if (abonentName == null || phone == null) {
            throw new IllegalArgumentException("Имя абонента и телефон не должны быть null");
        }

        namesAndPhones.computeIfAbsent(abonentName, k -> new ArrayList<>()).add(phone);
        return this;
    }

    @Override
    public String toString() {
        return "PhoneDirectory{" + "phones=" + namesAndPhones + '}';
    }
}
