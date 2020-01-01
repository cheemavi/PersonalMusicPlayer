package pmp;

import java.io.File;

import ca.utoronto.utm.util.Observable;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;


public class TuneCommand extends Observable{
 String fileName;
 MediaPlayer m;
 String songName;
 String Artist;

 
 public TuneCommand() {
		
		this.fileName = "NoSound.mp3";
		this.m = this.createPlayer(fileName);
		this.songName = "NO SOUND";
		Artist = "N/A";
		
	}
 
public TuneCommand(String fileName, String songName, String artist, String album) {
	
	this.fileName = fileName;
	this.m = this.createPlayer(fileName);
	this.songName = songName;
	Artist = artist;
	
}

public MediaPlayer createPlayer(String fileName) {
	
	File file = new File("assets"+File.separator+fileName);
	Media med = new Media(file.toURI().toString());
	MediaPlayer s = new MediaPlayer(med);
	s.setVolume(0.1);//default volume 
	return s;
}

public MediaPlayer getM() {
	return m;
}
public double getV() {
	return this.m.getVolume();
}
public void setV(double num) {
	this.m.setVolume(num);
}

public void setM(MediaPlayer m) {
	this.m=m;
	this.notifyObservers();
}
public void setfileName(String s) {
	this.fileName= s+".mp3";
	this.notifyObservers();
	
	
}
public String getfileName() {
	return this.fileName;
	
	
}
public void setSongName(String s) {
	this.songName=s;
	this.notifyObservers();
	
}
public String getSongName() {
	return this.songName;
	
}
public void setArtist(String s) {
	this.Artist=s;
	//System.out.println("I am being called");
	this.notifyObservers();
	
	
	
}

public String getArtist() {
	return this.Artist;
	
	
}




}
