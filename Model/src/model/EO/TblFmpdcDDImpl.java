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
// ---    Mon Jul 27 12:06:13 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblFmpdcDDImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        FmpdcDDId,
        RecDate,
        DueDate,
        Amount,
        CrDays,
        FmpdcMId,
        CreatedBy,
        CreatedDate,
        UpdatedBy,
        UpdatedDate,
        TblFmpdcM;
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
    public static final int FMPDCDDID = AttributesEnum.FmpdcDDId.index();
    public static final int RECDATE = AttributesEnum.RecDate.index();
    public static final int DUEDATE = AttributesEnum.DueDate.index();
    public static final int AMOUNT = AttributesEnum.Amount.index();
    public static final int CRDAYS = AttributesEnum.CrDays.index();
    public static final int FMPDCMID = AttributesEnum.FmpdcMId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int TBLFMPDCM = AttributesEnum.TblFmpdcM.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblFmpdcDDImpl() {
    }

    /**
     * Gets the attribute value for FmpdcDDId, using the alias name FmpdcDDId.
     * @return the value of FmpdcDDId
     */
    public BigDecimal getFmpdcDDId() {
        return (BigDecimal) getAttributeInternal(FMPDCDDID);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmpdcDDId.
     * @param value value to set the FmpdcDDId
     */
    public void setFmpdcDDId(BigDecimal value) {
        setAttributeInternal(FMPDCDDID, value);
    }

    /**
     * Gets the attribute value for RecDate, using the alias name RecDate.
     * @return the value of RecDate
     */
    public Timestamp getRecDate() {
        return (Timestamp) getAttributeInternal(RECDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for RecDate.
     * @param value value to set the RecDate
     */
    public void setRecDate(Timestamp value) {
        setAttributeInternal(RECDATE, value);
    }

    /**
     * Gets the attribute value for DueDate, using the alias name DueDate.
     * @return the value of DueDate
     */
    public Timestamp getDueDate() {
        return (Timestamp) getAttributeInternal(DUEDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for DueDate.
     * @param value value to set the DueDate
     */
    public void setDueDate(Timestamp value) {
        setAttributeInternal(DUEDATE, value);
    }

    /**
     * Gets the attribute value for Amount, using the alias name Amount.
     * @return the value of Amount
     */
    public BigDecimal getAmount() {
        return (BigDecimal) getAttributeInternal(AMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Amount.
     * @param value value to set the Amount
     */
    public void setAmount(BigDecimal value) {
        setAttributeInternal(AMOUNT, value);
    }

    /**
     * Gets the attribute value for CrDays, using the alias name CrDays.
     * @return the value of CrDays
     */
    public BigDecimal getCrDays() {
        return (BigDecimal) getAttributeInternal(CRDAYS);
    }

    /**
     * Sets <code>value</code> as the attribute value for CrDays.
     * @param value value to set the CrDays
     */
    public void setCrDays(BigDecimal value) {
        setAttributeInternal(CRDAYS, value);
    }

    /**
     * Gets the attribute value for FmpdcMId, using the alias name FmpdcMId.
     * @return the value of FmpdcMId
     */
    public BigDecimal getFmpdcMId() {
        return (BigDecimal) getAttributeInternal(FMPDCMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmpdcMId.
     * @param value value to set the FmpdcMId
     */
    public void setFmpdcMId(BigDecimal value) {
        setAttributeInternal(FMPDCMID, value);
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
    public EntityImpl getTblFmpdcM() {
        return (EntityImpl) getAttributeInternal(TBLFMPDCM);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblFmpdcM(EntityImpl value) {
        setAttributeInternal(TBLFMPDCM, value);
    }

    /**
     * @param fmpdcDDId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal fmpdcDDId) {
        return new Key(new Object[] { fmpdcDDId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.TblFmpdcDD");
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
                 loginId = new Number((String) ADFContext.getCurrent().getSessionScope().get("sessRID"));
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

