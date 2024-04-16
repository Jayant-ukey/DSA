package ageneral.custom_class;

import java.util.ArrayList;

import ageneral.generic_method.MyUtils;

public class MP4 {
	
	public static void main(String[] args) {
		
		Song song1 = new Song("Take me to your heart", "Micheal", 2014);
		Song song2 = new Song("See you again", "Wiz", 2015);
		Song song3 = new Song("Love me like you", "Ellie", 2013);
		Song song4 = new Song("Just a dream", "Nelly", 2010);
		Song song5 = new Song("As long as you love me", "BackStreet", 2008);

		ArrayList<Song> songList = new ArrayList<>();
		
		songList.add(song1);
		songList.add(song2);
		songList.add(song3);
		songList.add(song4);
		songList.add(song5);

		MyUtils.iterateList(songList);
		
	}

}
