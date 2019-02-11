package test06;

public class Test10_Dictionary {
	private static String [] kor = {"»ç¶û","¾Æ±â","µ·","¹Ì·¡","Èñ¸Á"};
	private static String [] eng = {"love","baby","money","future","hope"};
	public static String kor2Eng(String word) {
		for(int i=0; i<kor.length; i++) {
			if(kor[i].equals(word)) {
				word = eng[i];
				break;
			}else if(!kor[i].equals(word) && i==kor.length-1) {
				System.out.println(word+"´Â ÀúÀÇ »çÀü¿¡ ¾ø½À´Ï´Ù.");
			}
		}
		return word;
	}
}
