import java.util.Scanner;
public class ArrayManipulation {
    int[] Array;


    public ArrayManipulation(int length) {
        Array = new int[length];
    }

    public void FillArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the integers: ");

        for(int i=0; i<Array.length; i++)
        {
            Array[i] = input.nextInt();
        }
    }

    public void PrintArray(){
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }

    }

    public void InsertArray(int position, int value){
       Array[position] =  value;

    }

    public void DeleteFromPosition(int position){
        //int x = Array[position];
        Array[position] = 0;
        System.out.println("value has been placed at position no: "+position);

    }

    public static void main(String[] args) {

        ArrayManipulation A1 = new ArrayManipulation(5);
        A1.FillArray();
        A1.PrintArray();
        A1.InsertArray(0, 50);
        A1.DeleteFromPosition(2);
        A1.PrintArray();

    }


}



