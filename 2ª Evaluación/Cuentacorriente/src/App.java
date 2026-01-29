public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente1 = new Cliente();
        cliente1.cliente();
        Cliente cliente2 = new Cliente();
        cliente2.clientecondatos("Juan", "Pérez", "123456789A", raza.AMERINDIO);
        Cliente cliente3 = new Cliente();
        cliente3.clientecondatos("José", "Barrero", "0987654321B", raza.MONGOLICO);
    }
}
