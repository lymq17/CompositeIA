// Hoja - Aire
class Flauta implements Instrumento {
    @Override
    public void afinar() {
        System.out.println("Afinando la flauta.");
    }
    @Override
    public void tocar() {
        System.out.println("Tocando la flauta.");
    }
    @Override
    public void agregar(Instrumento instrumento) {
        throw new UnsupportedOperationException("No se pueden agregar instrumentos a una flauta.");
    }
    @Override
    public void eliminar(Instrumento instrumento) {
        throw new UnsupportedOperationException("No se pueden eliminar instrumentos de una flauta.");
    }
}
