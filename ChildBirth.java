import java.util.Random;

/**
 * Boy = 0
 * Girl = 1
 * @author bwong
 *
 */
public class ChildBirth {
	static int boys = 0, girls = 0;
	static int x = 10000; 
	public static void main(String[] args) {
			Random r = new Random();
			int counter = 0; 
			//Run the simluation 100 times. 
			for(int i = 0; i < 100; i++) {
				//Reset
				boys = 0;
				girls = 0; 
				counter += run(r);
			}
			
			System.out.println((double)counter/100 + "% chance for getting more boys.");
	}
	
	public static int run(Random r) {
		/**Simulate this for amount of families 
		 * defined in variable x
		 */
		for(int i= 0; i < x; i++) {
			while(true) {
				i = r.nextInt(2); // Random value 1 or 0. 50% chance of getting
				if(i == 0) {
					boys++; 
					break; 
				} else {
					girls++; 
				}
			}
		}
		System.out.println("Boys: " + boys + ". Girls: " + girls + ".");
		//Check if we got more boys than girls. 
		if(boys > girls) {
			return 1; 
		} else {
			return 0;
		}
	}
}
