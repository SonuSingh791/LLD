package observerDesignPattern;

public class Test {

	public static void main(String[] args) {
		CricketData cd = new CricketData();
		cd.setData(50, 1, 10);
		
		ScoreCardDisplay scd = new ScoreCardDisplay();	// observer1
		NetRunRateDisplay nrrd = new NetRunRateDisplay();	// observer2
		FinalScorePredictionDisplay fsd = new FinalScorePredictionDisplay();	// observer3
		cd.register(scd);
		cd.register(nrrd);
		cd.register(fsd);
		
		// set the data and call the update function of all the registered observers.
		cd.setData(100, 2, 20);
		
		cd.unRegister(fsd);
		cd.setData(150, 3, 24);
	}

}
