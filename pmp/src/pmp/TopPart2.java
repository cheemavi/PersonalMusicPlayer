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

public class TopPart2 extends HBox{
	
	Text Artist;
	
	public TopPart2() {
		
		this.Artist= new Text("Artist");
		this.Artist.setFont( Font.font("Arial",20));
		this.Artist.setFill(Color.LIGHTPINK);
		this.getChildren().addAll(Artist);
		
	
		
		
		
		
		
	}
	public String getT() {
		return Artist.getText();
		
	}
	public void setT(String s) {
		 Artist.setText(s);
	
	}
	
	
}
