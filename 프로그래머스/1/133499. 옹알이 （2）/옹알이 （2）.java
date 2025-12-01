class Solution {
    public int solution(String[] babbling) {
        String[] words = {"aya", "ye", "woo", "ma"};
        int answer = 0;

        for (String b : babbling) {
            String prev = "";  // 이전에 사용한 발음
            boolean isValid = true;
            int i = 0;

            while (i < b.length()) {
                boolean matched = false;

                for (String w : words) {
                    // 단어가 b의 현재 위치에서 시작하는 경우
                    if (b.startsWith(w, i)) {
                        // 같은 발음이 연속해서 나오면 불가능
                        if (w.equals(prev)) {
                            isValid = false;
                            break;
                        }

                        prev = w;           // 이전 발음 갱신
                        i += w.length();    // 단어 길이만큼 이동
                        matched = true;
                        break;
                    }
                }

                // 4개의 발음 중 어떤 것도 매칭되지 않으면 불가능
                if (!matched) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) answer++;
        }

        return answer;
    }
}
