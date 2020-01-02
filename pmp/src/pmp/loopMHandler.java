package pmp;




import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

public class loopMHandler implements EventHandler<ActionEvent> {
	SongEventHandler sE;
	boolean isLoop=false;
	Duration n= sE.getInstance().getTune().getM().getStartTime();
	
	

	@Override
	public void handle(ActionEvent arg0) {
		SongEventHandler sE= SongEventHandler.getInstance();
		MediaPlayer curr = sE.getTune().getM();
		
		if(!this.isLoop) {
			System.out.println(curr.getCycleCount()+"this");
			curr.setCycleCount(MediaPlayer.INDEFINITE);
			curr.setStartTime(Duration.ZERO);
			this.isLoop=true;
		}
		else {
			n=curr.getCurrentTime();
			curr.stop();
			this.isLoop=false;
			
			curr.setCycleCount(1);
			curr.setStartTime(n);
			System.out.println(curr.getStartTime()+"w");
			curr.play();
			curr.setStartTime(Duration.ZERO);
			
		}

	}

}
