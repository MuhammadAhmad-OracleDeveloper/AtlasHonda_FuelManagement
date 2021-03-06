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
// ---    Mon Jul 27 12:03:17 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblFmpdcDImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        FmpdcDId,
        FmpdcMId,
        FmrnMId,
        FmrnAmount,
        ChqNo,
        ChqDate,
        ChqAmount,
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
    public static final int FMPDCDID = AttributesEnum.FmpdcDId.index();
    public static final int FMPDCMID = AttributesEnum.FmpdcMId.index();
    public static final int FMRNMID = AttributesEnum.FmrnMId.index();
    public static final int FMRNAMOUNT = AttributesEnum.FmrnAmount.index();
    public static final int CHQNO = AttributesEnum.ChqNo.index();
    public static final int CHQDATE = AttributesEnum.ChqDate.index();
    public static final int CHQAMOUNT = AttributesEnum.ChqAmount.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int TBLFMPDCM = AttributesEnum.TblFmpdcM.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblFmpdcDImpl() {
    }

    /**
     * Gets the attribute value for FmpdcDId, using the alias name FmpdcDId.
     * @return the value of FmpdcDId
     */
    public BigDecimal getFmpdcDId() {
        return (BigDecimal) getAttributeInternal(FMPDCDID);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmpdcDId.
     * @param value value to set the FmpdcDId
     */
    public void setFmpdcDId(BigDecimal value) {
        setAttributeInternal(FMPDCDID, value);
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
     * Gets the attribute value for FmrnMId, using the alias name FmrnMId.
     * @return the value of FmrnMId
     */
    public BigDecimal getFmrnMId() {
        return (BigDecimal) getAttributeInternal(FMRNMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmrnMId.
     * @param value value to set the FmrnMId
     */
    public void setFmrnMId(BigDecimal value) {
        setAttributeInternal(FMRNMID, value);
    }

    /**
     * Gets the attribute value for FmrnAmount, using the alias name FmrnAmount.
     * @return the value of FmrnAmount
     */
    public BigDecimal getFmrnAmount() {
        return (BigDecimal) getAttributeInternal(FMRNAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmrnAmount.
     * @param value value to set the FmrnAmount
     */
    public void setFmrnAmount(BigDecimal value) {
        setAttributeInternal(FMRNAMOUNT, value);
    }

    /**
     * Gets the attribute value for ChqNo, using the alias name ChqNo.
     * @return the value of ChqNo
     */
    public String getChqNo() {
        return (String) getAttributeInternal(CHQNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for ChqNo.
     * @param value value to set the ChqNo
     */
    public void setChqNo(String value) {
        setAttributeInternal(CHQNO, value);
    }

    /**
     * Gets the attribute value for ChqDate, using the alias name ChqDate.
     * @return the value of ChqDate
     */
    public Timestamp getChqDate() {
        return (Timestamp) getAttributeInternal(CHQDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ChqDate.
     * @param value value to set the ChqDate
     */
    public void setChqDate(Timestamp value) {
        setAttributeInternal(CHQDATE, value);
    }

    /**
     * Gets the attribute value for ChqAmount, using the alias name ChqAmount.
     * @return the value of ChqAmount
     */
    public BigDecimal getChqAmount() {
        return (BigDecimal) getAttributeInternal(CHQAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for ChqAmount.
     * @param value value to set the ChqAmount
     */
    public void setChqAmount(BigDecimal value) {
        setAttributeInternal(CHQAMOUNT, value);
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
     * @param fmpdcDId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal fmpdcDId) {
        return new Key(new Object[] { fmpdcDId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.TblFmpdcD");
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

