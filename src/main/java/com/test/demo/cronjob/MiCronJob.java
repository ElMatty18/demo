package com.test.demo.cronjob;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MiCronJob {

    // Ejecutar cada 5 segundos
    @Scheduled(cron = "*/5 * * * * *")
    public void tareaProgramada() {
        System.out.println("Tarea programada ejecutada cada 5 segundos");
    }

    // Ejecutar todos los días a las 12:00 (mediodía)
    @Scheduled(cron = "0 0 12 * * ?")
    public void tareaMediodia() {
        System.out.println("Tarea ejecutada a las 12:00 PM");
    }
}
