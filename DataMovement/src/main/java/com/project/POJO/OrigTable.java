package com.project.POJO;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(Include.NON_NULL)


public class OrigTable {

	private String 
	
			AGREEMENT_NO ,
			ASSET_CATEGORY ,
			ASSET_TYPE,
			BRANCH,
			CFE_ID,
			COA_DSA_MG_EMP_ID,
			CROSS_SELL_PRODUCT,
			CUST_ID,
			EMPLOYEE_GRADE_PER,
			MANUFACTURER,
			OSB_BATCH_ID,
			PRODUCT,
			PSA_FLAG,
			REGION,
			REMARKS,
			RLH,
			RULE_NO,
			SCHEME,
			SCHEME_INCENTIVE,
			SCHEME_TYPE,
			SCHEME_TYPE_ADD,
			SFE_ID,
			SFE_PSA_INCENTIVE,
			STATUS,
			TL_ID,
			ZONE;
	
	private Integer 
	
			ADD_PO_FILE_PROCESSED_COUNT,
			AMOUNT_FINANCED,
			AVG_TEAM_PRODUCTIVITY,
			BROKER_AMT,
			BULK_COUNT_PER,
			BULK_FILE_COUNT,
			BULK_PO,
			BULK_PO_SLAB,
			BUSINESS_IRR,
			CE_ADD_PO,
			CE_NEW_COUNT,
			CE_NEW_VOLUME,
			CE_USED_COUNT,
			CE_USED_VOLUME,
			CE_USED_VOLUME_ADDITIONAL,
			CFE_INCENTIVE,
			CIFCL_INCOME,
			COA_PSA_INCENTIVE,
			CROSS_SELL_COUNT,
			CV_NEW_COUNT,
			CV_USED_COUNT,
			DOCUMENT_CHARGE,
			DUAL_CASES_COUNT,
			EARLY_BIRD_COUNT,
			EARLY_BIRD_DAYS,
			EARLY_BIRD_INCENTIVE,
			EARLY_BIRD_INS_SLAB,
			EARLY_BIRD_VOLUME,
			PREMIUM_COLLECTED,
			PV_CV_NEW_COUNT,
			PV_CV_USED_COUNT,
			PV_NEW_COUNT,
			PV_USED_COUNT,
			RLH_BONUS_INCENTIVE,
			RULE_ADD_PER,
			RULE_ADD_USED_PER,
			RULE_CFE,
			RULE_ID_BULK,
			RULE_ID_CE_ADD_PO,
			RULE_ID_CE_USED_ADD,
			RULE_PER,
			RULE_PSI,
			RULE_SC_ACH,
			RULE_SC_IN,
			SCHEME_SPECFIC_VOLUME_PER,
			SCHEME_SPECIFIC_BONUS_INC,
			SCHEME_SPECIFIC_BONUS_SLAB,
			SC_ACHIEVEMENT,
			SC_INCENTIVE_PERCENTAGE,
			SC_PERCENTAGE,
			SC_SLAB,
			SERVICE_CHARGE,
			SFE_ADD_PO,
			SFE_ADD_PO_CE_USED,
			SFE_ADD_PO_SLAB_CE_USED,
			SFE_ADD_PO_SLAB_USED,
			SFE_ADD_PO_USED,
			SFE_INCENTIVE,
			SFE_INCENTIVE_CROSS_SELL_CMRL,
			SFE_INCENTIVE_CROSS_SELL_HOS,
			SFE_INCENTIVE_CROSS_SELL_LIFE,
			SFE_INCENTIVE_CROSS_SELL_MIFUN ,
			SFE_INCENTIVE_CROSS_SELL_MIREN,
			SFE_INCENTIVE_CROSS_SELL_PAC,
			SFE_OVERALLSOP,
			SFE_OVERALLSOP_ADDITIONAL,
			SFE_SALARY,
			TL_SC_SLAB,
			TL_TEAM_SIZE,
			TOTAL_BULK_COUNT,
			TOTAL_FILE_PROCESSED,
			TOTAL_FILE_PROCESSED_CE,
			TOTAL_FILE_PROCESSED_USED,
			TOTAL_FILE_VOLUME,
			TOTAL_VOLUME_USED,
			TRACTOR_NEW_COUNT,
			TRACTOR_NEW_USED_COUNT,
			TRACTOR_USED_COUNT,
			TW2_COUNT,
			TW2_NONRE_COUNT,
			TW2_ONLY_RE_COUNT,
			TW2_RE_COUNT,
			TW3_COUNT,
			W_IRR,
		    TOTAL_CE_VOLUME ;
	
	private double 
	
			SC_INCENTIVE  ,
			TL_SC_INCENTIVE ;  
	
	private Date 
	
			LMS_DATE,MODIFIED_DATE;

    public OrigTable() {
	 
    }
	
