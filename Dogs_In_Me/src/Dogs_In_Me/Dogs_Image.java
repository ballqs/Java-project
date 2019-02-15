package Dogs_In_Me;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Dogs_Image extends JFrame {
 private JPanel contentPane;
 private JTextField txtUrl;
 private JButton btnNewButton;
 private JTextField textField_1;
 
 String str_defaultSavePosition ="D:/2-D/Dogs_In_Me/Image/";
 String str_SavedImagePosition = "";
 
 boolean b_saving = false;
 /**
  * Launch the application.
  */
 /**
  * Create the frame.
  */
 public Dogs_Image() {
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setBounds(100, 100, 450, 300);
  contentPane = new JPanel();
  contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
  setContentPane(contentPane);
  contentPane.setLayout(null);
  
  JButton btn1 = new JButton("이미지 다운");
  btn1.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseClicked(MouseEvent e) {
    
    if(!b_saving) {
     b_saving = true;
     
     if(downloadImage()) {
      chageImageOfButton();
     } else {
      JOptionPane.showMessageDialog(Dogs_Image.this, "저장이 완료되지 않았습니다. 다시 시도하세요.");
     }
     
     b_saving = false;
     
    } else {
     JOptionPane.showMessageDialog(Dogs_Image.this, "이미지를 저장 중입니다.");
    }
    
   }
  });
  btn1.setBounds(280, 11, 126, 53);
  contentPane.add(btn1);
  
  txtUrl = new JTextField();
  txtUrl.setText("URL");
  txtUrl.setBounds(12, 12, 256, 21);
  contentPane.add(txtUrl);
  txtUrl.setColumns(10);
  
  btnNewButton = new JButton("그림");
  btnNewButton.setBounds(12, 85, 394, 167);
  contentPane.add(btnNewButton);
  
  textField_1 = new JTextField();
  textField_1.setText("저장할 파일명");
  textField_1.setBounds(12, 43, 256, 21);
  contentPane.add(textField_1);
  textField_1.setColumns(10);
 }
 
 boolean downloadImage () {
  
  //테스트용 url : http://www.keenthemes.com/preview/metronic/theme/assets/global/plugins/jcrop/demos/demo_files/image1.jpg
  
  URL url = null;
  BufferedInputStream bis = null;
  BufferedOutputStream bos = null;
  
  boolean b_saved = false;
  
  try {
   url = new URL(txtUrl.getText().trim());
   
   bis = new BufferedInputStream(url.openStream());
   str_SavedImagePosition = str_defaultSavePosition + textField_1.getText().trim(); // 저장위치 + 파일명
   
   if(textField_1.getText().endsWith(".jpg")){  // jpg 확장자 붙이기
    str_SavedImagePosition += ".jpg";
    bos = new BufferedOutputStream(new FileOutputStream(str_SavedImagePosition));
    
    int data = 0;
    
    while((data = bis.read()) != -1) {
     bos.write(data);
    }
    
//    System.out.println(".jpg 이미지 저장 완료 " + data);
    b_saved = true;
    
   } else if(textField_1.getText().endsWith(".png")) {// png 확장자 붙이기
    str_SavedImagePosition += ".png";
    bos = new BufferedOutputStream(new FileOutputStream(str_SavedImagePosition));
    
    int data = 0;
    
    while((data = bis.read()) != -1) {
     bos.write(data);
    }
    
//    System.out.println(".png 이미지 저장 완료 " + data);
    b_saved = true;
   } else {
    JOptionPane.showMessageDialog(Dogs_Image.this, "png 와 jpg 만 저장할 수 있습니다.");
    
    b_saved = false;
   }
   
  } catch (MalformedURLException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  } catch (FileNotFoundException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  } catch (IOException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
  
  return b_saved;
  
 }
 
 void chageImageOfButton () {
  
  ImageIcon icon = new ImageIcon(str_SavedImagePosition);
  
  this.setBounds((int)(this.getBounds().getX()), (int)(this.getBounds().getY()), (int)(icon.getIconWidth()) + 300, (int)(icon.getIconHeight()) + 300);
  
  btnNewButton.setBounds((int)(btnNewButton.getBounds().getX()), (int)(btnNewButton.getBounds().getY()), (int)(icon.getIconWidth()), (int)(icon.getIconHeight()));
  
  btnNewButton.setIcon(icon);
 }
}

