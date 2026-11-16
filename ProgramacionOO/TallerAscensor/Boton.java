package ProgramacionOO.TallerAscensor;

public abstract class Boton {

    // Atributos protegidos (#)
    protected boolean iluminado;
    protected boolean funcionando;

    // Atributo privado (-)
    private boolean sonar;

    // Constructor
    public Boton(boolean sonar) {
        this.sonar = sonar;
        this.iluminado = false;
        this.funcionando = true;
    }

    // Metodos del diagrama
    public abstract void presionar();

    public void iluminar() {
        iluminado = true;
    }

    public void apagarIluminacion() {
        iluminado = false;
    }

    public void emitirSonido() {
        if (sonar) {
            System.out.println("   *beep*");
        }
    }

    public boolean estaFallando() {
        return !funcionando;
    }

    // Acceso a atributos (necesarios porque los atributos son protegidos/privados)
    public boolean isIluminado() {
        return iluminado;
    }

    public void setFuncionando(boolean funcionando) {
        this.funcionando = funcionando;
    }
}