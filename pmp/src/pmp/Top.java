package pmp;




import ca.utoronto.utm.util.Observable;
import ca.utoronto.utm.util.Observer;
import javafx.scene.layout.VBox;

public class Top extends VBox implements Observer {
	TopPart1 song;
	TopPart2 artist;
	String poo;
	//TopPart3 album;
	Top(){
		this.song = new TopPart1();
		this.artist= new TopPart2();
		//this.album= new TopPart3();
		this.getChildren().add(this.song);
		this.getChildren().add(this.artist);
		//this.getChildren().add(this.album);
		
			
	}
	public void setSinger(String s) {
		this.artist.setT(s);
	}
	@Override
	public void update(Observable o) {
		// update them song labels
		 TuneCommand mark = (TuneCommand)o;
		 this.artist.setT(mark.getArtist());
		 this.song.setT(mark.getSongName());
		 
		 System.out.println("wa");
		
	}

	
	
	

}
