import java.util.ArrayList;
 
public class BikeShop {

	static final int CREATE_BIKE_INFO = 4;
	static final int DELETE_BUYER_INFO = 3;
	static final int view_buyers_information = 2;
	static final int CREATE_BUYER_INFO = 1;
	static final int OPTION_QUIT = 6;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList<Feedback> feedbackList = new ArrayList<Feedback>();
		ArrayList<Bike> bikeList = new ArrayList<Bike>();
		ArrayList<BikeParts> bikePartsList = new ArrayList<BikeParts>();
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		ArrayList<Appointment> appointment = new ArrayList<Appointment>();
		
		int option = 0;
		while (option != OPTION_QUIT) {
	
		BikeShop.menu();
		option = Helper.readInt("Enter an option >");
		
		if(option == CREATE_BUYER_INFO) {
			// create  all buyer information
			
			
			
		}else if(option ==view_buyers_information) {
			// view the list of buyers' information
			
		}else if(option ==DELETE_BUYER_INFO ){
			
			// Delete buyers’ information
			
		}else if(option ==CREATE_BIKE_INFO ){
			
			// Create bike’s information
			
		}else if(option ==5 ){
			
			//  Delete the bike information
			
		}else if(option ==6 ){
			
			//  Create the bike part information
			
		}else if(option ==7 ){
			
			//  View the list of bike parts in the store
			
		}else if(option ==8) {
			// Delete the particular bike part
			
		}else if(option ==9 ){
			
			// Create feedback
		}else if(option ==10 ){
			
			// View the list of feedback in the system
		}else if(option ==11 ){
			
			//  Delete the particular feedback 
		}
		}
	
}

		public static void menu() {
			BikeShop.setHeader("Bike shop APP");
			System.out.println("1. Buyer's information");
			System.out.println("2. Bike information");
			System.out.println("3. Bike parts");
			System.out.println("4. Appointment");
			System.out.println("5. Feedback");
			System.out.println("6. Quit");
			Helper.line(80, "-");
			;

		}	
	
		public static void setHeader(String header) {
			Helper.line(80, "-");
			System.out.println(header);
			Helper.line(80, "-");
			
		}

}
