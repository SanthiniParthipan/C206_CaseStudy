
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {

	private Customer cu1;
	private Bike bi1;
	private BikeParts bp1;
	private Appointment ap1;
	private Feedback fb1;

	private ArrayList<Customer> customerList;
	private ArrayList<Bike> BikeList;
	private ArrayList<BikeParts> BikePartList;
	private ArrayList<Appointment> appointment;
	private ArrayList<Feedback> feedbackList;

	public C206_CaseStudyTest() {
		super();
	}

	@Before 
	public void setUp() throws Exception {
		// prepare test data

		cu1 = new Customer("johnny wong", "Jonnywong@gmail.com", "87940065");
		bi1 = new Bike("Trinx", "Mountainbike taiwan brand", true);
		bp1=new BikeParts("BP1","gear",10,"21 speed gear shifters shimano EF500(3x5)", true);
		ap1 = new Appointment("Tan ", 98476303, "S876499R", "24/07/2020");
		fb1 = new Feedback("philip", "response time could be improve ",null);

		customerList = new ArrayList<Customer>();
		BikeList = new ArrayList<Bike>();
		BikePartList = new ArrayList<BikeParts>();
		appointment = new ArrayList<Appointment>();
		feedbackList = new ArrayList<Feedback>();
	}

	//==========================================ELAINE TEST===================================================================
	// ELAINE TEST

	@Test
	public void addCustomerTest() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid Customer arraylist to add to", customerList);
		// Given an empty list, after adding 1 item, the size of the list is 1 - normal
		// The item just added is as same as the first item of the list
		BikeShop.addCustomer(customerList, cu1);
		assertEquals("Check that Customer arraylist size is 1", 1, customerList.size());
		assertSame("Check that Customer is added", cu1, customerList.get(0));

	}

	//ELAINE
	@Test
	public void retrieveAllCustomerTest() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Customer arraylist to retrieve item", customerList);

		// test if the list of customer retrieved from the SourceCentre is empty -
		// boundary
		String allCustomer = BikeShop.retrieveAllCustomer(customerList);
		String testOutput = "";
		assertEquals("Check that ViewAllCustomerlist", testOutput, allCustomer);

		// Given an empty list, after adding 2 items, test if the size of the list is 1
		// - normal
		BikeShop.addCustomer(customerList, cu1);

		assertEquals("Test that Customer arraylist size is 1", 1, customerList.size());

		// test if the expected output string same as the list of customer retrieved
		// from the SourceCentre
		allCustomer = BikeShop.retrieveAllCustomer(customerList);
		testOutput = String.format("%-20s %-30s %-10s\n", "Tony Tan", "Tonytan@gmail.com", "87940093");

		assertEquals("Test that ViewAllCustomerlist", testOutput, allCustomer);

	}
	//ELAINE
	@Test
	public void deleteCustomerTest() {
		customerList.add(cu1);
		// normal
		assertNotNull("Test if there is valid Customer arraylist to delete to", customerList);

		assertNotNull("There are buyers to delete", customerList);

		// If username does not equal to the buyer one, error message.
		assertEquals(cu1, customerList.get(0));

		String output = BikeShop.deleteBuyer(customerList, cu1);

		// Test that if same username as account, can delete.
		assertEquals("Test the buyer is deleted", "Information has been deleted!", output);

	}

	//ELAINE
	@Test
	public void updateBuyerTest() {

		customerList.add(cu1);
		// CHECK IF UPDATE IS SUCCESSFULL
		String expected = "updated successfully";
		String actualOuput = BikeShop.updateBuyerTest(customerList, "johnny wong", "Jonnywong@gmail.com", "87940065");
		assertEquals("Test UPDATED", expected, actualOuput);
		// CHECK CUSTOMER LIST NOT EMPTY
		assertNotNull("Check that the customer list is not empty.", customerList);

	}

	
	@Test
	public void searchBuyer() {
		// If user input is in Customer list
		customerList.add(cu1);
 
		String actual = BikeShop.searchBuyer(customerList, "johnny wong", "87940065");
		String expected = "johnny wong\n" + "Jonnywong@gmail.com\n" + "87940065";
		assertEquals("Test that the customer exists in the list", expected, actual);
		System.out.println("Customer exist");

		// If user input is not in Customer list
		String actual2 = BikeShop.searchBuyer(customerList, "elaine tan", "98875345");
		String expected2 = "This name/phone do not exist!";
		assertEquals("Test that the customer exists in the list", expected2, actual2);

		// User input should contain string only
		assertNotNull("Please input accordingly!", customerList);
	}

	// ===========================================Gabrielle Test===========================================================
	// Gabrielle Test

	@Test
	public void addBikeInfoTest() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid Bike Info arraylist to add to", BikeList);
		// Given an empty list, after adding 1 item, the size of the list is 1 - normal
		// The item just added is as same as the first item of the list
		BikeShop.addBikeInfo(BikeList, bi1);
		assertEquals("Check that Bike Info arraylist size is 1", 1, BikeList.size());
		assertSame("Check that Bike Info is added", bi1, BikeList.get(0));

	}
 
	@Test
	public void retrieveAllBikeTest() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Bike Info arraylist to retrieve item", BikeList);

		// test if the list of bike info retrieved from the SourceCentre is empty -
		// boundary
		String allBike = BikeShop.retrieveAllBikeInfo(BikeList);
		String testOutput = "";
		assertEquals("Check that ViewAllBikelist", testOutput, allBike);

		// Given an empty list, after adding 2 items, test if the size of the list is 1
		// - normal
		BikeShop.addBikeInfo(BikeList, bi1);

		assertEquals("Test that Bike Info arraylist size is 1", 1, BikeList.size());

	}

	public void deleteBikeInfoTest() {
		// normal
		assertNotNull("Test if there is valid bike info arraylist to delete to", BikeList);
		BikeShop.deleteBikeInfo(BikeList, bi1);
	}

	//==================================================Jia Xin Test========================================================
	// Jia Xin Test

	@Test
	public void addBikePartsTest() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid Bike parts arraylist to add to", BikePartList);
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		BikeShop.addBikeParts(BikePartList , bp1);
		assertEquals("Check that Bike parts arraylist size is 1", 1, BikePartList .size());
		assertSame("Check that Bike parts is added", bp1, BikePartList .get(0));
		
	}


	@Test
	public void retrieveAllBikePartsTest() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid bike Parts arraylist to retrieve item", BikePartList);
		
		//test if the list of bike parts retrieved from the SourceCentre is empty - boundary
		String allBikeparts= BikeShop.retrieveAllBikeParts(BikePartList);
		String testOutput = "";
		assertEquals("Check that ViewAllBikePartslist", testOutput, allBikeparts);
		
		//Given an empty list, after adding 2 items, test if the size of the list is 1 - normal
		BikeShop.addBikeParts(BikePartList, bp1);
		
		assertEquals("Test that Customer arraylist size is 1", 1, BikePartList.size());
		
		//test if the expected output string same as the list of bike parts retrieved from the SourceCentre	
		allBikeparts= BikeShop.retrieveAllBikeParts(BikePartList);
		testOutput = String.format("%-20s %-50s %-10s\n","gear", "21 speed gear shifters shimano EF500(3x5)", true);
	
		assertEquals("Test that ViewAllBikePartsList", testOutput, allBikeparts);
		
	}
	public void updateBikeParts() {
		// Jia Xin
		
	    //normal
	    assertNotNull("Test if there is valid Customer arraylist to update to", BikePartList);
	    BikeShop.updateBikeParts(BikePartList, bp1);
	    
	    //Boundary
	    assertNotNull("Test if there is valid Customer arraylist to update bikeParts", BikePartList);

		
	    // Error
	    String expected = "updated successfully";
	    String actualOuput =  BikeShop.updateBikeParts(BikePartList);
	    assertEquals("Test UPDATE", expected,actualOuput);
	    
	 }

	public void viewAllBikeParts() {
		// Jia Xin
		
		//normal
	    Boolean ok = C206_CaseStudyTest.viewAllBikeParts(BikePartList, null);
	    assertTrue("Test if there an available item to view", ok);  
		
	    
	    //Boundary
	    ok = C206_CaseStudyTest.viewAllBikeParts(BikePartList,"");
	    assertFalse("Test if the bike parts availabity can only be yes or no", ok);  
		
	    // Error
	    ok = C206_CaseStudyTest.viewAllBikeParts(BikePartList, null);
	    assertFalse("Test if the bike parts shown in the sysem", ok);  
	    
	}
	
	private static Boolean viewAllBikeParts(ArrayList<BikeParts> bikePartList2, String string) {
		// Jia Xin
		return null;
	}

	private static Boolean deleteBikeParts(ArrayList<BikeParts> bikePartList2, String string) {
		// TODO Auto-generated method stub
		return null;
	}

	//========================================================== Firdaus Test==================================================
	// Firdaus Test
	@Test
	public void addAppointmentTest() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid Appointment arraylist to add to", appointment);
		// Given an empty list, after adding 1 item, the size of the list is 1 - normal
		// The item just added is as same as the first item of the list
		BikeShop.addAppointment(appointment, ap1);
		assertEquals("Check that appointment arraylist size is 1", 1, appointment.size());
		assertSame("Check that appointment is added", ap1, appointment.get(0));

	}

	@Test
	public void retrieveAllAppointmentTest() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Appointment arraylist to retrieve item", appointment);

		// test if the list of appointment retrieved from the SourceCentre is empty -
		// boundary
		String allAppointment = BikeShop.retrieveAllAppointment(appointment);
		String testOutput = "";
		assertEquals("Check that ViewAllappointmentlist", testOutput, allAppointment);

		// Given an empty list, after adding 2 items, test if the size of the list is 1
		// - normal
		BikeShop.addAppointment(appointment, ap1);

		assertEquals("Test that appointment arraylist size is 1", 1, appointment.size());

	}

	public void deleteAppointmentTest() {
		// normal
		assertNotNull("Test if there is valid appointment arraylist to delete to", appointment);
		BikeShop.deleteAppointment(appointment, ap1);
	}

	
	// ===============================================================santhini test==============================
	// santhini Test
	@Test
	public void addFeedbackTest() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid feedback arraylist to add to", feedbackList);
		// Given an empty list, after adding 1 item, the size of the list is 1 - normal
		// The item just added is as same as the first item of the list
		BikeShop.addFeedback(feedbackList, fb1);
		assertEquals("Check that feedback arraylist size is 1", 1, feedbackList.size());
		assertSame("Check that feedback is added", fb1, feedbackList.get(0));

	}

	@Test
	public void retrieveAllFeedbackTest() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Feedback arraylist to retrieve item", feedbackList);

		// test if the list of feedback retrieved from the SourceCentre is empty -
		// boundary
		String allFeedback = BikeShop.retrieveAllFeedback(feedbackList);
		String testOutput = "";
		assertEquals("Check that ViewAllfeedbacklist", testOutput, allFeedback);

		// Given an empty list, after adding 2 items, test if the size of the list is 1
		// - normal
		BikeShop.addFeedback(feedbackList, fb1);

		assertEquals("Test that feedback arraylist size is 1", 1, feedbackList.size());

		// test if the expected output string same as the list of feedback retrieved
		// from the SourceCentre
		allFeedback = BikeShop.retrieveAllFeedback(feedbackList);
		testOutput = String.format("%-20s %-30s %-10s\n", "php", "great job","");

		assertEquals("Test that ViewAllFeedbacklist", testOutput, allFeedback);

	}

	public void deleteFeedbackTest() {
		// normal
		assertNotNull("Test if there is valid feedback arraylist to delete to", feedbackList);
		BikeShop.deleteFeeback(feedbackList, fb1);

	}
	
	@Test
	public void updateFeedbackTest() {
  
		feedbackList.add(fb1);
		//normal if feedback is updated 
		String feedback = " well done ";
		String actualOuput = BikeShop.Updatefeedback(feedbackList,"philip", "response time could be improve ",null);
		assertEquals("Test UPDATED", feedback, actualOuput);
		// boundary 
		assertNotNull("Check that feedbacklist is not empty.", feedbackList);

	}

	@Test 
	public void resonsefeedbackTest() { 
		
  
		feedbackList.add(fb1);
		//normal if feedback is updated 
		String result = " responsed";
		String actualOuput = BikeShop.resonsefeedback(feedbackList,"philip", "response time could be improve ","thank you");
		assertEquals("Test UPDATED", result, actualOuput);
		// boundary 
		assertNotNull("Check that feedbacklist is not empty.", feedbackList);

	}
	
	//================================================================================================================
	@After
	public void tearDown() throws Exception {
		cu1 = null;
		bi1 = null;
		bp1 = null;
		ap1 = null;
		fb1 = null;
		customerList = null;
		BikeList = null;
		BikePartList = null;
		appointment = null;
		feedbackList = null;

	}

}