	public OrigTable  (
			String AGREEMENT_NO,
			String ASSET_CATEGORY,
			String ASSET_TYPE,
			String BRANCH,
			String CFE_ID,
			String COA_DSA_MG_EMP_ID,
			String CROSS_SELL_PRODUCT,
			String CUST_ID,
			String EMPLOYEE_GRADE_PER,
			String MANUFACTURER,
			String OSB_BATCH_ID,
			String PSA_FLAG,
			String REGION,
			String REMARKS,
			String RLH,
			String RULE_NO,
			String SCHEME,
			String SCHEME_INCENTIVE,
			String SCHEME_TYPE_ADD,
			String SFE_ID,
			String SFE_PSA_INCENTIVE,
			String STATUS,
			String TL_ID,
			String ZONE,
		    String PRODUCT,
		    String SCHEME_TYPE,
			Date LMS_DATE,
			Date MODIFIED_DATE, 
			double SC_INCENTIVE,
			double TL_SC_INCENTIVE ,
			Integer ADD_PO_FILE_PROCESSED_COUNT,
			Integer AMOUNT_FINANCED,
			Integer AVG_TEAM_PRODUCTIVITY,
			Integer BROKER_AMT,
			Integer BULK_COUNT_PER,
			Integer BULK_FILE_COUNT,
			Integer BULK_PO,
			Integer BULK_PO_SLAB,
			Integer BUSINESS_IRR,
			Integer CE_ADD_PO,
			Integer CE_NEW_COUNT,
			Integer CE_NEW_VOLUME,
			Integer CE_USED_COUNT,
			Integer CE_USED_VOLUME,
			Integer CE_USED_VOLUME_ADDITIONAL,
			Integer CFE_INCENTIVE,
			Integer CIFCL_INCOME,
			Integer COA_PSA_INCENTIVE,
			Integer CROSS_SELL_COUNT,
			Integer CV_NEW_COUNT,
			Integer CV_USED_COUNT,
			Integer DOCUMENT_CHARGE,
			Integer DUAL_CASES_COUNT,
			Integer EARLY_BIRD_COUNT,
			Integer EARLY_BIRD_DAYS,
			Integer EARLY_BIRD_INCENTIVE,
			Integer EARLY_BIRD_INS_SLAB,
			Integer EARLY_BIRD_VOLUME,
			Integer PREMIUM_COLLECTED,
			Integer PV_CV_NEW_COUNT,
			Integer PV_CV_USED_COUNT,
			Integer PV_NEW_COUNT,
			Integer PV_USED_COUNT,
			Integer RLH_BONUS_INCENTIVE,
			Integer RULE_ADD_PER,
			Integer RULE_ADD_USED_PER,
			Integer RULE_CFE,
			Integer RULE_ID_BULK,
			Integer RULE_ID_CE_ADD_PO,
			Integer RULE_ID_CE_USED_ADD,
			Integer RULE_PER,
			Integer RULE_PSI,
			Integer RULE_SC_ACH,
			Integer RULE_SC_IN,
			Integer SCHEME_SPECFIC_VOLUME_PER,
			Integer SCHEME_SPECIFIC_BONUS_INC,
			Integer SCHEME_SPECIFIC_BONUS_SLAB,
			Integer SC_ACHIEVEMENT,
			Integer SC_INCENTIVE_PERCENTAGE,
			Integer SC_PERCENTAGE,
			Integer SC_SLAB,
			Integer SERVICE_CHARGE,
			Integer SFE_ADD_PO,
			Integer SFE_ADD_PO_CE_USED,
			Integer SFE_ADD_PO_SLAB_CE_USED,
			Integer SFE_ADD_PO_SLAB_USED,
			Integer SFE_ADD_PO_USED,
			Integer SFE_INCENTIVE,
			Integer SFE_INCENTIVE_CROSS_SELL_CMRL,
			Integer SFE_INCENTIVE_CROSS_SELL_HOS,
			Integer SFE_INCENTIVE_CROSS_SELL_LIFE,
			Integer SFE_INCENTIVE_CROSS_SELL_MIFUN,
			Integer SFE_INCENTIVE_CROSS_SELL_MIREN,
			Integer SFE_INCENTIVE_CROSS_SELL_PAC,
			Integer SFE_OVERALLSOP,
			Integer SFE_OVERALLSOP_ADDITIONAL,
			Integer SFE_SALARY,
			Integer TL_SC_SLAB,
			Integer TL_TEAM_SIZE,
			Integer TOTAL_BULK_COUNT,
			Integer TOTAL_FILE_PROCESSED,
			Integer TOTAL_FILE_PROCESSED_CE,
			Integer TOTAL_FILE_PROCESSED_USED,
			Integer TOTAL_FILE_VOLUME,
			Integer TOTAL_VOLUME_USED,
			Integer TRACTOR_NEW_COUNT,
			Integer TRACTOR_NEW_USED_COUNT,
			Integer TRACTOR_USED_COUNT,
			Integer TW2_COUNT,
			Integer TW2_NONRE_COUNT,
			Integer TW2_ONLY_RE_COUNT,
			Integer TW2_RE_COUNT,
			Integer TW3_COUNT,
			Integer W_IRR,
			Integer TOTAL_CE_VOLUME

			)   { 
		
			this.AGREEMENT_NO = AGREEMENT_NO;
			this.ADD_PO_FILE_PROCESSED_COUNT = ADD_PO_FILE_PROCESSED_COUNT;
			this.AMOUNT_FINANCED = AMOUNT_FINANCED;
			this.ASSET_CATEGORY = ASSET_CATEGORY;
			this.ASSET_TYPE = ASSET_TYPE;
			this.AVG_TEAM_PRODUCTIVITY = AVG_TEAM_PRODUCTIVITY;
			this.BRANCH = BRANCH;
			this.BROKER_AMT = BROKER_AMT;
			this.BULK_COUNT_PER = BULK_COUNT_PER;
			this.BULK_FILE_COUNT = BULK_FILE_COUNT;
			this.BULK_PO = BULK_PO;
			this.BULK_PO_SLAB = BULK_PO_SLAB;
			this.BUSINESS_IRR = BUSINESS_IRR;
			this.CE_ADD_PO = CE_ADD_PO;
			this.CE_NEW_COUNT = CE_NEW_COUNT;
			this.CE_NEW_VOLUME = CE_NEW_VOLUME;
			this.CE_USED_COUNT = CE_USED_COUNT;
			this.CE_USED_VOLUME = CE_USED_VOLUME;
			this.CE_USED_VOLUME_ADDITIONAL = CE_USED_VOLUME_ADDITIONAL;
			this.CFE_ID = CFE_ID;
			this.CFE_INCENTIVE = CFE_INCENTIVE;
			this.CIFCL_INCOME = CIFCL_INCOME;
			this.COA_DSA_MG_EMP_ID = COA_DSA_MG_EMP_ID;
			this.COA_PSA_INCENTIVE = COA_PSA_INCENTIVE;
			this.CROSS_SELL_COUNT = CROSS_SELL_COUNT;
			this.CROSS_SELL_PRODUCT = CROSS_SELL_PRODUCT;
			this.CUST_ID = CUST_ID;
			this.CV_NEW_COUNT = CV_NEW_COUNT;
			this.CV_USED_COUNT = CV_USED_COUNT;
			this.DOCUMENT_CHARGE = DOCUMENT_CHARGE;
			this.DUAL_CASES_COUNT = DUAL_CASES_COUNT;
			this.EARLY_BIRD_COUNT = EARLY_BIRD_COUNT;
			this.EARLY_BIRD_DAYS = EARLY_BIRD_DAYS;
			this.EARLY_BIRD_INCENTIVE = EARLY_BIRD_INCENTIVE;
			this.EARLY_BIRD_INS_SLAB = EARLY_BIRD_INS_SLAB;
			this.EARLY_BIRD_VOLUME = EARLY_BIRD_VOLUME;
			this.EMPLOYEE_GRADE_PER = EMPLOYEE_GRADE_PER;
			this.LMS_DATE = LMS_DATE;
			this.MANUFACTURER = MANUFACTURER;
			this.MODIFIED_DATE = MODIFIED_DATE;
			this.OSB_BATCH_ID = OSB_BATCH_ID;
			this.PREMIUM_COLLECTED = PREMIUM_COLLECTED;
			this.PRODUCT = PRODUCT;
			this.PSA_FLAG = PSA_FLAG;
			this.PV_CV_NEW_COUNT = PV_CV_NEW_COUNT;
			this.PV_CV_USED_COUNT = PV_CV_USED_COUNT;
			this.PV_NEW_COUNT = PV_NEW_COUNT;
			this.PV_USED_COUNT = PV_USED_COUNT;
			this.REGION = REGION;
			this.REMARKS = REMARKS;
			this.RLH = RLH;
			this.RLH_BONUS_INCENTIVE = RLH_BONUS_INCENTIVE;
			this.RULE_ADD_PER = RULE_ADD_PER;
			this.RULE_ADD_USED_PER = RULE_ADD_USED_PER;
			this.RULE_CFE = RULE_CFE;
			this.RULE_ID_BULK = RULE_ID_BULK;
			this.RULE_ID_CE_ADD_PO = RULE_ID_CE_ADD_PO;
			this.RULE_ID_CE_USED_ADD = RULE_ID_CE_USED_ADD;
			this.RULE_NO = RULE_NO;
			this.RULE_PER = RULE_PER;
			this.RULE_PSI = RULE_PSI;
			this.RULE_SC_ACH = RULE_SC_ACH;
			this.RULE_SC_IN = RULE_SC_IN;
			this.SC_ACHIEVEMENT = SC_ACHIEVEMENT;
			this.SC_INCENTIVE = SC_INCENTIVE;
			this.SC_INCENTIVE_PERCENTAGE = SC_INCENTIVE_PERCENTAGE;
			this.SC_PERCENTAGE = SC_PERCENTAGE;
			this.SC_SLAB = SC_SLAB;
			this.SCHEME = SCHEME;
			this.SCHEME_INCENTIVE = SCHEME_INCENTIVE;
			this.SCHEME_SPECFIC_VOLUME_PER = SCHEME_SPECFIC_VOLUME_PER;
			this.SCHEME_SPECIFIC_BONUS_INC = SCHEME_SPECIFIC_BONUS_INC;
			this.SCHEME_SPECIFIC_BONUS_SLAB = SCHEME_SPECIFIC_BONUS_SLAB;
			this.SCHEME_TYPE = SCHEME_TYPE;
			this.SCHEME_TYPE_ADD = SCHEME_TYPE_ADD;
			this.SERVICE_CHARGE = SERVICE_CHARGE;
			this.SFE_ADD_PO= SFE_ADD_PO;
			this.SFE_ADD_PO_CE_USED= SFE_ADD_PO_CE_USED;
			this.SFE_ADD_PO_SLAB_CE_USED= SFE_ADD_PO_SLAB_CE_USED;
			this.SFE_ADD_PO_SLAB_USED= SFE_ADD_PO_SLAB_USED;
			this.SFE_ADD_PO_USED=SFE_ADD_PO_USED;
			this.SFE_ID=SFE_ID;
			this.SFE_INCENTIVE=SFE_INCENTIVE;
			this.SFE_INCENTIVE_CROSS_SELL_CMRL=SFE_INCENTIVE_CROSS_SELL_CMRL;
			this.SFE_INCENTIVE_CROSS_SELL_HOS=SFE_INCENTIVE_CROSS_SELL_HOS;
			this.SFE_INCENTIVE_CROSS_SELL_LIFE=SFE_INCENTIVE_CROSS_SELL_LIFE;
			this.SFE_INCENTIVE_CROSS_SELL_MIFUN=SFE_INCENTIVE_CROSS_SELL_MIFUN;
			this.SFE_INCENTIVE_CROSS_SELL_MIREN=SFE_INCENTIVE_CROSS_SELL_MIREN;
			this.SFE_INCENTIVE_CROSS_SELL_PAC=SFE_INCENTIVE_CROSS_SELL_PAC;
			this.SFE_OVERALLSOP=SFE_OVERALLSOP;
			this.SFE_OVERALLSOP_ADDITIONAL=SFE_OVERALLSOP_ADDITIONAL;
			this.SFE_PSA_INCENTIVE=SFE_PSA_INCENTIVE;
			this.SFE_SALARY=SFE_SALARY;
			this.STATUS=STATUS;
			this.TL_ID=TL_ID;
			this.TL_SC_INCENTIVE=TL_SC_INCENTIVE;
			this.TL_SC_SLAB=TL_SC_SLAB;
			this.TL_TEAM_SIZE=TL_TEAM_SIZE;
			this.TOTAL_BULK_COUNT=TOTAL_BULK_COUNT;
			this.TOTAL_CE_VOLUME=TOTAL_CE_VOLUME;
			this.TOTAL_FILE_PROCESSED_CE=TOTAL_FILE_PROCESSED_CE;
			this.TOTAL_FILE_PROCESSED=TOTAL_FILE_PROCESSED;
			this.TOTAL_FILE_PROCESSED_USED=TOTAL_FILE_PROCESSED_USED;
			this.TOTAL_FILE_VOLUME=TOTAL_FILE_VOLUME;
			this.TOTAL_VOLUME_USED=TOTAL_VOLUME_USED;
			this.TRACTOR_NEW_COUNT=TRACTOR_NEW_COUNT;
			this.TRACTOR_NEW_USED_COUNT=TRACTOR_NEW_USED_COUNT;
			this.TRACTOR_USED_COUNT=TRACTOR_USED_COUNT;
			this.TW2_COUNT=TW2_COUNT;
			this.TW2_NONRE_COUNT=TW2_NONRE_COUNT;
			this.TW2_ONLY_RE_COUNT=TW2_ONLY_RE_COUNT;
			this.TW2_RE_COUNT=TW2_RE_COUNT;
			this.TW3_COUNT=TW3_COUNT;
			this.W_IRR=W_IRR;
			this.ZONE= ZONE;        }

	
	public String getAGREEMENT_NO() {
		return AGREEMENT_NO;
	}

