package com.april19;

public class Player {
	private String name;
	private int runs;
	private int wickets;
	private float average;
	private String highScore;
	private String bestFigure;
	
	public Player(String name, int runs, int wickets, float average, String highScore, String bestFigure) {
		super();
		this.name = name;
		this.runs = runs;
		this.wickets = wickets;
		this.average = average;
		this.highScore = highScore;
		this.bestFigure = bestFigure;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public float getAverage() {
		return average;
	}
	public void setAverage(float average) {
		this.average = average;
	}
	public String getHs() {
		return highScore;
	}
	public void setHs(String hs) {
		this.highScore = hs;
	}
	public String getBf() {
		return bestFigure;
	}
	public void setBf(String bf) {
		this.bestFigure = bf;
	}
}
