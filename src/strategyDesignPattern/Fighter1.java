package strategyDesignPattern;

import strategyDesignPattern.kicks.FootStomp;
import strategyDesignPattern.punches.ComplexPunch;
import strategyDesignPattern.wrestle.ChokeMove;

public class Fighter1 extends Fighter {

	Fighter1() {
		super(new FootStomp(), new ComplexPunch(), new ChokeMove());
	}
	
}
