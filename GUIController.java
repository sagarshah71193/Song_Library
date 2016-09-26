package GUI;

import java.util.*;

import javafx.fxml.FXML;

public class GUIController {
	
	public class Song{
		String name;
		String artist;
		String year;
		String album;
		
		public Song(String name, String artist, String year, String album){
			this.name = name;
			this.artist = artist;
			this.year = year;
			this.album = album;
		}
		
		public void setName(String s){
			name = s;
		}
		public void setArtist(String s){
			artist = s;
		}
		public void setYear (String s){
			year = s;
		}
		public void setAlbum(String s){
			album = s;
		}
		public String getName(){
			return name;
		}
		public String getArtist(){
			return artist;
		}
		public String getYear(){
			return year;
		}
		public String getAlbum(){
			return album;
		}
	}


}
