package org.huangly.domain;

import lombok.Data;
import org.huangly.common.TreeData;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection="sys_org")
public class Org extends TreeData {
    @Id
    private String id;
    @Field("name")
    private String name;
    @Field("code")
    private String code;
    @Field("pid")
    private String pid;


    @Override
    public String getpk() {
        return id;
    }

    @Override
    public String getParentPk() {
        return pid;
    }
}
