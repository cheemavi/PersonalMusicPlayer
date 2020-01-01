package pmp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.media.MediaPlayer;

public class muteHandler implements EventHandler<ActionEvent> {
	SongEventHandler sE;
	int counter=0;
	double pausedVol=0;

	@Override
	public void handle(ActionEvent arg0) {
		SongEventHandler sE= SongEventHandler.getInstance();
		if(counter%2==0 && sE.getTune().getV()!=0) {
			pausedVol=sE.getTune().getV();
			sE.getTune().setV(0);
			counter++;
		}
		else {
			sE.getTune().setV(pausedVol);
			counter++;
		}
		
			
		}

	}