	public void setAGREEMENT_NO(String aGREEMENT_NO) {
		AGREEMENT_NO = aGREEMENT_NO;
	}

	public String getASSET_CATEGORY() {
		return ASSET_CATEGORY;
	}

	public void setASSET_CATEGORY(String aSSET_CATEGORY) {
		ASSET_CATEGORY = aSSET_CATEGORY;
	}

	public String getASSET_TYPE() {
		return ASSET_TYPE;
	}

	public void setASSET_TYPE(String aSSET_TYPE) {
		ASSET_TYPE = aSSET_TYPE;
	}

	public String getBRANCH() {
		return BRANCH;
	}

	public void setBRANCH(String bRANCH) {
		BRANCH = bRANCH;
	}

	public String getCFE_ID() {
		return CFE_ID;
	}

	public void setCFE_ID(String cFE_ID) {
		CFE_ID = cFE_ID;
	}

	public String getCOA_DSA_MG_EMP_ID() {
		return COA_DSA_MG_EMP_ID;
	}

	public void setCOA_DSA_MG_EMP_ID(String cOA_DSA_MG_EMP_ID) {
		COA_DSA_MG_EMP_ID = cOA_DSA_MG_EMP_ID;
	}

	public String getCROSS_SELL_PRODUCT() {
		return CROSS_SELL_PRODUCT;
	}

