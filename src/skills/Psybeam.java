package skills;

import ru.ifmo.se.pokemon.*;

public class Psybeam extends PhysicalMove {
	
	public Psybeam() {
		super(Type.PSYCHIC, 65, 100);
	}
	
	@Override
    protected void applyOppEffects(Pokemon p) {
		//p.addEffect(new Effect().chance(0.1).confuse(p));//как применить confuse на p?
	}
	
    @Override
    protected String describe() {
        return "Применяет Psybeam";
    }
	
}
