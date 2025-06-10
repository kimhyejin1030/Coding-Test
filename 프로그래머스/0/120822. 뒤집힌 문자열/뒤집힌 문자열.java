class Solution {
    public String solution(String my_string) {
        // 문자열 → 문자 배열
        char[] arr = my_string.toCharArray();

        // 배열 뒤집기 (양끝 swap 방식)
        for (int i = 0; i < arr.length / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        // 문자 배열 → 문자열
        return new String(arr);
    }
}
