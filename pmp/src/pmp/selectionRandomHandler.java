package pmp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;

public class selectionRandomHandler implements EventHandler<ActionEvent> {
	TextField three;
	TextField four;
	SongEventHandler sE;

	public selectionRandomHandler(TextField aN, TextField sN) {
		this.three=aN;
		this.four=sN;
	}

	@Override
	public void handle(ActionEvent arg0) {
		// get song player
		SongEventHandler sE= SongEventHandler.getInstance();
		
		// get the song's singer and title
		String singer = this.three.getText().substring(8);
		String title = this.four.getText().substring(6);
		
		// stop current song and change the player's labels
		sE.getTune().getM().stop();
		sE.getTune().setArtist(singer);
		sE.getTune().setSongName(title);
		
		// setting up the file name 
		switch(title) {
		//song 1 chosen
				case "My Demons":
					sE.getTune().setfileName("StarSet");
					break;
		//song 2 chosen
				case "Every Night":
					sE.getTune().setfileName("EXID");
					break;	
		//song 3 chosen
				case "Fantasy":
					sE.getTune().setfileName("VIXX");
					break;
	    //song 4 chosen
				case "TOKYO GHOUL OST":
					sE.getTune().setfileName("Unravel");
					break;	
		//song 5 chosen
				case "I'm so sick":
					sE.getTune().setfileName("APINK");
					break;	
		//song 6 chosen
				case "You & I":
					sE.getTune().setfileName("UANDI");
					break;	
		//song 7 chosen
				case "Feelin' Good":
					sE.getTune().setfileName("FEELINGgood");
					break;	
		//song 8 chosen
				case "Wide Awake":
					sE.getTune().setfileName("wideAwake");
					break;	
		//song 9 chosen
				case "Shatter Me":
					sE.getTune().setfileName("shatterMe");
					break;	
		//song 10 chosen
				case "Bad Girl For You":
					sE.getTune().setfileName("BADGIRLFORU");
					break;	
					
		}
		// get tune command
		TuneCommand curr= sE.getTune();
		curr.getM().stop();
		String fl= curr.getfileName();
		curr.setM(curr.createPlayer(fl));
		
		

	}

}
