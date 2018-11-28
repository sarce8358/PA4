import java.util.Scanner;

public class Team
{
   private static Scanner input = new Scanner(System.in);
   private static int totalGame = 0;
   private static int wins = 0;
   private static String teamType = " ";
   private static String coachName = " ";
   
  
  //-------------------------------------declaring methods
  
  public void setTeam()
  {
    System.out.printf("%nEnter the team type:  ");
    teamType = input.nextLine().toLowerCase();
  }//END setTeam()
  
  public void setCoach()
  {
    System.out.printf("%nEnter the name of the coach: ");
    coachName = input.nextLine();
  }//END setCoach()
  
  public void setTotalGames()
  {
    System.out.printf("%nEnter the total number of games played for the "
                     + "%s team: ", getTeam());
    totalGame = input.nextInt();
    input.nextLine();
    
  }//END setTotalGames()
  
  public void setWins()
  {
   System.out.printf("%nEnter the number of wins for the %s team: "
                       , getTeam()); 
   wins = input.nextInt();
   input.nextLine();
  }//END setWins()
  
  
  public String getTeam(){
    return teamType;
  }//END getTeam()
  
  public String getCoach(){
    return coachName;
  }//END getCoach()
  
  public int getTotalGames(){
  return totalGame;
  }//END getTotalGames()
  
  public int getWins(){
    return wins;
  }//END getWins()
}//END class
