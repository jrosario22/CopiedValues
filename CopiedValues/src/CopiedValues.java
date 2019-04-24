import java.util.Scanner;
public class CopiedValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		
		final int NUM_ELEMENTS = 8;
		int[] userValues = new int[8];
		int[] copiedValues = new int[8];
		int[] shiftArray = new int[7];
		int i = 0;
		
		//Enter values
		System.out.println("Please enter " + NUM_ELEMENTS + " integers: ");
		for(i = 0; i < NUM_ELEMENTS; ++i){
			System.out.println("Value: ");
			userValues[i] = scnr.nextInt();
		}
		
		//Print Values
		System.out.println("You entered the following: ");
		for(i = 0; i < NUM_ELEMENTS; ++i){
			System.out.print(userValues[i] + " ");
		}
		System.out.println();
		
		//Turn negative values to zero
		System.out.println("Negative integers are not allowed. Your integers are now: ");
		for(i = 0; i < NUM_ELEMENTS; ++i){
			copiedValues[i] = userValues[i];
			if(copiedValues[i] < 0){
				copiedValues[i] = 0;
			}
		System.out.print(copiedValues[i] + " ");
		}
		System.out.println();
		
		//Shift the integers to the left and declare the last index as zero
		for(i = 0; i < (NUM_ELEMENTS -1); ++i){
			shiftArray[i] = userValues[i + 1];
			System.out.print(shiftArray[i] + " ");
		}
	}

}
