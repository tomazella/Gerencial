package cliente;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cliente cli = new cliente("Gilberto","Luiz");
		System.out.println(cli.get_nome()+" "+cli.get_sobreNome());
		cliente cli2 = new cliente("Thiago","Tomazella");
		System.out.println(cli2.get_nome()+" "+cli2.get_sobreNome());
	}

}
