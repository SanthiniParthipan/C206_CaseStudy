 //SANTHINI
public class Feedback { 
	
	private String Customer ;
	private String feedback;
	private String response;
	
	public Feedback(String customer, String feedback, String response) {
		super();
		Customer = customer;
		this.feedback = feedback;
		this.response = response;
	}

	public String getCustomer() {
		return Customer;
	}

	public void setCustomer(String customer) {
		Customer = customer;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
	public String toString() { 
	    
        return String.format("%-20s %-30s %-10s %-10s", getCustomer(),
                getFeedback(),getResponse());
    }
	
}
