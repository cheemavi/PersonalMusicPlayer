package pmp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.media.MediaPlayer;

public class volIncreaseHandler implements EventHandler<ActionEvent> {
	SongEventHandler sE;

	@Override
	public void handle(ActionEvent arg0) {
		SongEventHandler sE= SongEventHandler.getInstance();
		double currVol= sE.getTune().getV();
		if(currVol<.99 && currVol>=0) {
			//this.musicPlayer.setVolume(this.musicPlayer.getVolume()+.1);
			sE.getTune().setV(currVol+.1);
			
			
		}

	}

}
