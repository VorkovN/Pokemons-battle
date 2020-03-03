package persons;

import ru.ifmo.se.pokemon.*;
import skills.*;

public class Shuppet extends Pokemon {

	public Shuppet(String name, int level) {
		super(name, level);
		this.setType(Type.GHOST);
        this.setStats(44, 75, 35, 63, 33, 45);
        this.addMove(new Facade());
        this.addMove(new RockTomb());
        this.addMove(new RockSlide());
    }
}
