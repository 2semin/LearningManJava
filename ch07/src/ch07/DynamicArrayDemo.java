package ch07;
import java.util.ArrayList;
import java.util.Scanner;
public class DynamicArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Integer> scores = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int data;
		int sum = 0;
		
		while( (data = sc.nextInt()) >= -1) 
			scores.add(data);
		
		for(int s : scores) 
			sum += s;
		
		System.out.println("average score" + (sum / scores.size()));
		
	}
}
		

	


