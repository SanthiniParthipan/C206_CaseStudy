import java.util.ArrayList;

public class BikeShop {
	

	static final int DELETE_APPOINTMENT = 4;
	static final int DELETE_BIKE_INFO = 2;
	static final int CREATE_APPOINTMENT = 4;
	static final int CREATE_BIKE_INFO = 2;
	static final int DELETE_FEEDBACK = 5;
	static final int DELETE_BIKE_PARTS = 3;
	static final int DELETE_BUYER = 1;
	static final int DELETE_ITEMS = 3;
	static final int VIEW_ITEMS = 2;
	static final int CREATE_FEEBACK = 5;
	static final int CREATE_BIKE_PARTS = 3;
	static final int CREATE_BUYER = 1;
	static final int OPTION_CREATE_ITEMS = 1;
	static final int OPTION_QUIT = 6;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Feedback> feedbackList = new ArrayList<Feedback>();
		ArrayList<Bike> BikeList = new ArrayList<Bike>();
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		ArrayList<Appointment> appointment = new ArrayList<Appointment>();
		ArrayList<BikeParts> BikePartList = new ArrayList<BikeParts>();
		
		customerList .add(new Customer("Tony Tan", "Tonytan@gmail.com", "87940093"));
		//BikeList.add(new Bike(<<TO BE ADDED>>));
		BikePartList.add(new BikeParts("gear", "21 speed gear shifters shimano EF500(3x5)", true));
		//appointment.add(new Appointment(<<TO BE ADDED>>));
		feedbackList.add(new Feedback("Angelia", "good service ", "Thank you for your feedback"));

		
		int option = 0;
		while (option !=OPTION_QUIT) {

			BikeShop.menu();
			option = Helper.readInt("Enter an option >");

			if(option == OPTION_CREATE_ITEMS) {

				// create items
				BikeShop.setHeader("CREATE");
				BikeShop.setHeader("ITEM TYPES");
				System.out.println("1. buyer");
				System.out.println("2. Bike info");
				System.out.println("3. Bike parts");
				System.out.println("4. Appointment");
				System.out.println("5. Feedback");

				int itemType = Helper.readInt("Enter option to select item type > ");

				if (itemType == CREATE_BUYER) {
					// create a buyer
					Customer cc = inputCustomer();
					BikeShop.addCustomer(customerList, cc);

				} else if (itemType == CREATE_BIKE_INFO) {
					// create bike info
					Bike bi = inputBikeInfo();
					BikeShop.addBikeInfo(BikeList, bi);

				}else if (itemType == CREATE_BIKE_PARTS) {
					// create a bike parts
					BikeParts bp = inputBikeParts();
					BikeShop.addBikeParts(BikePartList, bp);


				}else if (itemType == CREATE_APPOINTMENT) {
					// create apppointment
					Appointment ap = inputAppointment();
					BikeShop.addAppointment(appointment, ap);

				}else if(itemType == CREATE_FEEBACK) {
					//create feedback
					Feedback fb = inputFeedback();
					BikeShop.addFeedback(feedbackList, fb);

				} else {
					System.out.println("Invalid type");
				}
				
			}else if(option ==VIEW_ITEMS) {
				// view all items
				BikeShop.viewAllBuyer(customerList );
				BikeShop.viewAllBikeInfo(BikeList);
				BikeShop.viewAllBikeParts(BikePartList);
				BikeShop.viewAllAppointment(appointment);
				BikeShop.viewAllFeedback(feedbackList);



			}else if(option ==DELETE_ITEMS ){
				// Delete 

				BikeShop.setHeader("Delete");			
				BikeShop.setHeader("ITEM TYPES");

		        System.out.println("1. Buyer");
		        System.out.println("2. Bike Listing and Features");
		        System.out.println("3. Bike Parts listing ");
		        System.out.println("4. Appointment");
		        System.out.println("5. Feedback");

				int itemType = Helper.readInt("Enter option to select item type > ");
 
				if (itemType == DELETE_BUYER) {
					// Delete buyers’ information
					BikeShop.deleteBuyer(customerList);

				} else if (itemType == DELETE_BIKE_INFO) {
					// delete bike info
					BikeShop.deleteBikeInfo(BikeList);
				
				}else if (itemType == DELETE_BIKE_PARTS) {
					// delete bike parts
					BikeShop.deleteBikeParts(BikePartList);

				}else if (itemType == DELETE_APPOINTMENT) {
					// delete appointment
					BikeShop.deleteAppointment(appointment);
				
				}else if(itemType == DELETE_FEEDBACK) {
					// delete feedback
					BikeShop.deleteFeeback(feedbackList);
				} else {
					System.out.println("Invalid type");
				}
			
			
			}else if(option ==4 ){
				System.out.println("bye");
			}else {
				System.out.println("invalid option");
			}

		}
	}


	public static void menu() {
		BikeShop.setHeader("Bike shop APP");
		System.out.println("1. create item");
		System.out.println("2. view item");
		System.out.println("3. delete item");
		System.out.println("4. quit");

		Helper.line(80, "-");
		;

	}

	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");

	}



	// ================================================= Option 1 create =====================================
	
	//ELAINE
	public static Customer inputCustomer() {
		String customerName = Helper.readString("Enter your name > ");
		String customerEmail = Helper.readString("Enter your email > ");
		String customerPhone = Helper.readString("Enter your phone > ");
		Customer cc = new Customer(customerName, customerEmail, customerPhone);
		return cc;
	}

	public static void addCustomer(ArrayList<Customer> customerList, Customer cc) {
		// TODO Auto-generated method stub
		
			customerList.add(cc);
			System.out.println("Customer information has successfully added!");

	}

	public static Bike inputBikeInfo() {
		// Gabrielle
		return null;
	}

	public static void addBikeInfo(ArrayList<Bike> bikeList, Bike bi) {
		// Gabrielle
		
	}


	
	public static BikeParts inputBikeParts() {
		// Jia Xin
		String customerName = Helper.readString("Enter your name: ");
		String bikeParts = Helper.readString("Enter bike parts: ");
		
		BikeParts bp = new BikeParts(customerName, bikeParts, false);

		return bp;
	}

	public static void addBikeParts(ArrayList<BikeParts> BikePartList, BikeParts bp) {
		// Jia Xin
		BikePartList.add(bp);
		System.out.println("Bike parts has successfully added!");
	}
	
	public static Appointment inputAppointment() {
		// Firdaus
		return null;
	}

	public static void addAppointment(ArrayList<Appointment> appointment, Appointment ap) {
		// Firdaus

	}

	public static Feedback inputFeedback() {
		// santhini
		String customer = Helper.readString("Enter your name :");
		String feedback = Helper.readString("Enter feedback :");
		String response = Helper.readString("Enter response");
		
		Feedback fb = new Feedback (customer,feedback , response);
		return fb;
	} 

	public static void addFeedback(ArrayList<Feedback> feedbackList, Feedback fb) {
		// santhini
		feedbackList.add(fb);
		System.out.println("feedback added");

	}

	// =============================================== Option 2 view =======================================
	//ELAINE
	public static String retrieveAllCustomer(ArrayList<Customer> customerList) {
		String output = "";
		
		for(int i = 0; i < customerList.size(); i++) {
			output += String.format("%-20s %-20s\n" , customerList.get(i).getName(), customerList.get(i).getEmail(), customerList.get(i).getPhone());
		}
		return output;

		}
	
	//ELAINE
	public static void viewAllBuyer(ArrayList<Customer> customerList) {
		Helper.line(60, "-");
		System.out.println("VIEW CUSTOMER INFORMATION");
		String output = "";
			
		    output = String.format("%-20s %-20s\n", "NAME, EMAIL", "PHONE");
			output += retrieveAllCustomer(customerList);

			    System.out.println(output);
		

	}

	public static void viewAllBikeInfo(ArrayList<Bike> bikeList) {
		// Gabrielle

	}
	
	
	public static String retrieveAllBikeParts(ArrayList<BikeParts> BikePartList) {
		// Jia Xin
		String output = "";
		
		for(int i = 0; i < BikePartList.size(); i++) {
			output += String.format("%-20s %-20s\n" , BikePartList.get(i).getPartName(), BikePartList.get(i).getDescriptions());
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
	
	
	
	public static void viewAllAppointment(ArrayList<Appointment> appointment) {
		// Firdaus
 
	}

	
	
	public static String retrieveAllFeedback(ArrayList<Feedback> feedbackList) {
		//santhini
		String output = "";
		for (int i = 0; i < feedbackList.size(); i++) {

			output += String.format("%-30s %-30s %-30s\n", feedbackList.get(i).getCustomer(),
					feedbackList.get(i).getFeedback(), 
					feedbackList.get(i).getResponse());
		}
		
		return output;
		
	}
	public static void viewAllFeedback(ArrayList<Feedback> feedbackList) {
		//santhini
		BikeShop.setHeader("FEEDBACK LIST");
		String output = String.format("%-30s %-30s %-30s\n", "CUSTOMER NAME", "FEEDBACK",
				"RESPONSE");
		 output += retrieveAllFeedback(feedbackList);	
		System.out.println(output);

	}
	
	// ===================================== Option 3 delete===============================

	public static void deleteBuyer(ArrayList<Customer> customerList) {
	    // ELAINE
		Helper.line(20, "-");
	    String b = Helper.readString("Enter Buyer's information > ");
	    
	    boolean exist = false;
	    
	    for (Customer i :customerList) {
	      if(i.getName().equalsIgnoreCase(b)) {
	        customerList.remove(i);
	        exist = true;
	        System.out.println("Information has been deleted!");
	        break;
	      }
	    }
	    if (exist == false) {
	    	System.out.println("Information does not exist!");
	    }
	        
	  }
		

	public static void deleteBikeInfo(ArrayList<Bike> bikeList) {
		// Gabrielle

	}

	public static void deleteBikeParts(ArrayList<BikeParts> BikePartList) {
		// Jia Xin
		String b = Helper.readString("Enter Bike Parts> ");
		for (BikeParts i :BikePartList) {
			if(i.getDescriptions().equalsIgnoreCase(b)) {
				BikePartList.remove(i);
				System.out.println("Bike Part has deleted!");

				break;
			}else {
				System.out.println("Bike Part Not Found!");
			}
		}
	     
	}
	     
	public static void deleteAppointment(ArrayList<Appointment> appointment) {
		// Firdaus

	}

	public static void deleteFeeback(ArrayList<Feedback> feedbackList) {
		// TODO Auto-generated method stub
		
	    String DeleteFeedback = Helper.readString("Enter feedback to delete: ");
	    String DeleteCus = Helper.readString("Enter Customer to delete: ");
	    String DeleteRes = Helper.readString("Enter response to delete: ");

	    for (Feedback fb : feedbackList) {
	      if (fb.getFeedback().equalsIgnoreCase(DeleteFeedback)){
	    	 feedbackList.remove(fb);
	    	  break;
	      } else {
	        System.out.println("feedback does not exsit ");
	      }
	    }

	}







}
