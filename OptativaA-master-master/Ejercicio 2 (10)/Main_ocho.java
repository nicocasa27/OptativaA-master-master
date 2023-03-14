import java.util.UUID;

public class Main_ocho {
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        String password = uuid.toString().substring(0, 8); //Obtiene los primeros 8 caracteres de la UUID
        System.out.println("Contraseña generada: " + password);
    }
}
