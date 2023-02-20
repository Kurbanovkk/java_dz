
import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, ArrayList<String>> contacts;

    public PhoneBook() {
        this.contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        if (!contacts.containsKey(name)) {
            contacts.put(name, new ArrayList<String>());
        }
        contacts.get(name).add(phoneNumber);
    }

    public ArrayList<String> getPhoneNumbers(String name) {
        return contacts.getOrDefault(name, new ArrayList<String>());
    }

    @Override
    public String toString() {
        return contacts.toString();
    }
}
