class Solution {
    public int solution(int[] ingredient) {
        int count = 0;        
        java.util.Stack<Integer> stack = new java.util.Stack<>();

        for (int x : ingredient) {
            stack.push(x);         

            if (stack.size() >= 4) {

                if (stack.get(stack.size() - 4) == 1 &&
                    stack.get(stack.size() - 3) == 2 &&
                    stack.get(stack.size() - 2) == 3 &&
                    stack.get(stack.size() - 1) == 1) {

                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    count++;
                }
            }
        }

        return count;
    }
}
