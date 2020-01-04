package pmp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class speedUpHandler implements EventHandler<ActionEvent> {
	SongEventHandler sE;
	@Override
	public void handle(ActionEvent arg0) {
		// speed up the song by .1 each time 
		SongEventHandler sE= SongEventHandler.getInstance();
		double currRate= sE.getTune().getR();
		if(currRate<=2.5) {
			sE.getTune().getM().pause();
			sE.getTune().setR(currRate+.1);
			sE.getTune().getM().play();
			
			
		}

	}

}
