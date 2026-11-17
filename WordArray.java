
public class WordArray {
    private Word[] words;
    private int count;

    // 배열을 maxCount 크기로 생성
    public WordArray(int maxCount) {
        words = new Word[maxCount];
        count = 0;
    }

    // 단어 추가 또는 횟수 증가
    public void add(String s) {
        for (int i = 0; i < count; i++) {
            if (words[i].equals(s)) {
                words[i].increaseCount();
                return;
            }
        }

        // 새로운 단어라면 새 Word 객체 생성
        if (count < words.length) {
            words[count] = new Word(s);
            count++;
        }
    }

    // 유효한 인덱스의 Word 객체 반환
    public Word get(int idx) {
        if (idx >= 0 && idx < count) {
            return words[idx];
        }
        return null;
    }

    // 현재 저장된 단어 종류의 개수 반환
    public int getCount() {
        return count;
    }
}
