package com.content.contentmanagementsystem.content;

import com.content.contentmanagementsystem.project.Project;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Getter
@Setter
public class CreateContentDTO {
    private String photo;
    private Integer position;
    private String subject;
    private String photoCredit;
    private ObjectId project;
    private String content;


    public Content toContent(){
        Project contentProject = new Project();
        contentProject.setId(this.project);
        return new Content().setPosition(position).setContent(content).setPhoto(photo).setPhotoCredit(photoCredit).setDeleted(false).setProject(contentProject);

    }

    @Override
    public String toString() {
        return "CreateContentDTO{" +
                "photo='" + photo + '\'' +
                ", position=" + position +
                ", subject='" + subject + '\'' +
                ", photoCredit='" + photoCredit + '\'' +
                ", project=" + project +
                ", content='" + content + '\'' +
                '}';
    }
}


