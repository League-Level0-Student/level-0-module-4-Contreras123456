package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {
        
        boolean isWeekday=false;
   boolean     isVacation=false;
        
        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below
         * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         */
   int snake = JOptionPane.showConfirmDialog(null, "Is it a weekday?","Sleepy Head", JOptionPane.YES_NO_OPTION);


        /*
         * Print “sleep in? if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!? If it is a weekday, and we are on vacation,
         * print “sleep in?.
*/
   System.out.println(snake);
   if(snake==0) {
	  int sos = JOptionPane.showConfirmDialog(null, "Is it a vacation?");
	   isWeekday=true;
	   if(sos==0) {
		   isVacation=true;
	   }
	   else if (sos==1) {
		   isVacation=false; 
	   }
   }
   else if (snake==1) {
	   isWeekday=false;
   }
   
   if(isWeekday) {
	 if(isVacation) {
		 System.out.println("sleep in");
	 }
	 else {
		 System.out.println("get up lazybones");
	 }
   }
   else {
	   System.out.println("sleep in");
   }
   
   
    }
}
