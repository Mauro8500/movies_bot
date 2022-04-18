package bo.edu.ucb.ingsoft.movies.dto;

public class PermissionDto {
    private String nombre;
    private String apellido;

    public PermissionDto(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;

    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getapellido() {
        return apellido;
    }

    public void setapellido(String apellido) {
        this.apellido = apellido;
    }


    @Override
    public String toString() {
        return "namesactors{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
