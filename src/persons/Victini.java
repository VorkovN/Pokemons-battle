package persons;

import ru.ifmo.se.pokemon.*;
import skills.*;

public class Victini extends Pokemon {
	
	public Victini(String name, int level) {
		super(name, level);
		this.setType(Type.FIRE, Type.PSYCHIC);
        this.setStats(100, 100, 100, 100, 100, 100);
        this.addMove(new DoubleTeam());
        this.addMove(new Blizzard());
        this.addMove(new FocusBlast());
        this.addMove(new Facade());
    }
}
