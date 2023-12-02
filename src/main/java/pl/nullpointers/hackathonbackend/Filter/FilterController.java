package pl.nullpointers.hackathonbackend.Filter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.nullpointers.hackathonbackend.Cable.CableOutput;

import java.util.List;

@RestController
public class FilterController {

    private FilterService filterService;


    public FilterController(FilterService filterService) {
        this.filterService = filterService;
    }

//    @GetMapping("/filter-cables")
//    public List<CableOutput> filterCables() {
//
//    }
}
