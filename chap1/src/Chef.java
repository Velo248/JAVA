public class Chef extends Menu {

    private final int chef;

    public Chef(int chef) {
        this.chef = chef;
    }

    public int getChef() {
        return chef;
    }

    public String[] possibleCooking() {
        return getOneFoodList(this.chef);
    }

    public String finishedCooking(int userSelectMenu) {
        return getFood(this.chef, userSelectMenu);
    }
}