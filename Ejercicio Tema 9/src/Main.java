public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        
        System.out.println(cliente);
        System.out.println(trabajador);

    }
    static class Persona {
        String nombre;
        int edad;
        String numeroCelular;
    }
    static class Cliente extends Persona {
        int credito;

        public Cliente(){
            this.edad = 25;
            this.nombre = "José Torres";
            this.numeroCelular = "+58 4241251825";
            this.credito = 200;

            System.out.println("El cliente se llama: " + this.nombre + " tiene " + this.edad + " años. Su número de celular es "
            + this.numeroCelular + " y tiene un crédito de: " + this.credito + ".");

        }
}   static class Trabajador extends Persona {
        int salario;

        public Trabajador(){
            this.edad = 27;
            this.nombre = "Alejandro Hernández";
            this.numeroCelular = "+58 4167043122";
            this.salario = 2500;
            System.out.println("El cliente se llama: " + this.nombre + " tiene " + this.edad + " años. Su número de celular es "
                    + this.numeroCelular + " y tiene un crédito de: " + this.salario + ".");
        }
    }
}