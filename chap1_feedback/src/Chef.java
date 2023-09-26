import java.util.List;
import java.util.ListIterator;

public class Chef implements Cook {
    private Menu menu;
    private String menuName;
    private List<String> menuList;

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public List<String> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<String> menuList) {
        this.menuList = menuList;
    }

    @Override
    public void selectedChef() {
        System.out.println(this.menuName + "이 선택됨.");
        System.out.println("==== 메뉴 선택ㄱ ====");
        ListIterator<String> it = this.menuList.listIterator();
        while (it.hasNext()) {
            System.out.printf(it.nextIndex() + 1 + ". " + it.next() + " ");
        }
        System.out.println();
    }

    @Override
    public void cooking(int menu) {
        System.out.println("==== 요리사가 요리를 준비중입니다. ====");
        System.out.println(this.menuList.get(menu - 1) + "이(가) 완성됨. 드셈.");
    }
}

class KoreanChef extends Chef {
    KoreanChef() {
        setMenu(new Menu("한식"));
        setMenuName(getMenu().getMenuTableName());
        setMenuList(getMenu().getMenuTableList());
    }
}

class JapaneseChef extends Chef {
    JapaneseChef() {
        setMenu(new Menu("일식"));
        setMenuName(getMenu().getMenuTableName());
        setMenuList(getMenu().getMenuTableList());
    }
}

class ChineseChef extends Chef {
    ChineseChef() {
        setMenu(new Menu("중식"));
        setMenuName(getMenu().getMenuTableName());
        setMenuList(getMenu().getMenuTableList());
    }
}

class WesternChef extends Chef {
    WesternChef() {
        setMenu(new Menu("양식"));
        setMenuName(getMenu().getMenuTableName());
        setMenuList(getMenu().getMenuTableList());
    }
}

