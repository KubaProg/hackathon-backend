package pl.nullpointers.hackathonbackend.Cable;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CableDataMapper {

    CableOutput mapToCableOutput(CableData cable);
}
