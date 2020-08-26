import java.util.ArrayList;

public class BikeShop {

	static final int DELETE_FEEDBACK = 3;
	static final int VIEW_FEEDBACK = 2;
	static final int CREATE_FEEDBACK = 1;

	static final int DELETE_APPOINTMENT = 3;  
	static final int VIEW_APPOINTMENT = 2;
	static final int CREATE_APPOINTMENT = 1;
	static final int UPDATE_APPOINTMENT = 4;
	static final int SEARCH_APPOINTMENT = 5;

	static final int AVAILABILITY_BIKE_PARTS = 5;
	static final int UPDATE_BIKE_PARTS = 4;
	static final int DELETE_BIKE_PARTS = 3;
	static final int VIEW_BIKE_PARTS = 2;
	static final int CREATE_BIKE_PARTS = 1;

	private static int BikePartsCount = 0;
	private static BikeParts[] BikeParts = new BikeParts[10];
	private static String updateAppDetails; 
	
	static final int DELETE_BIKE_INFO = 3;
	static final int VIEW_BIKE_INFO = 2;
	static final int CREATE_BIKE_INFO = 1;

	static final int SEARCH_BUYER = 5;
	static final int UPDATE_BUYER = 4;
	static final int DELETE_BUYER = 3;
	static final int VIEW_BUYER = 2;
	static final int CREATE_BUYER = 1;

	static final int OPTION_QUIT = 6;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Feedback> feedbackList = new ArrayList<Feedback>();
		ArrayList<Bike> BikeList = new ArrayList<Bike>();
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		ArrayList<Appointment> appointment = new ArrayList<Appointment>();
		ArrayList<BikeParts> BikePartList = new ArrayList<BikeParts>();

		customerList.add(new Customer("Tony Tan", "Tonytan@gmail.com", "87940093"));
		customerList.add(new Customer("johnny wong", "Jonnywong@gmail.com", "87940065"));
		BikeList.add(new Bike("projava Funga-3 27.5 ", "Mountainbike taiwan brand", true));
		BikePartList.add(new BikeParts("BP1","gear",10,"21 speed gear shifters shimano EF500(3x5)", true));
		// appointment.add(new Appointment(<<TO BE ADDED>>));
		feedbackList.add(new Feedback("Angelia", "good service ", "Thank you for your feedback"));

