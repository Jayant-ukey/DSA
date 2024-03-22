package queue_deque.day2;

//	2073. Time Needed to Buy Tickets -	https://leetcode.com/problems/time-needed-to-buy-tickets/description/

public class HP1BuyTicketTime {

}

//Brute Force O(n*k)
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count =0;

        while(tickets[k] > 0){
            for(int i=0; i<tickets.length; i++){
                if(tickets[i] == 0)
                    continue;

                else if(tickets[k] == 0)
                    return count;

                else{
                    tickets[i] -= 1;
                    count++;
                }
            }
        }
        return count; 
    }
}


//Efficient Solution O(N)
class Solution1 {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time =0;

        for(int i=0; i<tickets.length; i++){
            if(i<=k)
                time += Math.min(tickets[k], tickets[i]);

            else
                time += Math.min(tickets[k] - 1, tickets[i]);
        }
        return time;
    }
}