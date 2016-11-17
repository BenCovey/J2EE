package edu;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import edu.Team;
import edu.Match;
import edu.Stadium;

/**
 * Servlet implementation class League
 */
@WebServlet(description = "This servlet is responsible for responding to requests about the Soccer League", urlPatterns = {"/position"}, loadOnStartup = 1)
public class League extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	Team teamobj = new Team();
	Stadium stadiumobj = new Stadium();
	Match matchobj = new Match();
	/**
	 * Team Array.
	 */
	java.util.List<Team> teamArray = new ArrayList<Team>();
	/**
	 * Stadium Array.
	 */
	java.util.List<Stadium> stadiumArray = new ArrayList<Stadium>();
	/**
	 * Match Array.
	 */
	java.util.List<Match> matchArray = new ArrayList<Match>();
	/**
	 * Top Team.
	 */
	ArrayList<String> topTeam = new ArrayList<String>();
	ArrayList<String> Winners = new ArrayList<String>();
	private List<Match> data;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public League() {
        super();
    }


	public void init(final ServletConfig config) throws ServletException {
		System.out.println("I am alive");
		URL url;
		try
		{
		    url = config.getServletContext().getResource(FileHandler.DATA_FILE);
		    String path = url.getPath();
		    setData(buildTeams(FileHandler.loadFileData(path)));
		}
		catch (IOException e)
		{
		    e.printStackTrace();
		}
		
		for(int i = 0; i < matchArray.size(); i++){
			String team = matchArray.get(i).getWinner();
			System.out.println(matchArray.get(i).getWinner());
			if(Winners.contains(team)){
				int index = Winners.indexOf(team);
				Winners.set(index+1, Winners.get(index+1) +1);
			}else{
				Winners.add(matchArray.get(i).getWinner());
				Winners.add("1");
			}
			
		} //end for

	} //end of init


	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	protected void doGet(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {		
		URL url = request.getServletContext().getResource(FileHandler.DATA_FILE);
		String path = url.getPath();
		setData(buildTeams(FileHandler.loadFileData(path)));
		String value = request.getParameter("team");
		if (value != null)
		{
		    response.getWriter().write(searchItems(value.toLowerCase()));
		}
		else
		{
			//response.getWriter().write(message);
		    printList(response);
		}



	} //end of get

	/**
	 * @param value
	 * @return
	 */
	private String searchItems(final String value) {
		String result = "Not Found";
        return result;
	}


	private List<Match> buildTeams(final Map<String, ArrayList<String>> map)
	{
		
//		java.util.List<Team> teamArray = new ArrayList<Team>();
//		java.util.List<Stadium> stadiumArray = new ArrayList<Stadium>();
//		java.util.List<Match> matchArray = new ArrayList<Match>();
		 
	    for (String key : map.keySet())
	    {
    	
	    	//TEAMS
	    	boolean TeamOne = true;
		    boolean TeamTwo = true;
		    int Team1 = 0;
		    int Team2 = 0;
	       
	       for(int i = 0; i < teamArray.size(); i++){
	    	   if(teamArray.get(i).getName().equals(map.get(key).get(1))){TeamOne = false;Team1 = i;}
	    	   if(teamArray.get(i).getName().equals(map.get(key).get(2))){TeamTwo = false;Team2 = i;}
	    	   
		       }//end for 
	       if(TeamOne == true){
	    	   Team cTeam = new Team();
	    	   cTeam.setName(map.get(key).get(1));
	    	   //System.out.println(cTeam.getName());
	    	   teamArray.add(cTeam);
	       }//end if
	       if(TeamTwo == true){
	    	   Team cTeam = new Team();
	    	   cTeam.setName(map.get(key).get(2));
	    	   //System.out.println(cTeam.getName());
	    	   teamArray.add(cTeam);
	       }//end if 
	       
	       //STADIUMS
	       boolean stadiums = true;
	       int Nstadium = 0;
	       for(int i = 0; i < stadiumArray.size(); i++){
	    	   if(stadiumArray.get(i).getName().equals(map.get(key).get(0))){stadiums = false;Nstadium = i;}
	       }//end for
	       
	       if(stadiums == true){
	    	   Stadium cStadium = new Stadium();
	    	   cStadium.setName(map.get(key).get(0));
	    	   stadiumArray.add(cStadium);
	    	   //System.out.println(cStadium.getName());
	       }//end if
	       
	       //MATCH
	       boolean Match = true;
	       for(int i = 0; i > matchArray.size(); i++){
	    	   if(matchArray.get(i).getDate().equals(map.get(key).get(4))){Match = false;}
	       }
	       
	       if(Match == true){
	    	   String Winner;
	    	   String[] Scoring;
	    	   Match cMatch = new Match();
	    	   cMatch.setStadium(stadiumArray.get(Nstadium).getName());
	    	   cMatch.setDate(map.get(key).get(4));
	    	   cMatch.setTeamOne(teamArray.get(Team1).getName());
	    	   cMatch.setTeamTwo(teamArray.get(Team2).getName());
	    	   Winner = map.get(key).get(3);
	    	   Scoring = Winner.split("-");
	    	   Integer score1 = Integer.parseInt(Scoring[0]);
	    	   Integer score2= Integer.parseInt(Scoring[1]); 
	    	   int ts1 = 0;
	    	   int ts2 = 0;
	    	   if(score1 == score2){
	    		   ts1 = 1;
	    		   ts2 = 1;
	    		   cMatch.setWinner(map.get(key).get(1));
	    		   
	    	   }else if(score1 > score2){
	    		   ts1 = 3;
	    		   ts2 = 0;
	    		   cMatch.setWinner(map.get(key).get(1));
	    	   }else if(score1 < score2){
	    		   ts1 = 0;
	    		   ts2 = 3;
	    		   cMatch.setWinner(map.get(key).get(2));
	    	   }
	    	   
	    	   
	    	   cMatch.setTeamOneScore(ts1);
	    	   cMatch.setTeamTwoScore(ts2);
	    	   matchArray.add(cMatch);
	       } 
	       
	    }//end for

	    //System.out.println("END");
		return matchArray;
	}//end of BuildTeams

	protected void doPost(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}//end of post

	
	public void destroy() {
		System.out.println("I'm Dead");
	}//end of destroy
	
	private void printList(final HttpServletResponse response) throws IOException
	{

		PrintWriter writer = response.getWriter();

       
        for(int i = 0;i < Winners.size(); i++){
        	writer.write(Winners.get(i));
        	writer.write("  ");
        }

       
	}//end Printlist


	public List<Match> getData() {
		return data;
	}


	public void setData(List<Match> data) {
		this.data = data;
	}
}

