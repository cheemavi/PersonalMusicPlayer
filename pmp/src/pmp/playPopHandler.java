package pmp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class playPopHandler implements EventHandler<ActionEvent>{
	

	/**
	 * Handles executing the pop up to set the custom time per player feature
	 *
	 */
	private playPop p;
	
	

	public playPopHandler(playPop p) {
		this.p = p;
		
	}

	@Override
	/**
	 * Upon 'Time' button being clicked,  the pop up for setting custom playing
	 * duration for players is shown to player.
	 * @param arg0
	 *
	 */
	public void handle(ActionEvent arg0) {
		p.show();
		
	}

}
