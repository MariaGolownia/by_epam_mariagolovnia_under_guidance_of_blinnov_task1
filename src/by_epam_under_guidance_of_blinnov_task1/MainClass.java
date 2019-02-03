package by_epam_under_guidance_of_blinnov_task1;

import java.io.IOException;
import java.util.List;
import act.Action;
import exc.ValidationException;

public class MainClass {
	
	public static void main(String[] args) throws ValidationException, IOException  {
		FileReading fileReading = new FileReading();
		List <Double> listDouble = fileReading.readFileDigitIntoString("text.txt");
		Action act = new Action();
		
		System.out.println("Array is " + listDouble.toString());
		
		Action.bubbleSortIncreasingOrder(listDouble);
		System.out.println("Sorted array by bubble sort  in increasing order is " + listDouble.toString());
				
		Action.bubbleSortDecreasingOrder(listDouble);
		System.out.println("Sorted array by bubble sort  in deccreasing order is " + listDouble.toString());
			
		Action.selectionSortinIncreasingOrder(listDouble);
		System.out.println("Sorted array by selection sort  in increasing order is " + listDouble.toString());
		
		Action.selectionSortinDecreasingOrder(listDouble);
		System.out.println("Sorted array in deccreasing order is " + listDouble.toString());
		
		System.out.println(String.format("Average number of array's elements is %.2f", act.defineAverage(listDouble)));
		System.out.println("Sum of array's elements is " + act.defineSum(listDouble));
		System.out.println("Max of array's elements is " + act.defineMax(listDouble));
		System.out.println("Min of array's elements is " + act.defineMin(listDouble));
		
	}

}
