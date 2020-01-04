package pmp;
import java.io.File;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class musicApplication extends Application{
	Top topBar;
	Bottom bottomBar;
	

	@Override
	public void start(Stage stage) throws Exception {
		
		//Model
		TuneCommand dF= new TuneCommand();
		
	
		//controller to model hook up  to alter song 
		SongEventHandler song = SongEventHandler.getInstance();
		song.setTune(dF);
		
		
		//creating main layout
		stage.setTitle("Personal Music Player");
		BorderPane mp= new BorderPane();
		
		
		
		//setting up top and bottom bars and the pop up for texts
		topBar = new Top();
		topBar.setPadding(new Insets(5,0,0,5));
		bottomBar = new Bottom();
		
		
		
		// model to view attaching 
		dF.attach(topBar);
		
		
		
		
		// adding bars to the main layout
		mp.setTop(topBar);
		mp.setBottom(bottomBar);
		
		
	
		//Adding the logo center and centering it 
	
		//Image c = new Image((new File("assets" + File.separator + "alterschemelogo.png")).toURI().toString());
		//^get back to image c 
		Image a = new Image((new File("assets" + File.separator + "alterschemelogo.png")).toURI().toString());
		ImageView v= new ImageView(a);
		v.setFitHeight(250);
		v.setFitWidth(250);
		v.setPreserveRatio(true);
		Pane logo = new HBox();
		logo.getChildren().addAll(v);
		logo.setPadding(new Insets(3,0,0,3));
		mp.setCenter(v);
		
		
		
		//creating the main musicplayer scene
		Scene scene = new Scene(mp,520,520, Color.ANTIQUEWHITE); 
		stage.setScene(scene);
		
		//add icon
		stage.getIcons().add(a);
		
		
		// make GUI show 
		stage.setResizable(false);
		stage.show();
	}
	public static void main(String[] args) {
		//musicApplication view = new musicApplication();
		launch(args);
		
	}
}