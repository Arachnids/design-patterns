package phone;


public class Samsung extends Dispositivo implements DispositivoT  {


	public VideoCamera camara;
	
	
	public Samsung()
	{
		videocamera = new _10mgpxvideo();
		conectorUSB = new EUPlug();
	}

	@Override
	public void seleccionar() {
		
		
	}
	
	@Override
	public void tPlug() {
	}	
	

	@Override
	public void ConexionCamaraVideo() {
		camara.grabarvideo();
		Disco.guardandoVideo();

		
	}

	@Override
	public void ConexionCamaraFoto() {
		// TODO Auto-generated method stub
		
	}
}
