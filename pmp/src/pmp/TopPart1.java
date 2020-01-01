package pmp;

import ca.utoronto.utm.util.Observable;
import ca.utoronto.utm.util.Observer;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class TopPart1 extends HBox{
	
	Text Song;
	
	public TopPart1() {
		
		Song= new Text("Song Title");
		Song.setFont( Font.font("Arial", FontWeight.BOLD,38));
		Song.setFill(Color.LIGHTPINK);
		this.getChildren().addAll(Song);
		
	
		
		
		
		
		
	}
	public String getT() {
		return Song.getText();
		
	}
	public void setT(String s) {
		 Song.setText(s);
	
	}
	
	
}
