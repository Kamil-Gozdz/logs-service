package pl.niepracuj.logsservice.model.mapper;

import org.springframework.stereotype.Component;
import pl.niepracuj.logsservice.model.dto.LogDto;
import pl.niepracuj.logsservice.model.entity.Log;

@Component
public class LogMapper {

    public LogDto toDto(Log log){
        return LogDto.builder()
                .id(log.getId())
                .loggedOn(log.getLoggedOn())
                .message(log.getMessage())
                .build();
    }
    public Log toNewEntity(LogDto logDto){
        return  Log.builder()
                .message(logDto.getMessage())
                .loggedOn(logDto.getLoggedOn())
                .build();
    }
}
