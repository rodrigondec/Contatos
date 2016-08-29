package dominio;

public class Usuario {
	private String login;
	private String senha;
	
	public Usuario(String log, String sen){
		login = log;
		senha = sen;
	}
	
	public String getLogin(){
		return login;
	}
	
	public String getSenha(){
		return senha;
	}
}
