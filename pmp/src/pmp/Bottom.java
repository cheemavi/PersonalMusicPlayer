package pmp;

import java.io.File;

import ca.utoronto.utm.util.Observable;
import ca.utoronto.utm.util.Observer;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Bottom  extends HBox {
	Button looping;
	Button playM;
	Button pauseM;
	Button stopM;
	Button mute;
	Button volInc;
	Button volDec;
	Button viewTunes;
	Button idk;
	SongEventHandler songE;
	
	//constructor
	public Bottom() {
		
		SongEventHandler songE = SongEventHandler.getInstance();
		
		//initializing all buttons
		
		Button looping = new Button();
		Button playM = new Button();
		Button pauseM = new Button();
		Button stopM = new Button();
		Button mute = new Button();
		Button volInc = new Button();
		Button volDec = new Button();
		Button viewTunes = new Button();
		Button idk = new Button();
		
		//Set up them handlers 
		 // its getting there
		playM.setOnAction(new playMusicHandler());
		pauseM.setOnAction(new pauseMusicHandler());
		stopM.setOnAction(new stopMusicHandler());
		volInc.setOnAction(new volIncreaseHandler());
		volDec.setOnAction(new volDecHandler());
		mute.setOnAction(new muteHandler());
		looping.setOnAction(new loopMHandler());
		viewTunes.setOnAction(new PopUpHandler(new PopSongUp()));
		
		//spacing of Buttons
		
		looping.setMinSize(50,40);
		viewTunes.setMinSize(50,40);
		idk.setMinSize(50,40);
		stopM.setMinSize(62,40);
		pauseM.setMinSize(62,40);
		playM.setMinSize(75,55);
		volInc.setMinSize(50,40);
		volDec.setMinSize(50,40);
		mute.setMinSize(50,40);
		
		// Create all them images
		
		Image loopM = new Image((new File("assets" + File.separator + "loopMusic.png")).toURI().toString());
		Image songs =  new Image((new File("assets" + File.separator + "SONGLIST.png")).toURI().toString());
		Image muteP =  new Image((new File("assets" + File.separator + "mute.png")).toURI().toString());
		Image pauseP =  new Image((new File("assets" + File.separator + "pauseM.png")).toURI().toString());
		Image PL =  new Image((new File("assets" + File.separator + "PLACEHOLDER.png")).toURI().toString());
		Image playP =  new Image((new File("assets" + File.separator + "playM.png")).toURI().toString());
		Image stopP =  new Image((new File("assets" + File.separator + "stopMusic.png")).toURI().toString());
		Image volD =  new Image((new File("assets" + File.separator + "vd.png")).toURI().toString());
		Image volI =  new Image((new File("assets" + File.separator + "volincrease.png")).toURI().toString());
		
		// Create them imageViews
		
		ImageView loopView=new ImageView(loopM);
		ImageView songView=new ImageView(songs);
		ImageView muteView=new ImageView(muteP);
		ImageView pauseView=new ImageView(pauseP);
		ImageView PLView=new ImageView(PL);
		ImageView playView=new ImageView(playP);
		ImageView stopView=new ImageView(stopP);
		ImageView volDView=new ImageView(volD);
		ImageView volIView=new ImageView(volI);
		
		// imageView Sizing
		loopView.setFitHeight(40);
		loopView.setFitWidth(40);
		
		songView.setFitHeight(40);
		songView.setFitWidth(40);
		
		PLView.setFitHeight(40);
		PLView.setFitWidth(40);
		
		volDView.setFitHeight(40);
		volDView.setFitWidth(40);
		
		volIView.setFitHeight(40);
		volIView.setFitWidth(40);
		
		muteView.setFitHeight(40);
		muteView.setFitWidth(40);
		
		pauseView.setFitHeight(50);
		pauseView.setFitWidth(40);

		stopView.setFitHeight(50);
		stopView.setFitWidth(40);
		
		playView.setFitHeight(65);
		playView.setFitWidth(55);
		// add them button graphics 
		
		looping.setGraphic(loopView);
		viewTunes.setGraphic(songView);
		idk.setGraphic(PLView);
		stopM.setGraphic(stopView);
		playM.setGraphic(playView);
		pauseM.setGraphic(pauseView);
		volInc.setGraphic(volIView);
		volDec.setGraphic(volDView);
		mute.setGraphic(muteView);
		
		// get rid of outline 
		
		looping.setStyle("-fx-background-color: transparent");
		viewTunes.setStyle("-fx-background-color: transparent");
		idk.setStyle("-fx-background-color: transparent");
		stopM.setStyle("-fx-background-color: transparent");
		playM.setStyle("-fx-background-color: transparent");
		pauseM.setStyle("-fx-background-color: transparent");
		volInc.setStyle("-fx-background-color: transparent");
		volDec.setStyle("-fx-background-color: transparent");
		mute.setStyle("-fx-background-color: transparent");
		
		// add all buttons to Bottom
		this.getChildren().addAll(looping,viewTunes,idk, stopM,playM,pauseM,volInc,volDec,mute);
		
		
		
		
	
	}
	
	
	
}
