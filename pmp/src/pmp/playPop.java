package pmp;
import java.io.File;

import ca.utoronto.utm.util.Observable;
import ca.utoronto.utm.util.Observer;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class playPop {
	private Stage stage;
	private SongEventHandler derp;
	private Label aN;
	private Label sN;
	
	playPop(){
		SongEventHandler derp = SongEventHandler.getInstance();
		
		
		//major layout of popup 
		VBox major = new VBox();
		
		
		//make non changing text labels 
		 Label alterSpeed= new Label("                   Alter Speed");
		 alterSpeed.setFont( Font.font("Arial", FontWeight.BOLD,14));
		 alterSpeed.setTextFill(Color.LIGHTPINK);
		 alterSpeed.setPrefSize(230, 30);
		 
		 Label randomS= new Label("          Get Randomized Song");
		 randomS.setPrefSize(230, 10);
		 randomS.setFont( Font.font("Arial", FontWeight.BOLD,14));
		 randomS.setTextFill(Color.LIGHTPINK);
		 
		 //make textfields for the random Song stuff
		 TextField sN= new TextField("Song: ");
		 sN.setEditable(false);
		 sN.setMinHeight(10);
		 sN.setMinWidth(50);
		 
		 TextField aN= new TextField("Artist: ");
		 aN.setEditable(false);
		 aN.setMinHeight(10);
		 aN.setMinWidth(50);
		 
		 // make a text panel
		  VBox tP =new VBox();
		  tP.setMinSize(150,50);
		  tP.setPadding(new Insets(5,5,5,5));
		  tP.getChildren().addAll(sN,aN);
		  
		 // make the randomizer button chooser thing
		  Button randomSongGet= new Button("Get Random Song");
		 
		 // size the button 
		  randomSongGet.setMinSize(225, 30);
		  
		 // set acn of button
		  randomSongGet.setOnAction(new RandomSongHandler(aN, sN));
		  
		  
		 // make set random song button
		  Button setRandom= new Button("Set Random Song");
		  
		 // size the button 
		  setRandom.setMinSize(225, 30);
		 
		 // set acn of button
		  setRandom.setOnAction(new selectionRandomHandler(aN, sN));
		
		
		 
		
		
		//make them button panel
		HBox s= new HBox();
		s.setPrefSize(75,45);
		Scene sc = new Scene(major,235, 230);
		//System.out.println(sc.getWidth());
		s.setPadding(new Insets(5,0,0,0));
		major.setPadding(new Insets(5,0,0,5));
		this.stage=new Stage();
		
		//speed buttons
		Button S1= new Button("Slow Down");
		Button S2= new Button("Speed Up");
		Button S3= new Button("Reset Speed");
		
		//set size for them 
		S1.setMinSize(25, 30);
		S2.setMinSize(25, 30);
		S3.setMinSize(25, 30);
		
		
		// set up acn for playback buttons 
		S1.setOnAction(new slowDownHandler());
		S2.setOnAction(new speedUpHandler());
		S3.setOnAction(new reSetHandler());
		
		// add them buttons
		s.getChildren().addAll(S1,S2,S3);
		
		// add button panel
		major.getChildren().addAll(alterSpeed,s,randomS,randomSongGet,tP,setRandom);
		
		
		
		
		
		
		this.stage.setScene(sc);
		Image p = new Image((new File("assets" + File.separator + "alterschemelogo.png")).toURI().toString());
		stage.getIcons().add(p);
		stage.setTitle("Extras");
		stage.setResizable(false);
		
	}
	public void show() {
		stage.show();
	}
	public void close() {
		stage.close();
	
	}
	

}
