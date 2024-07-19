public class EmailGenerator {
    public static void main(String[] args) {
        String nombre ="Luis Enrique Mata";
        String empresa= "Accentur";
        String dominio= ".com.mx";

        String nombreNormalizado=nombre.strip().toLowerCase().replace(" ",".");
        String empresaNormalizada= "@"+(empresa.toLowerCase());

        String email = nombreNormalizado+empresaNormalizada+dominio;
        System.out.println(email);
    }
}
