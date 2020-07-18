package org.huangly.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("sys_subj_struct")
@Data
public class SubjStruct {
    @Id
    private String id;
    @Field("name")
    private String name;
    @Field("code")
    private String code;
    @Field("pid")
    private String pid;
    @Field("owner")
    public String owner;
}
