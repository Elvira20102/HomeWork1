import java.util.*;

public class PhoneBook {

    private Map<String, List<String>> book = new HashMap<>();


    public void add(String surname, String phone) {
        if (!book.containsKey(surname)) {
            book.put(surname, new ArrayList<>());
        }
        book.get(surname).add(phone);
    }


    public List<String> get(String surname) {
        return book.getOrDefault(surname, new ArrayList<>());
    }


    public void printAll() {
        for (Map.Entry<String, List<String>> entry : book.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }


    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Ivanov", "123-45-67");
        phoneBook.add("Ivanov", "999-88-77");
        phoneBook.add("Petrov", "111-22-33");

        System.out.println(phoneBook.get("Ivanov"));
        System.out.println(phoneBook.get("Petrov"));
        System.out.println(phoneBook.get("Sidorov"));

        phoneBook.printAll();
    }
}