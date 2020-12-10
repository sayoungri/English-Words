package st.wordbook.view;

import javax.swing.JFrame;

/**
 * GUI창 코드 작성하는 곳 - 사영리씨 담당
 * 
 * 메인, 상단바, 테스트, 파일 save, open UI
 * 
 * @author 사영리 - 메인프레임 작성하는 곳
 * 
 * 권송현, 김자경 - 사영리씨가 완성한 후, 메인프레임 코드(UI)에 이벤트 핸들링 코드 작성
 */
public class WordbookFrame extends JFrame {
	
	public WordbookFrame() {
		super("영어 단어장");
		setSize(1000, 700);
		setLocationRelativeTo(null);
	}
	
}
