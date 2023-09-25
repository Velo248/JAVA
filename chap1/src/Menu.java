import java.util.HashMap;

public class Menu {
    private final String[] koreanFood = {"비빔밥", "국밥", "불고기", "게장"};
    private final String[] japaneseFood = {"초밥", "소바", "라멘", "타코야끼"};
    private final String[] chineseFood = {"짜장", "짬뽕", "유린기", "탕수육"};
    private final String[] westernFood = {"파스타", "피자", "리조또", "라쟈나"};

    private final HashMap<Integer, String[]> foodList = new HashMap<>() {
        {
            put(1, koreanFood);
            put(2, japaneseFood);
            put(3, chineseFood);
            put(4, westernFood);
        }
    };

    public Menu() {
    }

    public String[] getOneFoodList(int chef) {
        return foodList.get(chef);
    }

    public String getFood(int chef, int food) {
        return foodList.get(chef)[food - 1];
    }

}
