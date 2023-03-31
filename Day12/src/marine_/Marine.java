

package marine_;

public class Marine {
	public static int attack = 3;
	public static int defense = 3;
	public int hp = 40; //나만 가지고 있음 . 갖고있는 한 계속
	
	public void underAttack(int damage) {
		System.out.println("공격받았습니다! 체력 감소:-"+damage);
		this.hp -= damage;
		System.out.println("현재 체력: "+this.hp);
		
	}
	
	public static void upgradeAttack() {//모두가 갖고있음. static
		Marine.attack += 3;
	}
	
	public static void upgradeDefnese() {
		Marine.defense += 3;
	}
}
