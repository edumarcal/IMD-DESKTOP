// Agradeço a Deus pelo dom do conhecimento
// Eduardo Marçal
// Código fonte criado em: 22/11/14
package arquivos;

/**
 *
 * @author Eduardo
 */
public class Camadas {

    protected String nomeCamada, descricao, pdu, protocolos[], dispositivos[];

    public Camadas(String nomeCamada, String descricao, String pdu, String[] protocolos, String[] dispositivos) {
        this.nomeCamada = nomeCamada;
        this.descricao = descricao;
        this.pdu = pdu;
        this.protocolos = protocolos;
        this.dispositivos = dispositivos;
    }
}
