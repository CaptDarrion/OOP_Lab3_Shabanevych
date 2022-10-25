package Lab3_Shabanevych;

import java.util.Arrays;
import java.util.Scanner;

public class FirstTask {
    
	static final Scanner scanner = new Scanner(System.in);
    static double[] inputArray() {
    System.out.println("Input size array: ");
    int size = scanner.nextInt();
    double[] array = new double[size];
    for (int i = 0; i < size; i++) {
        array[i] = scanner.nextDouble();
    }
    System.out.println("Your array: ");
    System.out.println(Arrays.toString(array));
    return array;
    }
    
    static void amountOfElements(double[] array) {
    double amount = 0;
    System.out.println("Input element C: ");
    double C = scanner.nextDouble();
    System.out.println("C: " + C);
    for (double n : array) {
    	if (n > C) amount++;
    }
    if (amount == 0) {
    	System.out.println("No numbers: ");
    	return;
    }
    System.out.printf("The number of elements of large C: " + amount);
    }
    
    static void productOfElements(double[] array) {
    double max = Math.abs(array[0]);
    int number = 0;
    for (int i = 1; i < array.length; i++) {
    	if (Math.abs(array[i]) > (max)) {
    		max = Math.abs(array[i]);
    		number = i+1;
    		
    	}
    }
    System.out.printf("\nMax element: " + max);
    System.out.printf("\nNumber max element: " + number);
    double product = 1;
    for (int i = number; number < array.length; number++) {
    	product *= array[number];
    }
    System.out.printf("\nProduct of elements: " + product);
    }
}    
    