package phoneBookAPP;

import java.util.ArrayList;

public class PhoneBook {
  ArrayList<Contact> contacts = new ArrayList<>();

  public void  addContact(String firstName, String lastNumber, String email, String phoneNumber){
  Contact newContact = new Contact(firstName,lastNumber,email,phoneNumber);
  contacts.add(newContact);
}

public Contact viewContact(int phoneNumber){
    return contacts.get(phoneNumber-1);

}
public void deleteContact(int phoneNumber){
      contacts.remove(phoneNumber-1);
}

public Contact findContact(int phoneNumber){
      return contacts.get(phoneNumber -1);
}

public void  updateContact(int phoneNumber, String name){
      Contact updateContact = findContact(phoneNumber);
      updateContact.setFirstName(name);

}


}
