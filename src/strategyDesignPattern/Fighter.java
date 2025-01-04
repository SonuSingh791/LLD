package strategyDesignPattern;

import strategyDesignPattern.kicks.IKickingBehaviour;
import strategyDesignPattern.kicks.RoundHouseKick;
import strategyDesignPattern.punches.HookPunch;
import strategyDesignPattern.punches.IPunchingBehaviour;
import strategyDesignPattern.wrestle.ChokeMove;
import strategyDesignPattern.wrestle.IWrestlingBehaviour;

public class Fighter {
	IKickingBehaviour kb;
	IPunchingBehaviour pb;
	IWrestlingBehaviour wb;
	
	Fighter(IKickingBehaviour kickObj, IPunchingBehaviour punchObj, IWrestlingBehaviour wrestleObj){
		this.kb = kickObj;					//new RoundHouseKick();
		this.wb = wrestleObj;				//new ChokeMove();
		this.pb = punchObj; 				//new HookPunch();
	}
	
	void fight() {
		pb.punch();
		kb.kick();
		wb.wrestle();
	}
}
