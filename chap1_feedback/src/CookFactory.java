public class CookFactory {
    private final Chef chef;

    public CookFactory(Chef chef) {
        this.chef = chef;
    }

    public void orderChef() {
        this.chef.selectedChef();
    }

    public void orderMenu(int menu) {
        this.chef.cooking(menu);
    }
}