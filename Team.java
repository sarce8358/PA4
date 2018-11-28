/*
 * PROGRAM PURPOSE: Captures user input about teams and statistics.
 */

import java.util.Scanner;

public class Team
{
   private static Scanner input = new Scanner(System.in);
   private static int totalGame = 0;
   private static int wins = 0;
   private static String teamType = " ";
   private static String coachName = " ";
   
  
  //-------------------------------------declaring methods

   
  /*
   * setTeam() Purpose: Captures user input for type of team.
   */
  public void setTeam()
  {
    System.out.printf("%nEnter the team type:  ");
    teamType = input.nextLine();
  }//END setTeam()
  
  
  /*
   * setCoach() Purpose: Captures user input for coach of team.
   */
  public void setCoach()
  {
    System.out.printf("%nEnter the name of the coach: ");
    coachName = input.nextLine();
  }//END setCoach()
  
  
  /*
   * setTotalGames() Purpose: Captures user input for total number of
   * games played.
   */
  public void setTotalGames()
  {
    System.out.printf("%nEnter the total number of games played for the "
                     + "%s team: ", getTeam());
    totalGame = input.nextInt();
    input.nextLine();
    
  }//END setTotalGames()
  
  
  /*
   * setWins() Purpose: Captures user input for total wins.
   */
  public void setWins()
  {
   System.out.printf("%nEnter the number of wins for the %s team: "
                       , getTeam()); 
   wins = input.nextInt();
   input.nextLine();
  }//END setWins()
  
  /*
   * getTeam() Purpose: Returns user input for type of team.
   */
  public String getTeam(){
    return teamType;
  }//END getTeam()
  
  
  /*
   * getCoach() Purpose: Returns user input for coach of team.
   */
  public String getCoach(){
    return coachName;
  }//END getCoach()
  
  
  /*
   * getTotalGames() Purpose: Returns user input for total number of
   * games played.
   */
  public int getTotalGames(){
  return totalGame;
  }//END getTotalGames()
  
  
  /*
   * getWins() Purpose: Returns user input for total wins.
   */
  public int getWins(){
    return wins;
  }//END getWins()
}//END class
