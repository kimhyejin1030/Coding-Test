class Solution {
    public int[] solution(String[] park, String[] routes) {
        int h = park.length;
        int w = park[0].length();

        int x = 0, y = 0;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (park[i].charAt(j) == 'S') {
                    x = i;
                    y = j;
                }
            }
        }

        for (String r : routes) {
            String[] parts = r.split(" ");
            String d = parts[0];
            int n = Integer.parseInt(parts[1]);

            int dx = 0, dy = 0;
            if (d.equals("N")) dx = -1;
            else if (d.equals("S")) dx = 1;
            else if (d.equals("W")) dy = -1;
            else if (d.equals("E")) dy = 1;

            int nx = x, ny = y;
            boolean ok = true;

            for (int k = 0; k < n; k++) {
                nx += dx;
                ny += dy;

                if (nx < 0 || nx >= h || ny < 0 || ny >= w) {
                    ok = false;
                    break;
                }
                if (park[nx].charAt(ny) == 'X') {
                    ok = false;
                    break;
                }
            }

            if (ok) {
                x = nx;
                y = ny;
            }
        }

        return new int[]{x, y};
    }
}