public class Main {
    public static void main(String[] args) {

        String example = "this is a string";
        String fname = "Meghan";
        String lname = "Schaefer";
        String fullname = "%s %s".formatted(fname, lname);
        System.out.println(fullname);

        String fullsentence = "jack and jill " + "went up the hill";
        System.out.println(fullsentence);

        System.out.println(fullsentence.length());

        //indexOf

        String search = "The quick brown fox jumped over the lazy dog";
        System.out.println(search);
        int index = search.indexOf("e");
        System.out.println("The index of e is: " + index);

        int nextIndex = search.indexOf('e',3);
        System.out.println(nextIndex);

        int indexQuick = search.indexOf("quick");
        System.out.println(indexQuick);

        int indexFootball = search.indexOf("football");
        System.out.println(indexFootball);

        //substrings

        String dateTime = "20220103 05:10:32";
        String year = dateTime.substring(0,4);
        String month = dateTime.substring(4,6);
        String day = dateTime.substring(6,8);
        String hours = dateTime.substring(9,11);
        String minutes = dateTime.substring(12,14);
        String seconds = dateTime.substring(15,17);
        System.out.println("Year:" + year);
        System.out.println("Month:" + month);
        System.out.println("Day:" + day);
        System.out.println("Hours:" + hours);
        System.out.println("Minutes:" + minutes);
        System.out.println("Seconds:" + seconds);

        //splitting a string

        String[] dateAndTime = dateTime.split(" ");
        String[] timeFields = dateAndTime[1].split(":");
        System.out.println("Hours: " + timeFields[0]);

        //using constants to make code more readable

        final int HOURS = 0;
        System.out.println("Hours: " + timeFields[HOURS]);

        // charAt method

        String data = "001somethingy12345";
        System.out.println(data.charAt(12));

        // replace method

        String _version = "this_text_needs_spaces_in_it";
        System.out.println(_version);
        System.out.println(_version.replace('_', ' ').replace("needs", "has"));



    }
}