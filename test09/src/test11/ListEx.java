package test11;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ListEx extends JFrame {
	private String [] fruits= {"apple", "banana", "kiwi", "mango", "pear",
									"peach", "berry", "strawberry", "blackberry"};
	private ImageIcon [] images = { 
									new ImageIcon("images/apple.jpg"),
									new ImageIcon("images/banana.jpg"),
									new ImageIcon("images/cherry.jpg") };
	private ArrayList<ImageIcon> imageList = new ArrayList<ImageIcon>();
	public JList list;
	public ListEx() {
		setTitle("리스트 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JList<String> strList = new JList<String>(fruits);
		c.add(strList);
		for(int i=0; i<images.length; i++) {
			images[i] = new ImageIcon(images[i].getImage().
					getScaledInstance(30, 30, Image.SCALE_DEFAULT));
			//이미지를 리사이즈 한다음에 변수에 집어넣는다.
		}
		for(int i=0; i<images.length; i++) {
			imageList.add(images[i]);
		}
		list = new JList(imageList.toArray());
		c.add(list);
		//JList<ImageIcon> imageList = new JList<ImageIcon>(images); 
		//imageList.setListData(images);
		//나중에 선언을 안했을때 통으로 넣는다.
		//c.add(imageList);
		
		JList<String> scrollList = new JList<String>(fruits); 
		c.add(new JScrollPane(scrollList)); 

		setSize(300,300);
		setVisible(true);
	}
	public static void main(String [] args) {
		new ListEx();
	}
}