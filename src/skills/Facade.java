package skills;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {

	public Facade() {
		super(Type.NORMAL, 70, 100);
	}
	
	@Override
    protected void applySelfEffects(Pokemon p) {
        if ((p.getCondition() == Status.BURN) || (p.getCondition() == Status.POISON) || (p.getCondition() == Status.PARALYZE)) {
            this.power *= 2;
        }
    }
	
    @Override
    protected String describe() {
        return "Применяет Facade";
    }
}
