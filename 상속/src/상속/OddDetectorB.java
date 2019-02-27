package »ó¼Ó;
abstract class OddDetector{
	protected int n;
	public OddDetector(int n) {
		this.n = n;
	}
	public abstract boolean isOdd();
}
public class OddDetectorB extends OddDetector{
	public OddDetectorB(int n) {
		super(n);
	}
	public static void main(String[] args) {
		OddDetectorB b = new OddDetectorB(10);
		System.out.println(b.isOdd());
	}
	@Override
	public boolean isOdd() {
		if(n%2==1) {
			return true;
		}else {
			return false;			
		}
	}

}
