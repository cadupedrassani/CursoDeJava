
public class Normal extends Ingresso {

	@Override
	public String imprimir(){
		String msg;
		msg = "Ingresso normal. Valor: " + getValor();
		return msg;
	}
}
