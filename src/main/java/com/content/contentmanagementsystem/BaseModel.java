package com.content.contentmanagementsystem;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;
import java.util.Date;

@Setter
@Getter
public abstract class BaseModel {
     @MongoId(FieldType.OBJECT_ID)
     protected ObjectId id;

     protected Date createdAt;

     protected Date updatedAt;

     public BaseModel() {
          
     }

     public BaseModel(ObjectId id) {
          this.id = id;
     }
}
