package pmp;

import java.io.File;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class musicApplication extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		Pane b= new HBox();
		Image a =  new Image(musicApplication.class.getResourceAsStream("boo.jpg"));
		ImageView v= new ImageView();
		v.setImage(a);

		b.getChildren().addAll(v);
		Scene scene = new Scene(b); 
		arg0.setScene(scene);
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
