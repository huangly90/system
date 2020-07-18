package org.huangly.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(value = "sys_org_struct")
@Data
public class OrgStruct {
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
    @Field("relate_org_code")
    private String relateOrgCode;
    @Field("relate_org_name")
    private String relateOrgName;
}
