package pmp;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;


public class SongEventHandler implements EventHandler<ActionEvent> {
	private TuneCommand song;

	public SongEventHandler(TuneCommand a) {
		this.song=a;
		
	}

	
	
	public TuneCommand getTune() {
		return this.song;
	}
	@Override
	public void handle(ActionEvent e) {
		Button source=(Button)e.getSource();
		// updating the top labels based on the song
		if (source.getText()=="1") {
		song.setArtist("StarSet");
		song.setSongName("My Demons");}
		
		else if (source.getText()=="2") {
			song.setArtist("EXID");
			song.setSongName("Every Night ");}
		
		else if (source.getText()=="3") {
			song.setArtist("VIXX");
			song.setSongName("Fantasy");}
		
		else if (source.getText()=="4") {
			song.setArtist("TOKYO GHOUL OST");
			song.setSongName("Unravel");}
		
		else if (source.getText()=="5") {
			song.setArtist("APINK");
			song.setSongName("I'm so sick");}
		
		
		
		
		//song.setfileName("MyDemons");
		
		//song.createPlayer(song.getfileName());
		
		

	}

}
/*
 * public void handle(ActionEvent event) {
		Button source=(Button)event.getSource();
		if(source.getText()=="increment") {
			mcounter.increment();
		} else if(source.getText()=="decrement") {
			mcounter.decrement();
		}
	}
 */
