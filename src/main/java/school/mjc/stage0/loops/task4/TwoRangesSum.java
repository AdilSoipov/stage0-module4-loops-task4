package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        
	       int skippedSum = 0;
	    int countedSum = 0;
	    if (lastInRow < 0){
	         System.out.println("last number in row is negative");
	    }
	        
	    
	   
	    if (lastInRow - numberToSkip > 1){
	        for(int i = 0; i <= numberToSkip; i++){
	            skippedSum += i;
	            
	        }
	        for(int i = numberToSkip + 1; i <= lastInRow; i++){
	            countedSum += i;
	            
	            
	        }
	    System.out.println("skipped sum is " + skippedSum);
	    System.out.println("counted sum is " + countedSum);
	        
	    }
	    else if(lastInRow - numberToSkip == 1){
	          for(int i = 0; i <= numberToSkip; i++){
	           skippedSum += i;
	           
	    }   System.out.println(skippedSum);
	    System.out.println(0);
	        
	    }
	    else if(numberToSkip > lastInRow){
	        System.out.println("number to skip is bugger then the last");

	    }
	    else if(lastInRow < 0){
	       System.out.println("last number in row is negative");

	        
	        
	    
	        
	    }
	        
	        
	    
	
	        


    }
}
