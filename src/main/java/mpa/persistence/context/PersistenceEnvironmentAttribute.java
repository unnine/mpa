package mpa.persistence.context;

public class PersistenceEnvironmentAttribute {

    static boolean AUDITING = true;


    public static void startAuditing() {
        AUDITING = true;
    }

    public static void stopAuditing() {
        AUDITING = false;
    }
}
