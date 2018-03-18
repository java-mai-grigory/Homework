package ru.mai.junior.Homework;

import java.util.ArrayList;

public class Tournir {
	private ArrayList<Team> teams = new ArrayList<>();
	private ArrayList<Result> results = new ArrayList<>();
	

	/**
	 * @param Name название команды
	 */
	public void addTeam(String Name)
	{
		teams.add( new Team(Name));
	}
	
	public Team getTeam(int i)
	{
		return teams.get(i);
	}
	
	
	/**
	 * @param t1  первая команда
	 * @param t2  вторая команда
	 * @param g1  забитые голы
	 * @param g2  пропущенные голы
	 */
	public void addResult(Team t1, Team t2, int g1, int g2) 
	{
		t1.setGoal_l( t1.getGoal_l() + g2);
		t1.setGoal_s( t1.getGoal_s() + g1);
		t2.setGoal_s( t2.getGoal_s() + g2);
		t2.setGoal_l( t2.getGoal_l() + g1);
		
		if (g1 > g2)
			t1.addThreePoints();
		else if(g2 > g1)
			t2.addThreePoints();
		else
		{
			t1.addOnePoints();
			t2.addOnePoints();
		}
			
				
	}
	
	ArrayList<Team> generateTable()
	{
		ArrayList<Team> tbl = new ArrayList<>();
		for(Team t: teams)
			tbl.add(t);
		return tbl;
	}
}
