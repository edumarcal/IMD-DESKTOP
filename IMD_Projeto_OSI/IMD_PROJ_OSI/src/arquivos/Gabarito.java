// Agradeço a Deus pelo dom do conhecimento
// Eduardo Marçal
// Código fonte criado em: 22/11/14
package arquivos;

import java.util.ArrayList;

/**
 *
 * @author Eduardo
 */
public class Gabarito {

    ArrayList<Camadas> camadas = new ArrayList<>();

    public void addCamada(Camadas camadas) {
        this.camadas.add(camadas);
    }

    public String camadaFisica() {
        String txt = null;
        for (Camadas camada : camadas) {
           txt = this.camadas.get(0).toString();
        }
        return txt;
    }

    public String camadaEnlace() {
        return this.camadas.get(1).toString();
    }

    public String camadaRede() {
        return this.camadas.get(2).toString();
    }

    public String camadaTransporte() {
        return this.camadas.get(3).toString();
    }

    public String camadaSessao() {
        return this.camadas.get(4).toString();
    }

    public String camadaApresentacao() {
        return this.camadas.get(5).toString();
    }

    public String camadaAplicacao() {
        return this.camadas.get(6).toString();
    }
}
