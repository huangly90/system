package org.huangly.domain;

import lombok.Data;
import org.huangly.common.TreeData;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(value = "sys_org_struct")
@Data
public class OrgStruct extends TreeData {
    @Id
    private String id;
    @Field("name")
    private String name;
    @Field("code")
    private String code;
    @Field("pid")
    private String pid;
    @Field("relate_org_id")
    private String relateOrgId;
    @Field("child")
    private List<OrgStruct> child;

    @Override
    public String getpk() {
        return id;
    }

    @Override
    public String getParentPk() {
        return pid;
    }
}
