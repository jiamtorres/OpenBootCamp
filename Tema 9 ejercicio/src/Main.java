public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.nombre = "José Torres";
        cliente.edad = 25;
        cliente.numeroCelular = "+58 4241251825";
        cliente.credito = 200.10;
        System.out.println("El cliente se llama: " + cliente.nombre + " tiene " + cliente.edad + " años. Su número de celular es "
                + cliente.numeroCelular + " y tiene un crédito de: " + cliente.credito + "$.");

        trabajador.nombre = "Alejandro Hernández";
        trabajador.edad = 27;
        trabajador.numeroCelular = "+58 4167043122";
        trabajador.salario = 2500;
        System.out.println("El trabajador se llama: " + trabajador.nombre + " tiene " + trabajador.edad + " años. Su número de celular es "
                + trabajador.numeroCelular + " y tiene un salario de: " + trabajador.salario + "$.");
    }

    static class Persona {
        String nombre;
        int edad;
        String numeroCelular;
    } static class Cliente extends Persona{
        double credito;
    } static class Trabajador extends Persona{
        double salario;
    }
}