
public class BikeParts extends BikePartsDB {
	private String partName;
	private String descriptions;
	private boolean isAvailable;
	
	public String getPartName() {
		return partName;
		
	}
	
	public void setPartName(String partName) {
		this.partName = partName;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public String toString(){
		String bikeInfo = super.toString();
        return String.format("%-63s %-20d", bikeInfo, selectBikeParts());
	}
	
	
}
