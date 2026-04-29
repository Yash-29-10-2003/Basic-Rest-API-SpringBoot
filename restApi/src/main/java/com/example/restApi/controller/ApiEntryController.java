package com.example.restApi.controller;

//controllers are just special components that handle http requests.

import com.example.restApi.entitiy.ApiEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api") //adds the /api mapping to the whole class
public class ApiEntryController {
    private Map<Long, ApiEntry> apiEntries = new HashMap();

    @GetMapping // gets mapped for /api for GET hits
    public List<ApiEntry> getAll(){
        return new ArrayList<>(apiEntries.values());
    }

    @PostMapping // gets mapped for /api for POST hits
    public boolean createEntry(@RequestBody ApiEntry myEntry){
        apiEntries.put(myEntry.getId(), myEntry);
        return true;
    }

    @GetMapping("id/{myId}") //get for api/id endpoint, storing id in a myId variable here
    public ApiEntry getApiEntryById(@PathVariable Long myId){
        return apiEntries.get(myId);
    }

    @DeleteMapping("id/{myId}") //delete for api/id endpoint, storing id in a myId variable here
    public ApiEntry deleteApiEntryById(@PathVariable Long myId){
        return apiEntries.remove(myId);
    }

    @PutMapping("id/{myId}") //put for api/id endpoint, storing id in a myId variable here
    public ApiEntry updateApiEntryById(@PathVariable Long myId , @RequestBody ApiEntry myEntry){
        return apiEntries.put(myId , myEntry);
    }
}
