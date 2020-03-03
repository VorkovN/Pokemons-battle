package skills;

import ru.ifmo.se.pokemon.*; 

public class TakeDown extends PhysicalMove {
	
	public TakeDown() {
		super(Type.NORMAL, 90, 85);
	}
	
	@Override
    protected void applySelfEffects(Pokemon p) {
	//хуй знает
	}
	
    @Override
    protected String describe() {
        return "Применяет TakeDown";
    }
	
}
