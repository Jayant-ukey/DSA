package greedy.day1;

import java.util.Scanner;

public class P1FrogJump {
	// Time : O(N)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] d = new int[n];
		
		for(int i=0; i<n; i++) {
			d[i] = sc.nextInt();
		}
		
		//curId represents current lilypad
		//mimJumps represents minimum no of jumps frog will required to cover distance
		int curId=0, minJumps = 0;
		while(curId < n) { //Loop will take care lilypad should not cross it's limit
			
			//nextId -> Check whether next lilypad is present or not
			//maxDist -> Distance should not be greater than frog's limit i.e. k
			int nextId = curId, maxDist=0;
			
			//Next lilypad should be present and maxDist should not cross frog's capacity(k)
			while(nextId+1 <= n && d[nextId]+maxDist <= k) {
				nextId += 1; //increasing lilypad
				maxDist += d[nextId]; //increasing distance
			}
			
			
			//If case arises where lilypad distance is greater than frog limit then printing -1, and return the funtion
			if(curId == nextId) {
				System.out.println("-1");
				return;
			}
			
			curId = nextId;
			minJumps += 1; //increasing jump count
		}
	}
}
