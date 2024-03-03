package com.content.contentmanagementsystem.content;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/content")
public class ContentController {
    @Autowired
    ContentRepository contentRepository;

    @GetMapping()
    public ResponseEntity<List<Content>> findAll(){
        return new ResponseEntity<>(contentRepository.findAll(), HttpStatus.OK) ;
    }

    @PostMapping()
    public ResponseEntity<Content> createOne(@RequestBody CreateContentDTO createContentDto){
        Content rawContent=createContentDto.toContent();
        Content content=contentRepository.save(rawContent);
        return new ResponseEntity<>(content, HttpStatus.CREATED) ;
    }

    @GetMapping("/{project}")
    public ResponseEntity<List<Content>> findContentsOfProject(@PathVariable String project){
        ObjectId projectId= new ObjectId(project);
        return new ResponseEntity<>(contentRepository.findByProject(projectId), HttpStatus.OK) ;
    }


}
