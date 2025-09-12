package mpa.persistence.context;

public class PersistenceEnvironment {

    private boolean auditing = true;


    public boolean isAuditing() {
        return auditing;
    }

    public void activateAuditing() {
        auditing = true;
    }

    public void deactivateAuditing() {
        auditing = false;
    }
}
