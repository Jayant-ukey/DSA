package ageneral.custom_class;

public class Song {
	
	private String name;
	private String artist;
	private Integer year;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getArtist() {
		return this.artist;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public Integer getYear() {
		return this.year;
	}
	
	public void setYear(Integer year) {
		this.year = year;
	}
	
	Song(String name, String artist, Integer year){
		this.name = name;
		this.artist = artist;
		this.year = year;
	}
	
	//When we are printing the Song class at that time we doesn't want reference object. We want the content hence we are overriding String method.
	public String toString() {
		return "name : "+this.name+", artist: "+this.artist+", year: "+this.year;
	}

}
