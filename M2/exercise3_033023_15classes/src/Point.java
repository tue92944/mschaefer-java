public class Point {
    int x;
    int y;

    public int calcDistance(int x,int y){
        int distance = 0;
        if (y>x){
            distance = y-x;
        }else if (y == x){
            distance = 0;
        }else{
            distance = x-y;
        }
        return distance;
    }

    public int moveDirection(int x, )
}
