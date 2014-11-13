
public class ElectricGuitar {
	
	String brand;
	int numOfPickups;
	boolean rockstarUsesIt;
	
	String getBrand(){
		return brand;
	}
	void setBrand(String aBrand){
		brand = aBrand;
	}
	int getNumOfPickups(){
		return numOfPickups;
	}
	void setNumberofPickups(int num){
		numOfPickups = num;
	}
	boolean getRockStarUsesIt(){
		return rockstarUsesIt;
	}
	void setRockStarUsesIt(boolean yesOrNo){
		rockstarUsesIt = yesOrNo;
	}
}
