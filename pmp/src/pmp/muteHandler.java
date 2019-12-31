package pmp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.media.MediaPlayer;

public class muteHandler implements EventHandler<ActionEvent> {
	MediaPlayer musicPlayer;
	public muteHandler(MediaPlayer m) {
		this.musicPlayer=m;
	}

	@Override
	public void handle(ActionEvent arg0) {
		this.musicPlayer.setVolume(0);
			
		}

	}


