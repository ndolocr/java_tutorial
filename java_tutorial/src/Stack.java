public class Stack {
    private int val;
    private int stack [] = new int[10];

    public Stack(){
        this.val = -1;
    }

    // Method to push values in the stack.
    public void push(int item){
        if(this.val == 9){
            System.out.println("Stack if full");
        }else{
            this.stack[++val] = item;
        }
    }

    // Method to pop out item
    public int pop(){
        if(this.val < 0){
            System.out.println("End of Stack!");
        }else{
         return this.stack[this.val--];
        }

    }
}
