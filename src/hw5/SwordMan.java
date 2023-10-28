package hw5;

public class SwordMan extends Hero implements Defend, Move, Attack{
	
	public SwordMan() {
		super();
	}
	
	public SwordMan(String name, int level, double exp) {
		super(name, level, exp);
	}
	
	@Override
	public void attackk() {
		System.out.println("揮劍");
	}
	
	@Override
	public void movee() {
		System.out.println("跑步");
	}
	
	@Override
	public void defendd() {
		System.out.println("做防禦動作");
	}
	
}
