package binary_search.notes;

/*
 In he line of 0-9 if we want precision also then we can use this code.
 If we pass:
	 - 1 precision then after decimal we are checking only one digit ex: 0.1
	 - 2 as a precisiom then after decimal 2 digtis will be there . ex : 0.01*/


import java.util.*;

public class SqrtPrecise {
	
	    public double mySqrt(int x, int p) {
	        double beg = 0, end = x;
	  
	        double precision = Math.pow(10, -p);
	        
	        //Here termination condition become like end-start must be greater than precision.
	        // i.e if precision is 0,01, then we are checking :- end-beg >= 0.01
	        while(end - beg >= precision) {
	            double mid = (beg + end)/2.0;
	            if(mid*mid <= x)
	                beg = mid;   //setting beg= mid will not make any big diff, u can also write it as: beg = mid+precision
	            else
	                end = mid;
	        }
	        return beg;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int p = sc.nextInt();

	        SqrtPrecise sol = new SqrtPrecise();
	        double ans = sol.mySqrt(n, p);
	        double finalAns = Math.round(ans*Math.pow(10,p))/Math.pow(10,p);

	        System.out.println(finalAns);
	    }

}
