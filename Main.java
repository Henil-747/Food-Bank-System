
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {

    static List<fulltimeEmployee> listfullTimeEmployee = new ArrayList<fulltimeEmployee>();
    static List<Volunteer> listVolunteer = new ArrayList<Volunteer>();
    static List<Donor> listDonor = new ArrayList<Donor>();
    static List<Donee> listDonee = new ArrayList<Donee>();

    public static void print_menu() {
        int choice;
        do {
            System.out.println("[1] To add a full time employee information");
            System.out.println("[2] To add a volunteer information");
            System.out.println("[3] To add Donor information");
            System.out.println("[4] To add Donee information");
            System.out.println("[5] To receive donation from a specific Donor");
            System.out.println("[6] To send donation to a specific Donee");
            System.out.println("[7] To print employees information & salaries for this cycle");
            System.out.println("[8] To print food pantry current supply");
            System.out.println("[9] To Exit");
            System.out.println("Enter your choice:");
            Scanner in = new Scanner(System.in);
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    fulltimeEmployee f1 = new fulltimeEmployee();
                    f1.details();
                    double salary = f1.calculateSalary();
                    listfullTimeEmployee.add(f1);
                    break;
                case 2:
                    Volunteer v1 = new Volunteer();
                    v1.details();
                    double salary1 = v1.calculateSalary();
                    listVolunteer.add(v1);
                    break;
                case 3:
                    Donor d1 = new Donor();
                    d1.details();
                    listDonor.add(d1);
                    break;
                case 4:
                    Donee d2 = new Donee();
                    d2.details();
                    listDonee.add(d2);
                    break;
                case 5:
                    System.out.println("Enter SSN(Social Security Number):");
                    int ssn = in.nextInt();
                    for (int i = 0; i < listDonor.size(); i++) {
                        if (ssn == listDonor.get(i).ssn) {
                            System.out.println("Found Suucessfully!");
                            System.out.println("No. of Grain items:");
                            int g1 = in.nextInt();
                            Grains g2[] = new Grains[g1];
                            for (int j = 0; j < g1; j++) {
                                g2[j] = new Grains();
                            }
                            for (int j = 0; j < g1; j++) {
                                g2[j].grainDetails();
                            }
                            System.out.println("No. of Dairy items:");
                            int da1 = in.nextInt();
                            Dairy da2[] = new Dairy[da1];
                            for (int j = 0; j < da1; j++) {
                                da2[j] = new Dairy();
                            }
                            for (int j = 0; j < da1; j++) {
                                da2[j].dairyDetails();
                            }
                            System.out.println("No. of produce items:");
                            int p1 = in.nextInt();
                            Produce p2[] = new Produce[p1];
                            for (int j = 0; j < p1; j++) {
                                p2[j] = new Produce();
                            }
                            for (int j = 0; j < p1; i++) {
                                p2[j].produceDetails();
                            }
                            break;
                        }
                        if (i == listDonor.size() - 1) {
                            System.out.println("Not Found!");
                        }
                    }
                    break;
                case 6:
                    System.out.println("Enter SSN(Social Security Number):");
                    int ssn1 = in.nextInt();
                    for (int i = 0; i < listDonee.size(); i++) {
                        if (ssn1 == listDonee.get(i).ssn) {
                            System.out.println("Found Suucessfully!");
                            System.out.println(listDonee.get(i).ssn + "\t" + listDonee.get(i).name + "\t" + listDonee.get(i).address);
                            System.out.println("No. of Grain items needed:");
                            int g1 = in.nextInt();
                            Grains g2[] = new Grains[g1];
                            for (int j = 0; j < g1; j++) {
                                g2[j] = new Grains();
                            }
                            for (int j = 0; j < g1; j++) {
                                g2[j].grainDetails();
                            }
                            System.out.println("No. of Dairy items:");
                            int da1 = in.nextInt();
                            Dairy da2[] = new Dairy[da1];
                            for (int j = 0; j < da1; j++) {
                                da2[j] = new Dairy();
                            }
                            for (int j = 0; j < da1; j++) {
                                da2[j].dairyDetails();
                            }
                            System.out.println("No. of produce items:");
                            int p1 = in.nextInt();
                            Produce p2[] = new Produce[p1];
                            for (int j = 0; j < p1; j++) {
                                p2[j] = new Produce();
                            }
                            for (int j = 0; j < p1; i++) {
                                p2[j].produceDetails();
                            }
                            break;
                        }
                        if (i == listDonee.size() - 1) {
                            System.out.println("Not Found!");
                        }
                    }
                    break;
                case 7:
                    for (int i = 0; i < listfullTimeEmployee.size(); i++) {
                        listfullTimeEmployee.get(i).printDetails();
                    }
                    for (int i = 0; i < listVolunteer.size(); i++) {
                        listVolunteer.get(i).printDetails();
                    }
                    break;
                case 8:
                    for (int i = 0; i < Donor.grainList.size(); i++) {
                        Donor.grainList.get(i).display();
                    }
                    break;
                case 9:
                    System.out.println("Thanks for using our system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Enter a number in the range [1-8]");
                    break;
            }
        } while (choice != 9);
    }

    public static void main(String[] args) {
        print_menu();

    }
}
