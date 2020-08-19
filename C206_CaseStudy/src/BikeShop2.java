import java.util.ArrayList;

public class BikeShop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Feedback> feedbackList = new ArrayList<Feedback>();
		ArrayList<Bike> BikeList = new ArrayList<Bike>();
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		ArrayList<Appointment> appointment = new ArrayList<Appointment>();
		ArrayList<BikeParts> bikeList = new ArrayList<BikeParts>();

		int option = 0;
		while (option !=6) {

			BikeShop2.menu();
			option = Helper.readInt("Enter an option >");

			if(option == 1) {

				// create items
				BikeShop2.setHeader("CREATE");
				BikeShop2.setHeader("ITEM TYPES");
				System.out.println("1. buyer");
				System.out.println("2. Bike info");
				System.out.println("3. Bike parts");
				System.out.println("4. Appointment");
				System.out.println("5. Feedback");

				int itemType = Helper.readInt("Enter option to select item type > ");

				if (itemType == 1) {
					// create a buyer
					Customer cc = inputCustomer();
					BikeShop2.addCustomer(customerList, cc);

				} else if (itemType == 2) {
					// Add Chromebook
					Bike bi = inputBikeInfo();
					BikeShop2.addBikeInfo(bikeList, bi);

				}else if (itemType == 3) {
					// create a buyer
					BikeParts bp = inputBikeParts();
					BikeShop2.addBikeParts(bikeList, bp);


				}else if (itemType == 4) {
					// Add Chromebook
					Appointment ap = inputAppointment();
					BikeShop2.addAppointment(appointment, ap);

				}else if(itemType == 5) {
					Feedback fb = inputFeedback();
					BikeShop2.addFeedback(feedbackList, fb);

				} else {
					System.out.println("Invalid type");
				}
			}else if(option ==2) {
				// view all items
				BikeShop2.viewAllBuyer(customerList );
				BikeShop2.viewAllBikeInfo(bikeList);
				BikeShop2.viewAllBikeParts(bikeList);
				BikeShop2.viewAllAppointment(appointment);
				BikeShop2.viewAllFeedback(feedbackList);



			}else if(option ==3 ){
				// Delete buyers’ information

				BikeShop2.setHeader("Delete");			
				BikeShop2.setHeader("ITEM TYPES");
				System.out.println("1. buyer");
				System.out.println("2. Bike info");
				System.out.println("3. Bike parts");
				System.out.println("4. Appointment");
				System.out.println("5. Feedback");

				int itemType = Helper.readInt("Enter option to select item type > ");

				if (itemType == 1) {
					// create a buyer
					BikeShop2.deleteBuyer(customerList);

				} else if (itemType == 2) {
					// Add Chromebook
					BikeShop2.deleteBikeInfo(bikeList);
				}else if (itemType == 3) {
					// create a buyer
					BikeShop2.deleteBikeParts(bikeList);

				}else if (itemType == 4) {
					// Add Chromebook
					BikeShop2.deleteAppointment(appointment);
				}else if(itemType == 5) {
					BikeShop2.deleteFeeback(feedbackList);
				} else {
					System.out.println("Invalid type");
				}
			
			
			}else {
				System.out.println("invalid option");
			}

		}
	}


	public static void menu() {
		BikeShop2.setHeader("Bike shop APP");
		System.out.println("1. create item");
		System.out.println("2. view item");
		System.out.println("3. delete item");

		Helper.line(80, "-");
		;

	}

	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");

	}

	// ===================================== Option 3
	// delete===============================

	private static void deleteBuyer(ArrayList<Customer> customerList) {
		// TODO Auto-generated method stub

	}

	private static void deleteBikeInfo(ArrayList<BikeParts> bikeList) {
		// TODO Auto-generated method stub

	}

	private static void deleteBikeParts(ArrayList<BikeParts> bikeList) {
		// TODO Auto-generated method stub

	}

	private static void deleteAppointment(ArrayList<Appointment> appointment) {
		// TODO Auto-generated method stub

	}

	private static void deleteFeeback(ArrayList<Feedback> feedbackList) {
		// TODO Auto-generated method stub

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
		// TODO Auto-generated method stub
		return null;
	}

	private static void addBikeParts(ArrayList<BikeParts> bikeList, BikeParts bp) {
		// TODO Auto-generated method stub

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
		return null;
	}

	private static void addFeedback(ArrayList<Feedback> feedbackList, Feedback fb) {
		// TODO Auto-generated method stub

	}

	// =============================================== Option 1 view
	// =======================================
	private static void viewAllBuyer(ArrayList<Customer> customerList) {
		// TODO Auto-generated method stub

	}

	private static void viewAllFeedback(ArrayList<Feedback> feedbackList) {
		// TODO Auto-generated method stub

	}

	private static void viewAllAppointment(ArrayList<Appointment> appointment) {
		// TODO Auto-generated method stub

	}

	private static void viewAllBikeParts(ArrayList<BikeParts> bikeList) {
		// TODO Auto-generated method stub

	}

	private static void viewAllBikeInfo(ArrayList<BikeParts> bikeList) {
		// TODO Auto-generated method stub

	}
}
