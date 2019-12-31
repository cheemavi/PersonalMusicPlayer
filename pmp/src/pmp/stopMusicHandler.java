package pmp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.media.MediaPlayer;

public class stopMusicHandler implements EventHandler<ActionEvent> {
	MediaPlayer musicPlayer;
	public stopMusicHandler(MediaPlayer m) {
		this.musicPlayer=m;
	}

	@Override
	public void handle(ActionEvent arg0) {
		this.musicPlayer.stop();

	}

}
