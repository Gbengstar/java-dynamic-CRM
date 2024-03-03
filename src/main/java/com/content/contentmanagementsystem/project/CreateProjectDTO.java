package com.content.contentmanagementsystem.project;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateProjectDTO
{

    private String name;

    public Project toProject(){
        return new Project().setName(name);
    }
}
