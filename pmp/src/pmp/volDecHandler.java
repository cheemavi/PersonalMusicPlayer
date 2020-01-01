package pmp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.media.MediaPlayer;

public class volDecHandler implements EventHandler<ActionEvent> {
	SongEventHandler sE;

	@Override
	public void handle(ActionEvent arg0) {
		SongEventHandler sE= SongEventHandler.getInstance();
		double currVol= sE.getTune().getV();
		if(currVol<=1 && currVol>0) {
			sE.getTune().setV(currVol-.1);
			
		}

	}

}
