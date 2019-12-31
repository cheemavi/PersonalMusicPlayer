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
		// TODO Auto-generated method stuff
		 TuneCommand mark = (TuneCommand)o;
		 this.poo= mark.getArtist();
		 System.out.println("wa");
		
	}

	
	
	

}
