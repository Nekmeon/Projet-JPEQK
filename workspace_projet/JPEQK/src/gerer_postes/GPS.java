package gerer_postes;

public class GPS {

	private String latitude;
	private int degrelatitude;
	private int minutelatitude;
	private int secondelatitude;
	
	private String longitude;
	private int degrelongitude;
	private int minutelongitude;
	private int secondelongitude;
	
	
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		if(latitude == "Nord" || latitude == "Sud"){
			this.latitude = latitude;
		}
		
	}
	public int getDegrelatitude() {
		return degrelatitude;
	}
	public void setDegrelatitude(int degrelatitude) {
		if(degrelatitude >= -90 && degrelatitude <= 90){
			this.degrelatitude = degrelatitude;
		}
		
	}
	public int getMinutelatitude() {
		return minutelatitude;
	}
	public void setMinutelatitude(int minutelatitude) {
		this.minutelatitude = minutelatitude;
	}
	public int getSecondelatitude() {
		return secondelatitude;
	}
	public void setSecondelatitude(int secondelatitude) {
		this.secondelatitude = secondelatitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		if(longitude == "Est" || longitude == "Ouest"){
			this.longitude = longitude;
		}
		
	}
	public int getDegrelongitude() {
		return degrelongitude;
	}
	public void setDegrelongitude(int degrelongitude) {
		if(degrelongitude >= -180 && degrelongitude <= 180){
			this.degrelongitude = degrelongitude;
		}
		
	}
	public int getMinutelongitude() {
		return minutelongitude;
	}
	public void setMinutelongitude(int minutelongitude) {
		this.minutelongitude = minutelongitude;
	}
	public int getSecondelongitude() {
		return secondelongitude;
	}
	public void setSecondelongitude(int secondelongitude) {
		this.secondelongitude = secondelongitude;
	}
	
	public GPS(String latitude, int degrelatitude, int minutelatitude,
			int secondelatitude, String longitude, int degrelongitude,
			int minutelongitude, int secondelongitude) {
		super();
		this.latitude = latitude;
		this.degrelatitude = degrelatitude;
		this.minutelatitude = minutelatitude;
		this.secondelatitude = secondelatitude;
		this.longitude = longitude;
		this.degrelongitude = degrelongitude;
		this.minutelongitude = minutelongitude;
		this.secondelongitude = secondelongitude;
	}
	
	
}
