package estructuras;
import objetos.*;
/**
 *
 * @author Jonathan Flores
 */
public class ListaDL
{
    private Nodo frente, fin;

    public boolean empty()
    {
        return (frente == null && fin == null);
    }
    
    public void insert (Nodo n)
    {
        if (empty()) frente = fin = n;
        else
        {
            Nodo aux = frente;
            while (aux != null && (((Factura)n.getInfo()).getSemestre() >= ((Factura)aux.getInfo()).getSemestre()))
            {
                aux = aux.getAtr();
            }
            
            if (aux == null)
            {
                fin.setAtr(n);
                n.setSig(fin);
                fin = n;
            }
            else
            {
                if (aux == frente)
                {
                    frente.setSig(n);
                    n.setAtr(frente);
                    frente = n;
                }
                else
                {
                    aux.getSig().setAtr(n);
                    n.setAtr(aux);
                    n.setSig(aux.getSig());
                    aux.setSig(n);
                }
            }
        }
    }
}
