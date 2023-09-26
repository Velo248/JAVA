import java.util.Arrays;
import java.util.List;

public enum MenuTable {
    KOREAN("한식", Arrays.asList("비빔밥", "국밥", "불고기", "찜닭")),
    JAPANESE("일식", Arrays.asList("초밥", "타코야끼", "오코노미야끼", "라멘")),
    CHINESE("중식", Arrays.asList("짜장", "짬뽕", "볶음밥", "탕수육")),
    WESTERN("양식", Arrays.asList("리조또", "파스타", "피자", "라자냐"));

    private final String menu;
    private final List<String> menuList;

    MenuTable(String name, List<String> list) {
        this.menu = name;
        this.menuList = list;
    }

    public String getMenu() {
        return menu;
    }

    public List<String> getMenuList() {
        return menuList;
    }
}