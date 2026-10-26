package ch07;
import java.util.Scanner;
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int scores [];
		int sum = 0;
		scores = new int[5];
		for (int i = 0 ; i < scores.length; i++) {
			scores[i] = sc.nextInt();
		}
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
			
			System.out.println(sum/scores.length);
		
		}

	}


