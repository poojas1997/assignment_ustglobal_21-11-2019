package com.ustglobal.phonesimulator.main;

import java.util.List;
import java.util.Scanner;

import com.ustglobal.phonesimulator.dao.PhoneDAO;
import com.ustglobal.phonesimulator.dto.PhoneSimulator;
import com.ustglobal.phonesimulator.util.PhoneManager;

public class MainClass {

	public static void main(String[] args) throws Exception {

		System.out.println("Press 1 to Show all contacts");
		System.out.println("Press 2 to Search for contacts(using name)");
		System.out.println("Press 3 to operate on contact");

		Scanner scn = new Scanner(System.in);
		int no = scn.nextInt();

		switch(no){

		case 1 :

			PhoneDAO dao1 = PhoneManager.getPhoneDAO();
			List<PhoneSimulator> list = dao1.getAllContact();


			for(PhoneSimulator phone : list) {
				System.out.println(phone.getName());
			}

			break;

		case 2:

			String name = scn.next();
			PhoneDAO dao2 = PhoneManager.getPhoneDAO();
			dao2.searchContact(name);
			PhoneSimulator phone = dao2.searchContact(name);

			if(phone!=null) {

				System.out.println(phone.getName());
				System.out.println(phone.getNumber());
				System.out.println(phone.getGroups());
				System.out.println("_______________");

				System.out.println("Press 1 to call");
				System.out.println("Press 2 to message");
				System.out.println("Press 3 to go bck to main menu");
				int c = scn.nextInt();

				switch(c) {

				case 1:
					System.out.println("calling the contact");
					System.out.println(" ");
					System.out.println("end the call");

					break;

				case 2:
					String s1 =scn.nextLine();
					System.out.println("message sent ");
					break;
				case 3:

					System.out.println("Press 1 to Show all contacts");
					System.out.println("Press 2 to Search for contacts(using name)");
					System.out.println("Press 3 to operate on contact");

					Scanner scn1 = new Scanner(System.in);
					

				}
				break;

			} else {
				System.out.println("No Contact");
			}

			break;

		case 3:
			System.out.println("Press 1 to add contact");
			System.out.println("Press 2 to delete contact");
			System.out.println("Press 3 to edit contact");
			

			int opt = scn.nextInt(); 
			
			switch(opt) {
			
			case 1:
				PhoneDAO dao3=  PhoneManager.getPhoneDAO();
				System.out.println("enter details");
				
				PhoneSimulator p = new PhoneSimulator();
				p.setName(scn.next());
				p.setNumber(scn.nextInt());
				p.setGroups(scn.next());
				
				System.out.println("data inserted");
				break;
				
			
			case 2:
				
				String name1 = scn.next();
				PhoneDAO dao4 = PhoneManager.getPhoneDAO();
				dao4.deleteContact(name1);
			
				break;
				
			case 3:	
				
				String name2 =scn.next();
				PhoneDAO dao5 = PhoneManager.getPhoneDAO();
				dao5.editContact(name2, 701905768,"family");
				
				
				
			}//end of switch(opt)
			
			

			
			

		}//end of switch
	}//end of main
}//end of MainClass
