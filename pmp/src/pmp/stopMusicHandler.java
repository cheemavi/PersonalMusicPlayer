package pmp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.media.MediaPlayer;

public class stopMusicHandler implements EventHandler<ActionEvent> {
	SongEventHandler sE;
	

	@Override
	public void handle(ActionEvent arg0) {
		SongEventHandler sE= SongEventHandler.getInstance();
		sE.getTune().getM().stop();

	}

}
