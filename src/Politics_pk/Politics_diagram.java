package Politics_pk;

import PoliticalElec.Political_f;
import PoliticalElec.Political_f.AcceptVoters_st;
import PoliticalElec.Political_f.CountVotes_st;
import PoliticalElec.Political_f.Init;
import PoliticalElec.Political_f.PersonVotes_st;
import PoliticalElec.Political_f.PublishResults_st;
import PoliticalElec.Political_f.Ready_st;
import PoliticalElec.Political_f.Validate_st;
import hu.elte.txtuml.api.layout.Below;
import hu.elte.txtuml.api.layout.Row;
import hu.elte.txtuml.api.layout.StateMachineDiagram;

class Politics_diagram extends StateMachineDiagram<Political_f> {

		@Row({Init.class, Ready_st.class, Validate_st.class})
		@Below(from = Ready_st.class, val = AcceptVoters_st.class)
		@Below(from = Validate_st.class, val = PersonVotes_st.class)
		@Below(from = PersonVotes_st.class, val = CountVotes_st.class)
		@Below(from = CountVotes_st.class, val = PublishResults_st.class) 
		class L extends Layout {}
	}
