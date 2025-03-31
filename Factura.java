package objetos;

/**
 *
 * @author Jonathan Flores
 */
public class Factura
{
    private short noFactura;
    private double precio;
    private double cantidad;
    private String desc;

    public short getNoFactura()
    {
        return noFactura;
    }

    public void setNoFactura(short noFactura)
    {
        this.noFactura = noFactura;
    }

    public double getPrecio()
    {
        return precio;
    }

    public void setPrecio(double precio)
    {
        this.precio = precio;
    }

    public double getCantidad()
    {
        return cantidad;
    }

    public void setCantidad(double cantidad)
    {
        this.cantidad = cantidad;
    }

    public String getDesc()
    {
        return desc;
    }

    public void setDesc(String desc)
    {
        this.desc = desc;
    }
    
    public double importe()
    {
        return precio * cantidad;
    }
}
