package persons;

import ru.ifmo.se.pokemon.*;
import skills.*;


public class Banette extends Shuppet {

	public Banette(String name, int level) {
		super(name, level);
		this.setType(Type.GHOST);
        this.setStats(64, 115, 65, 83, 63, 65);
        this.addMove(new TakeDown());
    }
}
