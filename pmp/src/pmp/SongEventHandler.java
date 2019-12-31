package pmp;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class SongEventHandler implements EventHandler<ActionEvent> {
	private TuneCommand song;

	public SongEventHandler(TuneCommand a) {
		this.song=a;
	}

	

	@Override
	public void handle(ActionEvent e) {
		//System.out.println(song.getArtist()+666);
		song.setArtist("StarSet");
		
		//System.out.println(song.getArtist()+"fuck");
		//song.setfileName("MyDemons");
		//song.setSongName("My Demons");
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
