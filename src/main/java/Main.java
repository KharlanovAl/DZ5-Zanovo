import ru.Netology.javaMvn.FreelanceServes;

public class Main {
    public static void main(String[] args) {


        FreelanceServes service = new FreelanceServes();

        int vocation = service.calculateMonthsOfRest(10000, 3000, 20000);

        System.out.println(vocation);
    }

}
