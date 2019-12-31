package pmp;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class TopPart3 extends HBox{
	
	Text album;
	
	public TopPart3() {
		
		album= new Text("Album");
		album.setFont( Font.font("Arial",14));
		album.setFill(Color.LIGHTPINK);
		this.getChildren().addAll(album);
		
	
		
		
		
		
		
	}
	
}
