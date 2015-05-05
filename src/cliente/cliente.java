package cliente;

public class cliente {
	String _nome;
	String _sobreNome;
	cliente(String nome,String sobreNome){
		set_nome(nome);
		set_sobreNome(sobreNome);
	}
	private void set_sobreNome(String _sobreNome) {
		this._sobreNome = _sobreNome;
	}
	public String get_sobreNome() {
		return _sobreNome;
	}
	private void set_nome(String _nome) {
		this._nome = _nome;
	}
	public String get_nome() {
		return _nome;
	}
}
