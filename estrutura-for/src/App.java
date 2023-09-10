public class App {
    public static void main(String[] args) {
        String nomes[] = { "Evandro", "José", "Evan", "Joseph" };

        for (String nome : nomes) {
            System.out.println(nome);
        }

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }

}