package edu;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Team
 */
@SuppressWarnings({ "serial", "unused" })
@WebServlet("/Team")
public class Team extends HttpServlet {
	private String name;
	private int points;
	private int win;
	private int loss;
	private int draw;
	private int standing;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
	public int getLoss() {
		return loss;
	}
	public void setLoss(int loss) {
		this.loss = loss;
	}
	public int getDraw() {
		return draw;
	}
	public void setDraw(int draw) {
		this.draw = draw;
	}
	public int getStanding() {
		return standing;
	}
	public void setStanding(int standing) {
		this.standing = standing;
	}
	public static void add(Team item) {
		// TODO Auto-generated method stub
		
	}

}
