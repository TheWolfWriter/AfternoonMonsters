package monsters.controller;

import monsters.model.MarshmellowMonster;
import monsters.view.MonsterView;

public class MonsterAppController
{
	private MonsterView appView;
	private MarshmellowMonster myMonster;
	
	public MonsterAppController()
	{
		appView = new MonsterView(this);
		myMonster = new MarshmellowMonster("Olf", 3.67, 2.01, 1, 2, 3, false);
	}
	
	public void start()
	{
		appView.displayInformation();
	}
	
	public MarshmellowMonster getMyMonster()
	{
		return myMonster;
	}
	
}
