public class Word {
    private String word;
    private int count;

    // 생성자: 단어를 저장하고 횟수를 1로 초기화
    public Word(String word) {
        this.word = word;
        this.count = 1;
    }

    // 단어 횟수 1 증가
    public void increaseCount() {
        count++;
    }

    // 저장된 단어와 전달받은 문자열이 같은지 확인
    public boolean equals(String s) {
        return word.equals(s);
    }

    // "단어 문자열: 횟수" 형태로 반환
    @Override
    public String toString() {
        return word + ": " + count;
    }
}

