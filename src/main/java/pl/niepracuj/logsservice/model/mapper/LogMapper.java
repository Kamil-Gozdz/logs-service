package pl.niepracuj.logsservice.model.mapper;

import org.mapstruct.Mapper;
import pl.niepracuj.logsservice.model.dto.LogDto;
import pl.niepracuj.logsservice.model.entity.Log;

@Mapper(componentModel = "spring")
public interface LogMapper {
LogDto logToDto (Log log);
Log logDtoToLog (LogDto logDto);

}
