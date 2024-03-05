
public class PrimeNo {
public static void main(String[] args) {
	int counter = 0;
	
	for (int i=0;i<=100;i++) {
		
		for(int j=2;j<=i-1;j++) {
			if(i%j==0) {
				counter++;
			}
		}
		
		if(counter==0) {
			System.out.println(i);
		} else {
			counter =0;
		}
	}
}
}
