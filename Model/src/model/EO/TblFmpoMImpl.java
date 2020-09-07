package model.EO;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jul 27 12:12:19 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblFmpoMImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        FmpoMId,
        FmpoMDate,
        FmvendorsId,
        FmlocationId,
        FmdocstsId,
        FmpoMRemarks,
        FmpoMCrDays,
        SpecInstr,
        CreatedBy,
        CreatedDate,
        UpdatedBy,
        UpdatedDate,
        TblFmpoD,
        TblFmdocsts,
        TblFmlocation,
        TblFmrnM,
        TblFmvendors;
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
    public static final int FMPOMID = AttributesEnum.FmpoMId.index();
    public static final int FMPOMDATE = AttributesEnum.FmpoMDate.index();
    public static final int FMVENDORSID = AttributesEnum.FmvendorsId.index();
    public static final int FMLOCATIONID = AttributesEnum.FmlocationId.index();
    public static final int FMDOCSTSID = AttributesEnum.FmdocstsId.index();
    public static final int FMPOMREMARKS = AttributesEnum.FmpoMRemarks.index();
    public static final int FMPOMCRDAYS = AttributesEnum.FmpoMCrDays.index();
    public static final int SPECINSTR = AttributesEnum.SpecInstr.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int TBLFMPOD = AttributesEnum.TblFmpoD.index();
    public static final int TBLFMDOCSTS = AttributesEnum.TblFmdocsts.index();
    public static final int TBLFMLOCATION = AttributesEnum.TblFmlocation.index();
    public static final int TBLFMRNM = AttributesEnum.TblFmrnM.index();
    public static final int TBLFMVENDORS = AttributesEnum.TblFmvendors.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblFmpoMImpl() {
    }

    /**
     * Gets the attribute value for FmpoMId, using the alias name FmpoMId.
     * @return the value of FmpoMId
     */
    public BigDecimal getFmpoMId() {
        return (BigDecimal) getAttributeInternal(FMPOMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmpoMId.
     * @param value value to set the FmpoMId
     */
    public void setFmpoMId(BigDecimal value) {
        setAttributeInternal(FMPOMID, value);
    }

    /**
     * Gets the attribute value for FmpoMDate, using the alias name FmpoMDate.
     * @return the value of FmpoMDate
     */
    public Timestamp getFmpoMDate() {
        return (Timestamp) getAttributeInternal(FMPOMDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmpoMDate.
     * @param value value to set the FmpoMDate
     */
    public void setFmpoMDate(Timestamp value) {
        setAttributeInternal(FMPOMDATE, value);
    }

    /**
     * Gets the attribute value for FmvendorsId, using the alias name FmvendorsId.
     * @return the value of FmvendorsId
     */
    public BigDecimal getFmvendorsId() {
        return (BigDecimal) getAttributeInternal(FMVENDORSID);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmvendorsId.
     * @param value value to set the FmvendorsId
     */
    public void setFmvendorsId(BigDecimal value) {
        setAttributeInternal(FMVENDORSID, value);
    }

    /**
     * Gets the attribute value for FmlocationId, using the alias name FmlocationId.
     * @return the value of FmlocationId
     */
    public BigDecimal getFmlocationId() {
        return (BigDecimal) getAttributeInternal(FMLOCATIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmlocationId.
     * @param value value to set the FmlocationId
     */
    public void setFmlocationId(BigDecimal value) {
        setAttributeInternal(FMLOCATIONID, value);
    }

    /**
     * Gets the attribute value for FmdocstsId, using the alias name FmdocstsId.
     * @return the value of FmdocstsId
     */
    public BigDecimal getFmdocstsId() {
        return (BigDecimal) getAttributeInternal(FMDOCSTSID);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmdocstsId.
     * @param value value to set the FmdocstsId
     */
    public void setFmdocstsId(BigDecimal value) {
        setAttributeInternal(FMDOCSTSID, value);
    }

    /**
     * Gets the attribute value for FmpoMRemarks, using the alias name FmpoMRemarks.
     * @return the value of FmpoMRemarks
     */
    public String getFmpoMRemarks() {
        return (String) getAttributeInternal(FMPOMREMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmpoMRemarks.
     * @param value value to set the FmpoMRemarks
     */
    public void setFmpoMRemarks(String value) {
        setAttributeInternal(FMPOMREMARKS, value);
    }

    /**
     * Gets the attribute value for FmpoMCrDays, using the alias name FmpoMCrDays.
     * @return the value of FmpoMCrDays
     */
    public BigDecimal getFmpoMCrDays() {
        return (BigDecimal) getAttributeInternal(FMPOMCRDAYS);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmpoMCrDays.
     * @param value value to set the FmpoMCrDays
     */
    public void setFmpoMCrDays(BigDecimal value) {
        setAttributeInternal(FMPOMCRDAYS, value);
    }

    /**
     * Gets the attribute value for SpecInstr, using the alias name SpecInstr.
     * @return the value of SpecInstr
     */
    public String getSpecInstr() {
        return (String) getAttributeInternal(SPECINSTR);
    }

    /**
     * Sets <code>value</code> as the attribute value for SpecInstr.
     * @param value value to set the SpecInstr
     */
    public void setSpecInstr(String value) {
        setAttributeInternal(SPECINSTR, value);
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
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblFmpoD() {
        return (RowIterator) getAttributeInternal(TBLFMPOD);
    }

    /**
     * @return the associated entity TblFmdocstsImpl.
     */
    public TblFmdocstsImpl getTblFmdocsts() {
        return (TblFmdocstsImpl) getAttributeInternal(TBLFMDOCSTS);
    }

    /**
     * Sets <code>value</code> as the associated entity TblFmdocstsImpl.
     */
    public void setTblFmdocsts(TblFmdocstsImpl value) {
        setAttributeInternal(TBLFMDOCSTS, value);
    }

    /**
     * @return the associated entity TblFmlocationImpl.
     */
    public TblFmlocationImpl getTblFmlocation() {
        return (TblFmlocationImpl) getAttributeInternal(TBLFMLOCATION);
    }

    /**
     * Sets <code>value</code> as the associated entity TblFmlocationImpl.
     */
    public void setTblFmlocation(TblFmlocationImpl value) {
        setAttributeInternal(TBLFMLOCATION, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblFmrnM() {
        return (RowIterator) getAttributeInternal(TBLFMRNM);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getTblFmvendors() {
        return (EntityImpl) getAttributeInternal(TBLFMVENDORS);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblFmvendors(EntityImpl value) {
        setAttributeInternal(TBLFMVENDORS, value);
    }

    /**
     * @param fmpoMId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal fmpoMId) {
        return new Key(new Object[] { fmpoMId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.TblFmpoM");
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
