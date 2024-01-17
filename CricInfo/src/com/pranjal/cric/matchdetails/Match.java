package com.pranjal.cric.matchdetails;

import java.util.Date;
import java.util.List;

import com.pranjal.cric.enums.MatchResult;
import com.pranjal.cric.teamdetails.Playing11;
import com.pranjal.cric.users.Commentator;
import com.pranjal.cric.users.Referee;
import com.pranjal.cric.users.Umpire;

public abstract class Match {
	private int number;
	private Date startTime;
	private MatchResult result;
	private Playing11[] teams;
	private List<Inning> innings;
	private List<Umpire> umpires;
	private Referee referee;
	private List<Commentator> commentators;
	private List<MatchStat> matchStats;

	public boolean assignStadium(Stadium stadium) {}

	public boolean assignReferee(Referee referee) {}
}
