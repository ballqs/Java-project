package 문제8;

public class Phone {
	//멤버변수
	private String name;
	private String tel;
	
	//생성자 -> set()메소드
	Phone(String name, String tel){
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	
}
