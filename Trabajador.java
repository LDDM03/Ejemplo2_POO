public class Trabajador {

	String Nombre;
	String Apellido;
	int cedula;
	float pago_h;
	int horas_t;
	
	Trabajador(){
		Nombre = "";
		Apellido = "";
		cedula = 0; 
		pago_h = 0;
		horas_t = 0;
		
	}


public int CalcularHorasExtra() {
	int horas_e=0;
	if(horas_t > 40) {
		horas_e= horas_t - 40;
		return horas_e;	
	}
	
	else
		return horas_e;
}

public double CalcularSalario() {
	double precioHE;
	double Salario;
	if(CalcularHorasExtra() > 0) {
		precioHE=(double) pago_h * 0.5 + pago_h;
		Salario= 40 * pago_h + CalcularHorasExtra() * precioHE;
	}
	
	else
		Salario= horas_t * pago_h;
	
	return Salario;
	}
}

