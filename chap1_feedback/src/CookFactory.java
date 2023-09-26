import java.util.List;

public class CookFactory {
    private Chef chef;
//    private final Menu menu;

    public CookFactory(Chef chef) {
        this.chef = chef;
    }

    public void setChef(Integer chef) {
        switch (chef) {
            case 1:
                this.chef = new KoreanChef(new Menu(1));
                break;

            case 2:
                this.chef = new JapaneseChef(new Menu(2));
                break;

            case 3:
                this.chef = new ChineseChef(new Menu(3));
                break;

            default:
                this.chef = new WesternChef(new Menu(4));
                break;
        }
    }
}
//    public String getMenuType() {
//        System.out.println();
//        return this.menu.getMenuTableName();
//    }
//
//    public List<String> getMenuList() {
//        return this.menu.getMenuTableList();
//    }
//
//    public void setMenu(Integer menu) {
//        this.menu.setMenu(menu);
//    }
//}
