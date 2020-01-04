package pmp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class slowDownHandler implements EventHandler<ActionEvent> {
	SongEventHandler sE;
	@Override
	public void handle(ActionEvent arg0) {
		// slow down song by .1  each time 
		SongEventHandler sE= SongEventHandler.getInstance();
		double currRate= sE.getTune().getR();
		if(currRate>0) {
			sE.getTune().getM().pause();
			sE.getTune().setR(currRate-.1);
			sE.getTune().getM().play();
			
			
		}

	}

}
