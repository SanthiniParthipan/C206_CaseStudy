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
	
	private ArrayList<Customer> customerList ;
	private ArrayList<Bike> BikeList ;
	private ArrayList<BikeParts> BikePartList ;
	private ArrayList<Appointment> appointment ;
	private ArrayList<Feedback> feedbackList ;
	
	public C206_CaseStudyTest() {
		super();
	}
	 
	@Before
	public void setUp() throws Exception {
		// prepare test data 
		
		cu1=new Customer("johnny wong", "Jonnywong@gmail.com", "87940065");
		bi1=new Bike("Trinx","Mountainbike taiwan brand",true);
		bp1= new BikeParts("front suspension fork", "front  suspension fork made of trinx brand", true);
		ap1=new Appointment("Tan ", 98476303, "S876499R", "24/07/2020");
		fb1=new Feedback("philip", "response time could be improve ", "Thank you for your feedbackwe will take it into considerations");

		customerList = new ArrayList<Customer>();
		BikeList = new ArrayList<Bike>();
		BikePartList = new ArrayList<BikeParts>();
		appointment = new ArrayList<Appointment>();
		feedbackList = new ArrayList<Feedback>();
	}

	@Test
	public void addCustomerTest() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid Customer arraylist to add to", customerList);
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		BikeShop.addCustomer(customerList, cu1);
		assertEquals("Check that Customer arraylist size is 1", 1, customerList.size());
		assertSame("Check that Customer is added", cu1, customerList.get(0));
		
	} 
	@Test
	public void addBikeInfoTest() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid Bike Info arraylist to add to", BikeList);
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		BikeShop.addBikeInfo(BikeList , bi1);
		assertEquals("Check that Bike Info arraylist size is 1", 1, BikeList .size());
		assertSame("Check that Bike Info is added", bi1, BikeList .get(0));
		
	}
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
	public void addAppointmentTest() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid Appointment arraylist to add to", appointment);
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		BikeShop.addAppointment(appointment , ap1);
		assertEquals("Check that appointment arraylist size is 1", 1, appointment .size());
		assertSame("Check that appointment is added", ap1, appointment .get(0));
		
	}
	@Test
	public void addFeedbackTest() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid feedback arraylist to add to", feedbackList);
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		BikeShop.addFeedback(feedbackList , fb1);
		assertEquals("Check that feedback arraylist size is 1", 1, feedbackList.size());
		assertSame("Check that feedback is added", fb1, feedbackList.get(0));
		
	} 
	
	@Test
	public void retrieveAllCustomerTest() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Customer arraylist to retrieve item", customerList);
		
		//test if the list of customer retrieved from the SourceCentre is empty - boundary
		String allCustomer= BikeShop.retrieveAllCustomer(customerList);
		String testOutput = "";
		assertEquals("Check that ViewAllCustomerlist", testOutput, allCustomer);
		
		//Given an empty list, after adding 2 items, test if the size of the list is 1 - normal
		BikeShop.addCustomer(customerList, cu1);
		
		assertEquals("Test that Customer arraylist size is 1", 1, customerList.size());
		
		//test if the expected output string same as the list of customer retrieved from the SourceCentre	
		allCustomer= BikeShop.retrieveAllCustomer(customerList);
		testOutput = String.format("%-20s %-30s %-10s\n","Tony Tan", "Tonytan@gmail.com", "87940093");
	
		assertEquals("Test that ViewAllCustomerlist", testOutput, allCustomer);
		
	}
	
	@Test
	public void retrieveAllBikeTest() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Bike Info arraylist to retrieve item", BikeList);
		
		//test if the list of bike info retrieved from the SourceCentre is empty - boundary
		String allBike= BikeShop.retrieveAllBikeInfo(BikeList);
		String testOutput = "";
		assertEquals("Check that ViewAllBikelist", testOutput, allBike);
		
		//Given an empty list, after adding 2 items, test if the size of the list is 1 - normal
		BikeShop.addBikeInfo(BikeList, bi1);
		
		assertEquals("Test that Bike Info arraylist size is 1", 1,BikeList.size());
		
		//test if the expected output string same as the list of bike info retrieved from the SourceCentre	
		allBike= BikeShop.retrieveAllBikeInfo(BikeList);
		testOutput = String.format("%-20s %-30s %-10s\n","Trinx","Mountainbike taiwan brand",true);
	
		assertEquals("Test that ViewAllBikelist", testOutput, allBike);
		
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
	
	@Test
	public void retrieveAllAppointmentTest() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Appointment arraylist to retrieve item", appointment);
		
		//test if the list of appointment retrieved from the SourceCentre is empty - boundary
		String allAppointment= BikeShop.retrieveAllAppointment(appointment);
		String testOutput = "";
		assertEquals("Check that ViewAllappointmentlist", testOutput, allAppointment);
		
		//Given an empty list, after adding 2 items, test if the size of the list is 1 - normal
		BikeShop.addAppointment(appointment, ap1);
		
		assertEquals("Test that appointment arraylist size is 1", 1, appointment.size());
		
		//test if the expected output string same as the list of appointment retrieved from the SourceCentre	
		allAppointment= BikeShop.retrieveAllAppointment(appointment);
		testOutput = String.format("%-20s %-20s %-10s %-10s\n","Tan ", 98476303, "S876499R", "24/07/2020");
	
		assertEquals("Test that ViewAllAppointmentlist", testOutput, allAppointment);
		
	}
	
	@Test
	public void retrieveAllFeedbackTest() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Feedback arraylist to retrieve item", feedbackList);
		
		//test if the list of feedback retrieved from the SourceCentre is empty - boundary
		String allFeedback= BikeShop.retrieveAllFeedback(feedbackList);
		String testOutput = "";
		assertEquals("Check that ViewAllCustomerlist", testOutput, allFeedback);
		
		//Given an empty list, after adding 2 items, test if the size of the list is 1 - normal
		BikeShop.addFeedback(feedbackList, fb1);
		
		assertEquals("Test that Customer arraylist size is 1", 1,feedbackList.size());
		
		//test if the expected output string same as the list of feedback retrieved from the SourceCentre	
		allFeedback= BikeShop.retrieveAllFeedback(feedbackList);
		testOutput = String.format("%-20s %-30s %-10s\n","Tony Tan", "Tonytan@gmail.com", "87940093");
	
		assertEquals("Test that ViewAllCustomerlist", testOutput, allFeedback);
		
	}
	// delete for(all 5)
	
	public void deleteBikePartTest() {
	    //boundary
	    assertNotNull("Test if there is valid BikePart arraylist to add to", BikePartList);
	    C206_CaseStudyTest.addBikeParts(BikePartList, bp1);
	    //normal
	    Boolean ok = C206_CaseStudyTest.deleteBikeParts(BikePartList,"b001");
	    assertTrue("Test if an available item is ok to delete?", ok);    
	    //error condition
	    ok = C206_CaseStudyTest.deleteBikeParts(BikePartList,"");
	    assertFalse("Test if the same item is NOT ok to delete ?", ok);  
	    //error
	    ok = C206_CaseStudyTest.deleteBikeParts(BikePartList,"b1111"); 
	    assertFalse("Test if the same item is NOT ok to delete ?", ok);  
	    
	  }

	public void deleteCustomerTest() {
	    //normal
	    assertNotNull("Test if there is valid Customer arraylist to delete to", customerList);
	    BikeShop.deleteBuyer(customerList,cu1);
	  }
	public void deleteBikeInfoTest() {
	    //normal
	    assertNotNull("Test if there is valid Customer arraylist to delete to", BikeList);
	    BikeShop.deleteBikeInfo(BikeList,bi1);
	  }
	public void deleteBikePartsTest() {
	    //normal
	    assertNotNull("Test if there is valid Customer arraylist to delete to", BikePartList);
	    BikeShop.deleteBikeParts(BikePartList,bp1);
	  }
	public void deleteAppointmentTest() {
	    //normal
	    assertNotNull("Test if there is valid Customer arraylist to delete to", appointment);
	    BikeShop.deleteAppointment(appointment,ap1);
	  }
	public void deleteFeedbackTest() {
	    //normal
	    assertNotNull("Test if there is valid feedback arraylist to delete to", feedbackList);
	    BikeShop.deleteFeeback(feedbackList,fb1);
	  }

	
	private static Boolean deleteBikeParts(ArrayList<BikeParts> bikePartList2, String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void addBikeParts(ArrayList<BikeParts> bikePartList2, BikeParts bp12) {
		// TODO Auto-generated method stub
		
	}

 
	@After
	public void tearDown() throws Exception {
		cu1=null;
		bi1 = null;
		bp1= null;
		ap1=null;
		fb1=null;
		customerList = null;
		BikeList = null;
		BikePartList = null;
		appointment = null;
		feedbackList =null;
		
	}




}
