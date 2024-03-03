package com.content.contentmanagementsystem.project;

import com.content.contentmanagementsystem.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(callSuper = true)
@Document
@Accessors(chain = true)
@Data

public class Project  extends BaseModel {

    private String name;

    public Project() {
    }


    public Project(ObjectId id, String name) {
        super(id);
        this.name= name;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                '}';
    }

}
