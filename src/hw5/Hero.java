package hw5;

public class Hero {
	// 省略 getter/setter...
	
	private String name;
	private int level;
	private double exp;
	private Defend de; //介面
	private Attack at;
	private Move mo;
	
	public Hero() {
		this("David", 1, 0);
	}
	
	public Hero(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}
	
	public void setHero(Defend def, Attack att, Move moo) {
		this.de = def;
		this.at = att;
		this.mo = moo;
	}
	
	public void work() {
		de.defendd();
		at.attackk();
		mo.movee();
	}
}
