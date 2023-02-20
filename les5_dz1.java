
// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
public class les5_dz1 {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Иванов Иван Сергеевич", "89604156589");
        phoneBook.addContact("Иванов Иван Сергеевич", "89604156710");
        phoneBook.addContact("Осипов Виктор Николаевич", "89604156999");
        System.out.println(phoneBook);
    }
}
