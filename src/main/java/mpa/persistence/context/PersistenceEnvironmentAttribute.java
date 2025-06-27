package mpa.persistence.context;

public class PersistenceEnvironmentAttribute {

    static boolean AUDITING = true;


    public static boolean isAuditing() {
        return AUDITING;
    }

    public static void activateAuditing() {
        AUDITING = true;
    }

    public static void deactivateAuditing() {
        AUDITING = false;
    }
}
