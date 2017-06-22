package com.string;

public class bitManipulation {
	 // Print all subsets of given set[]
    static int printSubsets(int set[] , int k)
    {
        int n = set.length;
        int count = 0;
        // Run a loop for printing all 2^n
        // subsets one by obe
        
       // System.out.println("(1<<n) is "+(1<<n));
        for (int i = 0; i < (1<<n); i++)
        {
        	
        	// System.out.println("(1<< i) is "+(1<<i));
           // System.out.print("{ ");
        	int sum = 0;
            // Print current subset
            for (int j = 0; j <n; j++)
            {
                // (1<<j) is a number with jth bit 1
                // so when we 'and' them with the
                // subset number we get which numbers
                // are present in the subset and which
                // are not
            	
                if ((i & (1 << j)) > 0){
                	System.out.println("value i ="+i+" value j ="+j+" value1<<j ="+(1<<j)+" condition ="+ (i & (1 << j)));
                	sum +=set[j];
                	System.out.println(" sum "+sum);
                }
                
            }
            if(sum==k){
            	count++;
            	System.out.println(" count "+count);
            	
            	//System.out.println("Time complexity is " + (1<<n)*n);
            }
          //  System.out.println("}");
        }
    return count;
    }
	public static void main(String arg[]){
		
		int set[] = {1,2,5,4,8,3};
		int c = printSubsets(set , 7);
        System.out.println("total subset are "+c);
	}

}
