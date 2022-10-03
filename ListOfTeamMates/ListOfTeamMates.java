import java.util.ArrayList;

public class ListOfTeamMates{
  
  public static void main(String[] args) {
    
    ArrayList<TeamMate> equipe = new ArrayList<TeamMate>();
    equipe.add(new TeamMate ());
    equipe.add(new TeamMate ("PalitoSP","maria",true));
    equipe.add(new TeamMate ("LaranjaRS", "carlos"));
    equipe.add(new TeamMate ("PilhaDF","sergio",true));
    equipe.add(new TeamMate ("CadeiraRJ","helio"));
    System.out.println(equipe.size());
    System.out.println("-----");
    //Nome de cada TeamMate armazenado
    for (TeamMate eq : equipe){
      System.out.println(eq.getName());
    }
    //userId dos TeamMates online(true)
    System.out.println("-----");
    for (TeamMate eq : equipe){
      if (eq.getOnline() == true){
        System.out.println(eq.getUserId());
      }
    }
    System.out.println("-----");

    //limpando toda a ArrayList
    equipe.clear();
    System.out.println(equipe.size());
    
    /*  Jeito "c" de se fazer, estava testando
    for(int i = 0 ; i < equipe.size() ; i++){
      System.out.println(equipe.get(i).getName());
    }
    System.out.println("-----");
    
    for(int i = 0 ; i < equipe.size() ; i++){
      if (equipe.get(i).getOnline() == true) {
        System.out.println(equipe.get(i).getUserId());
      }
    }*/
    
  }
  
}