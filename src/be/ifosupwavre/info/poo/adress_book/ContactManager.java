package be.ifosupwavre.info.poo.adress_book;

import java.util.ArrayList;
import java.util.List;

public class ContactManager {
	private List<Contact> contacts = new ArrayList<>();
	
	public boolean addContact(Contact contact){
		if (!contacts.contains(contact)) {
			return contacts.add(contact);
		} else {
			return false;
		}
		
	}
	
	public boolean deleteContact(Contact contact){
		if (contacts.contains(contact)) {
			return contacts.remove(contact);
		} else {
			return false;
		}
	}
	
	public boolean deleteContact(int index){
		if (contacts.contains(index)) {
			contacts.remove(index);
			return true;
		} else {
			return false;
		}
	}
	
	public List<Contact> getContacts() {
		return contacts;
	}
	
	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	
	
}
