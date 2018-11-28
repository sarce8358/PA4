import java.util.Scanner;
public class TeamStats
{
  /**
   * create 1D array at the class level called myTeams at the class level as a null array the type will be Team
   */
  private static Scanner input = new Scanner(System.in);
  private Team[] myTeams = null;
  
  //-------------------------------------declaring methods
  
  
  public void start()
  {
    /**
     * if the answer is "Yes" to tracking team performance then call processWinsLosses() and displayTeamStats()
     * 
     * if answer is "No" then print message "Thank you! Exiting program."
     */
    System.out.printf("%nDo you want to track the performance of the athletic "
                        + "teams at your school?  Enter 'Y' or 'N':  ");
    char ans = input.nextLine().charAt(0);
    
    if(Character.toUpperCase(ans) == 'Y') {
      processWinsLosses();
    } else if (Character.toUpperCase(ans) == 'N') {
System.out.printf("Thank you! Exiting program.");
    
    }
    
    
    
  }//END start()
  
  public void processWinsLosses()
  {
    /**
     * prmot user on number of teams that they would like to track. this number will be used to make the size of the 
     * myTeams array.
     */
    System.out.printf("%nWhat is the name of your school?");
    String name = input.nextLine();
    
    System.out.printf("%nHow many athletic teams do you have at your school?");
    //input.nextLine();
    
  }//END processWinsLosses()
  
  public void displayTeamStats()
  {
    /**
     * see sample output on instructions
     */
  }//END displayTeamStats()
  
}//END class
