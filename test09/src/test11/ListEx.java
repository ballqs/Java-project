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
		setTitle("����Ʈ ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JList<String> strList = new JList<String>(fruits);
		c.add(strList);
		for(int i=0; i<images.length; i++) {
			images[i] = new ImageIcon(images[i].getImage().
					getScaledInstance(30, 30, Image.SCALE_DEFAULT));
			//�̹����� �������� �Ѵ����� ������ ����ִ´�.
		}
		for(int i=0; i<images.length; i++) {
			imageList.add(images[i]);
		}
		list = new JList(imageList.toArray());
		c.add(list);
		//JList<ImageIcon> imageList = new JList<ImageIcon>(images); 
		//imageList.setListData(images);
		//���߿� ������ �������� ������ �ִ´�.
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