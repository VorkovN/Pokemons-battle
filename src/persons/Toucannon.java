package persons;

import ru.ifmo.se.pokemon.*;
import skills.*;

public class Toucannon extends Pikipek {

	public Toucannon(String name, int level) {
		super(name, level);
		this.setType(Type.FLYING, Type.NORMAL);
        this.setStats(80, 120, 75, 75, 75, 60);
        this.addMove(new Swagger());
    }
}
