package main;

import java.io.IOException;

import PoliticalElec.CountingVotes_t;
import PoliticalElec.InvalidVoter_t;
import PoliticalElec.Opened_t;
import PoliticalElec.Political_f;
import PoliticalElec.ReleaseResults_t;
import PoliticalElec.Validating_t;
import PoliticalElec.VanueClosed_t;
import PoliticalElec.Votes_t;
import hu.elte.txtuml.api.model.Action;
import hu.elte.txtuml.api.model.execution.ModelExecutor;

public class Main {
	
	static Political_f political;

	static void init() {
		political = Action.create(Political_f.class);
		Action.start(political);
	}

	public static void main(String[] args) throws IOException {
		ModelExecutor.create().setTraceLogging(true).start(Main::init);
		System.in.read();
		Action.send(new Opened_t(), political);
		System.in.read();
		Action.send(new VanueClosed_t(), political);
		System.in.read();
		Action.send(new Validating_t(), political);
		System.in.read();
		Action.send(new Votes_t(), political);
		System.in.read();
		Action.send(new InvalidVoter_t(), political);
		System.in.read();
		Action.send(new CountingVotes_t(), political);
		System.in.read();
		Action.send(new ReleaseResults_t(), political);
	}

}
