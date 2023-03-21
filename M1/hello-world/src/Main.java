public class Main {
    public static void main(String[] args) {
        System.out.println("the assignment operator");
        System.out.println("int x = 0");
        int x=0;
        System.out.println("this is the value of x");
        System.out.println(x);

        x += 5;
        //x=x+5;
        System.out.println("added 5 to x");
        System.out.println(x);

        x -= 2;
        System.out.println("subtracted 2 from x");
        System.out.println(x);

        x *= 4;
        System.out.println("multiplied x by 4");
        System.out.println(x);

        x /= 3;
        System.out.println("divided x by 3");
        System.out.println(x);

        x=0;
        System.out.println("reset x to 0");
        System.out.println(x);

        x++;
        System.out.println("increased x by 1");
        System.out.println(x);

        x--;
        System.out.println("subtracted 1 from x");
        System.out.println(x);

        int t =  10/3;
        System.out.println("The value is truncated");
        System.out.println(t);

        int wholeNumber = 10 / 3;
        int remainder = 10 % 3;
        System.out.println("The whole number value is" + wholeNumber);
        System.out.println("The remainder is" + remainder);

        boolean outcome; //false
        outcome= 3 < 4;
        System.out.println("The outcome of 3 < 4");
        System.out.println(outcome);

        outcome = 3 > 4;
        System.out.println("the outcome of 3 > 4 is " + outcome);

        outcome= 3 <= 4;
        System.out.println("The outcome of 3 <= 4 is " + outcome);

        outcome = 3 == 3;
        System.out.println("The outcome of 3==3 is " + outcome);

        outcome = 4 == 3;
        System.out.println("The outcome of 4 == 3 is " + outcome);

        outcome = true && true;
        System.out.println("Outcome of true && true is " + outcome);

        outcome= false && true;
        System.out.println("Outcome of false && true is " + outcome);

        outcome= true && false;
        System.out.println("outcome of true && false is " + outcome);

        outcome= true || true;
        System.out.println("outcome of true || true is " + outcome);

        outcome= false || true;
        System.out.println("outcome of false || true is " + outcome);

        outcome= !false;
        System.out.println("The outcome of !false is " + outcome);





    }
}