package kr.megaptera.backend.weekd02.assignment.services;

import kr.megaptera.backend.weekd02.assignment.models.Session;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class SessionManager {

    private long counter = 0;
    private Map<Long, Session> sessions = new HashMap<>();

    public boolean isExist(long id){
        var session = sessions.get(id);
        return session != null;
    }

    public Session get(long id){
        return sessions.get(id);
    }

    public Session register(String userName) {
        var session = new Session(++counter, userName, LocalDate.now());
        sessions.put(session.getId(), session);
        return session;
    }

    public void remove(long id){
        sessions.remove(id);
    }
}
