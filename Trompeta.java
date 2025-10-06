class Trompeta implements Instrumento {
    @Override
    public void afinar() {
        System.out.println("Afinando la trompeta.");
    }
    @Override
    public void tocar() {
        System.out.println("Tocando la trompeta.");
    }
    @Override
    public void agregar(Instrumento instrumento) {
        throw new UnsupportedOperationException("No se pueden agregar instrumentos a una trompeta.");
    }
    @Override
    public void eliminar(Instrumento instrumento) {
        throw new UnsupportedOperationException("No se pueden eliminar instrumentos de una trompeta.");
    }
}
