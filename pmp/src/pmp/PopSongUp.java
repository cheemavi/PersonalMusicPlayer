package pmp;

import java.io.File;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
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
		//make a random scroll bar to test
		
		VBox songL= new VBox();
		songL.setPrefSize(250, 1000);
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setContent(songL);
		Scene scene = new Scene(scrollPane,260, 200);
		scrollPane.pannableProperty().set(true);
		scrollPane.hbarPolicyProperty().setValue(ScrollPane.ScrollBarPolicy.NEVER);
		scrollPane.vbarPolicyProperty().setValue(ScrollPane.ScrollBarPolicy.ALWAYS);
		scrollPane.fitToWidthProperty().set(true);
		scrollPane.fitToHeightProperty().set(true);
		this.stage=new Stage();
		this.stage.setResizable(false);
		Button S1= new Button("1");
		Button S2= new Button("2");
		Button S3= new Button("3");
		Button S4= new Button("4");
		Button S5= new Button("5");
		Button S6= new Button("6");
		Button S7= new Button("7");
		Button S8= new Button("8");
		Button S9= new Button("9");
		Button S10= new Button("10");
		
		// set them widths 
		S1.setMinSize(230, 50);
		S2.setMinSize(230, 50);
		S3.setMinSize(230, 50);
		S4.setMinSize(230, 50);
		S5.setMinSize(230, 50);
		S6.setMinSize(230, 50);
		S7.setMinSize(230, 50);
		S8.setMinSize(230, 50);
		S9.setMinSize(230, 50);
		S10.setMinSize(230, 50);
		
		// Making them images
		Image song1 =   new Image((new File("assets" + File.separator + "song1.png")).toURI().toString());
		Image song2 =   new Image((new File("assets" + File.separator + "SONG2.png")).toURI().toString());
		Image song3 =   new Image((new File("assets" + File.separator + "SONG3.png")).toURI().toString());
		Image song4 =  new Image((new File("assets" + File.separator + "SONG4.png")).toURI().toString());
		Image song5 =   new Image((new File("assets" + File.separator + "SONG5.png")).toURI().toString());
		Image song6 =   new Image((new File("assets" + File.separator + "dc.png")).toURI().toString());
		Image song7 =   new Image((new File("assets" + File.separator + "Fg.png")).toURI().toString());
		Image song8 =   new Image((new File("assets" + File.separator + "wa.png")).toURI().toString());
		Image song9 =   new Image((new File("assets" + File.separator + "shm.png")).toURI().toString());
		Image song10 =   new Image((new File("assets" + File.separator + "ping.png")).toURI().toString());
		
		// create the image views 
		ImageView songO=new ImageView(song1);
		ImageView songT=new ImageView(song2);
		ImageView songTh=new ImageView(song3);
		ImageView songF=new ImageView(song4);
		ImageView songFi=new ImageView(song5);
		ImageView songSi=new ImageView(song6);
		ImageView songSev=new ImageView(song7);
		ImageView songEight=new ImageView(song8);
		ImageView songNine=new ImageView(song9);
		ImageView songTen=new ImageView(song10);
		
		// image view sizing 
		songO.setFitHeight(50);
		songO.setFitWidth(220);
		
		songT.setFitHeight(50);
		songT.setFitWidth(220);
		
		songTh.setFitHeight(50);
		songTh.setFitWidth(220);
		
		songF.setFitHeight(50);
		songF.setFitWidth(220);
		
		songFi.setFitHeight(50);
		songFi.setFitWidth(220);
		
		songSi.setFitHeight(50);
		songSi.setFitWidth(220);
		
		songSev.setFitHeight(50);
		songSev.setFitWidth(220);
		
		songEight.setFitHeight(50);
		songEight.setFitWidth(220);
		
		songNine.setFitHeight(50);
		songNine.setFitWidth(220);
		
		songTen.setFitHeight(50);
		songTen.setFitWidth(220);
		
		
		
		
		// setting graphics for buttons 
		S1.setGraphic(songO);
		S2.setGraphic(songT);
		S3.setGraphic(songTh);
		S4.setGraphic(songF);
		S5.setGraphic(songFi);
		S6.setGraphic(songSi);
		S7.setGraphic(songSev);
		S8.setGraphic(songEight);
		S9.setGraphic(songNine);
		S10.setGraphic(songTen);
		
	
	
		// set them button handlers
		S1.setOnAction(derp);
		S2.setOnAction(derp);
		S3.setOnAction(derp);
		S4.setOnAction(derp);
		S5.setOnAction(derp);
		S6.setOnAction(derp);
		S7.setOnAction(derp);
		S8.setOnAction(derp);
		S9.setOnAction(derp);
		S10.setOnAction(derp);

		
		S1.setStyle("-fx-background-color:#ffc2c2 ");
		S2.setStyle("-fx-background-color: #ffc2c2 ");
		S3.setStyle("-fx-background-color: #ffc2c2 ");
		S4.setStyle("-fx-background-color: #ffc2c2 ");
		S5.setStyle("-fx-background-color: #ffc2c2 ");
		S6.setStyle("-fx-background-color: #ffc2c2 ");
		S7.setStyle("-fx-background-color: #ffc2c2 ");
		S8.setStyle("-fx-background-color: #ffc2c2 ");
		S9.setStyle("-fx-background-color: #ffc2c2 ");
		S10.setStyle("-fx-background-color: #ffc2c2 ");
		
		// adding all them kids
		songL.getChildren().addAll(S1,S2,S3,S4,S5,S6,S7,S8,S9,S10);
		
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
