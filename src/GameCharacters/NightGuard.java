package GameCharacters;
import Minigames.*;

public class NightGuard extends NightBehaviour {

	Boolean doTasks(String name) {
		System.out.print("\n["+ name +"]:\n\t❝   You there! What are you doing outside your cell ?! ❞\n");
		
		Minigames.QuickAttack qa = new Minigames.QuickAttack();
		return qa.play();
		
	}
}
