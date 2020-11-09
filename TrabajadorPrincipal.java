ublic class TrabajadorPrincipal {

	public static void main(String[] args) {
		
		Trabajador Luis = new Trabajador();
		Luis.Nombre = "Luis";
		Luis.Apellido = "Diaz";
		Luis.cedula = 29763189;
		Luis.horas_t = 60;
		Luis.pago_h= 2500;
		
		System.out.print("Estos son los datos del tabajador" + "\nNombre:" + Luis.Nombre + "\nApellido:" + Luis.Apellido + "\nCedula:" + Luis.cedula);
		System.out.println("\nEstas son sus horas extras trabajadas:" + Luis.CalcularHorasExtra());
		System.out.println("Esta es su tarifa por hora:" + Luis.CalcularSalario());
	
	}
}
