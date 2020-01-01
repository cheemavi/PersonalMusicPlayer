package pmp;



import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.media.MediaPlayer;


public class SongEventHandler implements EventHandler<ActionEvent> {
	private static TuneCommand song= new TuneCommand();
	private static SongEventHandler instance;
	private String fileName;
	
	
	
	

	private SongEventHandler(TuneCommand a) {
		this.song=a;
	}
	
	public static SongEventHandler  getInstance() {
		if (instance == null)
			instance = new SongEventHandler(null);

		return instance;
	}
	
	
	public TuneCommand getTune() {
		return this.song;
	}
	public String getArt() {
		return this.song.getArtist();
	}
	public void setTune(TuneCommand t) {
		this.song=t;
	}
	@Override
	public void handle(ActionEvent e) {
		Button source=(Button)e.getSource();
		// updating the top labels based on the song
		if (source.getText()=="1") {
		song.setArtist("StarSet");
		song.setSongName("My Demons");
		song.setfileName("StarSet");
		}
		
		else if (source.getText()=="2") {
			song.setArtist("EXID");
			song.setSongName("Every Night ");
			song.setfileName("EXID");}
		
		else if (source.getText()=="3") {
			song.setArtist("VIXX");
			song.setSongName("Fantasy");
			song.setfileName("VIXX");
		}
		
		else if (source.getText()=="4") {
			song.setArtist("TOKYO GHOUL OST");
			song.setSongName("Unravel");
			song.setfileName("Unravel");
		}
		
		else if (source.getText()=="5") {
			song.setArtist("APINK");
			song.setSongName("I'm so sick");
			song.setfileName("APINK");
			
			
			
		}
		song.setM(song.createPlayer(song.getfileName()));
		
		
		
		
		
		
		
		
		//song.setfileName("MyDemons");
		
		
		
		

	}


}
