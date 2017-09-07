package phoneyDirectory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PhoneyNumbers {

	public static void main(String[] args) throws InterruptedException {
		Address jdaddress = new Address("114 Market St", "St. Louis", "MO", "63403");
		Address jedaddress = new Address("324 Main St", "St. Charles", "MO", "63303");
		Address jmwdaddress = new Address("574 Pole Ave", "St. Peters", "MO", "63333");
		Person johnDoe = new Person("John", "", "Doe", jdaddress, "6366435698");
		Person johnEDoe = new Person("John", "E", "Doe", jedaddress, "8475390126");
		Person johnMichaelWestDoe = new Person("John", "Michael West", "Doe", jmwdaddress, "5628592375");
		ArrayList<Person> listings = new ArrayList<Person>();
		listings.add(johnDoe);
		listings.add(johnEDoe);
		listings.add(johnMichaelWestDoe);
		Scanner selection = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		int choice;
		String criteria;
		blank(50);
		print("****************************************");
		blank(2);
		print("WELCOME TO THE WELLSCOM PHONE DIRECTORY");
		blank(2);
		print("   At");
		blank(1);
		print("****************************************");
		print("                           Loading .    ");
  		Thread.sleep(3000);
  		blank(50);
		print("****************************************");
		blank(2);
		print("WELCOME TO THE WELLSCOM PHONE DIRECTORY");
		blank(2);
		print("   At WellsCom,");
		blank(1);
		print("****************************************");
		print("                           Loading . .  ");
  		Thread.sleep(1000);
  		blank(50);
		print("****************************************");
		blank(2);
		print("WELCOME TO THE WELLSCOM PHONE DIRECTORY");
		blank(2);
		print("   At WellsCom, we");
		blank(1);
		print("****************************************");
		print("                           Loading . . .");
  		Thread.sleep(1000);
  		blank(50);
		print("****************************************");
		blank(2);
		print("WELCOME TO THE WELLSCOM PHONE DIRECTORY");
		blank(2);
		print("   At WellsCom, we make");
		blank(1);
		print("****************************************");
		print("                           Loading .    ");
  		Thread.sleep(1000);
  		blank(50);
		print("****************************************");
		blank(2);
		print("WELCOME TO THE WELLSCOM PHONE DIRECTORY");
		blank(2);
		print("   At WellsCom, we make the");
		blank(1);
		print("****************************************");
		print("                           Loading . .  ");
  		Thread.sleep(1000);
  		blank(50);
		print("****************************************");
		blank(2);
		print("WELCOME TO THE WELLSCOM PHONE DIRECTORY");
		blank(2);
		print("   At WellsCom, we make the future!");
		blank(1);
		print("****************************************");
		print("                           Loading . . .");
  		Thread.sleep(2000);
  		blank(50);
  		int keepgoing = 0;
		while(keepgoing < 1) {
  		print("WELCOME TO THE WELLSCOM ELECTRONIC PHONE DIRECTORY\r\n"+
  				"Please make a selection from the choices below:\r\n" + 
				"1 SEARCH THE DIRECTORY\r\n" + 
				"2 VIEW ALL DIRECTORY LISTINGS\r\n" + 
				"3 UPDATE AN EXISTING ENTRY\r\n" + 
				"4 ADD A NEW LISTING\r\n" + 
				"5 DELETE AN EXISTING LISTING\r\n" + 
				"6 ABOUT THE DIRECTORY / ABOUT WELLSCOM\r\n" + 
				"7 EXIT THE PHONE DIRECTORY\r\n" + 
				"");
  		choice = selection.nextInt();
  		blank(1);
  		switch(choice) {
  			case 1:
  				print("SEARCH THE DIRECTORY");
  				blank(1);
  				print("***Please select your search criteria***\r\n" + 
  						"\r\n" + 
  						"Please make a selection from the choices below:\r\n" + 
  						"1 SEARCH BY FIRST AND LAST NAME\r\n" + 
  						"2 SEARCH BY LAST NAME ONLY\r\n" + 
  						"3 SEARCH BY FIRST NAME ONLY\r\n" + 
  						"4 SEARCH BY STATE\r\n" + 
  						"5 SEARCH BY CITY\r\n" + 
  						"6 REVERSE PHONE LOOKUP");
  				choice = selection.nextInt();
  				blank(1);
  				switch(choice) {
  				case 1:
  					print("SEARCH BY FIRST AND LAST NAME");
  					blank(1);
  					print("Enter the last name only, then press 'Enter'.");
  					criteria = input.nextLine();
  					String searchLastName = criteria;
  					print("Enter the first name only, then press 'Enter'.");
  					criteria = input.nextLine();
  					print("The search for " + criteria + " " + searchLastName + " produced the following results: ");
  	  				int counter = 0;
  	  				for(Person firstLast : listings) {
  	  					if(firstLast.getFirstName().equals(criteria) && firstLast.getLastName().equals(searchLastName)) {
  	  						counter++;
  	  						print("LISTING " + counter);
  	  						System.out.print(firstLast.getFirstName()+" "+firstLast.getMiddleName()+firstLast.getLastName());
  	  						System.out.println(firstLast.getAddress());
  	  						System.out.println(parsePhoneNum(firstLast.getPhoneyNumber()));
  	  						blank(1);
  	  					}
  	  				}  					
  					break;
  				case 2:
  					print("SEARCH BY LAST NAME ONLY");
  					blank(1);
  					print("Enter the last name, then press the 'Enter' key.");
  					criteria = input.nextLine();
  					print("The search for " + criteria + " produced the following results: ");
  	  				counter = 0;
  	  				for(Person lastName : listings) {
  	  					if(lastName.getLastName().equals(criteria)) {
  	  						counter++;
  	  						print("LISTING " + counter);
  	  						System.out.print(lastName.getFirstName()+" "+lastName.getMiddleName()+lastName.getLastName());
  	  						System.out.println(lastName.getAddress());
  	  						print(parsePhoneNum(lastName.getPhoneyNumber()));
  	  						blank(1);
  	  					}
  	  				}  					
  					break;
  				case 3:
  					print("SEARCH BY FIRST NAME ONLY");
  					blank(1);
  					print("Enter the first name, then press the 'Enter' key.");
  					criteria = input.nextLine();
  					print("The search for " + criteria + " produced the following results: ");
  	  				counter = 0;
  	  				for(Person firstName : listings) {
  	  					if(firstName.getFirstName().equals(criteria)) {
  	  						counter++;
  	  						print("LISTING " + counter);
  	  						System.out.print(firstName.getFirstName()+" "+firstName.getMiddleName()+firstName.getLastName());
  	  						System.out.println(firstName.getAddress());
  	  						print(parsePhoneNum(firstName.getPhoneyNumber()));
  	  						blank(1);
  	  					}
  	  				}  					
  					break;
  				case 4:
  					print("SEARCH BY STATE");
  					blank(1);
  					print("Enter the two-letter state abbreviation, then press the 'Enter' key.");
  					criteria = input.nextLine().toUpperCase();
  					print("The search for listings in " + criteria + " produced the following results: ");
  	  				counter = 0;
  	  				for(Person state : listings) {
  	  					if(state.getAddress().getState().toUpperCase().equals(criteria.toUpperCase())) {
  	  						counter++;
  	  						print("LISTING " + counter);
  	  						System.out.print(state.getFirstName()+" "+state.getMiddleName()+state.getLastName());
  	  						System.out.println(state.getAddress());
  	  						print(parsePhoneNum(state.getPhoneyNumber()));
  	  						blank(1);
  	  					}
  	  				}  					
  					break;
  				case 5:
  					print("SEARCH BY CITY");
  					blank(1);
  					print("Enter the city name, then press the 'Enter' key.");
  					criteria = input.nextLine();
  					print("The search for listings in the city of " + criteria + " produced the following results: ");
  	  				counter = 0;
  	  				for(Person city : listings) {
  	  					if(city.getAddress().getCity().equals(criteria)) {
  	  						counter++;
  	  						print("LISTING " + counter);
  	  						System.out.print(city.getFirstName()+" "+city.getMiddleName()+city.getLastName());
  	  						System.out.println(city.getAddress());
  	  						print(parsePhoneNum(city.getPhoneyNumber()));
  	  						blank(1);
  	  					}
  	  				}  					
  					break;
  				case 6:
  					blank(2);
  					print("REVERSE PHONE NUMBER LOOKUP");
  					blank(1);
  					print("Enter the 10-digit telephone number you wish to lookup. Enter the number without spaces.");
  					criteria = input.nextLine();
  	  				blank(1);
  					print("The search for phone number " + parsePhoneNum(criteria) + " produced the following results: ");
  	  				counter = 0;
  	  				for(Person phoney : listings) {
  	  					if(phoney.getPhoneyNumber().equals(criteria)) {
  	  						counter++;
  	  						print("LISTING " + counter);
  	  						System.out.print(phoney.getFirstName()+" "+phoney.getMiddleName()+phoney.getLastName());
  	  						System.out.println(phoney.getAddress());
  	  						blank(1);
  	  						}
  	  					}
				default:
					print("Please make a valid selection.");
					break;  	  				
  					}
				break;
  			case 2:
  				blank(1);
  				print("VIEW ALL DIRECTORY LISTINGS");
  				blank(1);
  				for(Person fullList : listings) {
  					System.out.print(fullList);
  					blank(1);
  				}
  				blank(1);
  					break;
  			case 3:
  				print("UPDATE AN EXISTING ENTRY");
  				blank(1);
  				print("Please enter the 10-digit phone number of the listing you would like to update.");
  				criteria = input.nextLine();
				blank(1);
				int indexFound = -1;
  				for(Person chosenOne : listings) {
  					if(chosenOne.getPhoneyNumber().equals(criteria)) {
  						indexFound = listings.indexOf(chosenOne);
  					}
  					if(indexFound > -1) {
  						print("LISTING FOUND. Please enter the requested data to update the listing.");
  		  				blank(1);
  		  				print("Enter the first name only.");
  		  				criteria = input.nextLine();
  		  				String firstName = criteria;
  		  				print("Next, enter the middle name only. IF THERE IS NONE, PRESS ENTER.");
  		  				criteria = input.nextLine();
  		  				String middleName = criteria;
  		  				print("Next, enter the last name only.");
  		  				criteria = input.nextLine();
  		  				String lastName = criteria;
  		  				print("Next, enter the street number and street name to appear on the address first line.");
  		  				criteria = input.nextLine();
  		  				String street1 = criteria;
  		  				print("Next, enter the city only.");
  		  				criteria = input.nextLine();
  		  				String city = criteria;
  		  				print("Next, enter the state only.");
  		  				criteria = input.nextLine();
  		  				String state = criteria;
  		  				print("Next, enter the five digit zip code only.");
  		  				criteria = input.nextLine();
  		  				String zipCode = criteria;
  		  				print("Finally, enter the 10-digit telephone number WITH NO SPACES OR HYPHENS. Ex. 5559998888");
  		  				criteria = input.nextLine();
  		  				blank(1);
  		  				String phoneyNumber = criteria;
  		  				Address address = new Address (street1, city, state, zipCode);
  		  				listings.get(indexFound).setFirstName(firstName);
  		  				listings.get(indexFound).setMiddleName(middleName);
  		  				listings.get(indexFound).setLastName(lastName);
  		  				listings.get(indexFound).setAddress(address);
  		  				listings.get(indexFound).setPhoneyNumber(phoneyNumber);
  		  				print("Thank you. The listing has been updated.");
  		  				blank(1);
  		  				Collections.sort(listings);
  		  				for(Person x : listings) {
  		  					System.out.print(x);
  		  					blank(1);
  		  					}
  		  				break;
  					}
  				}
  				break;
  			case 4:
  				blank(1);
  				print("ADD A NEW LISTING");
  				blank(1);
  				print("Enter the first name only.");
  				criteria = input.nextLine();
  				String firstName = criteria;
  				print("Next, enter the middle name only. IF THERE IS NONE, PRESS ENTER.");
  				criteria = input.nextLine();
  				String middleName = criteria;
  				print("Next, enter the last name only.");
  				criteria = input.nextLine();
  				String lastName = criteria;
  				print("Next, enter the street number and street name to appear on the address first line.");
  				criteria = input.nextLine();
  				String street1 = criteria;
  				print("Next, enter the city only.");
  				criteria = input.nextLine();
  				String city = criteria;
  				print("Next, enter the state only.");
  				criteria = input.nextLine();
  				String state = criteria;
  				print("Next, enter the five digit zip code only.");
  				criteria = input.nextLine();
  				String zipCode = criteria;
  				print("Finally, enter the 10-digit telephone number WITH NO SPACES OR HYPHENS. Ex. 5559998888");
  				criteria = input.nextLine();
  				String phoneyNumber = criteria;
  				Person addOne = new Person(firstName, middleName, lastName, new Address(street1, city, state, zipCode), phoneyNumber);
  				listings.add(addOne);
  				print("Thank you. The listing has been added.");
  				blank(1);
  				Collections.sort(listings);
  				for(Person x : listings) {
  					System.out.print(x);
  					blank(1);
  				}
  				blank(1);
					break;
  			case 5:
  				print("DELETE AN EXISTING LISTING");
  				blank(1);
  				print("Please enter the 10-digit phone number of the listing you would like to remove.");
  				criteria = input.nextLine();
				blank(1);
  				for(Person chosenOne : listings) {
  					if(chosenOne.getPhoneyNumber().equals(criteria)) {
  						indexFound = listings.indexOf(chosenOne);
  						listings.remove(indexFound);
  		  				print("LISTING REMOVED");
  		  				for(Person fullList : listings) {
  		  					System.out.print(fullList);
  		  					blank(1);
  		  				}
  		  				blank(1);
  						break;
  						}
  					}
					break;
  			case 6:
  				print("ABOUT THE DIRECTORY / ABOUT WELLSCOM");
  				print("****************************************");
  				print("Electronic Phone Directory, version 1.0");
  				print("           © Copyright 2017");
  				print("WellsCom is a subsidiary of MarcusCorp");
  				print("  Theft of any portion of this program");
  				print("will be met with swift and unending fury.");
  				print("    Thank you for choosing WellsCom!");
  				print("          We make the future!");
  				print("      IMakeComputerMagic@gmail.com");
  				print("****************************************");
					break;
  				
  			case 7:
  				print("EXIT THE PHONE DIRECTORY");
  				blank(2);
  				print("Shutting down. Please wait.");
  		  		Thread.sleep(3000);
  		  		blank(50);
  				print("****************************************");
  				blank(2);
  				print("    THANK YOU FOR CHOOSING WELLSCOM");
  				blank(2);
  				print("    At WellsCom, we make the future!");
  				blank(1);
  				print("****************************************");
  				print("                       Session has ended");
  				selection.close();
  				input.close();
				return;
  			default:
  				print("Please enter a valid selection");
					break;
  				}
			}
		}//End of the main method / while loop

		public static void blank(int lines) {
		for(int i = 0; i <= lines; i++) {
			System.out.println();
			}
		}
		public static void print(String string) {
			System.out.println(string);
		}
		public static String parsePhoneNum(String phoneNum) {
			String areaCode = phoneNum.substring(0, 3);
			String prefix = phoneNum.substring(3, 6);
			String suffix = phoneNum.substring(6, 10);
			return ("("+ areaCode + ") " + prefix + "-" + suffix);
		}

}
