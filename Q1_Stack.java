package DAA;

import java.util.Stack;

public class Q1_Stack {



    public static void main(String[] args) {


        Stack<Integer> game = new Stack<>();

        game.push(1);
        game.push(2);
        game.push(3);

        if( game.isEmpty()){
            System.out.println("Stack is Empty");
        }
        else{
            System.out.println("Stact is not Empty");
        }




        System.out.println(game);





    }
}
