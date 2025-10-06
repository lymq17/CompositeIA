// Hoja - Percusión
class Tambor implements Instrumento {
    @Override
    public void afinar() {
        System.out.println("Afinando el tambor.");
    }
    @Override
    public void tocar() {
        System.out.println("Tocando el tambor.");
    }
    @Override
    public void agregar(Instrumento instrumento) {
        throw new UnsupportedOperationException("No se pueden agregar instrumentos a un tambor.");
    }
    @Override
    public void eliminar(Instrumento instrumento) {
        throw new UnsupportedOperationException("No se pueden eliminar instrumentos de un tambor.");
    }
}