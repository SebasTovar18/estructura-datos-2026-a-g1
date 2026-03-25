public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        //Permite agregar la cantidad de datos que se requiera

        lista.agregar("Pablo");
        lista.agregar("Angelita");
        lista.agregar("Jonathan");
        lista.agregar("Sebastian");


        lista.mostrar();
    }
}