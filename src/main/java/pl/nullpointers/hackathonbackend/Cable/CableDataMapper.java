package pl.nullpointers.hackathonbackend.Cable;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CableDataMapper {

    List<CableOutput> mapToListOfCableOutput(List<CableData> cable);


}
