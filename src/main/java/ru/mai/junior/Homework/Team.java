package ru.mai.junior.Homework;

public class Team {
	private String Name;
	private int points;
	private int goal_s;
	private int goal_l;
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public int getGoal_s() {
		return goal_s;
	}
	public void setGoal_s(int goal_s) {
		this.goal_s = goal_s;
	}
	public int getGoal_l() {
		return goal_l;
	}
	public void setGoal_l(int goal_l) {
		this.goal_l = goal_l;
	}
	public Team(String name) {
		super();
		Name = name;
	}
	
	public void addThreePoints()
	{
		this.points += 3;
	}
	
	public void addOnePoints()
	{
		this.points++;
	}

	
	
}
