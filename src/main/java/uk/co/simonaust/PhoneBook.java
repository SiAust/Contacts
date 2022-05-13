import java.util.HashSet;
import java.util.Set;

/**
 * Stores a number of contacts.
 * @author Simon Aust
 * @version .1
 * */
public class PhoneBook {

    private final Set<Contact> contacts;

    public PhoneBook() {
        this.contacts = new HashSet<>();
    }

    public void addContact(Contact contact) {
        if (!(contacts.add(contact))) {
            System.out.println("Contact already exists in phone book");
        }
    }
}
