package st.wordbook.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 영어단어(String), 영어 단어 한글 뜻들을 담은 String
 * --> new WordsVO() 생성자로 객체 생성
 * --> List<WordsVO>에 추가
 * --> 해당 List<WordsVO> 활용
 * 
 * 각 기능 메소드 (검색 메소드, 파일 입출력 메소드... etc.) 작성
 */
public class WordbookController {
	
	/**
	 * @author 권송현
	 */
	// 파일 입력(읽어들여오기)
	
	// 파일 출력(내보내기)
	
	// txt파일 출력
	
	
	
	/**
	 * @author 김자경
	 */
	// 한영테스트
	
	// 영한테스트
	
	
	
	/**
	 * @author 사영리
	 * - 영리씨 HashMap말구 List(ArrayList)를 이용해서 구현해주세요!
	 */
	// 단어 검색 메소드
	
	// 단어 추가 메소드

	// 단어 삭제 메소드
	
	Scanner sc = new Scanner(System.in);
	
	HashMap<String, String> map = new HashMap<String, String>();
	
	public void saveWords(String w, String m) {
		map.put(w, m);
		
	}
	public void inputWords() {
		System.out.print("단어: ");
		String w =sc.nextLine();
		System.out.print("뜻: ");
		String m = sc.nextLine();
		saveWords(w,m);
		
	}
	
	public Map<String, String> printwords(){
		return map;
	}
	
}
