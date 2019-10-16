package be.ifosupwavre.info.poo.adress_book;

import org.fluttercode.datafactory.impl.DataFactory;

import java.util.List;
import java.util.stream.Collectors;

public class MainApp {
	public static void main(String[] args) {
		ContactManager contactManager = new ContactManager();
		DataFactory factory = new DataFactory();
		
		
		System.out.println("Création des contacts...");
		for (int i = 0; i < 10; i++) {
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
		
		System.out.println("\n\tAffichage des contacts :");
		contactManager.getContacts().forEach(System.out::println);
		
		System.out.println("\n\tAffiche détaillé :");
		contactManager.getContacts().forEach(contact ->
				System.out.println(
						contact.getFirstName() + " " +
						contact.getLastName() + " " +
						contact.getAddress() + " " +
						contact.getZipcode() + " " +
						contact.getCity() )
		);
		
		System.out.println("\n\tTest recherche :");
		List<Contact> filtered = contactManager.getContacts().parallelStream()
				.filter(contact -> contact.getFirstName().contains("Lee"))
				.collect(Collectors.toList());
		filtered.forEach(System.out::println);
	}
}
