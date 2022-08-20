package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        
	    int skippedSum = 0;
	    int countedSum = 0;
	    if (numberToSkip > lastInRow){
	        System.out.println("number to skip is bugger then the last");
	    }
	    else if(lastInRow < 0) {
	        
	        System.out.println("last number in row is negative");
	    }
	    else if (lastInRow > numberToSkip){
	        int i = 0;
	        int x = numberToSkip;
	        int y = lastInRow;
	        while(i < x){
	            skippedSum += i;
	            i++;
	        while(x < y){
	            countedSum +=x;
	            x++;
	        }          
	            
	            
	        }
	        
	    }
	    System.out.println(skippedSum);
	    System.out.println(countedSum);
	    


    }
}
