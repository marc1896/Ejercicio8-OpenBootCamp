public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(26);
        persona.setNombre("Marco Antonio");
        persona.setTelefono("5523032709");
        System.out.println("Nombre: " + persona.getNombre() + "\nEdad: " + persona.getEdad() + "\nNum. Telefono: " + persona.getTelefono());
    }
}
