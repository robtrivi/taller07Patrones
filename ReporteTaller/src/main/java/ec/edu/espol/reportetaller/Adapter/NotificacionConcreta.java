package adapter;

/**
 *
 * @author Xavier Cobos
 */
public class NotificacionConcreta {
    
    private NotificacionAdapter adapter;

    public void setAdapter(NotificacionAdapter adapter) {
        this.adapter = adapter;
    }
    public void sendNotification() {
        adapter.sendNotification();
    }
    
}
