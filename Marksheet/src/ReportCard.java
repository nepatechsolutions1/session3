
import java.util.Scanner;

public class ReportCard {
	
	public static void main(String[] args){
		
		
		// Individual Name input		
		Scanner a = new Scanner(System.in);
		System.out.println("please enter your First name:");
		String fname = a.next();
		System.out.println("please enter your Last name:");
		String lname = a.next();
		
		//Science score input

		Scanner science = new Scanner(System.in);
		 System.out.println("please enter Science Quiz:");
	     float sQuiz = science.nextFloat();
	     System.out.println("please enter Science Mid-term:");
	     float sMid = science.nextFloat();
	     System.out.println("please enter Science final Score:");
	     float sFinal = science.nextFloat();
	     
	     //nepali score input
	     Scanner nepali = new Scanner(System.in);
		 System.out.println("please enter Nepali Quiz Score:");
	     float nQuiz = nepali.nextFloat();
	     System.out.println("please enter Nepali Mid-term Score:");
	     float nMid = nepali.nextFloat();
	     System.out.println("please enter Nepali final Score:");
	     float nFinal = nepali.nextFloat();
	     
	     //english score input
	     Scanner english = new Scanner(System.in);
		 System.out.println("please enter english Quiz Score:");
	     float eQuiz = english.nextFloat();
	     System.out.println("please enter english Mid-term Score:");
	     float eMid = english.nextFloat();
	     System.out.println("please enter english final Score:");
	     float eFinal = english.nextFloat();
	     
	     //math score input
	     Scanner math = new Scanner(System.in);
		 System.out.println("please enter math Quiz Score:");
	     float mQuiz = math.nextFloat();
	     System.out.println("please enter math Mid-term Score:");
	     float mMid = math.nextFloat();
	     System.out.println("please enter Math final Score:");
	     float mFinal = math.nextFloat();
	     
	     //computer score input
	     Scanner computer = new Scanner(System.in);
		 System.out.println("please enter Computer Quiz Score:");
	     float cQuiz = computer.nextFloat();
	     System.out.println("please enter Computer Mid-term Score:");
	     float cMid = computer.nextFloat();
	     System.out.println("please enter Computer final Score:");
	     Float cFinal = computer.nextFloat();
	     
	     // Average calculation
	     
	     System.out.println("****************************");
	     
	     int sAvg = (int)Math.ceil((sQuiz+sMid+sFinal)/3);
	     System.out.println("Science average Score  :"+ (sAvg));
	     
	     int nAvg = (int) Math.ceil((nQuiz+nMid+nFinal)/3);
	     System.out.println("Nepali average Score   :"+nAvg);
	     

	     int eAvg = (int) Math.ceil((eQuiz+eMid+eFinal)/3);
	     System.out.println("English average Score  :"+eAvg);
	     
	     int mAvg = (int) Math.ceil((mQuiz+mMid+mFinal)/3);
	     System.out.println("Math average Score     :"+mAvg);
	     
	     int cAvg = (int) Math.ceil((cQuiz+cMid+cFinal)/3);
	     System.out.println("Computer average Score :"+cAvg);
	     
	     
	     // Total and percentage calculation
	     
	     //int RoundedUp = (int) Math.ceil(RandomReal)-- this is used to convert Float to int
	     
	     float grandTotal = (sAvg+nAvg+eAvg+mAvg+cAvg);
	     
	     int roundedAvj = (int) Math.ceil(grandTotal);
	     System.out.println ();
	     System.out.println("Your Grand total is: "+ roundedAvj);
	     
	     
	     float percentage =  ((grandTotal/500) *100);
	     
	     int roundedper = (int)Math.ceil(percentage);
	     
	     System.out.println();
	     System.out.println("You Scored "+ roundedper+"%");
	     
	     System.out.println();
	     
	
	     
	     /*if the average score >=90% =>grade=A -if the average score >= 70% and <90% => grade=B -if the
	       average score>=50% and <70% =>grade=C -if the average score<50% =>grade=F */
	
	    if (roundedper >= 90){

		     System.out.println("Congratulation " +fname+" "+lname+" you got an A!!!");
	    }
	    else if (roundedper >=70 && roundedper <90){

		     System.out.println("Congratulation "+fname+" "+lname+" you got a B!!!");
	    }
	    else if (roundedper >=50 && roundedper<70){
	    	
		     System.out.println(fname+" "+lname +" you got a C, need to work hard");
	    }
	    else {
	    	System.out.println ("Sorry " +fname+" "+lname+" you have Failed, Work hard next time, no party Sarty");
	    }
	 
	    
	}

}
