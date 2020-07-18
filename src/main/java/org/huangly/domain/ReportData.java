package org.huangly.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;

@ApiModel("业务报表数据")
@Data
@Document(collection="sys_report_data")
public class ReportData {
    @Id
    private String id;
    @ApiModelProperty("组织id")

    @Field("org_id")
    private String orgId;
    @ApiModelProperty("期间yyyy-MM")
    @Field("period")
    private String period;
    @ApiModelProperty("调整层")
    @Field("adjust")
    private String adjust;
    @ApiModelProperty("数据类型")
    @Field("type")
    private String type;
    @ApiModelProperty("凭证号")
    @Field("voucher_no")
    private String voucherNo;
    @ApiModelProperty("来源id")
    @Field("source_id")
    private String sourceId;
    @ApiModelProperty("辅助核算")
    @Field("auxiliary")
    private String auxiliary;
    @ApiModelProperty("部门id")
    @Field("dept_id")
    private String deptId;
    @ApiModelProperty("科目id")
    @Field("subj_id")
    private String subjId;
    @ApiModelProperty("金额")
    @Field("amout")
    private BigDecimal amout;

}
