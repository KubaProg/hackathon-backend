package pl.nullpointers.hackathonbackend.Filter;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class FilterService {



    private static final Map<String, String> METAL_TYPE_MAPPING = new HashMap<>();

    static {
        METAL_TYPE_MAPPING.put("a", "Cu");
        METAL_TYPE_MAPPING.put("b", "Al");
    }

    public boolean filterCable(String cableType, String metalType, String insulationType, int numberOfCores, String numberOfLoadedCoresType, String installationMethod) {
        return filterByMetalType(cableType, metalType)
                && filterByInsulationType(cableType, insulationType)
                && filterByNumberOfLoadedCores(numberOfCores, numberOfLoadedCoresType)
                && filterByInstallationMethod(installationMethod);
    }

    private boolean filterByMetalType(String cableType, String metalType) {
        // Przemapuj metalType przy użyciu mapy
        String mappedMetalType = METAL_TYPE_MAPPING.get(metalType);

        if ("Cu".equals(mappedMetalType)) {
            return cableType.matches("^(YDY|YDYp|YKY|YKXS|N2XH).*$");
        } else if ("Al".equals(mappedMetalType)) {
            return cableType.equals("YAKXS");
        }
        return false;
    }

    private boolean filterByInsulationType(String cableType, String insulationType) {
        if (insulationType.equals("a")) {
            return cableType.equals("YKY") && getMaxTemperature(cableType) == 70;
        } else if (insulationType.equals("b")) {
            return (cableType.equals("YKXS") || cableType.equals("YAKXS")) && getMaxTemperature(cableType) == 90;
        } else if (insulationType.equals("c")) {
            return cableType.equals("N2XH") && getMaxTemperature(cableType) == 90;
        }
        return false;
    }

    private int getMaxTemperature(String cableType) {
        switch (cableType) {
            case "YKY":
                return 70;
            case "YKXS":
            case "YAKXS":
            case "N2XH":
                return 90;
            default:
                return 0;
        }
    }

    private boolean filterByNumberOfLoadedCores(int numberOfCores, String numberOfLoadedCoresType) {
        if (numberOfLoadedCoresType.equals("a")) {
            return numberOfCores == 2;
        } else if (numberOfLoadedCoresType.equals("b") || numberOfLoadedCoresType.equals("c")) {
            return numberOfCores == 3;
        }
        return false;
    }

    private boolean filterByInstallationMethod(String installationMethod) {
        // Zakładam, że przekazane wartości odpowiadają dostępnym wartościom
        return installationMethod.equals("A1") || installationMethod.equals("A2")
                || installationMethod.equals("B1") || installationMethod.equals("B2")
                || installationMethod.equals("E") || installationMethod.equals("F")
                || installationMethod.equals("D1") || installationMethod.equals("D2");
    }


}
