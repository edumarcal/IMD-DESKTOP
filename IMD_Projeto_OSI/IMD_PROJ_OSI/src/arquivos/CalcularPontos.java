// Agradeço a Deus pelo dom do conhecimento
// Eduardo Marçal
// Código fonte criado em: 23/11/14

package arquivos;

/**
 *
 * @author Eduardo
 */
public class CalcularPontos {

    int ponto;
    private String parcial1;
    private String parcial2;
    private String parcial3;
    private String parcial4;
    private String parcial5;
    private String parcial6;
    private String parcial7;

    public String notaFinal() {
        int c1 = Integer.parseInt(this.parcial1);
        int c2 = Integer.parseInt(this.parcial2);
        int c3 = Integer.parseInt(this.parcial3);
        int c4 = Integer.parseInt(this.parcial4);
        int c5 = Integer.parseInt(this.parcial5);
        int c6 = Integer.parseInt(this.parcial6);
        int c7 = Integer.parseInt(this.parcial7);
        int nota = (c1+c2+c3+c4+c5+c6+c7)/7;
        return String.valueOf(nota);
    }

    /**
     * @param parcial1 the parcial1 to set
     */
    public void setParcial1(String parcial1) {
        this.parcial1 = parcial1;
    }

    /**
     * @param parcial2 the parcial2 to set
     */
    public void setParcial2(String parcial2) {
        this.parcial2 = parcial2;
    }

    /**
     * @param parcial3 the parcial3 to set
     */
    public void setParcial3(String parcial3) {
        this.parcial3 = parcial3;
    }

    /**
     * @param parcial4 the parcial4 to set
     */
    public void setParcial4(String parcial4) {
        this.parcial4 = parcial4;
    }

    /**
     * @param parcial5 the parcial5 to set
     */
    public void setParcial5(String parcial5) {
        this.parcial5 = parcial5;
    }

    /**
     * @param parcial6 the parcial6 to set
     */
    public void setParcial6(String parcial6) {
        this.parcial6 = parcial6;
    }

    /**
     * @param parcial7 the parcial7 to set
     */
    public void setParcial7(String parcial7) {
        this.parcial7 = parcial7;
    }
}
