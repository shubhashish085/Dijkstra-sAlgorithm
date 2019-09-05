package com.example.algorithm;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DijkstrasAlgorithm {
	
	public static void main(String[] args) {
		String source,destination ;
		
		double  conversionFactor;
		
		Set<Node> nodes = new HashSet<>();
		
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		
		for(int i = 0; i < 4;i++) {
			Node node = new Node(reader.next());
			
		}
		
			
		for(int i = 0;i < n ; i++) {
			 System.out.println("Source .................");
			 source = reader.next();
			 System.out.println("Destination ............");
			 destination = reader.next();
			 System.out.println("Conversion Factor ......");
			 conversionFactor = reader.nextDouble();
			 
			 
			
			
		}
		
		
	}

}
