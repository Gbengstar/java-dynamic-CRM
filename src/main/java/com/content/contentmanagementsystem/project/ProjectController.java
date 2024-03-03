package com.content.contentmanagementsystem.project;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/project")
public class ProjectController {

    public ProjectController(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    private final ProjectRepository projectRepository;

    @GetMapping()
    public List<Project> findAll(){
        return projectRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Project> findById(@PathVariable String id){
        return projectRepository.findById(id);
    }

    @PostMapping()
    public ResponseEntity<Project>createOne(@RequestBody CreateProjectDTO createProjectDTO ){

        return new ResponseEntity< >(projectRepository.save(createProjectDTO.toProject()), HttpStatus.CREATED);
    }



}
