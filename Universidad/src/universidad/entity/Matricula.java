package universidad.entity;
// Generated 13-ene-2020 20:34:36 by Hibernate Tools 4.3.1



/**
 * Matricula generated by hbm2java
 */
public class Matricula  implements java.io.Serializable {


     private MatriculaId id;
     private int notaF;

    public Matricula() {
    }

    public Matricula(MatriculaId id, int notaF) {
       this.id = id;
       this.notaF = notaF;
    }
   
    public MatriculaId getId() {
        return this.id;
    }
    
    public void setId(MatriculaId id) {
        this.id = id;
    }
    public int getNotaF() {
        return this.notaF;
    }
    
    public void setNotaF(int notaF) {
        this.notaF = notaF;
    }




}


