
public class WordsCounter {
    private String text;
    private char[] delimiters;
    private WordArray words;

    // 생성자: 텍스트와 특수 문자 배열 저장
    public WordsCounter(String text, char[] delimiters) {
        this.text = text;
        this.delimiters = delimiters;

        // 텍스트의 단어를 모두 저장할 수 있도록 배열 생성
        words = new WordArray(text.length() + 1);

        // 처음 전달받은 텍스트 처리
        splitWords(text);
    }

    // 저장된 단어가 있는지 확인
    public boolean hasWords() {
        return words.getCount() > 0;
    }

    // 공백을 기준으로 텍스트를 나눈 후 단어 배열에 추가
    public void splitWords(String s) {
        String[] strs = s.split(" ");
        addWord(strs);
    }

    // 텍스트와 단어 목록을 문자열로 반환
    @Override
    public String toString() {
        String result = text + "\n\n";

        for (int i = 0; i < words.getCount(); i++) {
            result += words.get(i).toString() + "\n";
        }

        return result;
    }

    // 특수 문자 배열에 해당 문자가 있는지 확인
    private boolean isDelimiter(char ch) {
        for (int i = 0; i < delimiters.length; i++) {
            if (delimiters[i] == ch) {
                return true;
            }
        }

        return false;
    }

    // 단어 양끝의 공백과 특수 문자 제거
    private String trimWord(String s) {
        // 먼저 양끝의 공백 제거
        s = s.trim();

        int start = 0;
        int end = s.length();

        // 앞쪽 특수 문자 제거
        while (start < end && isDelimiter(s.charAt(start))) {
            start++;
        }

        // 뒤쪽 특수 문자 제거
        while (end > start && isDelimiter(s.charAt(end - 1))) {
            end--;
        }

        return s.substring(start, end);
    }

    // 단어 배열을 처리하여 WordArray에 저장
    private void addWord(String[] strs) {
        for (int i = 0; i < strs.length; i++) {
            String word = trimWord(strs[i]);

            // 빈 문자열은 제외하고 소문자로 변환
            if (!word.isEmpty()) {
                words.add(word.toLowerCase());
            }
        }
    }
}
