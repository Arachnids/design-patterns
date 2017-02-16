package phone;



public class Iphone extends Dispositivo implements DispositivoT {

	
	public PhotoCamera camara;

    public Iphone()
    {
    	photocamera = new _10mgpxcamera();
    	conectorUSB = new USAPlug();
    }
    
    @Override
	public void seleccionar()
	{
		
	}
	
	@Override
	public void tPlug() {
		
		
	}

	@Override
	public void ConexionCamaraFoto() {
		// TODO Auto-generated method stub
		camara.tirarFoto();
		Disco.guardandoFoto();
	}

	@Override
	public void ConexionCamaraVideo() {
		// TODO Auto-generated method stub
		
	}
	
}
