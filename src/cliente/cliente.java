package cliente;

public class cliente {
	String _nome;
	cliente(String nome){
		set_nome(nome);
	}
	private void set_nome(String _nome) {
		this._nome = _nome;
	}
	public String get_nome() {
		return _nome;
	}
}
