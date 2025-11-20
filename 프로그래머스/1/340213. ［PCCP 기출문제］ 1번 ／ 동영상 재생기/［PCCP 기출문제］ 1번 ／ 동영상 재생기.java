class Solution {
    
    private int toSec(String time) {
        String[] t = time.split(":");
        return Integer.parseInt(t[0]) * 60 + Integer.parseInt(t[1]);
    }

    private String toTime(int sec) {
        return String.format("%02d:%02d", sec / 60, sec % 60);
    }

    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        
        int video = toSec(video_len);
        int position = toSec(pos);
        int opStart = toSec(op_start);
        int opEnd = toSec(op_end);

        // 🚨 초기 위치가 오프닝 안이면 바로 스킵해야 함!
        if (position >= opStart && position <= opEnd) {
            position = opEnd;
        }

        for (String cmd : commands) {

            if (cmd.equals("prev")) {
                position -= 10;
                if (position < 0) position = 0;
            } 
            else if (cmd.equals("next")) {
                position += 10;
                if (position > video) position = video;
            }

            if (position >= opStart && position <= opEnd) {
                position = opEnd;
            }
        }

        return toTime(position);
    }
}
