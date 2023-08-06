package Hackerrank30days;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
    public Difference(int[] arr){
        elements = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            elements[i] = arr[i];
        }
    }

    public void computeDifference() {
        this.maximumDifference = 0;
        if(elements.length <= 1) return;
        int smallest = elements[0], largest = elements[0];
        for(int i = 0; i < elements.length; i++){
            if(smallest > elements[i]) smallest = elements[i];
            if(largest < elements[i]) largest = elements[i];
        }
        this.maximumDifference = largest - smallest;
    }
} // End of Difference class

public class Day14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
