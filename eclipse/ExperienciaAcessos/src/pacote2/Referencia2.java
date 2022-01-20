package pacote2;

import pacote.Referencia;

public class Referencia2 {
	public void TesteAcessoObjetos() {
		Referencia ref = new Referencia();
		//O objeto default só é visível para classes no mesmo pacote
		//ref.modificadorDefault = 0;
		
		ref.modificadorPublico = 0;
		
		// O objeto protegido só é visível para métodos da classe principal, subclasses e classes no mesmo pacote 
		//ref.modificadorProtegido = 0;
		
		//O objeto privado é visível para métodos da classe principal
		//ref.modificadorPrivado = 0;
	} 
}
