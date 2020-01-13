/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;


import java.util.Iterator;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import universidad.entity.Alumno;
import universidad.util.NewHibernateUtil;
/**
 *
 * @author Carlos
 */
public class Universidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SessionFactory sfactory = NewHibernateUtil.getSessionFactory();
        Session session = sfactory.openSession();
        
        Alumno alumno=new Alumno();
        Query q=session.createQuery("from Alumno as al inner join MatriculaId as ma on al.dni=ma.dni inner join Asignatura as asig on asig.codAsig=ma.codAsig"
                + "where ma.notaF=>5");
        Iterator<?>iter=q.iterate();
        while(iter.hasNext()){
            alumno=(Alumno)iter.next();
            System.out.println(alumno.getDni()+"\n"+alumno.getNombre());
        }
        session.close();
    }
    
}
