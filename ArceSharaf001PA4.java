/*
 * @(#)ArceSharaf001PA4.java
 * @author Sarah Arce, Osman Sharaf
 * @version 1.00 2018/11/26 10:51 AM
 * 
 * PROGRAM PURPOSE:
 */
import java.util.Scanner;
public class ArceSharaf001PA4
{
  private static Scanner input = new Scanner(System.in);
  
  public static void main(String[] args)
  {
    //CREATE AN OBJECT OF TeamStats to call the method(s)
    //that kick starts the program.
    System.out.printf("Do you want to track the performance of the athletic "
                        + "teams at your school?  Enter 'Y' or 'N':  ");
    
    TeamStats teamStats = new TeamStats();
    teamStats.start();
    
    System.exit(0);
  }//END main()
}//END APPLICATION CLASS ArceSharaf001PA4
