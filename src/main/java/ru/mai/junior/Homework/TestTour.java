package ru.mai.junior.Homework;

public class TestTour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tournir tour = new Tournir();
		tour.addTeam("Спартак");
		tour.addTeam("Цска");
		
		
		tour.addResult(tour.getTeam(0), tour.getTeam(1), 1, 1);
		for(Team t : tour.generateTable())
		{
			System.out.printf("%-20s  %d  %d - %d\n", t.getName(), t.getPoints(), t.getGoal_l(), t.getGoal_s());
		}
	}

}
