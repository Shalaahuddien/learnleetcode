class Solution {
    public int[] dailyTemperatures(int[] T) {
        Stack<Integer> stack = new Stack<>();
        int[] map = new int[T.length];
        for(int i = 0; i < T.length; i++)
        {
            while(!stack.isEmpty() && T[stack.peek()] < T[i])
            {
                Integer topIndex = stack.pop();
                int diff = i - topIndex;
                map[topIndex] = diff;
            }
            stack.push(i);            
        }
         while(!stack.isEmpty())
            {
                Integer topIndex = stack.pop();
                map[topIndex] = 0;
            }
            return map;
    }
}

//[73, 74, 75, 71, 69, 72, 76, 73]