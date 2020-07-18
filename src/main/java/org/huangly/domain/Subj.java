package org.huangly.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("sys_subj")
@Data
public class Subj {
    @Id
    private String id;
    @Field("code")
    private String code;
    @Field("name")
    private String name;
}
