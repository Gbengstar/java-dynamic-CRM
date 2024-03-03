package com.content.contentmanagementsystem.project;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.Repository;

public interface ProjectRepository extends MongoRepository<Project,String> {
}
