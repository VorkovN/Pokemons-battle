package lab2;

import ru.ifmo.se.pokemon.*;
import persons.*;

public class battle {

	public static void main(String[] args) {
		
		Battle b = new Battle();
		
		b.addAlly(new Pikipek("Некит", 3));
		b.addAlly(new Toucannon("Владос", 3));
		b.addAlly(new Trumbeak("Готовая лаба ", 2));
		b.addFoe(new Victini("Яркеев", 5));
		b.addFoe(new Shuppet("Рыжий", 4));
		b.addFoe(new Banette("Ебанутый Вопрос", 6));
		
		b.go();

	}

}
