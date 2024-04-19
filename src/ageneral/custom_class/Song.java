package ageneral.custom_class;

//We are sorting this Song class.
//If we check Collections.sort(), then sort method is only applicable to those data type which implements Comparable interface.
//That's why we are implementing Comparable interface and passing Song as a type.(We can pass type as T also. But in that case in compareTo method we need to pass same)
//after implementing this COmparable interface we need to override compareTo method.
public class Song implements Comparable<Song>{
	
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

	//Sorting base on year
	/*
	 * public int compareTo(Song anotherSong) {
	 * 
	 * //If current object is greater than given object return positive
	 * if(this.getYear() > anotherSong.getYear()) return +1;
	 * 
	 * else if (this.getYear() < anotherSong.getYear()) return -1;
	 * 
	 * return 0; }
	 */
	
	public int compareTo(Song anotherSong) {
		//Compare on the basis of Name value. It will call compareTo method of String Class.
		//Return +ve -> "x".compareTo("a") i.e. current object is greater than given/specified object.
		//If you want to sort it in descending order then you can put minus sign.
		return this.getName().compareTo(anotherSong.getName());
	}
}
