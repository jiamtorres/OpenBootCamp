public class Main {
    public static void main(String[] args) {
    Persona persona = new Persona();
    persona.setNombre("José");
    persona.setEdad(25);
    persona.setTelefono("+58 424 125 1825");

        System.out.println("Mi nombre es: " + persona.getNombre() + ". Tengo " + persona.getEdad() + " años y mi número de telefono es: " + persona.getTelefono());
    }
    static class Persona{
        private int edad;
        private String nombre;
        private String telefono;

        public void setEdad(int edad){
            this.edad = edad;
        }
        public int getEdad(){
            return this.edad;
        }
        public void setNombre (String nombre){
            this.nombre = nombre;
        }
        public String getNombre (){
            return this.nombre;
        }
        public void setTelefono(String telefono){
            this.telefono = telefono;
        }
        public String getTelefono(){
            return this.telefono;
        }
    }
}