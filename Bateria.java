class Bateria implements Instrumento {
    @Override
    public void afinar() {
        System.out.println("Afinando la batería.");
    }
    @Override
    public void tocar() {
        System.out.println("Tocando la batería.");
    }
    @Override
    public void agregar(Instrumento instrumento) {
        throw new UnsupportedOperationException("No se pueden agregar instrumentos a una batería.");
    }
    @Override
    public void eliminar(Instrumento instrumento) {
        throw new UnsupportedOperationException("No se pueden eliminar instrumentos de una batería.");
    }
}