package number_theory.lastday;


import java.util.*;
import java.lang.*;
import java.io.*;

public class P3 {


	//https://www.codechef.com/APRIL20A/problems/STRNO/
		public static void main (String[] args) throws java.lang.Exception
		{
			// your code goes 
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			
			while(t-- > 0){
			    int x = sc.nextInt();
			    int k = sc.nextInt();
			    int primtCount = 0;
			    
			    for(int i=2; i<=x; i++){
			        if(x%i == 0){
			            primtCount++;
			            x/=2;
			        }
			    }
			    if(x > 1)
			        primtCount++;
			        
			    if(k >= primtCount)
			        System.out.println(1);
			        
			    else
			        System.out.println(0);
			}

		}

}
