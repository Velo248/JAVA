//client

public class Main {
    public static void main(String[] args) {
//        KoreanChef koreanChef = new KoreanChef(new CookFactory(new Menu()));
        CookFactory cookFactory = new CookFactory(new KoreanChef(new Menu(1)));
    }
}