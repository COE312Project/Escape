package GameCharacters;
import Minigames.*;

public class NightGuard extends NightBehaviour {

	Boolean doTasks(String name) {
		System.out.print("\n["+ name +"]:\n\t❝   You there! What are you doing outside your cell ?! ❞\n");
		
		Minigames.QuickAttack qa = new Minigames.QuickAttack();
		Boolean alive = qa.play();
		
		if(!alive)
			System.out.print("\n With your super fast reflexes, you deliver a lethal blow to the guard!\n"
					+ " He didn't know that you had a yellow belt in karate!\n"
					+ " You lay him down quietly, as to not alert the other guards.\n> ");
		
		return alive;
	}
}
