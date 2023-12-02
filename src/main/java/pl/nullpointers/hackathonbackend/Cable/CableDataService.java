package pl.nullpointers.hackathonbackend.CableRecord;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Service
public class CableDataService {

    @Autowired
    private CableDataRepository cableDataRepository;

    @Autowired
    private ConductorCrossSectionRepository conductorCrossSectionRepository;

    public void saveCableDataFromFile(String filePath) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            CableData[] cableDataArray = objectMapper.readValue(new File(filePath), CableData[].class);

            List<CableData> cableDataList = Arrays.asList(cableDataArray);

            // Save each CableData object along with its ConductorCrossSection objects
            for (CableData cableData : cableDataList) {
                // Save the CableData object
                cableDataRepository.save(cableData);

                // Set the CableData reference for each ConductorCrossSection
                if (cableData.getConductorCrossSections() != null) {
                    for (ConductorCrossSection conductorCrossSection : cableData.getConductorCrossSections()) {
                        conductorCrossSection.setCableData(cableData);
                        conductorCrossSectionRepository.save(conductorCrossSection);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
