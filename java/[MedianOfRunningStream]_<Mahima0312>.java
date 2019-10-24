import java.util.Collections;
import java.util.PriorityQueue;

public class medianofstream {
	
	public static void main(String[] args) {
		int[] arr= { 5,7,10,15};
		
		PriorityQueue<Integer> minheap= new PriorityQueue<>();
		PriorityQueue<Integer> maxheap= new PriorityQueue<>(Collections.reverseOrder());
		
		
		double med= arr[0];
		maxheap.add(arr[0]);
		System.out.println(med);
		for(int i=1;i<arr.length;i++)
		{
			int x= arr[i];
			
			if(minheap.size()<maxheap.size())
			{
				if(x<med)
				{
					minheap.add(maxheap.remove());
					maxheap.add(x);
				}else {
					minheap.add(x);
				}
				med= (double) (maxheap.peek()+ minheap.peek())/2;
			}
			else if(minheap.size()== maxheap.size())
			{
				if(x>med)
				{
					minheap.add(x);
					med= (double)(minheap.peek());
					
					
				}else {
					maxheap.add(x);
					med= (double)(maxheap.peek());
					
				}
				
			}else {
				
				if(x>med) {
				
				maxheap.add(minheap.remove());
				minheap.add(x);
				}
				else {
					maxheap.add(x);
				}
				
				med= (double) (maxheap.peek()+ minheap.peek())/2;
				
			}
			System.out.println(med);
			
			
			
		}
		
	}

}
