
package edu;



public class Match  {
	private String Name;
	private String Date;
	private String Score;
	private String teamOne;
	private String teamTwo;
	private int teamOneScore;
	private int teamTwoScore;
	private String stadium;
	private String winner;
	public String getName() {
		return Name;
	}
	public void setName(String sName) {
		this.Name = sName;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getScore() {
		return Score;
	}
	public void setScore(String score) {
		Score = score;
	}
	public String getTeamOne() {
		return teamOne;
	}
	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}
	public String getTeamTwo() {
		return teamTwo;
	}
	public void setTeamTwo(String teamTwo) {
		this.teamTwo = teamTwo;
	}
	public int getTeamOneScore() {
		return teamOneScore;
	}
	public void setTeamOneScore(int ts1) {
		this.teamOneScore = ts1;
	}
	public int getTeamTwoScore() {
		return teamTwoScore;
	}
	public void setTeamTwoScore(int ts2) {
		this.teamTwoScore = ts2;
	}
	public String getStadium() {
		return stadium;
	}
	public void setStadium(String stadium) {
		this.stadium = stadium;
	}
	public String getWinner() {
		return winner;
	}
	public void setWinner(String winner) {
		this.winner = winner;
	}
	
	

}
