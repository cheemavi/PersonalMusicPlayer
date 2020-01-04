package pmp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class reSetHandler implements EventHandler<ActionEvent> {
	SongEventHandler sE;
	@Override
	public void handle(ActionEvent arg0) {
		// reset to default speed
		SongEventHandler sE= SongEventHandler.getInstance();
		sE.getTune().getM().pause();
			sE.getTune().setR(1.0);
			sE.getTune().getM().play();
			
			
			
		

	}

}
