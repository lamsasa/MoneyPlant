package com.MoneyPlant.repository;

import com.MoneyPlant.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    List<Schedule> findByUserId(Long userId);

    Schedule findByScId(Long scId);

    void deleteByScId(Long scId);

    Schedule findByGoogleCalendarIdAndEventId(String googleCalendarId, String eventId);

    boolean existsByGoogleCalendarIdAndEventId(String googleCalendarId, String eventId);
}