		int option = 0;
		while (option != OPTION_QUIT) {

			BikeShop.menu();
			option = Helper.readInt("Enter an option >");

			if (option == 1) { // Elaine

				// buyer

				BikeShop.Customermenu();

				int itemType = Helper.readInt("Enter option to select item type for customer > ");

				if (itemType == CREATE_BUYER) {
					// create a buyer
					Customer cc = inputCustomer();
					BikeShop.addCustomer(customerList, cc);

				} else if (itemType == VIEW_BUYER) {
					// view Buyer
					BikeShop.viewAllBuyer(customerList);

				} else if (itemType == DELETE_BUYER) {
					// Delete buyer
 
					String b = Helper.readString("Enter Buyer's information > ");
					BikeShop.deleteBuyer(customerList, null);
				} else if (itemType == UPDATE_BUYER) {
					// UPDATE BUYER
					String updateName = Helper.readString("Enter the buyer's name you wish to update: ");
					String updateEmail = Helper.readString("Enter the buyer's email you wish to update: ");
					String updatePhone = Helper.readString("Enter the buyer's phone you wish to update: ");
					BikeShop.updateBuyer(customerList, updateName, updateEmail, updatePhone);
				}else if (itemType == SEARCH_BUYER) {
					//SEARCH
					String name = Helper.readString("Enter name > ");
					String num = Helper.readString("Enter phone number > ");
					BikeShop.searchBuyer(customerList, name, num);
				
				} else {
					System.out.println("bye");
				}

			} else if (option == 2) { // gabrielle

				BikeShop.BikeInfomenu();
				int itemTypeBI = Helper.readInt("Enter option to select item type for bike info >");

				if (itemTypeBI == CREATE_BIKE_INFO) {
					// create a BikeInfo
					Bike bi = inputBikeInfo();
					BikeShop.addBikeInfo(BikeList, bi);

				} else if (itemTypeBI == VIEW_BIKE_INFO) {
					// view BikeInfo
					BikeShop.viewAllBikeInfo(BikeList);

				} else if (itemTypeBI == DELETE_BIKE_INFO) {
					// Delete BikeInfo
					BikeShop.deleteBikeInfo(BikeList, null);

				} else {
					System.out.println("bye");
				}

			} else if (option == 3) { // jia xin
				
				BikeShop.BikePartsmenu();
				int itemTypeBp = Helper.readInt("Enter option to select item type for bike parts >");
				
				if (itemTypeBp == CREATE_BIKE_PARTS) {
					// create a Bikeparts
					
					BikeParts bp = inputBikeParts();
					BikeShop.addBikeParts(BikePartList, bp);

				} else if (itemTypeBp == VIEW_BIKE_PARTS) {
					// view Bikeparts
					BikeShop.viewAllBikeParts(BikePartList);

				}else if (itemTypeBp == DELETE_BIKE_PARTS) {
					// Delete BikeParts
					BikeShop.deleteBikeParts(BikePartList,null);

				}else if (itemTypeBp == UPDATE_BIKE_PARTS) {
					BikeShop.updateBikeParts(BikePartList,null);
					
				}else if(itemTypeBp == AVAILABILITY_BIKE_PARTS) {
					BikeShop.viewAllBikeParts(BikePartList,null);
				}else {
					System.out.println("bye");
				}


			} else if (option == 4) { //firdaus
				BikeShop.Appointmentmenu();
				int itemTypeAp = Helper.readInt("Enter option to select item type for Appointment >");

				if (itemTypeAp == CREATE_APPOINTMENT) {
					// create a Appointment
					Appointment ap = inputAppointment();
					BikeShop.addAppointment(appointment, ap);

				} else if (itemTypeAp == VIEW_APPOINTMENT) {
					// view Appointment
					BikeShop.viewAllAppointment(appointment);

				} else if (itemTypeAp == DELETE_APPOINTMENT) {
					// Delete Appointment
					BikeShop.deleteAppointment(appointment, null);
					
				}else if (itemTypeAp == UPDATE_APPOINTMENT) {
					//Update Appointment
					BikeShop.updateBuyerAppointment(appointment,null);
					
				}else if (itemTypeAp == SEARCH_APPOINTMENT) {
					//Search Appointment
					String name = Helper.readString("Enter name: ");
					String date = Helper.readString("Enter date: ");
					BikeShop.searchAppByBuyer(appointment, name, date);
				} else {
					System.out.println("bye");
				}

			} else if (option == 5) { //santhini
				BikeShop.Feedbackmenu();
				int itemTypefb = Helper.readInt("Enter option to select item type for Feedback >");

				if (itemTypefb == CREATE_FEEDBACK) {
					// create a Feedback
					Feedback fb = inputFeedback();
					BikeShop.addFeedback(feedbackList, fb);

				} else if (itemTypefb == VIEW_FEEDBACK) {
					// view feedback
					BikeShop.viewAllFeedback(feedbackList);

				} else if (itemTypefb == DELETE_FEEDBACK) {
					// Delete feedback
					BikeShop.deleteFeeback(feedbackList, null);

				} else if (itemTypefb == 4) {
					// update feedback
					BikeShop.Updatefeedback(feedbackList, null, null, null);

				} else if (itemTypefb == 5) {
					// response to feedback
					BikeShop.resonsefeedback(feedbackList, null,null,null);

				} else if (itemTypefb == 6) {
					System.out.println("quit");
				}

			}

		}
		System.out.println("thank you for using bike shop");
	}

	public static void menu() {
		BikeShop.setHeader("Bike shop APP");
		System.out.println("1. Buyer Registeration");
		System.out.println("2. Bike info");
		System.out.println("3. Bike parts");
		System.out.println("4. Appointment");
		System.out.println("5. feedback");
		System.out.println("6. quit");
		Helper.line(80, "-");
		;

	}
	// Elaine menu
	public static void Customermenu() {  
		BikeShop.setHeader("Bike shop APP");
		System.out.println("1. create Buyer");
		System.out.println("2. view Buyer");
		System.out.println("3. delete Buyer");
		System.out.println("4. Update buyer's information");
		System.out.println("5. Search buyer");
		System.out.println("6. Quit");

		Helper.line(80, "-");
		;
 
	}
	//Gabrielle menu
	public static void BikeInfomenu() {
		BikeShop.setHeader("Bike shop APP");
		System.out.println("1. create Bike Info");
		System.out.println("2. view BIke info");
		System.out.println("3. delete Bike info");
		System.out.println("4.Quit");

		Helper.line(80, "-");
		;

	}
	// Jia Xin menu
	public static void BikePartsmenu() {
		BikeShop.setHeader("Bike shop APP");
		System.out.println("1. create BikeParts");
		System.out.println("2. view BikeParts");
		System.out.println("3. delete BikeParts");
		System.out.println("4. update BikeParts");
		System.out.println("5. BikeParts availability");
		System.out.println("6. quit");

		Helper.line(80, "-");
		;

	}
	//Firdaus menu
	public static void Appointmentmenu() {
		BikeShop.setHeader("Bike shop APP");
		System.out.println("1. create Appointment");
		System.out.println("2. view Appointment");
		System.out.println("3. delete Appointment");
		System.out.println("4. update Appointment");
		System.out.println("5. search appointment details");
		System.out.println("6. quit");

		Helper.line(80, "-");
		;

	}
	// santhini menu
	public static void Feedbackmenu() {
		BikeShop.setHeader("Bike shop APP");
		System.out.println("1. create Feedback");
		System.out.println("2. view Feedback");
		System.out.println("3. delete Feedback");
		System.out.println("4. update Feedback");
		System.out.println("5. response to Feedback");
		System.out.println("6. quit");

		Helper.line(80, "-");
		;

	}

	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");

	}

	// ==================================================Buyer=============================================

	//ELAINE
	public static Customer inputCustomer() {
		String customerName = Helper.readString("Enter your name > ");
		String customerEmail = Helper.readString("Enter your email > ");
		String customerPhone = Helper.readString("Enter your phone > ");
		Customer cc = new Customer(customerName, customerEmail, customerPhone);
		return cc;
	}

	public static void addCustomer(ArrayList<Customer> customerList, Customer cc) {
		// //ELAINE
		
			customerList.add(cc);
			System.out.println("Customer information has successfully added!");

	}
	
	
	
	//ELAINE
	public static String retrieveAllCustomer(ArrayList<Customer> customerList) {
		String output = "";
		
		for(int i = 0; i < customerList.size(); i++) {
			output += String.format("%-20s %-20s %-20s\n" , customerList.get(i).getName(), customerList.get(i).getEmail(), customerList.get(i).getPhone());
		}
		return output;

		}
	
	//ELAINE
	public static void viewAllBuyer(ArrayList<Customer> customerList) {
		Helper.line(60, "-");
		System.out.println("VIEW CUSTOMER INFORMATION");
		String output = "";
			
		    output = String.format("%-20s %-20s %-20s\n", "NAME", "EMAIL", "PHONE");
			output += retrieveAllCustomer(customerList);

			    System.out.println(output);
		

	}
	

	public static String deleteBuyer(ArrayList<Customer> customerList, Customer cu1) {
	    // ELAINE
		Helper.line(20, "-");
	    String customer=Helper.readString("enter customer to delete :");
	    boolean exist = false;
	    
	    for (Customer i :customerList) {
	      if(i.getName().equalsIgnoreCase(customer)) {
	        customerList.remove(i);
	        exist = true;
	        String output = "Information has been deleted!";
	        return output;
	        }
	    }
	    if (exist == false) {
	    	String output = "Information does not exist!";
	    	return output;
	    }
	    
	    return null;
	        
	  }
	
	public static String updateBuyerTest(ArrayList<Customer> customerList, String name,String email,String phone) {
		  //ELAINE V2 UPDATE
		    Helper.line(20,  "-");
		    System.out.println("UPDATE BUYER INFORMATION");
		    Helper.line(60, "-");

		    String output = "";

		    
		    boolean isFound = false;
		        
		    for (Customer i : customerList) {
		      
		      if (i.getName().equalsIgnoreCase(name) && i.getEmail().equalsIgnoreCase(email) && i.getPhone().equalsIgnoreCase(phone)) {
		        String newName = Helper.readString("Enter a new name: ");
		        String newEmail = Helper.readString("Enter a new email: ");
		        String newPhone = Helper.readString("Enter a new phone: ");
		        i.setName(newName);
		        i.setEmail(newEmail);
		        i.setPhone(newPhone);
		        isFound = true;
		        output = "updated successfully";
		        System.out.println(output);
		        break;
		      }
		    }
	        if(isFound == false) {
	          output = "Incorrect information";
	          System.out.println(output);
	        }
		          
		       
		      return output;
		}
	
	
	
	public static void updateBuyer(ArrayList<Customer> customerList, String name,String email,String phone) {
		//ELAINE V2 UPDATE
		String output = updateBuyerTest(customerList, name, email, phone);
		System.out.println(output);
		
		}
	public static String searchBuyer(ArrayList<Customer> customerList, String name, String phone) {
		//ELAINE V2 SEARCH
		Helper.line(20, "-");
		System.out.println("SEARCH BUYER INFORMATION");
		Helper.line(60,  "-");
				
		String output =  "";
		boolean exist = false;
		
		for (Customer i : customerList) {
			if (i.getName().equalsIgnoreCase(name) && i.getPhone().equals(phone)) {
				exist = true;
				output+=i.getName() +"\n";
				output+=i.getEmail()+"\n";
				output+=i.getPhone();
				;

			}
		}
		if (exist == false) {
			output+="This name/phone do not exist!";
		}
		
		System.out.println(output);
		return output;
	}
		
	
		
		
	

	// ================================================= Bike Info  =====================================
	// Gabrielle 
	
	public static Bike inputBikeInfo() {
		String bikeModel = Helper.readString("Enter bike model: ");
		String bikeDesc = Helper.readString("Enter bike description: ");

		Bike bi = new Bike(bikeModel, bikeDesc, false);

		return bi;
	}

	public static void addBikeInfo(ArrayList<Bike> bikeList, Bike bi) {
		// Gabrielle

		bikeList.add(bi);
		System.out.println("Bike model has successfully added!");

	}

	public static String retrieveAllBikeInfo(ArrayList<Bike> bikeList) {
		// Gabrielle
		String output = "";

		for (int i = 0; i < bikeList.size(); i++) {
			output += String.format("%-20s %-20s\n", bikeList.get(i).getModel(), bikeList.get(i).getDescription(),
					bikeList.get(i).getIsAvailable());
		}
		return output;

	}

	public static void viewAllBikeInfo(ArrayList<Bike> bikeList) {
		// Gabrielle

		String output = "";

		output = String.format("%-20s %-20s\n", "MODEL", "DESCRIPTION", "AVAILABLITY");
		output += retrieveAllBikeInfo(bikeList);

		System.out.println(output);

	}

	public static void deleteBikeInfo(ArrayList<Bike> bikeList, Bike bi1) {
		// Gabrielle
		String type = Helper.readString("Enter Bike Model: ");
		for (Bike i : bikeList) {
			if (i.getDescription().equalsIgnoreCase(type)) {
				bikeList.remove(i);
				System.out.println("Bike Model has been deleted!");

				break;
			} else {
				System.out.println("Bike Model Not Found!");
			}
		}

	}

	//===================================================== Bike Parts===============================
	
	
	public static BikeParts inputBikeParts() {
		// Jia Xin
		String partNumber = Helper.readString("Enter part number: ");
		String bikePartsName = Helper.readString("Enter part name: ");
		String bikeParts = Helper.readString("Enter bike parts descriptions: ");
		
		BikeParts bp = new BikeParts(partNumber, bikePartsName, BikePartsCount, bikeParts, true);

		return bp;
	}

	public static void addBikeParts(ArrayList<BikeParts> BikePartList, BikeParts bp) {
		// Jia Xin
		BikePartList.add(bp);
		System.out.println("Bike parts has successfully added!");
	}



	
	public static String retrieveAllBikeParts(ArrayList<BikeParts> BikePartList) {
		// Jia Xin
		String output = "";
		
		for(int i = 0; i < BikePartList.size(); i++) {
			output += String.format("%-20s %-20s\n" , BikePartList.get(i).getPartName(),BikePartList.get(i).getDescriptions());
		}
		return output;

		}

	public static void viewAllBikeParts(ArrayList<BikeParts> BikePartList) {
		// Jia Xin
	    String output = "";
	
	    output = String.format("%-20s %-20s\n", "PART NAME", "DESCRIPTIONS");
		output += retrieveAllBikeParts(BikePartList);

		    System.out.println(output);
	}
	


	public static void deleteBikeParts(ArrayList<BikeParts> BikePartList, BikeParts bp1) {
		// Jia Xin
		String b = Helper.readString("Enter Bike Parts> ");
		for (BikeParts i :BikePartList) {
			if(i.getPartName().equalsIgnoreCase(b)) {
				BikePartList.remove(i);
				System.out.println("Bike Part has deleted!");
				break;
				
			}else {
				System.out.println("Bike Part Not Found!");
			}
		}
	     
	}
	
	public static void updateBikeParts(ArrayList<BikeParts> BikePartList, BikeParts bp1) {
		// Jia Xin
		
		String updateBikeParts = Helper.readString("Enter the bike part name to update: ");
		
		for (BikeParts i :BikePartList) {
			if(i.getPartName().equalsIgnoreCase(updateBikeParts)) {
				String newBikePartName = Helper.readString("Enter new bike parts name: ");
				String newBikePart = Helper.readString("Enter new bike parts information: ");
				i.setPartName(newBikePartName);
				i.setDescriptions(newBikePart);
				System.out.println("Bike Part is updated!");
				break;
				
			}else {
				if(i.getPartName() != updateBikeParts){
					System.out.println("l !");
				}
			}
		}
		
	}
	//
	public static String updateBikeParts(ArrayList<BikeParts> bikePartList) {
		// Jia Xin
		return null;
	}
	//
	
	public static String viewBikeParts(ArrayList<BikeParts> BikePartList) {
		// Jia Xin
		String output = "";
		
		for(int i=0; i < BikePartList.size(); i++) {
			int unit = BikePartList.get(i).getUnit();
			calculate(unit);
			output += String.format("%-84s \n", BikePartList.get(i).toStrings());
		}
		return output;
	}
	
	public static void viewAllBikeParts(ArrayList<BikeParts> BikePartList, BikeParts bp1) {
		// Jia Xin
		String output = String.format("%-10s %-30s %-10s %10s\n", "ASSET ID", "Bike Part Name", "Unit", "Available");
		output += viewBikeParts(BikePartList);
		System.out.println(output);
	}
	
	private static void calculate(int unit) {
		// Jia Xin	
	}
	


	// ========================================================Appointment==================================

	public static Appointment inputAppointment() {
		// Firdaus
		String name = Helper.readString("Enter your name: ");
		int number = Helper.readInt("Enter your number: ");
		String ic = Helper.readString("Enter identification number: ");
		String date = Helper.readString("Enter preferred appointment date: ");

		Appointment ap = new Appointment(name, number, ic, date);
		return ap;
	}

	public static void addAppointment(ArrayList<Appointment> appointment, Appointment ap) {
		// Firdaus
		appointment.add(ap);
		System.out.println("Appointment succesfully added!");
	}

	public static String retrieveAllAppointment(ArrayList<Appointment> appointment) {
		// Firdaus
		String output = "";

		for (int i = 0; i < appointment.size(); i++) {
			output += String.format("%-20s %-20d %-20s %-20s", appointment.get(i).getName(),
					appointment.get(i).getNumber(), appointment.get(i).getIc(), appointment.get(i).getDate());
		}
		return output;
	}

	public static void viewAllAppointment(ArrayList<Appointment> appointment) {
		// Firdaus
		System.out.println("Appointment List");
		Helper.line(60, "-");
		String output = "";

		output = String.format("%-20s %-20s %-20s %-20s", "CUSTOMER NAME", "PHONE NUMBER", "IDENTIFICATION CARD NO.",
				"DATE OF APPOINTMENT\n");
		output += retrieveAllAppointment(appointment);
		System.out.println(output);
	}

	public static void deleteAppointment(ArrayList<Appointment> appointment, Appointment ap1) {

		// Firdaus
		String n = Helper.readString("Enter your name: ");

		for (Appointment ap : appointment) {
			if (ap.getName().equalsIgnoreCase(n)) {
				appointment.remove(ap);
				System.out.println("Appointment deleted");
				break;
			} else {
				System.out.println("Appointment Not Found!");
			}
		}
	}
	public static void updateBuyerAppointment(ArrayList<Appointment> appointment, Appointment ap1) {
		//Firdaus
		String updateAppDetails = Helper.readString("Enter name to update: ");
		
		for (Appointment i :appointment) {
			if(i.getName().equalsIgnoreCase(updateAppDetails)) {
				int newNumber = Helper.readInt("Enter new contact number: ");
				i.setNumber(newNumber);
				System.out.println("Appointment Details is updated!");
				break;
			} else {
				if(i.getName() != updateAppDetails){
					System.out.println("Invalid Name!");
				}
			}
		}
	}
	public static String updateBuyerAppointment(ArrayList<Appointment> appointment) {
		// Firdaus
		return null;
	}
	public static String searchAppByBuyer(ArrayList<Appointment> appointment, String name, String date) {
		// Firdaus
		Helper.line(60, "-");
		System.out.println("SEARCH BUYER APPOINTMENT");
		Helper.line(60,"-");
		
		String output =  "";
		boolean exist = false;
		
		for (Appointment i : appointment) {
			if (i.getName().equalsIgnoreCase(name) && i.getDate().equals(date)) {
				exist = true;
				output+=i.getName() +"\n";
				output+=i.getNumber()+"\n";
				output+=i.getIc()+"\n";
				output+=i.getDate();
				;

			}
			if (exist == false) {
				output+="This attendee's name or appointment date does not exist!";
			}
			System.out.println(output);		
		}
		return output;
	}
	// ====================================================== FeedBack===============================

	public static Feedback inputFeedback() {
		// santhini
		String customer = Helper.readString("Enter your name :");
		String feedback = Helper.readString("Enter feedback :");

		Feedback fb = new Feedback(customer, feedback, null);
		return fb;
	}

	public static void addFeedback(ArrayList<Feedback> feedbackList, Feedback fb) {
		// santhini
		feedbackList.add(fb);
		System.out.println("feedback has successfully added");

	}


	public static String retrieveAllFeedback(ArrayList<Feedback> feedbackList) {
		// santhini
		String output = "";
		for (int i = 0; i < feedbackList.size(); i++) {

			output += String.format("%-30s %-30s %-30s\n", feedbackList.get(i).getCustomer(),
					feedbackList.get(i).getFeedback(), feedbackList.get(i).getResponse());
		}

		return output;

	}

	public static void viewAllFeedback(ArrayList<Feedback> feedbackList) {
		// santhini
		BikeShop.setHeader("FEEDBACK LIST");
		String output = String.format("%-30s %-30s %-30s\n", "CUSTOMER NAME", "FEEDBACK", "RESPONSE");
		output += retrieveAllFeedback(feedbackList);
		System.out.println(output);

	} 

	public static void deleteFeeback(ArrayList<Feedback> feedbackList, Object object) {
		// santhini
		BikeShop.viewAllFeedback(feedbackList);
		String DeleteFeedback = Helper.readString("Enter feedback to delete: ");

		for (Feedback fb : feedbackList) {
			if (DeleteFeedback.equalsIgnoreCase(fb.getCustomer())) {
				feedbackList.remove(fb);
				System.out.println("deleted feedback successfully  ");
				
				break;
			}else {
				System.out.println("name does not exsist");
				 
			}
			
		} 

	}

	public static String resonsefeedback(ArrayList<Feedback> feedbackList, String name, String feedback, String response) {
		// santhini

		BikeShop.viewAllFeedback(feedbackList);
		String responseName = Helper.readString("Enter name to response :");
		boolean responseb = false;

		for (int i = 0; i < feedbackList.size(); i++) {
			if (responseName.equalsIgnoreCase(feedbackList.get(i).getCustomer())) {

				String nresponse = Helper.readString("Enter response :");
				feedbackList.get(i).setResponse(nresponse);
				;
				responseb = true;

				System.out.println(" response successfully sent  ");
				break;
			}
		}
		if (responseb == false) {
			System.out.println("invalid name ");
		}
		return null; 

	}

	public static String Updatefeedback(ArrayList<Feedback> feedbackList, String name, String feedback,
			String response) {
		// santhini

		BikeShop.viewAllFeedback(feedbackList);
		String updateName = Helper.readString("Enter name to update :");
		boolean updated = false;

		for (int i = 0; i < feedbackList.size(); i++) {
			if (updateName.equalsIgnoreCase(feedbackList.get(i).getCustomer())) {

				String newfeedback = Helper.readString("Enter new feedback :");
				feedbackList.get(i).setFeedback(newfeedback);
				updated = true;

				System.out.println(" feedback updated ");
				break;
			}
		}
		if (updated == false) {
			System.out.println("invalid name ");
		} 
		return null;

	}



}