
import java.util.Scanner;

class Donee {

    int ssn, g, d, p;
    String name, address;

    void details() {
        System.out.println("Enter SSN(Social Security Number):");
        Scanner in = new Scanner(System.in);
        ssn = in.nextInt();
        this.ssn = ssn;
        String q = in.nextLine();
        System.out.println("Name :");
        name = in.nextLine();
        this.name = name;
        System.out.println("Address :");
        address = in.nextLine();
        this.address = address;
        System.out.println("No. of Grain items needed:");
        g = in.nextInt();
        this.g = g;
        Grains g1[] = new Grains[g];
        for (int i = 0; i < g; i++) {
            g1[i] = new Grains();
        }
        for (int i = 0; i < g; i++) {
            g1[i].grainDetails();
        }
        System.out.println("No. of Dairy items needed:");
        d = in.nextInt();
        this.d = d;
        Dairy d1[] = new Dairy[d];
        for (int i = 0; i < d; i++) {
            d1[i] = new Dairy();
        }
        for (int i = 0; i < d; i++) {
            d1[i].dairyDetails();
        }
        System.out.println("No. of produce items needed:");
        p = in.nextInt();
        this.p = p;
        Produce p1[] = new Produce[p];
        for (int i = 0; i < p; i++) {
            p1[i] = new Produce();
        }
        for (int i = 0; i < p; i++) {
            p1[i].produceDetails();
        }
    }
}
