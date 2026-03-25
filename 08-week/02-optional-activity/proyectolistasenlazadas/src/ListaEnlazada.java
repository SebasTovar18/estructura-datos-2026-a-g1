public class ListaEnlazada {
    Nodo cabeza;

    public ListaEnlazada() {
        cabeza = null;
    }

    // Método para agregar nodos
    public void agregar(String nombre) {
        Nodo nuevo = new Nodo(nombre);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    // Método para mostrar la lista
    public void mostrar() {
        Nodo actual = cabeza;

        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }

        System.out.println("null");
    }
}