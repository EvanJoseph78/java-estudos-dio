import edu.evan.smartTv.SmartTv;

public class App {
    public static void main(String[] args) throws Exception {
        SmartTv tv1 = new SmartTv();
        System.out.println(tv1);
        tv1.ligarTv();
        System.out.println(tv1);
        tv1.ligarTv();
        tv1.desligarTv();
        tv1.aumentarVolume();
        tv1.diminuirVolume();
        tv1.diminuirVolume();
        tv1.diminuirVolume();
        tv1.mudarCanal();
        tv1.mudarCanal();
        tv1.mudarCanal(56);

    }

    public static String getFullName(String firstName, String lastName) {
        return firstName.concat(" ").concat(lastName);
    }
}
