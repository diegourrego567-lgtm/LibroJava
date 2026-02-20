public class Principal {
public static void main(String[] args) {
libro libro1 = new libro(); // Usa constructor por defecto
libro libro2 = new libro("Cien años de soledad", "Gabriel García Márquez", 432, "978-8437604947");
libro1.mostrarInfo();
libro2.mostrarInfo();
libro2.setNumeroPaginas(450); // Modifica un atributo
System.out.println("El título del libro2 es: " + libro2.getTitulo());
System.out.println("Total de libros creados: " + libro.getTotalLibros()); // Accede al método estático
}
}