package persons;

import ru.ifmo.se.pokemon.*;
import skills.*;

public class Pikipek extends Pokemon {
	
	public Pikipek(String name, int level) {
		super(name, level);
		this.setType(Type.FLYING, Type.NORMAL);
        this.setStats(35, 75, 30, 30, 30, 65);
        this.addMove(new DoubleTeam());
        this.addMove(new Facade());
    }
}
