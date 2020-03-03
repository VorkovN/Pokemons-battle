package skills;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
	
	public Swagger() {
		super(Type.NORMAL, 0, 85);
	}

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, 2);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        //p.addEffect(new Effect().confuse(p));//как применить confuse на p?
    }
	
    @Override
    protected String describe() {
        return "Применяет Swagger";
    }
	
}
