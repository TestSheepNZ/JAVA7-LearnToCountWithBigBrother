/*
 * This program is part of my learning Java series
 * This one looks at if statements
 * 
 * Find the blog here,
 * http://testsheepnz.blogspot.co.nz/2016/08/java-7-conditional-world-of-ifs.html
 * 
 * YOU ALREADY KNOW WHAT WAITS FOR YOU IN ROOM 101
 * 
 * For more information - please reread.
 * 
 * Mike Talks, Aug 2016
 */


public class BigBrotherMaths {
		 
       public static void bigBrotherCalc (int num1, int num2)
       {
              int answer = 0;
             
              // If asked for 2+2, give the correct answer
              // deemed by the party
              if (num1 == 2 && num2 == 2)
              {
                     answer = 5;
              }
              else
              {
                     answer = num1 + num2;
              }
             
              System.out.println("Big Brother says that "
                           + num1 + " + "
                           + num2 + " = "
                           + answer);
             
              //return answer;
       }
      
       public static void thePartyDecreesCalc (int num1, int num2)
       {
              int answer = 0;
             
              // If asked for 2+2, or 2+3
              // give the correct answer
              // deemed by the party
              if (num1 == 2 && num2 == 2)
              {
                     answer = 5;
              }
              else if (  (num1 == 2 && num2 == 3)
                           || (num1 == 3 && num2 == 2) )
              {
                     answer = 7;
              }
              else
              {
                     answer = num1 + num2;
              }
             
              System.out.println("The party decrees that "
                           + num1 + " + "
                           + num2 + " = "
                           + answer);
             
              //return answer;
       }     
      
 
       public static void main(String[] args) {
              // TODO Auto-generated method stub
             
              // Learn basic arithmetic with Big Brother
              bigBrotherCalc(1,2);
              bigBrotherCalc(3,2);
              bigBrotherCalc(2,2);
              bigBrotherCalc(3,3);
             
              // The party in it's wisdom decrees the following
              // improved answers
              thePartyDecreesCalc(1,2);
              thePartyDecreesCalc(3,2);
              thePartyDecreesCalc(2,2);
              thePartyDecreesCalc(3,3);
             
       }     
      

}
