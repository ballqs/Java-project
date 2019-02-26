package 영화티켓구매시스템;

public class movielist {
	private int ticketnumber,price;
	private String moviename,seat,time;
	public movielist(int ticketnumber,String moviename,int price,String seat, String time) {
		this.ticketnumber = ticketnumber;
		this.price = price;
		this.moviename = moviename;
		this.seat = seat;
		this.time = time;
	}
	public int getTicketnumber() {
		return ticketnumber;
	}
	public void setTicketnumber(int ticketnumber) {
		this.ticketnumber = ticketnumber;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public String getSeat() {
		return seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
}
