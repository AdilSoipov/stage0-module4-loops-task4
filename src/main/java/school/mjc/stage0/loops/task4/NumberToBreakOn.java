package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        
	   
	   if (numberToGoUntil < toBreakWith){
	       System.out.println("iterating till the end");
	       while(numberToGoUntil <= toBreakWith){
	           	 System.out.println(numberToGoUntil);
	           	 numberToGoUntil++;
	           	 

	       }
	   
	       }
	   else{
	       int i = 0;
	       while(i <= toBreakWith){
	           	System.out.println(i);
	           	i++;

	           
	           
	       }
	       
	   }     
	       

    }
}
