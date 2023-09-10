public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        CaixaEletronico c = new CaixaEletronico(100);
        c.realizarSaque(10);
    }
}
