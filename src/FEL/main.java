package FEL;

import BLL.Service.ManagerService;
import DAL.IDAO;
import DAL.InMemoryDAO;

import java.util.Scanner;

public class main {
    private static int level = 1;
    private static final Scanner s = new Scanner(System.in);

    public static void main(String args[]) {
        IDAO dao = new InMemoryDAO();

        switch (level) {
            default:
                break;
            case 1:
                System.out.println("100. Connexion de gestionnaire");
                System.out.println("200. Connexion de client");
                end(100, 200);
                break;
        }
    }

    public static void end(int min, int max) {
        System.out.println("999. Quitter");

        do {
            int nxtLvl = -1;
            try {
                nxtLvl = s.nextInt();
            } catch (NumberFormatException e) {
                nxtLvl = -1;
            }

            if (nxtLvl == 999) {
                if (level == 1) {
                    Runtime.getRuntime().exit(0);
                }
                else {
                    level--;
                }
                break;
            }
            else if (nxtLvl <= max && nxtLvl >= min) {
                level = nxtLvl;
                break;
            }
        } while (true);
    }
}
