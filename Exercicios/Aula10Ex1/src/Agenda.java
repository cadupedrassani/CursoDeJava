import java.security.GeneralSecurityException;
import java.util.ArrayList;

public class Agenda {

	private ArrayList<Contato> contatos;

    public Agenda(){
    	contatos = new ArrayList<Contato>();
    }
    
    public void addContato(Contato c){   
    	contatos.add(c);
    }
}
