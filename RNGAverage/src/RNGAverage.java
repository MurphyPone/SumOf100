
public class RNGAverage {

	public static void main(String[] args) {
		//Dumb math
		for(int i = 0; i <10; i++) {
			double deviation = averageControl() - averageRNG(); 
			System.out.println("Deviation : " + deviation + "");	
		}
	}

	public static double averageRNG() {
		//Random
		double[] numsRNG = new double[100];
		double totalRNG = 0;
		double avgRNG;		
		
		for(int i = 0; i < 100; i++) {
			numsRNG[i] = Math.random()*100; //Should return random 0,100
			totalRNG += numsRNG[i];
		}
		
		avgRNG = totalRNG/numsRNG.length;
		//System.out.println("Random Average : " + avgRNG + "\n");	
		
		return avgRNG;
	}

	public static double averageControl() {
		//Control 
		double[] numsControl = new double[100];
		double totalControl = 0;
		double avgControl;		
		
		for(int i = 0; i < 100; i++) {
			numsControl[i] = i;
			totalControl += numsControl[i];
		}
		
		avgControl = totalControl/numsControl.length;
		//System.out.println("Control Average : " + avgControl + "\n");
		
		return avgControl;
	}
	
}
