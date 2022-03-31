
public class NuevaClase extends Datos implements InterfazCuarta {

	@Override
	public void cuarta() {
	
		System.out.println("soy interfaz 4" );
		
	}

	@Override
	public void primera1() {
	
		System.out.println("soy interfaz 1A");
		
	}

	@Override
	public void primera2() {
		
		System.out.println("soy interfaz 1B");
		
	}

	@Override
	public void segunda1() {
		
		System.out.println("soy interfaz 2A");
		
	}

	@Override
	public void segunda2() {
		
		System.out.println("soy interfaz 2B");
		
	}

	@Override
	public void tercea2() {
		
		System.out.println("soy interfaz 3B");
		
	}

	@Override
	public void tercera1() {
		
		System.out.println("soy interfaz 3A");
		
	}
	
	public void metodoPrimera( InterfazPrimera primera){
		
		primera.primera1();
		primera.primera2();
		System.out.println("soy metodo primera interfaz ");
	}

	public void metodoSegundo(InterfazSegunda segunda){
	
		segunda.segunda1();
		segunda.segunda2();
		
		System.out.println("soy metodo segunda interfaz");
	}
	
	public void metodoTercero(InterfazTercera tercera){
		
		tercera.tercea2();
		tercera.tercera1();
		
		System.out.println("soy metodo tercera interfaz");
	}
	
	public void metodoCuarta(InterfazCuarta cuarta){
		
		cuarta.primera1();
		cuarta.segunda1();
		cuarta.tercera1();
		System.out.println("soy metodo cuarta interfaz");
	}

}
