package model.EO;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jul 27 11:22:15 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblFmdailyConDImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        FmtanksId,
        FmitemsId,
        FmdailyConMId,
        FillSts,
        DipValue1,
        DipValue2,
        DipValue3,
        AmbTemp,
        FuelTemp,
        DensityKg,
        DensityTemp,
        FmdailyConDId,
        CreatedBy,
        CreatedDate,
        UpdatedBy,
        UpdatedDate,
        TblFmdailyConM;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int FMTANKSID = AttributesEnum.FmtanksId.index();
    public static final int FMITEMSID = AttributesEnum.FmitemsId.index();
    public static final int FMDAILYCONMID = AttributesEnum.FmdailyConMId.index();
    public static final int FILLSTS = AttributesEnum.FillSts.index();
    public static final int DIPVALUE1 = AttributesEnum.DipValue1.index();
    public static final int DIPVALUE2 = AttributesEnum.DipValue2.index();
    public static final int DIPVALUE3 = AttributesEnum.DipValue3.index();
    public static final int AMBTEMP = AttributesEnum.AmbTemp.index();
    public static final int FUELTEMP = AttributesEnum.FuelTemp.index();
    public static final int DENSITYKG = AttributesEnum.DensityKg.index();
    public static final int DENSITYTEMP = AttributesEnum.DensityTemp.index();
    public static final int FMDAILYCONDID = AttributesEnum.FmdailyConDId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int TBLFMDAILYCONM = AttributesEnum.TblFmdailyConM.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblFmdailyConDImpl() {
    }

    /**
     * Gets the attribute value for FmtanksId, using the alias name FmtanksId.
     * @return the value of FmtanksId
     */
    public BigDecimal getFmtanksId() {
        return (BigDecimal) getAttributeInternal(FMTANKSID);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmtanksId.
     * @param value value to set the FmtanksId
     */
    public void setFmtanksId(BigDecimal value) {
        setAttributeInternal(FMTANKSID, value);
    }

    /**
     * Gets the attribute value for FmitemsId, using the alias name FmitemsId.
     * @return the value of FmitemsId
     */
    public BigDecimal getFmitemsId() {
        return (BigDecimal) getAttributeInternal(FMITEMSID);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmitemsId.
     * @param value value to set the FmitemsId
     */
    public void setFmitemsId(BigDecimal value) {
        setAttributeInternal(FMITEMSID, value);
    }

    /**
     * Gets the attribute value for FmdailyConMId, using the alias name FmdailyConMId.
     * @return the value of FmdailyConMId
     */
    public BigDecimal getFmdailyConMId() {
        return (BigDecimal) getAttributeInternal(FMDAILYCONMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmdailyConMId.
     * @param value value to set the FmdailyConMId
     */
    public void setFmdailyConMId(BigDecimal value) {
        setAttributeInternal(FMDAILYCONMID, value);
    }

    /**
     * Gets the attribute value for FillSts, using the alias name FillSts.
     * @return the value of FillSts
     */
    public String getFillSts() {
        return (String) getAttributeInternal(FILLSTS);
    }

    /**
     * Sets <code>value</code> as the attribute value for FillSts.
     * @param value value to set the FillSts
     */
    public void setFillSts(String value) {
        setAttributeInternal(FILLSTS, value);
    }

    /**
     * Gets the attribute value for DipValue1, using the alias name DipValue1.
     * @return the value of DipValue1
     */
    public BigDecimal getDipValue1() {
        return (BigDecimal) getAttributeInternal(DIPVALUE1);
    }

    /**
     * Sets <code>value</code> as the attribute value for DipValue1.
     * @param value value to set the DipValue1
     */
    public void setDipValue1(BigDecimal value) {
        setAttributeInternal(DIPVALUE1, value);
    }

    /**
     * Gets the attribute value for DipValue2, using the alias name DipValue2.
     * @return the value of DipValue2
     */
    public BigDecimal getDipValue2() {
        return (BigDecimal) getAttributeInternal(DIPVALUE2);
    }

    /**
     * Sets <code>value</code> as the attribute value for DipValue2.
     * @param value value to set the DipValue2
     */
    public void setDipValue2(BigDecimal value) {
        setAttributeInternal(DIPVALUE2, value);
    }

    /**
     * Gets the attribute value for DipValue3, using the alias name DipValue3.
     * @return the value of DipValue3
     */
    public BigDecimal getDipValue3() {
        return (BigDecimal) getAttributeInternal(DIPVALUE3);
    }

    /**
     * Sets <code>value</code> as the attribute value for DipValue3.
     * @param value value to set the DipValue3
     */
    public void setDipValue3(BigDecimal value) {
        setAttributeInternal(DIPVALUE3, value);
    }

    /**
     * Gets the attribute value for AmbTemp, using the alias name AmbTemp.
     * @return the value of AmbTemp
     */
    public BigDecimal getAmbTemp() {
        return (BigDecimal) getAttributeInternal(AMBTEMP);
    }

    /**
     * Sets <code>value</code> as the attribute value for AmbTemp.
     * @param value value to set the AmbTemp
     */
    public void setAmbTemp(BigDecimal value) {
        setAttributeInternal(AMBTEMP, value);
    }

    /**
     * Gets the attribute value for FuelTemp, using the alias name FuelTemp.
     * @return the value of FuelTemp
     */
    public BigDecimal getFuelTemp() {
        return (BigDecimal) getAttributeInternal(FUELTEMP);
    }

    /**
     * Sets <code>value</code> as the attribute value for FuelTemp.
     * @param value value to set the FuelTemp
     */
    public void setFuelTemp(BigDecimal value) {
        setAttributeInternal(FUELTEMP, value);
    }

    /**
     * Gets the attribute value for DensityKg, using the alias name DensityKg.
     * @return the value of DensityKg
     */
    public BigDecimal getDensityKg() {
        return (BigDecimal) getAttributeInternal(DENSITYKG);
    }

    /**
     * Sets <code>value</code> as the attribute value for DensityKg.
     * @param value value to set the DensityKg
     */
    public void setDensityKg(BigDecimal value) {
        setAttributeInternal(DENSITYKG, value);
    }

    /**
     * Gets the attribute value for DensityTemp, using the alias name DensityTemp.
     * @return the value of DensityTemp
     */
    public BigDecimal getDensityTemp() {
        return (BigDecimal) getAttributeInternal(DENSITYTEMP);
    }

    /**
     * Sets <code>value</code> as the attribute value for DensityTemp.
     * @param value value to set the DensityTemp
     */
    public void setDensityTemp(BigDecimal value) {
        setAttributeInternal(DENSITYTEMP, value);
    }

    /**
     * Gets the attribute value for FmdailyConDId, using the alias name FmdailyConDId.
     * @return the value of FmdailyConDId
     */
    public BigDecimal getFmdailyConDId() {
        return (BigDecimal) getAttributeInternal(FMDAILYCONDID);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmdailyConDId.
     * @param value value to set the FmdailyConDId
     */
    public void setFmdailyConDId(BigDecimal value) {
        setAttributeInternal(FMDAILYCONDID, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public Number getCreatedBy() {
        return (Number) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Gets the attribute value for UpdatedBy, using the alias name UpdatedBy.
     * @return the value of UpdatedBy
     */
    public Number getUpdatedBy() {
        return (Number) getAttributeInternal(UPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for UpdatedBy.
     * @param value value to set the UpdatedBy
     */
    public void setUpdatedBy(Number value) {
        setAttributeInternal(UPDATEDBY, value);
    }

    /**
     * Gets the attribute value for UpdatedDate, using the alias name UpdatedDate.
     * @return the value of UpdatedDate
     */
    public Timestamp getUpdatedDate() {
        return (Timestamp) getAttributeInternal(UPDATEDDATE);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getTblFmdailyConM() {
        return (EntityImpl) getAttributeInternal(TBLFMDAILYCONM);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblFmdailyConM(EntityImpl value) {
        setAttributeInternal(TBLFMDAILYCONM, value);
    }

    /**
     * @param fmdailyConDId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal fmdailyConDId) {
        return new Key(new Object[] { fmdailyConDId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.TblFmdailyConD");
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        Number loginId = null;
             try {
                 loginId = new Number((String) ADFContext.getCurrent().getSessionScope().get("sessUMID"));
             } catch(Exception ex) {
                 ex.printStackTrace();
             }
             
             if (operation == DML_INSERT) {
                 setCreatedBy(loginId);
                 setUpdatedBy(loginId);
                 } else if(operation == DML_UPDATE) {
                 setUpdatedBy(loginId);
             }
        super.doDML(operation, e);
    }
}

