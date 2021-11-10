package ingeritance_07.abstract_gamlevel;

public class Player {
	   
	   private PlayerLevel level;   //PlayerLevel : 데이타 타입, level :인스턴스변수 
	   
	   public Player() {   //생성자
	      level = new BeginerLevel();   //객체생성 
	      level.showLevelMessage();
	   }
	   
	   public PlayerLevel getLevel() {
	      return level;
	   }
	   
	   public void UpgradeLevel(PlayerLevel level) {   //업캐스팅 
	      this.level = level;
	      level.showLevelMessage();
	   }
	   
	   public void play(int count) {
	      level.go(count);
	   }
	   
}