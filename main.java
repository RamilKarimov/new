import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        String cold = "на улице холодно";
        String warm = "на улице тепло";
        Scanner console = new Scanner(System.in);
        int temp = console.nextInt();
        if (temp < 0)
            System.out.println("на улице холодно");
        else
            System.out.println("на улице тепло");
    }
}
