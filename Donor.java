
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Donor {

    static List<FoodItem> grainList = new ArrayList<FoodItem>();
    int ssn, g, d, p;

    void details() {
        System.out.println("Enter SSN(Social Security Number):");
        Scanner in = new Scanner(System.in);
        ssn = in.nextInt();
        this.ssn = ssn;
        String q = in.nextLine();
        System.out.println("No. of Grain items:");
        g = in.nextInt();
        this.g = g;
        Grains g1[] = new Grains[g];
        for (int i = 0; i < g; i++) {
            g1[i] = new Grains();
        }
        for (int i = 0; i < g; i++) {
            g1[i].grainDetails();
            grainList.add(g1[i]);
        }
        System.out.println("No. of Dairy items:");
        d = in.nextInt();
        this.d = d;
        Dairy d1[] = new Dairy[d];
        for (int i = 0; i < d; i++) {
            d1[i] = new Dairy();
        }
        for (int i = 0; i < d; i++) {
            d1[i].dairyDetails();
            grainList.add(d1[i]);
        }
        System.out.println("No. of produce items:");
        p = in.nextInt();
        this.p = p;
        Produce p1[] = new Produce[p];
        for (int i = 0; i < p; i++) {
            p1[i] = new Produce();
        }
        for (int i = 0; i < p; i++) {
            p1[i].produceDetails();
            grainList.add(p1[i]);
        }
    }

    public int getssn() {
        return ssn;
    }
}
