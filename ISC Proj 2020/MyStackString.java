public class MyStackString {
   private int maxSize;
   private String[] stack;
   private int top;

   public MyStackString(int s) {
      maxSize = s;
      stack = new String[maxSize];
      top = -1;
   }
   public void push(String j) {
      stack[++top] = j;
   }
   public String pop() {
       if(top==-1)
         return "";
      return stack[top--];
   }
   public String peek() {
      return stack[top];
   }
   public boolean isEmpty() {
      return (top == -1);
   }
   public boolean isFull() {
      return (top == maxSize - 1);
   }
}
