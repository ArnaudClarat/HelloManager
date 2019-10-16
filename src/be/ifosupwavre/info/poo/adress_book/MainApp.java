package be.ifosupwavre.info.poo.adress_book;

import org.fluttercode.datafactory.impl.DataFactory;

public class MainApp {
	public static void main(String[] args) {
		ContactManager contactManager = new ContactManager();
		DataFactory factory = new DataFactory();
		
		
		System.out.println("Création des contacts...");
		for (int i = 0; i < 20; i++) {
			Contact contact = new ContactBuilder()
					.setFirstName(factory.getFirstName())
					.setLastName(factory.getLastName())
					.setAddress(factory.getAddress())
					.setCity(factory.getCity())
					.setZipcode(factory.getNumberBetween(1000,9999))
					.setPhoneNumber(factory.getNumberText(10))
					.setEmail(factory.getEmailAddress())
					.setBirthday(factory.getBirthDate())
					.createContact();
			contactManager.addContact(contact);
		}
		
		System.out.println("Affichage des contacts :");
		contactManager.getContacts().forEach(System.out::println);
	}
}
