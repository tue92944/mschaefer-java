public class Time {
    private int hours;
    private int minutes;

    public int addMinutes(int minutesToAdd){
        minutes+=minutesToAdd;
        return minutes;
    }

    public int deleteMinutes(int minutesToDelete){
        minutes -= minutesToDelete;
        return minutes;
    }

    public String formatTime(int hours, int minutes){

    }
}
