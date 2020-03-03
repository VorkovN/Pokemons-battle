package skills;

import ru.ifmo.se.pokemon.*;

public class Blizzard extends SpecialMove {

    public Blizzard() {
        super(Type.ICE, 110, 70);
    }
    
    @Override
    protected void applyOppEffects(Pokemon p) {
        //p.addEffect(new Effect().chance(0.1).freeze(p));//??? ????????? freeze ?? p?
    }
    
    @Override
    protected String describe() {
        return "????????? Blizzard";
    }
    
}
