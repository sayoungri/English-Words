package st.wordbook.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * 파일 불러오기, 저장하기 창
 * 
 * @author 권송현
 */
public class NavFrame extends JFrame implements ActionListener {
   
   public NavFrame() {
      super("파일 탐색기");
      setSize(730,550);
      setLocationRelativeTo(null);
      setResizable(false);
      
<<<<<<< HEAD
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
=======
		//송현
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		JLabel label1 = new JLabel("검색위치: ");
		label1.setBounds(10,10,60,50);
		
		JTextField input = new JTextField();
		input.setBounds(70, 10, 530, 40);
		
//		JButton input = new JButton("new button");
//		input.setBounds(70, 10, 530, 40);
		
		JButton btn = new JButton("Browser");
		btn.setBounds(610, 10, 100, 40);
		
		JTextArea area = new JTextArea();
		area.setBounds(10, 70,700, 320);
		JScrollPane scrollPane = new JScrollPane(area);
		
		JLabel label2 = new JLabel("파일 이름: ");
		label2.setBounds(10,410,70,50);
		
		JTextField input2 = new JTextField();
		input2.setBounds(80, 420, 500, 30);
		
		JLabel label3 = new JLabel("파일 종류: ");
		label3.setBounds(10,450,70,50);
		
		JTextField input3 = new JTextField();
		input3.setBounds(80, 460, 500, 30);
		
		JButton openbtn = new JButton("열기");
		openbtn.setBounds(600, 420, 90, 30);
		
		JButton savebtn = new JButton("저장");
		savebtn.setBounds(600, 460, 90, 30);
		
		add(label1);
		add(input);
		add(btn);
		add(area);
		add(label2);
		add(input2);
		add(label3);
		add(input3);
		add(openbtn);
		add(savebtn);
		
		

	}
>>>>>>> 07ce2a2289db9b6818384c19f5e6a8d7e7e228c6

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

}