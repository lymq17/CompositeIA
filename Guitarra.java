// Hoja - Cuerdas
class Guitarra implements Instrumento {
    @Override
    public void afinar() {
        System.out.println("Afinando la guitarra.");
    }
    @Override
    public void tocar() {
        System.out.println("Tocando la guitarra.");
    }
    @Override
    public void agregar(Instrumento instrumento) {
        throw new UnsupportedOperationException("No se pueden agregar instrumentos a una guitarra.");
    }
    @Override
    public void eliminar(Instrumento instrumento) {
        throw new UnsupportedOperationException("No se pueden eliminar instrumentos de una guitarra.");
    }
}
