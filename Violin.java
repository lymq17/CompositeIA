class Violin implements Instrumento {
    @Override
    public void afinar() {
        System.out.println("Afinando el violín.");
    }
    @Override
    public void tocar() {
        System.out.println("Tocando el violín.");
    }
    @Override
    public void agregar(Instrumento instrumento) {
        throw new UnsupportedOperationException("No se pueden agregar instrumentos a un violín.");
    }
    @Override
    public void eliminar(Instrumento instrumento) {
        throw new UnsupportedOperationException("No se pueden eliminar instrumentos de un violín.");
    }
}
