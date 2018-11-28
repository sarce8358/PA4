/*
 * PROGRAM PURPOSE: Calls upon Team program, processes wins and loses,
 * and displays team statistics.
 */

import java.util.Scanner;
public class TeamStats
{
  /**
   * create 1D array at the class level called myTeams at the class level as a null array the type will be Team
   */
  private Scanner input = new Scanner(System.in);
  private Team[] myTeams = null;
  private Team team = new Team();
  private int teams = 0;
  private String name = " ";
  
  //-------------------------------------declaring methods
  
  
  /*
   * start() Purpose: Asks user if they would like to start application
   * or exits, depending on input.
   */
  public void start()
  {
    /**
     * if the answer is "Yes" to tracking team performance then call processWinsLosses() and displayTeamStats()
     * 
     * if answer is "No" then print message "Thank you! Exiting program."
     */
    System.out.printf("%nDo you want to track the performance of the athletic "
                        + "teams at your school?  Enter 'Y' or 'N': ");
    char ans = input.nextLine().charAt(0);
    
    if(Character.toUpperCase(ans) == 'Y') {
      processWinsLosses();
    } else if (Character.toUpperCase(ans) == 'N') {
System.out.printf("Thank you! Exiting program.  ");
    
    }
    
  }//END start()
  
  
  /*
   * processWinsLosses() Purpose: Calls upon Team program to receive
   * user input.
   */
  public void processWinsLosses()
  {
    /**
     * prmot user on number of teams that they would like to track. this number will be used to make the size of the 
     * myTeams array.
     */
    System.out.printf("%nWhat is the name of your school?  ");
    name = input.nextLine();
    
    System.out.printf("%nHow many athletic teams do you have at your school?  ");
    teams = input.nextInt();
    Team[] myTeams = new Team[teams];
    
    for(int i = 1; i <= myTeams.length; i++){
      
    
    
    team.setTeam();
    team.setCoach();
    team.setTotalGames();
    team.setWins();
    

    }
    
        displayTeamStats();
  }//END processWinsLosses()
  
  
  
  /*
   * displayTeamStats() Purpose: Displays all accumulated
   * statistics about the teams.
   */
  public void displayTeamStats()
  {
    /**
     * see sample output on instructions
     */
    System.out.printf("%nTEAMS WIN-LOSS RECORD FOR %S", name);
    
    for(int i = 0; i <= teams; i++){
    

      System.out.printf("%n%nTeam: %s"
                        + "%nCoach: %s"
                        + "%nTotal Games: %d"
                        + "%nNo. of Wins: %d"
                        
                        , team.getTeam(), team.getCoach(),
                      team.getTotalGames(), team.getWins());
    
    }//END for loop
  }//END displayTeamStats()
  
}//END class
