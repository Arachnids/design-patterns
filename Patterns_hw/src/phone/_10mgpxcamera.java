package phone;

public class _10mgpxcamera implements PhotoCamera{

	@Override
	public String conectar() {
		
		return "Camara de 10 mgpx ha sido conectada";
	}

	@Override
	public String tirarFoto() {
		return "Se ha tirado la foto";
	}

}
