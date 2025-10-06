import java.util.ArrayList;
import java.util.List;

// Componente
interface Instrumento {
    void afinar();
    void tocar();
    void agregar(Instrumento instrumento);
    void eliminar(Instrumento instrumento);
}