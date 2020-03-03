package skills;

import ru.ifmo.se.pokemon.*;

public class RockSlide extends PhysicalMove {
	
	public RockSlide() {
		super(Type.ROCK, 75, 90);
	}

    @Override
    protected void applyOppEffects(Pokemon p) {
    	//p.addEffect(new Effect().chance(0.3).flinch(p));//как применить flinch на p?
    }
    
    @Override
    protected String describe() {
        return "Применяет RockSlide";
    }
	
}
