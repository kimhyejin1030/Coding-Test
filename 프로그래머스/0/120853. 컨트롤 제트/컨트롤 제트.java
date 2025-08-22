class Solution {
    public int solution(String s) {
        String[] arr = s.split(" ");
        int sum = 0;
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        
        for(String str : arr) {
            if(str.equals("Z")) {
                if(!stack.isEmpty()) {
                    sum -= stack.pop();
                }
            } else {
                int num = Integer.parseInt(str);
                sum += num;
                stack.push(num);
            }
        }
        return sum;
    }
}