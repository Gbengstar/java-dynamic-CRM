package com.content.contentmanagementsystem.content;

import com.content.contentmanagementsystem.project.Project;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import org.bson.types.ObjectId;
import org.springframework.core.convert.converter.Converter;

public class ProjectReadConverter implements Converter<DBObject, Project> {

    @Override
    public Project convert(DBObject source) {
        Project p = new Project((ObjectId) source.get("_id"), (String) source.get("name"));
        p.setName((String) source.get("name"));
        return p;
    }
}