	public void setCROSS_SELL_PRODUCT(String cROSS_SELL_PRODUCT) {
		CROSS_SELL_PRODUCT = cROSS_SELL_PRODUCT;
	}

	public String getCUST_ID() {
		return CUST_ID;
	}

	public void setCUST_ID(String cUST_ID) {
		CUST_ID = cUST_ID;
	}

	public String getEMPLOYEE_GRADE_PER() {
		return EMPLOYEE_GRADE_PER;
	}

	public void setEMPLOYEE_GRADE_PER(String eMPLOYEE_GRADE_PER) {
		EMPLOYEE_GRADE_PER = eMPLOYEE_GRADE_PER;
	}

	public String getMANUFACTURER() {
		return MANUFACTURER;
	}

	public void setMANUFACTURER(String mANUFACTURER) {
		MANUFACTURER = mANUFACTURER;
	}

	public String getOSB_BATCH_ID() {
		return OSB_BATCH_ID;
	}

	public void setOSB_BATCH_ID(String oSB_BATCH_ID) {
		OSB_BATCH_ID = oSB_BATCH_ID;
	}

	public String getPRODUCT() {
		return PRODUCT;
	}

	public void setPRODUCT(String pRODUCT) {
		PRODUCT = pRODUCT;
	}

	public String getPSA_FLAG() {
		return PSA_FLAG;
	}

	public void setPSA_FLAG(String pSA_FLAG) {
		PSA_FLAG = pSA_FLAG;
	}

	public String getREGION() {
		return REGION;
	}

	public void setREGION(String rEGION) {
		REGION = rEGION;
	}

	public String getREMARKS() {
		return REMARKS;
	}

	public void setREMARKS(String rEMARKS) {
		REMARKS = rEMARKS;
	}

	public String getRLH() {
		return RLH;
	}

	public void setRLH(String rLH) {
		RLH = rLH;
	}

	public String getRULE_NO() {
		return RULE_NO;
	}

	public void setRULE_NO(String rULE_NO) {
		RULE_NO = rULE_NO;
	}

	public String getSCHEME() {
		return SCHEME;
	}

	public void setSCHEME(String sCHEME) {
		SCHEME = sCHEME;
	}

	public String getSCHEME_INCENTIVE() {
		return SCHEME_INCENTIVE;
	}

	public void setSCHEME_INCENTIVE(String sCHEME_INCENTIVE) {
		SCHEME_INCENTIVE = sCHEME_INCENTIVE;
	}

	public String getSCHEME_TYPE() {
		return SCHEME_TYPE;
	}

	public void setSCHEME_TYPE(String sCHEME_TYPE) {
		SCHEME_TYPE = sCHEME_TYPE;
	}

	public String getSCHEME_TYPE_ADD() {
		return SCHEME_TYPE_ADD;
	}

	public void setSCHEME_TYPE_ADD(String sCHEME_TYPE_ADD) {
		SCHEME_TYPE_ADD = sCHEME_TYPE_ADD;
	}

	public String getSFE_ID() {
		return SFE_ID;
	}

	public void setSFE_ID(String sFE_ID) {
		SFE_ID = sFE_ID;
	}

	public String getSFE_PSA_INCENTIVE() {
		return SFE_PSA_INCENTIVE;
	}

	public void setSFE_PSA_INCENTIVE(String sFE_PSA_INCENTIVE) {
		SFE_PSA_INCENTIVE = sFE_PSA_INCENTIVE;
	}

