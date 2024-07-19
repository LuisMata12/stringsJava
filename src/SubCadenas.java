public class SubCadenas {
    public static void main(String[] args) {
        String cadena1 = "hello word";
        //El metodo subString es excluyente

        String subCadena1= cadena1.substring(0,5);
        String subCadena2 = cadena1.substring(5,10);

        System.out.println("Cadena1: "+subCadena1+"\n"+
                            "Cadena2: "+subCadena2);


        //Al usar el metodo concat o culquier otro metodo en un objeto String se crea un
        // nuevo objeto en otro espcio de memoria.

        String cadena2 = cadena1.concat("Hola2");

        //Se puede usar la clase StringBuilder ya que esta clase permite a la cadena ser mutable
        // osea actualizar el objeto en el mismno espacio de memoria

        StringBuilder cadena3 =new StringBuilder("hello word");
        cadena3.append(" and devs");
        System.out.println(cadena3);

    }
}
