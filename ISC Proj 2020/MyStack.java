public class MyStack {
   private int maxSize;
   private char[] stack;
   private int top;

   public MyStack(int s) {
      maxSize = s;
      stack = new char[maxSize];
      top = -1;
   }
   public void push(char j) {
      stack[++top] = j;
   }
   public char pop() {
      return stack[top--];
   }
   public char peek() {
      return stack[top];
   }
   public boolean isEmpty() {
      return (top == -1);
   }
   public boolean isFull() {
      return (top == maxSize - 1);
   }
}
