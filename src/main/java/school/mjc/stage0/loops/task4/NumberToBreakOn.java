package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
   	
	   int x = 1;
	   if (numberToGoUntil < toBreakWith){
	       System.out.println("iterating till the end");
	       while(x < numberToGoUntil){
	           	 System.out.println(x);
	           	 x++;
	           	 

	       }
	   
	       }
	   else{
	       int i = 1;
	       while(i <= toBreakWith){
	           	System.out.println(i);
	           	i++;

	           
	           
	       }
	       
	   }     
	       

    }
}
