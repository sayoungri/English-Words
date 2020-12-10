package st.wordbook.view;

import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * 파일 불러오기, 저장하기 창
 * 
 * @author 권송현
 */
public class NavFrame extends JFrame {
   
   public NavFrame(int x, int y, int w, int h) {
      super("파일 탐색기");
      setBounds(x, y, w, h);
      
      //송현
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(null);
      
      JLabel label1 = new JLabel("검색위치: ");
      label1.setBounds(10,10,60,50);
      
      JTextField input = new JTextField();
      input.setBounds(70, 10, 200, 40);
      
      JButton btn = new JButton("Browser");
      btn.setBounds(100, 10, 270, 40);
      
      JTextArea area = new JTextArea();
      area.setBounds(10, 70,700, 300);
      
      JLabel label2 = new JLabel("파일 이름: ");
      label2.setBounds(10,410,70,50);
      
      
      JLabel label3 = new JLabel("파일 종류: ");
      label3.setBounds(10,430,70,50);
      
      add(label1);
      add(input);
      add(btn);
      add(area);
      add(label2);
      add(label3);

   }

}