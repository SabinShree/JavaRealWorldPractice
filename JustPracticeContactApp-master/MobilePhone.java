package BankingAPp.ArrayListChallenge;


import java.util.ArrayList;

public class MobilePhone {
    public String phoneNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        myContacts = new ArrayList<>();
    }

    public boolean addContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("System is already on file.");
            return false;
        }
        this.myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContacts) {
        int position = findContact(oldContact);
        if (position >= 0) {
            this.myContacts.set(position, newContacts);
            return true;
        }
        return false;
    }
    // simple but take time to find the value :(
    public int findContactAlternative(String name){
        for (int i = 0; i < this.myContacts.size(); i++){
            if (this.myContacts.get(i).getName().equalsIgnoreCase(name)){
                return ++i;
            }
        }
        return -1;
    }

    public int findContact(String name) {
        // using selection sort.
        for (int i = 0; i < this.myContacts.size(); i++) {
            for (int j = 0; j < this.myContacts.size() -1 ; j++) {
                if (this.myContacts.get(i).getName().compareToIgnoreCase(this.myContacts.get(j).getName()) < 0) {
                    Contact tempVar = this.myContacts.get(i);
                    myContacts.set(i, myContacts.get(j));
                    myContacts.set(j, tempVar);
                }
            }
        }

        // binary search
        int low = 0;
        int high = myContacts.size() - 1;
        while (low <= high) {
            // a b c d e
            int middle = (low + high) / 2;
            if (myContacts.get(middle).getName().compareTo(name) > 0){
                high = middle -1 ;
            } else if (myContacts.get(middle).getName().compareTo(name) < 0){
                low = middle + 1;
            } else {
                return middle;
            }
        }

        return -1;
    }


    public boolean removeContact(Contact removedContact) {
        int position = findContact(removedContact);
        if (position >= 0) {
            this.myContacts.remove(position);
            return true;
        }
        return false;
    }

    public int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    public void printContact() {
        System.out.println("There are " + this.myContacts.size() + " contacts in your list.");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i + 1) + ". " + myContacts.get(i).getName() + " -->> " + myContacts.get(i).getPhoneNumber());
        }
    }

    public String queryContact(Contact contact) {
        int position = findContact(contact);
        if (position >= 0) {
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

}