	public String getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}

	public String getTL_ID() {
		return TL_ID;
	}

	public void setTL_ID(String tL_ID) {
		TL_ID = tL_ID;
	}

	public String getZONE() {
		return ZONE;
	}

	public void setZONE(String zONE) {
		ZONE = zONE;
	}

	public Integer getTOTAL_CE_VOLUME() {
		return TOTAL_CE_VOLUME;
	}

	public void setTOTAL_CE_VOLUME(Integer tOTAL_CE_VOLUME) {
		TOTAL_CE_VOLUME = tOTAL_CE_VOLUME;
	}

	public Integer getTOTAL_FILE_PROCESSED() {
		return TOTAL_FILE_PROCESSED;
	}

	public void setTOTAL_FILE_PROCESSED(Integer tOTAL_FILE_PROCESSED) {
		TOTAL_FILE_PROCESSED = tOTAL_FILE_PROCESSED;
	}

	public Integer getAMOUNT_FINANCED() {
		return AMOUNT_FINANCED;
	}

	public void setAMOUNT_FINANCED(Integer aMOUNT_FINANCED) {
		AMOUNT_FINANCED = aMOUNT_FINANCED;
	}

	public Integer getAVG_TEAM_PRODUCTIVITY() {
		return AVG_TEAM_PRODUCTIVITY;
	}

	public void setAVG_TEAM_PRODUCTIVITY(Integer aVG_TEAM_PRODUCTIVITY) {
		AVG_TEAM_PRODUCTIVITY = aVG_TEAM_PRODUCTIVITY;
	}

	public Integer getBROKER_AMT() {
		return BROKER_AMT;
	}

	public void setBROKER_AMT(Integer bROKER_AMT) {
		BROKER_AMT = bROKER_AMT;
	}

	public Integer getBUSINESS_IRR() {
		return BUSINESS_IRR;
	}

	public void setBUSINESS_IRR(Integer bUSINESS_IRR) {
		BUSINESS_IRR = bUSINESS_IRR;
	}

	public Integer getCFE_INCENTIVE() {
		return CFE_INCENTIVE;
	}

	public void setCFE_INCENTIVE(Integer cFE_INCENTIVE) {
		CFE_INCENTIVE = cFE_INCENTIVE;
	}

	public Integer getCIFCL_INCOME() {
		return CIFCL_INCOME;
	}

	public void setCIFCL_INCOME(Integer cIFCL_INCOME) {
		CIFCL_INCOME = cIFCL_INCOME;
	}

	public Integer getCOA_PSA_INCENTIVE() {
		return COA_PSA_INCENTIVE;
	}

	public void setCOA_PSA_INCENTIVE(Integer cOA_PSA_INCENTIVE) {
		COA_PSA_INCENTIVE = cOA_PSA_INCENTIVE;
	}

	public Integer getDOCUMENT_CHARGE() {
		return DOCUMENT_CHARGE;
	}

	public void setDOCUMENT_CHARGE(Integer dOCUMENT_CHARGE) {
		DOCUMENT_CHARGE = dOCUMENT_CHARGE;
	}

	public Integer getPREMIUM_COLLECTED() {
		return PREMIUM_COLLECTED;
	}

	public void setPREMIUM_COLLECTED(Integer pREMIUM_COLLECTED) {
		PREMIUM_COLLECTED = pREMIUM_COLLECTED;
	}

	public Integer getSERVICE_CHARGE() {
		return SERVICE_CHARGE;
	}

	public void setSERVICE_CHARGE(Integer sERVICE_CHARGE) {
		SERVICE_CHARGE = sERVICE_CHARGE;
	}

	public Integer getSC_ACHIEVEMENT() {
		return SC_ACHIEVEMENT;
	}

	public void setSC_ACHIEVEMENT(Integer sC_ACHIEVEMENT) {
		SC_ACHIEVEMENT = sC_ACHIEVEMENT;
	}

	public Integer getSC_INCENTIVE_PERCENTAGE() {
		return SC_INCENTIVE_PERCENTAGE;
	}

	public void setSC_INCENTIVE_PERCENTAGE(Integer sC_INCENTIVE_PERCENTAGE) {
		SC_INCENTIVE_PERCENTAGE = sC_INCENTIVE_PERCENTAGE;
	}

	public Integer getSC_PERCENTAGE() {
		return SC_PERCENTAGE;
	}

	public void setSC_PERCENTAGE(Integer sC_PERCENTAGE) {
		SC_PERCENTAGE = sC_PERCENTAGE;
	}

	public Integer getSC_SLAB() {
		return SC_SLAB;
	}

	public void setSC_SLAB(Integer sC_SLAB) {
		SC_SLAB = sC_SLAB;
	}

	public Integer getSFE_INCENTIVE_CROSS_SELL_PAC() {
		return SFE_INCENTIVE_CROSS_SELL_PAC;
	}

	public void setSFE_INCENTIVE_CROSS_SELL_PAC(Integer sFE_INCENTIVE_CROSS_SELL_PAC) {
		SFE_INCENTIVE_CROSS_SELL_PAC = sFE_INCENTIVE_CROSS_SELL_PAC;
	}

	public Integer getSFE_INCENTIVE_CROSS_SELL_LIFE() {
		return SFE_INCENTIVE_CROSS_SELL_LIFE;
	}

	public void setSFE_INCENTIVE_CROSS_SELL_LIFE(Integer sFE_INCENTIVE_CROSS_SELL_LIFE) {
		SFE_INCENTIVE_CROSS_SELL_LIFE = sFE_INCENTIVE_CROSS_SELL_LIFE;
	}

	public Integer getSFE_INCENTIVE_CROSS_SELL_MIFUN() {
		return SFE_INCENTIVE_CROSS_SELL_MIFUN;
	}

	public void setSFE_INCENTIVE_CROSS_SELL_MIFUN(Integer sFE_INCENTIVE_CROSS_SELL_MIFUN) {
		SFE_INCENTIVE_CROSS_SELL_MIFUN = sFE_INCENTIVE_CROSS_SELL_MIFUN;
	}

	public Integer getSFE_INCENTIVE_CROSS_SELL_HOS() {
		return SFE_INCENTIVE_CROSS_SELL_HOS;
	}

	public void setSFE_INCENTIVE_CROSS_SELL_HOS(Integer sFE_INCENTIVE_CROSS_SELL_HOS) {
		SFE_INCENTIVE_CROSS_SELL_HOS = sFE_INCENTIVE_CROSS_SELL_HOS;
	}

	public Integer getSFE_INCENTIVE_CROSS_SELL_CMRL() {
		return SFE_INCENTIVE_CROSS_SELL_CMRL;
	}

	public void setSFE_INCENTIVE_CROSS_SELL_CMRL(Integer sFE_INCENTIVE_CROSS_SELL_CMRL) {
		SFE_INCENTIVE_CROSS_SELL_CMRL = sFE_INCENTIVE_CROSS_SELL_CMRL;
	}

	public Integer getSFE_OVERALLSOP() {
		return SFE_OVERALLSOP;
	}

	public void setSFE_OVERALLSOP(Integer sFE_OVERALLSOP) {
		SFE_OVERALLSOP = sFE_OVERALLSOP;
	}

	public Integer getSFE_OVERALLSOP_ADDITIONAL() {
		return SFE_OVERALLSOP_ADDITIONAL;
	}

	public void setSFE_OVERALLSOP_ADDITIONAL(Integer sFE_OVERALLSOP_ADDITIONAL) {
		SFE_OVERALLSOP_ADDITIONAL = sFE_OVERALLSOP_ADDITIONAL;
	}

	public Integer getSFE_SALARY() {
		return SFE_SALARY;
	}

	public void setSFE_SALARY(Integer sFE_SALARY) {
		SFE_SALARY = sFE_SALARY;
	}

	public Integer getTL_SC_SLAB() {
		return TL_SC_SLAB;
	}

	public void setTL_SC_SLAB(Integer tL_SC_SLAB) {
		TL_SC_SLAB = tL_SC_SLAB;
	}

	public Integer getW_IRR() {
		return W_IRR;
	}

	public void setW_IRR(Integer w_IRR) {
		W_IRR = w_IRR;
	}

	public Integer getTL_TEAM_SIZE() {
		return TL_TEAM_SIZE;
	}

	public void setTL_TEAM_SIZE(Integer tL_TEAM_SIZE) {
		TL_TEAM_SIZE = tL_TEAM_SIZE;
	}

	public Integer getRULE_PER() {
		return RULE_PER;
	}

	public void setRULE_PER(Integer rULE_PER) {
		RULE_PER = rULE_PER;
	}

	public Integer getRULE_ADD_PER() {
		return RULE_ADD_PER;
	}

	public void setRULE_ADD_PER(Integer rULE_ADD_PER) {
		RULE_ADD_PER = rULE_ADD_PER;
	}

	public Integer getRULE_SC_ACH() {
		return RULE_SC_ACH;
	}

	public void setRULE_SC_ACH(Integer rULE_SC_ACH) {
		RULE_SC_ACH = rULE_SC_ACH;
	}

	public Integer getRULE_SC_IN() {
		return RULE_SC_IN;
	}

	public void setRULE_SC_IN(Integer rULE_SC_IN) {
		RULE_SC_IN = rULE_SC_IN;
	}

	public Integer getRULE_CFE() {
		return RULE_CFE;
	}

	public void setRULE_CFE(Integer rULE_CFE) {
		RULE_CFE = rULE_CFE;
	}

	public Integer getRULE_PSI() {
		return RULE_PSI;
	}

	public void setRULE_PSI(Integer rULE_PSI) {
		RULE_PSI = rULE_PSI;
	}

	public Integer getTOTAL_FILE_VOLUME() {
		return TOTAL_FILE_VOLUME;
	}

	public void setTOTAL_FILE_VOLUME(Integer tOTAL_FILE_VOLUME) {
		TOTAL_FILE_VOLUME = tOTAL_FILE_VOLUME;
	}

	public Integer getSFE_INCENTIVE() {
		return SFE_INCENTIVE;
	}

	public void setSFE_INCENTIVE(Integer sFE_INCENTIVE) {
		SFE_INCENTIVE = sFE_INCENTIVE;
	}

	public Integer getSFE_ADD_PO() {
		return SFE_ADD_PO;
	}

	public void setSFE_ADD_PO(Integer sFE_ADD_PO) {
		SFE_ADD_PO = sFE_ADD_PO;
	}

	public Integer getSFE_ADD_PO_SLAB_USED() {
		return SFE_ADD_PO_SLAB_USED;
	}

	public void setSFE_ADD_PO_SLAB_USED(Integer sFE_ADD_PO_SLAB_USED) {
		SFE_ADD_PO_SLAB_USED = sFE_ADD_PO_SLAB_USED;
	}

	public Integer getSFE_ADD_PO_USED() {
		return SFE_ADD_PO_USED;
	}

	public void setSFE_ADD_PO_USED(Integer sFE_ADD_PO_USED) {
		SFE_ADD_PO_USED = sFE_ADD_PO_USED;
	}

	public Integer getRULE_ADD_USED_PER() {
		return RULE_ADD_USED_PER;
	}

	public void setRULE_ADD_USED_PER(Integer rULE_ADD_USED_PER) {
		RULE_ADD_USED_PER = rULE_ADD_USED_PER;
	}

	public Integer getCROSS_SELL_COUNT() {
		return CROSS_SELL_COUNT;
	}

	public void setCROSS_SELL_COUNT(Integer cROSS_SELL_COUNT) {
		CROSS_SELL_COUNT = cROSS_SELL_COUNT;
	}

	public Integer getTOTAL_FILE_PROCESSED_USED() {
		return TOTAL_FILE_PROCESSED_USED;
	}

	public void setTOTAL_FILE_PROCESSED_USED(Integer tOTAL_FILE_PROCESSED_USED) {
		TOTAL_FILE_PROCESSED_USED = tOTAL_FILE_PROCESSED_USED;
	}

	public Integer getTOTAL_VOLUME_USED() {
		return TOTAL_VOLUME_USED;
	}

	public void setTOTAL_VOLUME_USED(Integer tOTAL_VOLUME_USED) {
		TOTAL_VOLUME_USED = tOTAL_VOLUME_USED;
	}

	public Integer getBULK_COUNT_PER() {
		return BULK_COUNT_PER;
	}

	public void setBULK_COUNT_PER(Integer bULK_COUNT_PER) {
		BULK_COUNT_PER = bULK_COUNT_PER;
	}

	public Integer getBULK_PO_SLAB() {
		return BULK_PO_SLAB;
	}

	public void setBULK_PO_SLAB(Integer bULK_PO_SLAB) {
		BULK_PO_SLAB = bULK_PO_SLAB;
	}

	public Integer getBULK_PO() {
		return BULK_PO;
	}

	public void setBULK_PO(Integer bULK_PO) {
		BULK_PO = bULK_PO;
	}

	public Integer getRULE_ID_BULK() {
		return RULE_ID_BULK;
	}

	public void setRULE_ID_BULK(Integer rULE_ID_BULK) {
		RULE_ID_BULK = rULE_ID_BULK;
	}

	public Integer getBULK_FILE_COUNT() {
		return BULK_FILE_COUNT;
	}

	public void setBULK_FILE_COUNT(Integer bULK_FILE_COUNT) {
		BULK_FILE_COUNT = bULK_FILE_COUNT;
	}

	public Integer getCE_ADD_PO() {
		return CE_ADD_PO;
	}

	public void setCE_ADD_PO(Integer cE_ADD_PO) {
		CE_ADD_PO = cE_ADD_PO;
	}

	public Integer getTOTAL_FILE_PROCESSED_CE() {
		return TOTAL_FILE_PROCESSED_CE;
	}

	public void setTOTAL_FILE_PROCESSED_CE(Integer tOTAL_FILE_PROCESSED_CE) {
		TOTAL_FILE_PROCESSED_CE = tOTAL_FILE_PROCESSED_CE;
	}

	public Integer getRULE_ID_CE_ADD_PO() {
		return RULE_ID_CE_ADD_PO;
	}

	public void setRULE_ID_CE_ADD_PO(Integer rULE_ID_CE_ADD_PO) {
		RULE_ID_CE_ADD_PO = rULE_ID_CE_ADD_PO;
	}

	public Integer getADD_PO_FILE_PROCESSED_COUNT() {
		return ADD_PO_FILE_PROCESSED_COUNT;
	}

	public void setADD_PO_FILE_PROCESSED_COUNT(Integer aDD_PO_FILE_PROCESSED_COUNT) {
		ADD_PO_FILE_PROCESSED_COUNT = aDD_PO_FILE_PROCESSED_COUNT;
	}

	public Integer getTW2_RE_COUNT() {
		return TW2_RE_COUNT;
	}

	public void setTW2_RE_COUNT(Integer tW2_RE_COUNT) {
		TW2_RE_COUNT = tW2_RE_COUNT;
	}

	public Integer getTW2_ONLY_RE_COUNT() {
		return TW2_ONLY_RE_COUNT;
	}

	public void setTW2_ONLY_RE_COUNT(Integer tW2_ONLY_RE_COUNT) {
		TW2_ONLY_RE_COUNT = tW2_ONLY_RE_COUNT;
	}

	public Integer getTW2_NONRE_COUNT() {
		return TW2_NONRE_COUNT;
	}

	public void setTW2_NONRE_COUNT(Integer tW2_NONRE_COUNT) {
		TW2_NONRE_COUNT = tW2_NONRE_COUNT;
	}

	public Integer getTW2_COUNT() {
		return TW2_COUNT;
	}

	public void setTW2_COUNT(Integer tW2_COUNT) {
		TW2_COUNT = tW2_COUNT;
	}

	public Integer getTW3_COUNT() {
		return TW3_COUNT;
	}

	public void setTW3_COUNT(Integer tW3_COUNT) {
		TW3_COUNT = tW3_COUNT;
	}

	public Integer getPV_USED_COUNT() {
		return PV_USED_COUNT;
	}

	public void setPV_USED_COUNT(Integer pV_USED_COUNT) {
		PV_USED_COUNT = pV_USED_COUNT;
	}

	public Integer getCV_USED_COUNT() {
		return CV_USED_COUNT;
	}

	public void setCV_USED_COUNT(Integer cV_USED_COUNT) {
		CV_USED_COUNT = cV_USED_COUNT;
	}

	public Integer getPV_CV_USED_COUNT() {
		return PV_CV_USED_COUNT;
	}

	public void setPV_CV_USED_COUNT(Integer pV_CV_USED_COUNT) {
		PV_CV_USED_COUNT = pV_CV_USED_COUNT;
	}

	public Integer getTRACTOR_NEW_COUNT() {
		return TRACTOR_NEW_COUNT;
	}

	public void setTRACTOR_NEW_COUNT(Integer tRACTOR_NEW_COUNT) {
		TRACTOR_NEW_COUNT = tRACTOR_NEW_COUNT;
	}

	public Integer getTRACTOR_USED_COUNT() {
		return TRACTOR_USED_COUNT;
	}

	public void setTRACTOR_USED_COUNT(Integer tRACTOR_USED_COUNT) {
		TRACTOR_USED_COUNT = tRACTOR_USED_COUNT;
	}

	public Integer getTRACTOR_NEW_USED_COUNT() {
		return TRACTOR_NEW_USED_COUNT;
	}

	public void setTRACTOR_NEW_USED_COUNT(Integer tRACTOR_NEW_USED_COUNT) {
		TRACTOR_NEW_USED_COUNT = tRACTOR_NEW_USED_COUNT;
	}

	public Integer getPV_NEW_COUNT() {
		return PV_NEW_COUNT;
	}

	public void setPV_NEW_COUNT(Integer pV_NEW_COUNT) {
		PV_NEW_COUNT = pV_NEW_COUNT;
	}

	public Integer getCV_NEW_COUNT() {
		return CV_NEW_COUNT;
	}

	public void setCV_NEW_COUNT(Integer cV_NEW_COUNT) {
		CV_NEW_COUNT = cV_NEW_COUNT;
	}

	public Integer getPV_CV_NEW_COUNT() {
		return PV_CV_NEW_COUNT;
	}

	public void setPV_CV_NEW_COUNT(Integer pV_CV_NEW_COUNT) {
		PV_CV_NEW_COUNT = pV_CV_NEW_COUNT;
	}

	public Integer getCE_NEW_VOLUME() {
		return CE_NEW_VOLUME;
	}

	public void setCE_NEW_VOLUME(Integer cE_NEW_VOLUME) {
		CE_NEW_VOLUME = cE_NEW_VOLUME;
	}

	public Integer getCE_USED_VOLUME() {
		return CE_USED_VOLUME;
	}

	public void setCE_USED_VOLUME(Integer cE_USED_VOLUME) {
		CE_USED_VOLUME = cE_USED_VOLUME;
	}

	public Integer getRLH_BONUS_INCENTIVE() {
		return RLH_BONUS_INCENTIVE;
	}

	public void setRLH_BONUS_INCENTIVE(Integer rLH_BONUS_INCENTIVE) {
		RLH_BONUS_INCENTIVE = rLH_BONUS_INCENTIVE;
	}

	public Integer getSCHEME_SPECFIC_VOLUME_PER() {
		return SCHEME_SPECFIC_VOLUME_PER;
	}

	public void setSCHEME_SPECFIC_VOLUME_PER(Integer sCHEME_SPECFIC_VOLUME_PER) {
		SCHEME_SPECFIC_VOLUME_PER = sCHEME_SPECFIC_VOLUME_PER;
	}

	public Integer getSCHEME_SPECIFIC_BONUS_SLAB() {
		return SCHEME_SPECIFIC_BONUS_SLAB;
	}

	public void setSCHEME_SPECIFIC_BONUS_SLAB(Integer sCHEME_SPECIFIC_BONUS_SLAB) {
		SCHEME_SPECIFIC_BONUS_SLAB = sCHEME_SPECIFIC_BONUS_SLAB;
	}

	public Integer getSCHEME_SPECIFIC_BONUS_INC() {
		return SCHEME_SPECIFIC_BONUS_INC;
	}

	public void setSCHEME_SPECIFIC_BONUS_INC(Integer sCHEME_SPECIFIC_BONUS_INC) {
		SCHEME_SPECIFIC_BONUS_INC = sCHEME_SPECIFIC_BONUS_INC;
	}

	public Integer getEARLY_BIRD_INS_SLAB() {
		return EARLY_BIRD_INS_SLAB;
	}

	public void setEARLY_BIRD_INS_SLAB(Integer eARLY_BIRD_INS_SLAB) {
		EARLY_BIRD_INS_SLAB = eARLY_BIRD_INS_SLAB;
	}

	public Integer getCE_USED_VOLUME_ADDITIONAL() {
		return CE_USED_VOLUME_ADDITIONAL;
	}

	public void setCE_USED_VOLUME_ADDITIONAL(Integer cE_USED_VOLUME_ADDITIONAL) {
		CE_USED_VOLUME_ADDITIONAL = cE_USED_VOLUME_ADDITIONAL;
	}

	public Integer getSFE_ADD_PO_SLAB_CE_USED() {
		return SFE_ADD_PO_SLAB_CE_USED;
	}

	public void setSFE_ADD_PO_SLAB_CE_USED(Integer sFE_ADD_PO_SLAB_CE_USED) {
		SFE_ADD_PO_SLAB_CE_USED = sFE_ADD_PO_SLAB_CE_USED;
	}

	public Integer getSFE_ADD_PO_CE_USED() {
		return SFE_ADD_PO_CE_USED;
	}

	public void setSFE_ADD_PO_CE_USED(Integer sFE_ADD_PO_CE_USED) {
		SFE_ADD_PO_CE_USED = sFE_ADD_PO_CE_USED;
	}

	public Integer getRULE_ID_CE_USED_ADD() {
		return RULE_ID_CE_USED_ADD;
	}

	public void setRULE_ID_CE_USED_ADD(Integer rULE_ID_CE_USED_ADD) {
		RULE_ID_CE_USED_ADD = rULE_ID_CE_USED_ADD;
	}

	public Integer getCE_NEW_COUNT() {
		return CE_NEW_COUNT;
	}

	public void setCE_NEW_COUNT(Integer cE_NEW_COUNT) {
		CE_NEW_COUNT = cE_NEW_COUNT;
	}

	public Integer getCE_USED_COUNT() {
		return CE_USED_COUNT;
	}

	public void setCE_USED_COUNT(Integer cE_USED_COUNT) {
		CE_USED_COUNT = cE_USED_COUNT;
	}

	public Integer getEARLY_BIRD_VOLUME() {
		return EARLY_BIRD_VOLUME;
	}

	public void setEARLY_BIRD_VOLUME(Integer eARLY_BIRD_VOLUME) {
		EARLY_BIRD_VOLUME = eARLY_BIRD_VOLUME;
	}

	public Integer getEARLY_BIRD_COUNT() {
		return EARLY_BIRD_COUNT;
	}

	public void setEARLY_BIRD_COUNT(Integer eARLY_BIRD_COUNT) {
		EARLY_BIRD_COUNT = eARLY_BIRD_COUNT;
	}

	public Integer getEARLY_BIRD_DAYS() {
		return EARLY_BIRD_DAYS;
	}

	public void setEARLY_BIRD_DAYS(Integer eARLY_BIRD_DAYS) {
		EARLY_BIRD_DAYS = eARLY_BIRD_DAYS;
	}

	public Integer getEARLY_BIRD_INCENTIVE() {
		return EARLY_BIRD_INCENTIVE;
	}

	public void setEARLY_BIRD_INCENTIVE(Integer eARLY_BIRD_INCENTIVE) {
		EARLY_BIRD_INCENTIVE = eARLY_BIRD_INCENTIVE;
	}

	public Integer getDUAL_CASES_COUNT() {
		return DUAL_CASES_COUNT;
	}

	public void setDUAL_CASES_COUNT(Integer dUAL_CASES_COUNT) {
		DUAL_CASES_COUNT = dUAL_CASES_COUNT;
	}

	public Integer getTOTAL_BULK_COUNT() {
		return TOTAL_BULK_COUNT;
	}

	public void setTOTAL_BULK_COUNT(Integer tOTAL_BULK_COUNT) {
		TOTAL_BULK_COUNT = tOTAL_BULK_COUNT;
	}

	public Integer getSFE_INCENTIVE_CROSS_SELL_MIREN() {
		return SFE_INCENTIVE_CROSS_SELL_MIREN;
	}

	public void setSFE_INCENTIVE_CROSS_SELL_MIREN(Integer sFE_INCENTIVE_CROSS_SELL_MIREN) {
		SFE_INCENTIVE_CROSS_SELL_MIREN = sFE_INCENTIVE_CROSS_SELL_MIREN;
	}

	public double getSC_INCENTIVE() {
		return SC_INCENTIVE;
	}

	public void setSC_INCENTIVE(double sC_INCENTIVE) {
		SC_INCENTIVE = sC_INCENTIVE;
	}

	public double getTL_SC_INCENTIVE() {
		return TL_SC_INCENTIVE;
	}

	public void setTL_SC_INCENTIVE(double tL_SC_INCENTIVE) {
		TL_SC_INCENTIVE = tL_SC_INCENTIVE;
	}

	public Date getLMS_DATE() {
		return LMS_DATE;
	}

	public void setLMS_DATE(Date lMS_DATE) {
		LMS_DATE = lMS_DATE;
	}

	public Date getMODIFIED_DATE() {
		return MODIFIED_DATE;
	}

	public void setMODIFIED_DATE(Date mODIFIED_DATE) {
		MODIFIED_DATE = mODIFIED_DATE;
	}
	
	
	
	
	
}

