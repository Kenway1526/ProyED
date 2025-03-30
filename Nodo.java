package objetos;

/**
 *
 * @author Jonathan Flores
 */
public class Nodo
{
    private Object info;
    private Nodo sig;
    private Nodo atr;

    public Nodo(Object info)
    {
        this.info = info;
        sig = atr = null;
    }

    public Object getInfo()
    {
        return info;
    }

    public void setInfo(Object info)
    {
        this.info = info;
    }

    public Nodo getSig()
    {
        return sig;
    }

    public void setSig(Nodo sig)
    {
        this.sig = sig;
    }

    public Nodo getAtr()
    {
        return atr;
    }

    public void setAtr(Nodo atr)
    {
        this.atr = atr;
    }
}
