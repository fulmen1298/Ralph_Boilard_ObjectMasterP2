public class TestGame {

	public static void main(String[] args) {
		Human h = new Human("Harry");
		Ninja n = new Ninja("Nathaniel");
		Wizard w = new Wizard("Wabiskue");
		Samurai s = new Samurai("Sam Tarly");
		Human h2 = new Human("Hermit");
		
		n.steal(h);
		w.heal(h);
		s.deathBlow(h);
		n.runAway();
		s.meditate();
		s.howMany();
		w.fireball(h2);

	}

}