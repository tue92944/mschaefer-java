import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[] names = new String [2];
        Scanner sc = new Scanner(System.in);
        String name = "";
        int index = 0;

        do{
            System.out.println(("Enter a name"));
            name = sc.nextLine();
            if (name.isBlank()){
                break;
            }
            names[index] = name;
            index++;
            if (index == names.length){
                String[] newArray = new String[names.length *2];
                for (int i =0; i<names.length; i++){
                    newArray[i] = names[i];
                }
                names = newArray;
            }

        }while(name.isBlank() == false);










    }
}