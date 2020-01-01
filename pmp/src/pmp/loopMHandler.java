package pmp;




import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

public class loopMHandler implements EventHandler<ActionEvent> {
	SongEventHandler sE;
	boolean isLoop=false;
	
	

	@Override
	public void handle(ActionEvent arg0) {
		SongEventHandler sE= SongEventHandler.getInstance();
		MediaPlayer curr = sE.getTune().getM();
		if(!this.isLoop) {
			Duration n = curr.getCurrentTime();
			curr.setCycleCount(MediaPlayer.INDEFINITE);
			this.isLoop=true;
		}
		else {
			curr.pause();
			this.isLoop=false;
			
			curr.setCycleCount(1);
			curr.play();
			
			
		}

	}

}
