package pacote2;

import pacote.Referencia;

public class Referencia2 {
	public void TesteAcessoObjetos() {
		Referencia ref = new Referencia();
		//O objeto default s� � vis�vel para classes no mesmo pacote
		//ref.modificadorDefault = 0;
		
		ref.modificadorPublico = 0;
		
		// O objeto protegido s� � vis�vel para m�todos da classe principal, subclasses e classes no mesmo pacote 
		//ref.modificadorProtegido = 0;
		
		//O objeto privado � vis�vel para m�todos da classe principal
		//ref.modificadorPrivado = 0;
	} 
}
