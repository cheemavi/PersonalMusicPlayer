package pmp;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;

public class RandomSongHandler implements EventHandler<ActionEvent> {

TextField one;
TextField two;
     RandomSongHandler(TextField aN, TextField sN){
    	 
    	 this.one=aN;
    	 this.two=sN;
    	 
     }
	@Override
	public void handle(ActionEvent arg0) {
		
		//set defaults for tracking the random track's info
		String artist = "Artist: ";
		String song= "Song: ";
		
		// get random number
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(10) + 1;
		
		// switch case to iterate threw various combos 
		switch(randomInt) {
		
		 //song 1 chosen
		case 1:
			artist="Artist: Starset";
			song= "Song: My Demons";
			break;
		// song 2 chosen
		case 2:
			artist="Artist: EXID";
			song= "Song: Every Night";
			break;
		// song 3 chosen
		case 3:
			artist="Artist: VIXX";
			song= "Song: Fantasy";
			break;
		// song 4 chosen
		case 4:
			artist="Artist: TOKYO GHOUL OST";
			song= "Song: Unravel";
			break;
		// song 5 chosen
		case 5:
			artist="Artist: APINK";
			song= "Song: I'm so sick";
			break;
		// song 6 chosen 
		case 6:
			artist="Artist: DREAMCATCHER";
			song= "Song: You & I";
			break;
		// song 7 chosen
		case 7:
			artist="Artist: Michael Bublé";
			song= "Song: Feelin' Good";
			break;
		// song 8 chosen 
		case 8:
			artist="Artist: Katy Perry";
			song= "Song: Wide Awake";
			break;
		// song 9 chosen
		case 9:
			artist="Artist: Lindsey Stirling ft Lzzy Hale";
			song= "Song: Shatter Me";
			break;
		// song 10 chosen 
		case 10:
			artist="Artist: EXID";
			song= "Song: Bad Girl For You";
			break;
		
			
		
		}
		
		
		// set the artist and song to the one picked from switch case
		this.one.setText(artist);
		this.two.setText(song);

	}

}
