import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[] myArray = new String [4];
        Scanner sc = new Scanner(System.in);
        String empty = "";


        for (int i=0; i<myArray.length; i++){
            System.out.println("Please enter your word: ");
            String input = sc.nextLine();
            if (input != empty){
                myArray[i]=input;
                System.out.println(myArray);
            }else{
                break;
            }

        }

        String[] doubleMyArray = new String [myArray.length * 2];

        for (int i = myArray.length; i<doubleMyArray.length;i++){
            doubleMyArray[i]= myArray[i];
            System.out.println("Please enter your word: ");
            String input = sc.nextLine();
            if (input != empty){
                doubleMyArray[i]=input;
                System.out.println(doubleMyArray);
            }else{
                break;
            }
        }




    }
}