import java.util.HashMap;

public class CookFactory extends Chef {
    private final HashMap<Integer, String> foodRef = new HashMap<>() {{
        put(1, "한식");
        put(2, "일식");
        put(3, "중식");
        put(4, "양식");
    }};

    public CookFactory(int userSelectChef) {
        super(userSelectChef);
    }

    public String getSelectedChef() {
        return foodRef.get(getChef());
    }

    public void foodPreview() {
        for (int i = 0; i < possibleCooking().length; i++) {
            System.out.print(i + 1 + ". " + possibleCooking()[i] + " ");
        }
    }

    public void userMenuOrder(int userSelectMenu) {
        System.out.println(finishedCooking(userSelectMenu) + "이(가) 완성됐습니다.");
    }
}
