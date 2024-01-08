package SistemaAcceso;
import java.time.LocalDate;

public class Usuario {
    private String nick;
    private String password;
    private LocalDate UltimoinicioSesion;
    private int nIincios;



    public Usuario(String contrasena, String usuario){
        password =contrasena;
        nick = usuario;
    }
    public String getNick(){
        return nick;
    }
    public void setNick(String nick){
    }
    public String getPasswaord(){
        return password;
    }
    public void setPassword(String password){

    }
}
