package st.wordbook.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

/**
 * 한영테스트, 영한테스트 창
 * 
 * @author 김자경
 */
public class EngTestFrame extends JFrame {
	
	// TODO "테스트시작"버튼(startBtn), "정답제출"버튼(submitBtn) 이벤트리스너 바인딩
	// TODO 문제 - List내 단어 랜덤 출력(메소드, 이벤트리스너 바인딩)
	// TODO 답안 - 작성한 답안과 List에서 단어 뜻 일치하는지 체크(메소드, 이벤트리스너 바인딩)
	// TODO 맞은 수, 틀린 수, 푼 문제수 카운트(메소드, 이벤트리스너 바인딩)
	
	private JTextField ansField;

	public EngTestFrame() {
		super("영어 테스트");
		setSize(450, 550);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JPanel pnTop = new JPanel();
		pnTop.setBounds(31, 35, 365, 245);
		pnTop.setBorder(new LineBorder(Color.BLACK));
		pnTop.setLayout(null);
		
		getContentPane().add(pnTop);
		
		JLabel testLbl1 = new JLabel("문제 : ");
		testLbl1.setBounds(49, 60, 54, 22);
		testLbl1.setFont(new Font("Gulim", Font.PLAIN, 18));
		pnTop.add(testLbl1);
		
		JLabel question = new JLabel("(문제)");
		question.setBounds(120, 60, 193, 22);
		question.setFont(new Font("Gulim", Font.PLAIN, 18));
		question.setHorizontalAlignment(JLabel.CENTER);
		pnTop.add(question);
		
		JLabel testLbl2 = new JLabel("답안 : ");
		testLbl2.setBounds(49, 120, 54, 22);
		testLbl2.setFont(new Font("Gulim", Font.PLAIN, 18));
		pnTop.add(testLbl2);
		
		ansField = new JTextField();
		ansField.setBounds(120, 117, 193, 28);
		ansField.setFont(new Font("Gulim", Font.PLAIN, 18));
		ansField.setColumns(20);
		pnTop.add(ansField);
		
		JButton startBtn = new JButton("테스트 시작");
		startBtn.setBounds(32, 197, 131, 31);
		startBtn.setFont(new Font("Gulim", Font.PLAIN, 18));
		pnTop.add(startBtn);
		
		JButton submitBtn = new JButton("정답 제출");
		submitBtn.setBounds(200, 197, 131, 31);
		submitBtn.setFont(new Font("Gulim", Font.PLAIN, 18));
		pnTop.add(submitBtn);
		
		JPanel pnBottom = new JPanel();
		pnBottom.setBounds(31, 299, 365, 158);
		pnBottom.setLayout(null);
		pnBottom.setBorder(new LineBorder(Color.BLACK));
		getContentPane().add(pnBottom);
		
		JLabel correctLbl = new JLabel("맞은 수 : ");
		correctLbl.setBounds(123, 31, 78, 22);
		correctLbl.setFont(new Font("Gulim", Font.PLAIN, 18));
		pnBottom.add(correctLbl);
		
		JLabel wrongLbl = new JLabel("틀린 수 : ");
		wrongLbl.setBounds(123, 68, 78, 22);
		wrongLbl.setFont(new Font("Gulim", Font.PLAIN, 18));
		pnBottom.add(wrongLbl);
		
		JLabel solveLbl = new JLabel("푼 문제 수 : ");
		solveLbl.setBounds(99, 105, 102, 22);
		solveLbl.setFont(new Font("Gulim", Font.PLAIN, 18));
		pnBottom.add(solveLbl);
		
		JLabel correctNum = new JLabel("0");
		correctNum.setBounds(212, 31, 94, 22);
		correctNum.setFont(new Font("Gulim", Font.PLAIN, 18));
		pnBottom.add(correctNum);
		
		JLabel wrongNum = new JLabel("0");
		wrongNum.setBounds(212, 68, 94, 22);
		wrongNum.setFont(new Font("Gulim", Font.PLAIN, 18));
		pnBottom.add(wrongNum);
		
		JLabel solveNum = new JLabel("0");
		solveNum.setBounds(212, 105, 94, 22);
		solveNum.setFont(new Font("Gulim", Font.PLAIN, 18));
		pnBottom.add(solveNum);
		
	}
}
