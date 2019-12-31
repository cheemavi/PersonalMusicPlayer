package pmp;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class PopSongUp {
	private Stage stage;
	private Button S1;
	private Button S2;
	private Button S3;
	private Button S4;
	private Button S5;
	private TuneCommand  a = new TuneCommand();
	

	PopSongUp(){
		VBox songL= new VBox();
		Scene scene = new Scene(songL, 250, 250);
		this.stage=new Stage();
		this.stage.setResizable(false);
		Button S1= new Button();
		Button S2= new Button();
		Button S3= new Button();
		Button S4= new Button();
		Button S5= new Button();
		
		// set them widths 
		S1.setMinSize(250, 50);
		S2.setMinSize(250, 50);
		S3.setMinSize(250, 50);
		S4.setMinSize(250, 50);
		S5.setMinSize(250, 50);
		
		// Making them images
		Image song1 =  new Image(musicApplication.class.getResourceAsStream("song1.png"));
		Image song2 =  new Image(musicApplication.class.getResourceAsStream("SONG2.png"));
		Image song3 =  new Image(musicApplication.class.getResourceAsStream("SONG3.png"));
		Image song4 =  new Image(musicApplication.class.getResourceAsStream("SONG4.png"));
		Image song5 =  new Image(musicApplication.class.getResourceAsStream("SONG5.png"));
		
		// create the image views 
		ImageView songO=new ImageView(song1);
		ImageView songT=new ImageView(song2);
		ImageView songTh=new ImageView(song3);
		ImageView songF=new ImageView(song4);
		ImageView songFi=new ImageView(song5);
		
		// image view sizing 
		songO.setFitHeight(50);
		songO.setFitWidth(250);
		
		songT.setFitHeight(50);
		songT.setFitWidth(250);
		
		songTh.setFitHeight(50);
		songTh.setFitWidth(250);
		
		songF.setFitHeight(50);
		songF.setFitWidth(250);
		
		songFi.setFitHeight(50);
		songFi.setFitWidth(250);
		
		
		// setting graphics for buttons 
		S1.setGraphic(songO);
		S2.setGraphic(songT);
		S3.setGraphic(songTh);
		S4.setGraphic(songF);
		S5.setGraphic(songFi);
	
		// set them button handlers
		S1.setOnAction(new SongEventHandler(a));
		
		// adding all them kids
		songL.getChildren().addAll(S1,S2,S3,S4,S5);
		
		stage.setScene(scene);
		stage.setTitle("Song List");
		Image p =  new Image(musicApplication.class.getResourceAsStream("alterschemelogo.png"));
		stage.getIcons().add(p);
		

	
	
}
	public void show() {
		stage.show();
	}
	public void hide() {
		stage.hide();
		
		
	}
}
