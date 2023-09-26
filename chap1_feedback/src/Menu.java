//repository

import java.util.Arrays;
import java.util.List;

enum MenuTable {
    KOREAN("한식", Arrays.asList("비빔밥", "국밥", "불고기", "찜닭")),
    JAPANESE("한식", Arrays.asList("초밥", "타코야끼", "오코노미야끼", "라멘")),
    CHINESE("한식", Arrays.asList("짜장", "짬뽕", "볶음밥", "탕수육")),
    WESTERN("한식", Arrays.asList("리조또", "파스타", "피자", "라자냐"));

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

public class Menu {
    private MenuTable menuTable;

//    Menu() {}
    public Menu(Integer menu) {
        switch (menu) {
            case 1:
                this.menuTable = MenuTable.KOREAN;
                break;

            case 2:
                this.menuTable = MenuTable.JAPANESE;
                break;

            case 3:
                this.menuTable = MenuTable.CHINESE;
                break;

            default:
                this.menuTable = MenuTable.WESTERN;
                break;
        }
    }

    public String getMenuTableName() {
        return menuTable.getMenu();
    }

    public List<String> getMenuTableList() {
        return menuTable.getMenuList();
    }
}