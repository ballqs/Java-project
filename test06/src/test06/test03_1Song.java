package test06;

public class test03_1Song{
	private String title[];
	private String artist;
	private int year;
	private String country;
	public test03_1Song(String title[], String artist, int year, String country){
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	public void show() {
		if(year != 0)
			System.out.println(year+"년 "+country+"국적의 "+artist+"가 부른 "+title[0]);
		else
			System.out.println("값이 들어있지 않습니다.");
	}
}
