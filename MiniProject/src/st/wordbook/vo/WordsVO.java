package st.wordbook.vo;

/**
 * 객체리스트 형태로 사용 예정 (List<WordsVO>)
 * 
 * 수정 노노! 수정 필요할시 톡주세요~
 */
public class WordsVO {
	// String word, String meaning --> meaning 여러 뜻일 경우 ','로 구분해 입력하도록 사용자에 요구 --> JLabel이용해 표시
	private String word;
	private String meaning;
	
	public WordsVO() {
		super();
	}

	public WordsVO(String word, String meaning) {
		super();
		this.word = word;
		this.meaning = meaning;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	@Override
	public String toString() {
		return "영어단어=" + word + ", 뜻=" + meaning;
	}
}
