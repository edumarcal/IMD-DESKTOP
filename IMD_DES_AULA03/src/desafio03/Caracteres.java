// Agradeço a Deus pelo dom do conhecimento
// Eduardo Marçal
// Código fonte criado em: 02/11/14
package desafio03;

/**
 *
 * @author Eduardo
 */
public class Caracteres {

    static String GOL;
    String vogais, consoantes, palavra;
    int qtdCaracteres, qtdConsoantes, qtdVogais;

    public Caracteres(String palavra) {
        this.palavra = palavra;
    }

    public Caracteres() {
    }

    public void contarCaraceteres(String valor) {
        for (int i = 0; i < valor.length(); i++) {
            qtdCaracteres++;
        }
    }

    public void contarConsoantesEVogais(String valor) {
        char parte[] = valor.toUpperCase().toCharArray();
        for (int i = 0; i < parte.length; i++) {
            for (Consoantes c : Consoantes.values()) {
                if (c.equals(parte[i])) {
                    consoantes += 1;
                }
            }
            for (Vogais v : Vogais.values()) {
                if (v.equals(parte[i])) {
                    vogais += 1;
                }
            }
        }
    }
}
