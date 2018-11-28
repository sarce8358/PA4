import java.util.Scanner;

public class Team
{
   private static Scanner input = new Scanner(System.in);
  
  //-------------------------------------declaring methods
  
  public void setTeam()
  {
    System.out.printf("%nEnter the team type:  ");
    String teamType = input.nextLine();
  }//END setTeam()
  
  public void setCoach()
  {
    System.out.printf("%nEnter the name of the coach: ");
    String coachName = input.nextLine();
  }//END setCoach()
  
  public void setTotalGames()
  {
    System.out.printf("%nEnter the total number of games played for the "
                     + "%s team: ", );
  }//END setTotalGames()
  
  public void setWins()
  {
    
  }//END setWins()
  
  
  public void getTeam(){
    
  }
  
  public void getCoach(){
    
  }
  
  public void getTotalGames(){
  
  }
  
  public void setWins(){
    
  }
}//END class
