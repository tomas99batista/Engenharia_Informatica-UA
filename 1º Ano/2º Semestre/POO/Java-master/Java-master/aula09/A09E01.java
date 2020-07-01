package aula09;

import java.util.*;

public class A09E01 {

	public static void main(String[] args) {
		
		Collection<Integer> col; //Testar diferentes coleções
		
		List<Integer> nums = new ArrayList<>();
		nums.add(1000); nums.add(5000); nums.add(10000); nums.add(20000);
		nums.add(40000); nums.add(100000);
		
		System.out.printf("%10s%10d%10d%10d%10d%10d%10d\n", "Collection", 1000, 5000, 10000, 20000, 40000, 100000);
		System.out.println("ArrayList");
		
		//ArrayList
		col = new ArrayList<Integer>(); 
		
		checkPerformance(col, nums);
		
		System.out.println("\nLinkedList");
		
		
		//LinkedList
		col = new LinkedList<Integer>(); 
		
		checkPerformance(col, nums);
		
		System.out.println("\nTreeSet");
		
		
		//TreeSet
		col = new TreeSet<Integer>(); 
		
		checkPerformance(col, nums);
		
		System.out.println("\nHashSet");
		
		
		//HashSet
		col = new HashSet<Integer>(); 
		
		checkPerformance(col, nums);
	}
	
	private static void checkPerformance(Collection<Integer> col, List<Integer> nums) {
		double start, stop, delta;
		
		// Add
		System.out.printf("%-10s", "add");
		for(Integer j : nums) {
			start = System.nanoTime(); // clock snapshot before
			for(int i=0; i<j; i++ )
				col.add( i );
			stop = System.nanoTime();  // clock snapshot after
			delta = (stop-start)/1e6; // convert to milliseconds

			System.out.printf("%10.2f", delta);
			
		}
		
		// Search
		System.out.printf("\n%-10s", "search");
		for(Integer j : nums){
			start = System.nanoTime(); // clock snapshot before
			for(int i=0; i<j; i++ ) {
				int n = (int) (Math.random()*j);
				if (!col.contains(n))
					System.out.println("Not found???"+n);
			}
			stop = System.nanoTime();  // clock snapshot after
			delta = (stop-start)/1e6; // convert nanoseconds to milliseconds
			
			System.out.printf("%10.2f", delta);
			
		}
		
		
		// Remove
		System.out.printf("\n%-10s", "remove");
		for(Integer j : nums) {
			start = System.nanoTime(); // clock snapshot before
			for(int i = 0; i < j; i++) {
				col.remove(i);
			}
			stop = System.nanoTime();  // clock snapshot after
			delta = (stop-start)/1e6; // convert nanoseconds to milliseconds
			
			System.out.printf("%10.2f", delta);
			
		}
		
		
	}

}
