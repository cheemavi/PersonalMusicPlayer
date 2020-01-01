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
 String Album;
 
 public TuneCommand() {
		
		this.fileName = "5.mp3";
		this.m = this.createPlayer(fileName);
		this.songName = "5 SECOND INTRO";
		Artist = "N/A";
		Album = "N/A";
	}
public TuneCommand(String fileName, String songName, String artist, String album) {
	
	this.fileName = fileName;
	this.m = this.createPlayer(fileName);
	this.songName = songName;
	Artist = artist;
	Album = album;
}

public MediaPlayer createPlayer(String fileName) {
	
	File file = new File("pmp" + File.separator+ "assets"+File.separator+fileName);
	Media med = new Media(file.toURI().toString());
	MediaPlayer s = new MediaPlayer(med);
	s.setVolume(0.1);//default volume 
	return s;
}

public MediaPlayer getM() {
	return m;
}
public void setM(MediaPlayer m) {
	this.m=m;
	//this.notifyObservers();
}
public void setfileName(String s) {
	this.fileName= s+".mp3";
	
}
public String getfileName() {
	return this.fileName;
	
}
public void setSongName(String s) {
	this.songName=s;
	//this.notifyAll();
	
}
public String getSongName() {
	return this.songName;
	
}
public void setArtist(String s) {
	this.Artist=s;
	notifyObservers();
	
	
	
}
public String getArtist() {
	return this.Artist;
	
	
}




}
