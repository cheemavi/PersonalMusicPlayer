package pmp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.media.MediaPlayer;

public class playMusicHandler implements EventHandler<ActionEvent> {
MediaPlayer musicPlayer;
	public playMusicHandler(MediaPlayer m) {
		this.musicPlayer=m;
	}

	@Override
	public void handle(ActionEvent e) {
		this.musicPlayer.play();
		/*System.out.println(this.musicPlayer.getCycleCount());
		if(this.musicPlayer.getCycleCount()==1) {
			this.musicPlayer.stop();
			
			this.musicPlayer.setCycleCount(1);
			this.musicPlayer.play();
			this.musicPlayer.setCycleCount(0);
			
		}
		else {
			this.musicPlayer.pause();
			this.musicPlayer.play();
			this.musicPlayer.setCycleCount(1);
		}*/
		

	}

}
