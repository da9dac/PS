import java.io.*;
import java.util.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        MyStack stack = new MyStack(n);
        
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            
            String cmd = st.nextToken();
            
            switch (cmd) {
                case "push": {
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                }
                case "pop": {
                    sb.append(stack.pop()).append("\n");
                    break;
                }
                case "size": {
                    sb.append(stack.size()).append("\n");
                    break;
                }
                case "empty": {
                    sb.append(stack.empty()).append("\n");
                    break;
                }
                default: {
                    sb.append(stack.top()).append("\n");
                }
            }
        }
        
        System.out.println(sb);
    }
    
    static class MyStack {
        private int size;
        private int[] arr;
        
        MyStack(int n) {
            this.size = 0;
            this.arr = new int[n];
        }
        
        void push(int x) {
            arr[size++] = x;
        }
        
        int pop() {
            return empty() == 1 ? -1 : arr[--size];
        }
        
        int size() {
            return size;
        }
        
        int empty() {
            return size == 0 ? 1 : 0;
        }
        
        int top() {
            return empty() == 1 ? -1 : arr[size - 1];
        }
    }
}