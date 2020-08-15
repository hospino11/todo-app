package io.schultz.dustin.todoapp.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

@Component
public class MaxMemoryHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        Status maxMemoryStatus = Runtime.getRuntime().maxMemory() < 500 ? Status.DOWN : Status.UP;
        return Health.status(maxMemoryStatus).build();
    }
}
