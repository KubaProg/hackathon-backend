package pl.nullpointers.hackathonbackend.Cable.Filter;

import org.springframework.web.bind.annotation.RestController;

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
