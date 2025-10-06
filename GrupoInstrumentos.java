// Composite

import java.util.ArrayList;
import java.util.List;

class GrupoInstrumentos implements Instrumento {
    private List<Instrumento> instrumentos = new ArrayList<>();

    @Override
    public void afinar() {
        for (Instrumento instrumento : instrumentos) {
            instrumento.afinar();
        }
    }

    @Override
    public void tocar() {
        for (Instrumento instrumento : instrumentos) {
            instrumento.tocar();
        }
    }

    @Override
    public void agregar(Instrumento instrumento) {
        instrumentos.add(instrumento);
    }

    @Override
    public void eliminar(Instrumento instrumento) {
        instrumentos.remove(instrumento);
    }
}