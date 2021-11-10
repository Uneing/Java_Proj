package ingeritance_07.abstract_gamlevel;

public class PlayerEx {

	   public static void main(String[] args) {
	      
	      Player player = new Player();   //초보자 레벨 
	      player.play(1);
	      
	      AdvancedLevel aLevel = new AdvancedLevel();   //중급자레벨
	      player.UpgradeLevel(aLevel);   
	      player.play(2);
	      
	      SuperLevel sLevel = new SuperLevel();   //고급자레벨
	      player.UpgradeLevel(sLevel);
	      player.play(3);
	      
	   }

	}
