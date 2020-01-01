package pmp;

import java.io.File;

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
	private SongEventHandler derp;
	
	
	

	PopSongUp(){
		SongEventHandler derp = SongEventHandler.getInstance();
		VBox songL= new VBox();
		Scene scene = new Scene(songL, 250, 250);
		this.stage=new Stage();
		this.stage.setResizable(false);
		Button S1= new Button("1");
		Button S2= new Button("2");
		Button S3= new Button("3");
		Button S4= new Button("4");
		Button S5= new Button("5");
		
		// set them widths 
		S1.setMinSize(230, 50);
		S2.setMinSize(230, 50);
		S3.setMinSize(230, 50);
		S4.setMinSize(230, 50);
		S5.setMinSize(230, 50);
		
		// Making them images
		Image song1 =   new Image((new File("assets" + File.separator + "song1.png")).toURI().toString());
		Image song2 =   new Image((new File("assets" + File.separator + "SONG2.png")).toURI().toString());
		Image song3 =   new Image((new File("assets" + File.separator + "SONG3.png")).toURI().toString());
		Image song4 =  new Image((new File("assets" + File.separator + "SONG4.png")).toURI().toString());
		Image song5 =   new Image((new File("assets" + File.separator + "SONG5.png")).toURI().toString());
		
		// create the image views 
		ImageView songO=new ImageView(song1);
		ImageView songT=new ImageView(song2);
		ImageView songTh=new ImageView(song3);
		ImageView songF=new ImageView(song4);
		ImageView songFi=new ImageView(song5);
		
		// image view sizing 
		songO.setFitHeight(50);
		songO.setFitWidth(235);
		
		songT.setFitHeight(50);
		songT.setFitWidth(235);
		
		songTh.setFitHeight(50);
		songTh.setFitWidth(235);
		
		songF.setFitHeight(50);
		songF.setFitWidth(235);
		
		songFi.setFitHeight(50);
		songFi.setFitWidth(235);
		
		
		// setting graphics for buttons 
		S1.setGraphic(songO);
		S2.setGraphic(songT);
		S3.setGraphic(songTh);
		S4.setGraphic(songF);
		S5.setGraphic(songFi);
	
		// set them button handlers
		S1.setOnAction(derp);
		S2.setOnAction(derp);
		S3.setOnAction(derp);
		S4.setOnAction(derp);
		S5.setOnAction(derp);

		
		S1.setStyle("-fx-background-color:#ffc2c2 ");
		S2.setStyle("-fx-background-color: #ffc2c2 ");
		S3.setStyle("-fx-background-color: #ffc2c2 ");
		S4.setStyle("-fx-background-color: #ffc2c2 ");
		S5.setStyle("-fx-background-color: #ffc2c2 ");
		// adding all them kids
		songL.getChildren().addAll(S1,S2,S3,S4,S5);
		
		stage.setScene(scene);
		stage.setTitle("Song List");
		Image p = new Image((new File("assets" + File.separator + "alterschemelogo.png")).toURI().toString());
		stage.getIcons().add(p);
		

	
	
}
	public void show() {
		stage.show();
	}
	public void close() {
		stage.close();
	
	}
	
}
