package pmp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.media.MediaPlayer;

public class volIncreaseHandler implements EventHandler<ActionEvent> {
	MediaPlayer musicPlayer;
	public volIncreaseHandler(MediaPlayer m) {
		this.musicPlayer=m;
	}

	@Override
	public void handle(ActionEvent arg0) {
		double currVol= this.musicPlayer.getVolume();
		if(currVol<.99 && currVol>=0) {
			this.musicPlayer.setVolume(this.musicPlayer.getVolume()+.1);
			
		}

	}

}
