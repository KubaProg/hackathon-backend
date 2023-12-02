package pl.nullpointers.hackathonbackend.Filter;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.nullpointers.hackathonbackend.Cable.CableData;
import pl.nullpointers.hackathonbackend.Cable.CableOutput;
import pl.nullpointers.hackathonbackend.inputHandler.Input;

import java.util.List;

@RestController
public class FilterController {

    private FilterService filterService;



    public FilterController(FilterService filterService) {
        this.filterService = filterService;
    }

    @GetMapping("/filter-cables")
    public ResponseEntity<List<CableData>> filterCables(Input input) {
        return ResponseEntity.ok(filterService.filterCables(input));
    }
}
