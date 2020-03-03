package persons;

import ru.ifmo.se.pokemon.*;
import skills.*;

public class Trumbeak extends Pikipek {

	public Trumbeak(String name, int level) {
		super(name, level);
		this.setType(Type.FLYING, Type.NORMAL);
        this.setStats(55, 85, 530, 40, 50, 75);
        this.addMove(new Psybeam());
    }
}
