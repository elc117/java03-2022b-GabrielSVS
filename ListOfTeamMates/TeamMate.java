public class TeamMate {
  private String userId;
  private String name;
  private boolean online;
  
  public String getUserId(){
    return this.userId;
  }

  public String getName(){
    return this.name;
  }

  public boolean getOnline(){
    return this.online;
  }

  public void setUserId(String userId){
    this.userId = userId;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setOnline(boolean online){
    this.online = online;
  }  

  public TeamMate(){
    this.userId = "GabrielSVS";
    this.name = "gabriel";
    this.online = true;
  }

  public TeamMate(String userId, String name, boolean online){
    this.userId = userId;
    this.name = name;
    this.online = online;
  }

  public TeamMate(String userId, String name){
    this.userId = userId;
    this.name = name;
    this.online = false;
  }
}
