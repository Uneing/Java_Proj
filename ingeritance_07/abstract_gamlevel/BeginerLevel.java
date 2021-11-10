package ingeritance_07.abstract_gamlevel;

public class BeginerLevel extends PlayerLevel {

	   @Override
	   public void run() {
	      System.out.println("천천히 달립니다.");      
	   }

	   @Override
	   public void jump() {
	      System.out.println("Jump를 할줄 모릅니다.");      
	   }

	   @Override
	   public void turn() {
	      System.out.println("Turn도 할줄 모릅니다.");   
	   }

	   @Override
	   public void showLevelMessage() {
	      System.out.println("========초보자 레벨입니다.========");   
	   }
	   
	   
	   
	}
