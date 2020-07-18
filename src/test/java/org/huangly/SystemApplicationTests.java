package org.huangly;

import org.huangly.domain.Org;
import org.huangly.domain.OrgStruct;
import org.huangly.domain.Subj;
import org.huangly.domain.SubjStruct;
import org.huangly.service.OrgService;
import org.huangly.service.OrgStructService;
import org.huangly.service.SubjService;
import org.huangly.service.SubjStructService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.List;

@SpringBootTest
class SystemApplicationTests {

    @Autowired
    OrgStructService orgStructService;

    @Test
    void testAddOrgStruct(){

        OrgStruct orgStruct=new OrgStruct();
        orgStruct.setName("管理机构");
        String id = orgStructService.insert(orgStruct).getId();


        OrgStruct orgStructGN=new OrgStruct();
        orgStructGN.setName("国内");
        orgStructGN.setPid(id);
        String id2 = orgStructService.insert(orgStructGN).getId();

        OrgStruct orgStructGNGS1=new OrgStruct();
        orgStructGNGS1.setCode("C01");
        orgStructGNGS1.setName("公司11111");

        orgStructGNGS1.setRelateOrgCode("C01");
        orgStructGNGS1.setRelateOrgName("公司1");
        orgStructGNGS1.setRelateOrgId("5f0adebf97698b37d820819e");
        orgStructGNGS1.setPid(id2);

        OrgStruct orgStructGNGS2=new OrgStruct();
        orgStructGNGS2.setCode("C02");
        orgStructGNGS2.setName("公司2");
        orgStructGNGS2.setRelateOrgCode("C02");
        orgStructGNGS2.setRelateOrgName("公司2");
        orgStructGNGS2.setRelateOrgId("5f0adebf97698b37d820819f");
        orgStructGNGS2.setPid(id2);

        orgStructService.insert(orgStructGNGS1);
        orgStructService.insert(orgStructGNGS2);


        OrgStruct orgStructGW=new OrgStruct();
        orgStructGW.setName("国外");
        orgStructGW.setPid(id);
        String id3 = orgStructService.insert(orgStructGW).getId();


        OrgStruct orgStructGWGS1=new OrgStruct();
        orgStructGWGS1.setCode("C01");
        orgStructGWGS1.setName("公司11111");

        orgStructGWGS1.setRelateOrgCode("C01");
        orgStructGWGS1.setRelateOrgName("公司1");
        orgStructGWGS1.setRelateOrgId("5f0adebf97698b37d820819e");
        orgStructGWGS1.setPid(id3);

        OrgStruct orgStructGWGS2=new OrgStruct();
        orgStructGWGS2.setCode("C02");
        orgStructGWGS2.setName("公司2222222222");
        orgStructGWGS2.setRelateOrgCode("C02");
        orgStructGWGS2.setRelateOrgName("公司2");
        orgStructGWGS2.setRelateOrgId("5f0adebf97698b37d820819f");
        orgStructGWGS2.setPid(id3);
        orgStructService.insert(orgStructGWGS1);
        orgStructService.insert(orgStructGWGS2);


    }



    @Autowired
    SubjService subjService;
    @Autowired
    SubjStructService subjStructService;

    @Test
    void testAddSubj(){
        Subj subj=new Subj();
        subj.setCode("100101");
        subj.setName("现金-人民币");

        String idxianjin= subjService.insert(subj).getId();

        Subj subj2=new Subj();
        subj2.setCode("1002010101");
        subj2.setName("银行存款-中国银行-人民币-祝溏支行");

        String idyinhang= subjService.insert(subj2).getId();


        SubjStruct subjStruct1=new SubjStruct();

        subjStruct1.setName("资产负债表");
        subjStruct1.setOwner("ZI-CHANG-FU-ZAI报表菜单节点");

        String iddddddd = subjStructService.insert(subjStruct1).getId();

        SubjStruct subjStruct=new SubjStruct();

        subjStruct.setName("现金流量表");
        subjStruct.setOwner("XIAN-JIN-Liu-Liang报表菜单节点");

        String idxjllb = subjStructService.insert(subjStruct).getId();

        SubjStruct subjStruct_XJ=new SubjStruct();
        subjStruct_XJ.setCode("100101");
        subjStruct_XJ.setName("现金-人民币");
        subjStruct_XJ.setPid(iddddddd);
        subjStructService.insert(subjStruct_XJ);

        SubjStruct subjStruct_YH=new SubjStruct();
        subjStruct_YH.setCode("1002010101");
        subjStruct_YH.setName("银行存款-中国银行-人民币-祝溏支行");
        subjStruct_YH.setPid(iddddddd);
        subjStructService.insert(subjStruct_YH);    }
}
