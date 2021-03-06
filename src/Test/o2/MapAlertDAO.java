package Test.o2;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class MapAlertDAO implements AlertService {
    private final Map<UUID, Date> alerts = new HashMap<UUID, Date>();
        
    public UUID addAlert(Date time) {
        UUID id = UUID.randomUUID();
        this.alerts.put(id, time);
        return id;
    }

    public Date getAlert(UUID id) {
        return this.alerts.get(id);
    }

    @Override
    public UUID raiseAlert() {
        return this.storage.addAlert(new Date());
    }

    @Override
    public Date getAlertTime() {
        UUID id = null;
        return this.storage.getAlert(id);
    }
}
