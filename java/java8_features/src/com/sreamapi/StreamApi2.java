package com.sreamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi2 {
	public static void main(String[] args) {
		List<String>names=Arrays.asList("pavan","muruli","mohan","jagadeesh","darshan","abhi");
        List<String>collect =names.stream().filter((s)->s.startsWith("a")).collect((Collectors.toList()));
	    System.out.println(collect);
        
        List<Integer>numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer>res =numbers.stream().map(ele->ele*ele).collect(Collectors.toList());
	    System.out.println(res);
        
        
	}

}
