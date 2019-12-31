package pmp;

import java.nio.channels.NetworkChannel;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

public class loopMHandler implements EventHandler<ActionEvent> {
	MediaPlayer musicPlayer;
	boolean isLoop;
	public loopMHandler(MediaPlayer m) {
		this.musicPlayer=m;
		isLoop= false;
	}

	@Override
	public void handle(ActionEvent arg0) {
		if(!this.isLoop) {
			Duration n = this.musicPlayer.getCurrentTime();
			this.musicPlayer.setCycleCount(MediaPlayer.INDEFINITE);
			this.isLoop=true;
		}
		else {
			this.musicPlayer.pause();
			this.isLoop=false;
			
			this.musicPlayer.setCycleCount(1);
			this.musicPlayer.play();
			
			
		}

	}

}
