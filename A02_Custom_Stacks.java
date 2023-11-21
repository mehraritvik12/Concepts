package Stacks;

public class A02_Custom_Stacks {

    protected int[] data;
    private static final int DEFAULT_SIZE= 10;
    int ptr =-1;


    public A02_Custom_Stacks() {     // if size not inputted then constructor will call itself with default value otherwise not
        this(DEFAULT_SIZE);
    }
    public A02_Custom_Stacks(int size) {
        this.data = new int[size];
    }



        public boolean push(int item){

            if(isFull()){
                System.out.println("Stack is Full");
                return false;
            }
            ptr++;
            data[ptr]= item;
            return true;


        }


        public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception ("Cannot pop from empty stack!!")
        }
        }


    private boolean isFull() {
        return ptr == data.length -1; /khana kha lena  / last index
    }

    private boolean isEmpty() {
        return ptr == -1; // last index
    }
}
