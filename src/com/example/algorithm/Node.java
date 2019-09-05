package com.example.algorithm;

import java.util.List;

import lombok.Data;

@Data
public class Node {
	
     String node;
	
     List<UomConversion> edges;
     
     public Node(String node) {
    	 this.node = node;
    	 
     }
}
