# FIUBA
### Sistema para contabilizar materias aprobadas

```java
public class materia {
    public codigoMateria codigo;
    public String nombre;
    public final int creditos;
}

public enum codigoMateria { materias }

public class alumno {
    private final int padron;
    private String nombre;
    private List<Carrera> carreras;
    private List<materia> materias_aprobadas;

    public void inscribirCarrera(String nombreCarrera) {}
    public void aprobarMateria(codigoMateria codigo){}
    public List<Carrera> getCarrerasTerminadas() {}
}

public class carrera {
    public Carreras nombre;
    public int creditos_necesarios;
    public List<Materia> electivas;
    public List<Materia> obligatorias;
}

public enum Carreras { carreras }

public class Facultad {
    private List<Carrera> carreras;
    private List<Materia> materias;
    private List<Alumno> alumnos;

    public List<Alumno> getRecibidos() {}
}
```