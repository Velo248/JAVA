import java.util.List;

public class Menu {
    private MenuTable menuTable;

    public Menu(String menu) {
        for (MenuTable table : MenuTable.values()) {
            if (table.getMenu().equals(menu)) {
                this.menuTable = table;
                break;
            } else {
                System.out.println("MenuType Error!!");
            }
        }
    }

    public String getMenuTableName() {
        return menuTable.getMenu();
    }

    public List<String> getMenuTableList() {
        return menuTable.getMenuList();
    }
}