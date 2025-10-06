// Cliente
public class Main {
    public static void main(String[] args) {
        Instrumento tambor = new Tambor();
        Instrumento bateria = new Bateria();
        Instrumento flauta = new Flauta();
        Instrumento trompeta = new Trompeta();
        Instrumento guitarra = new Guitarra();
        Instrumento violin = new Violin();

        GrupoInstrumentos grupoPercusion = new GrupoInstrumentos();
        grupoPercusion.agregar(tambor);
        grupoPercusion.agregar(bateria);

        GrupoInstrumentos grupoAire = new GrupoInstrumentos();
        grupoAire.agregar(flauta);
        grupoAire.agregar(trompeta);

        GrupoInstrumentos grupoCuerdas = new GrupoInstrumentos();
        grupoCuerdas.agregar(guitarra);
        grupoCuerdas.agregar(violin);

        GrupoInstrumentos orquesta = new GrupoInstrumentos();
        orquesta.agregar(grupoPercusion);
        orquesta.agregar(grupoAire);
        orquesta.agregar(grupoCuerdas);

        System.out.println("=== Afinando orquesta ===");
        orquesta.afinar();

        System.out.println("\n=== Tocando orquesta ===");
        orquesta.tocar();
    }
}