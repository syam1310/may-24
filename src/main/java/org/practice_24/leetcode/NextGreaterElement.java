package org.practice_24.leetcode;

import java.util.Stack;

public class NextGreaterElement {
    public static int[] nge(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    res[i] = j;
                    break;
                }
            }
        }
        return res;
    }

    public static int[] ngeStack(int[] arr) {
        int[] res = new int[arr.length];
        //Arrays.fill(res, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            res[i] = -1;
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                res[stack.peek()] = i;
                stack.pop();
            }
            stack.push(i);
        }
        return res;
    }

}
