package com.content.contentmanagementsystem.content;

import com.content.contentmanagementsystem.BaseModel;
import com.content.contentmanagementsystem.project.Project;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.bson.types.ObjectId;
import org.springframework.core.convert.Property;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Date;
@EqualsAndHashCode(callSuper = true)
@Document(collection = "content")
@Accessors(chain = true)
@Data
public class Content  extends BaseModel {
    private String photo;
    private Integer position;
    private String subject;
    private String photoCredit;
    @DBRef()
    private Project project;
    private String content;
    private Boolean deleted;





}
