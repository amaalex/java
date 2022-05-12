package compulsory.management;

import net.bytebuddy.agent.builder.AgentBuilder;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * global management for EntityManagerFactory
 */
public class GlobalManagement {
    private static EntityManagerFactory emf = null;
    private static GlobalManagement singleInstance = null;

    private GlobalManagement(){
        GlobalManagement.emf = Persistence.createEntityManagerFactory("appPU");
    }

    /**
     * retunrning a reference for an EntityManagerFactory already created
     *
     * @return reference
     */
    public static EntityManagerFactory getEntityManagerFactory() {
        if(singleInstance == null){
            singleInstance = new GlobalManagement();
        }
        return GlobalManagement.emf;
    }

    /**
     * this method closes the connection for the running EntityManagerFactory
     */
    public static void closeEntityManagerFactory() {
        GlobalManagement.emf.close();
    }
}
