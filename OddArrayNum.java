package Com.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddArrayNum {
	public static Integer[] filterOdd(Integer[] arr) {
		
		//converting the given integer array to list
		List<Integer> list  = Arrays.asList(arr);
		
		//Using filters for collections, detecting the odd numbers in the array
		List<Integer> oddNums = list.stream().filter(i -> i%2 != 0)
				.collect(Collectors.toList());
		
		//convert list to array and returning the integer array to the function
		Integer[] oddArr = (Integer[]) oddNums.toArray();
		
		return oddArr;
	}
		
} 