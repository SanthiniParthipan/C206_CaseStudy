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
		
		cu1=new Customer("Tony Tan", "Tonytan@gmail.com", "87940093");
		//bi1=new Bike(<<TO BE ADDED>>));
		bp1= new BikeParts("gear", "21 speed gear shifters shimano EF500(3x5)", true);
		//ap1=new Appointment(<<TO BE ADDED>>));
		fb1=new Feedback("Angelia", "good service ", "Thank you for your feedback");

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
		assertNotNull("Check if there is valid Bike Info arraylist to add to", customerList);
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
