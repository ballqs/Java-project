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
			System.out.println(year+"�� "+country+"������ "+artist+"�� �θ� "+title[0]);
		else
			System.out.println("���� ������� �ʽ��ϴ�.");
	}
}
