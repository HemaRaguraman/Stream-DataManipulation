package com.model;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Main{
	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(20,6,10,15,22,80,18,8,15,34,15,20,22,8,6);
		System.out.println("Starts with 1");
		 li.stream()
                .map(i -> i+"")
                .filter(i->i.startsWith("1")).forEach(System.out::println);
		 System.out.println("All Even Integers");
		 li.stream().filter(i->i%2==0).forEach(System.out::println);
		 System.out.println("count of Integers");
		 long count=li.stream().count();
		 System.out.println(count);
		 System.out.println("first element");
		 li.stream().findFirst().ifPresent(s->System.out.println(s));
		 System.out.println("maximum element");
		 li.stream().max(Integer::compareTo).ifPresent(s->System.out.println(s));
		 System.out.println("minimum element");
		 li.stream().min(Integer::compareTo).ifPresent(s->System.out.println(s));
		 System.out.println("sum of element");
		
		int sum= li.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
		System.out.println("Distinct element");
		 li.stream().distinct().sorted().forEach(s->System.out.print(s+" "));
		 
      

	}
}