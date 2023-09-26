import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int chef;
        int menu;
        CookFactory cookFactory;

        System.out.println("==== 메뉴 접수ㄱ ====");
        System.out.println("""
                1. 한식
                2. 일식
                3. 중식
                4. 양식""");
        Scanner sc = new Scanner(System.in);
        chef = sc.nextInt();

        cookFactory = switch (chef) {
            case 1 -> new CookFactory(new KoreanChef());
            case 2 -> new CookFactory(new JapaneseChef());
            case 3 -> new CookFactory(new ChineseChef());
            default -> new CookFactory(new WesternChef());
        };

        cookFactory.orderChef();
        menu = sc.nextInt();
        cookFactory.orderMenu(menu);
        sc.close();
    }
}