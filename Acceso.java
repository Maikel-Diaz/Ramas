public class Acceso
{
    private int ano;
    private int mes;
    private int dia;
    private int hora;
    private int minutos;
    private String paginaWeb;
    private String direccionIP;
    private String codigo;
    public Acceso(String datosAccesoServidor)
    {
        String[] datosAccesoSeparados = datosAccesoServidor.split("");
        ano = Integer .parseInt(datosAccesoSeparados[1].substring(1,5));
        mes = Integer .parseInt(datosAccesoSeparados[2]);
        dia = Integer .parseInt(datosAccesoSeparados[3]);
        hora = Integer .parseInt(datosAccesoSeparados[4]);
        minutos = Integer .parseInt(datosAccesoSeparados[5].substring(0,2));
        paginaWeb = datosAccesoSeparados[6];
        direccionIP = datosAccesoSeparados[0];
        codigo = datosAccesoSeparados[7];
    }
    
    public int getAno() 
    {
        return ano;
    }
    
    public int getMes()
    {
        return mes;
    }
    
    public int getDia()
    {
        return dia;
    }
    
    public int getHora()
    {
        return hora;
    }
    
    public int getMinutos()
    {
        return minutos;
    }
    
    public String getPaginaWeb()
    {
        return paginaWeb;
    }
    
    public String getDireccionIP()
    {
        return direccionIP;
    }
    
    public String getCodigo()
    {
        return codigo;
    }
}