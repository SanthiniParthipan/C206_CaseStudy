import java.util.ArrayList;

public class BikeShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Feedback> feedbackList = new ArrayList<Feedback>();
		ArrayList<Bike> BikeList = new ArrayList<Bike>();
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		ArrayList<Appointment> appointment = new ArrayList<Appointment>();
		ArrayList<BikeParts> BikePartList = new ArrayList<BikeParts>();
		
		int option = 0;
		while (option !=6) {

			BikeShop.menu();
			option = Helper.readInt("Enter an option >");

			if(option == 1) {

				// create items
				BikeShop.setHeader("CREATE");
				BikeShop.setHeader("ITEM TYPES");
				System.out.println("1. buyer");
				System.out.println("2. Bike info");
				System.out.println("3. Bike parts");
				System.out.println("4. Appointment");
				System.out.println("5. Feedback");

				int itemType = Helper.readInt("Enter option to select item type > ");

				if (itemType == 1) {
					// create a buyer
					Customer cc = inputCustomer();
					BikeShop.addCustomer(customerList, cc);

				} else if (itemType == 2) {
					// create Chromebook
					Bike bi = inputBikeInfo();
					BikeShop.addBikeInfo(BikePartList, bi);

				}else if (itemType == 3) {
					// create a bike parts
					BikeParts bp = inputBikeParts();
					BikeShop.addBikeParts(BikePartList, bp);


				}else if (itemType == 4) {
					// create apppointment
					Appointment ap = inputAppointment();
					BikeShop.addAppointment(appointment, ap);

				}else if(itemType == 5) {
					//create feedback
					Feedback fb = inputFeedback();
					BikeShop.addFeedback(feedbackList, fb);

				} else {
					System.out.println("Invalid type");
				}
				
			}else if(option ==2) {
				// view all items
				BikeShop.viewAllBuyer(customerList );
				BikeShop.viewAllBikeInfo(BikePartList);
				BikeShop.viewAllBikeParts(BikePartList);
				BikeShop.viewAllAppointment(appointment);
				BikeShop.viewAllFeedback(feedbackList);



			}else if(option ==3 ){
				// Delete 

				BikeShop.setHeader("Delete");			
				BikeShop.setHeader("ITEM TYPES");
				System.out.println("1. buyer");
				System.out.println("2. Bike info");
				System.out.println("3. Bike parts");
				System.out.println("4. Appointment");
				System.out.println("5. Feedback");

				int itemType = Helper.readInt("Enter option to select item type > ");

				if (itemType == 1) {
					// Delete buyers’ information
					BikeShop.deleteBuyer(customerList);

				} else if (itemType == 2) {
					// delete bike info
					BikeShop.deleteBikeInfo(BikePartList);
				
				}else if (itemType == 3) {
					// delete bike parts
					BikeShop.deleteBikeParts(BikePartList);

				}else if (itemType == 4) {
					// delete appointment
					BikeShop.deleteAppointment(appointment);
				
				}else if(itemType == 5) {
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



	// ================================================= Option 1 create
	// =====================================

	private static Customer inputCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	private static void addCustomer(ArrayList<Customer> customerList, Customer cc) {
		// TODO Auto-generated method stub

	}

	private static Bike inputBikeInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	private static void addBikeInfo(ArrayList<BikeParts> bikeList, Bike bi) {
		// TODO Auto-generated method stub

	}

	private static BikeParts inputBikeParts() {
		String customerName = Helper.readString("Enter your name: ");
		String bikeParts = Helper.readString("Enter bike parts: ");
		
		BikeParts bp = new BikeParts(customerName, bikeParts, false);
		return bp;
	}

	private static void addBikeParts(ArrayList<BikeParts> BikePartList, BikeParts bp) {
		BikePartList.add(bp);
		System.out.println("Bike parts has successfully added!");

	}

	private static Appointment inputAppointment() {
		// TODO Auto-generated method stub
		return null;
	}

	private static void addAppointment(ArrayList<Appointment> appointment, Appointment ap) {
		// TODO Auto-generated method stub

	}

	private static Feedback inputFeedback() {
		// TODO Auto-generated method stub
		String customer = Helper.readString("Enter your name :");
		String feedback = Helper.readString("Enter feedback :");
		String response = Helper.readString("Enter response");
		
		Feedback fb = new Feedback (customer,feedback , response);
		return fb;
	} 

	private static void addFeedback(ArrayList<Feedback> feedbackList, Feedback fb) {
		// TODO Auto-generated method stub
		feedbackList.add(fb);
		System.out.println("feedback added");

	}

	// =============================================== Option 2 view
	// =======================================
	private static void viewAllBuyer(ArrayList<Customer> customerList) {
		// TODO Auto-generated method stub

	}

	private static void viewAllBikeInfo(ArrayList<BikeParts> bikeList) {
		// TODO Auto-generated method stub

	}

	
	
	private static String retrieveAllBikeParts(ArrayList<BikeParts> BikePartList) {
		String output = "";
		
		for(int i = 0; i < BikePartList.size(); i++) {
			output += String.format("%-20s %-20s\n" , BikePartList.get(i).getPartName(), BikePartList.get(i).getDescriptions());
		}
		return output;

		}

	private static void viewAllBikeParts(ArrayList<BikeParts> BikePartList) {

		//JX

	    String output = "";
		
	    output = String.format("%-20s %-20s\n", "PART NAME", "DESCRIPTIONS");
		output += retrieveAllBikeParts(BikePartList);

		    System.out.println(output);


	}
	
	

	private static void viewAllAppointment(ArrayList<Appointment> appointment) {
		// TODO Auto-generated method stub

	}

	private static void viewAllFeedback(ArrayList<Feedback> feedbackList) {
		// TODO Auto-generated method stub

	}
	
	// ===================================== Option 3
	// delete===============================

	private static void deleteBuyer(ArrayList<Customer> customerList) {
		// TODO Auto-generated method stub

	}

	private static void deleteBikeInfo(ArrayList<BikeParts> bikeList) {
		// TODO Auto-generated method stub

	}
	
	
	

	private static void deleteBikeParts(ArrayList<BikeParts> BikePartList) {
		String b = Helper.readString("Enter Bike Parts> ");
	    boolean exist = false;
	      
	      for (BikeParts i : BikePartList) {
	        if (i.getPartName().equalsIgnoreCase(b)) {

	         {
	        	 BikePartList.remove(i);
	          exist = true;
	          break;
	        } 
	      }
	      if (exist == false) {
	        System.out.println("Bike Parts does not exist");
	      }
	      
	    }

	}
	
	
	private static void deleteAppointment(ArrayList<Appointment> appointment) {
		// TODO Auto-generated method stub

	}

	private static void deleteFeeback(ArrayList<Feedback> feedbackList) {
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
