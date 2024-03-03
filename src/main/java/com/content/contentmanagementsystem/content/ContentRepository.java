package com.content.contentmanagementsystem.content;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContentRepository  extends MongoRepository<Content,String> {

    List<Content> findByProject(ObjectId projectId);
}
