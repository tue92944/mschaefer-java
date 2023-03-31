public class Cookie extends Food{
    private String cookieType;

    public String getCookieType() {
        return cookieType;
    }

    public void setCookieType(String cookieType) {
        this.cookieType = cookieType;
    }

    public Cookie(int quantity, double cost, String foodType, int calories, String cookieType) {
        super(quantity, cost, foodType, calories);
        this.cookieType = cookieType;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCookie Type: " + cookieType;
    }
}
