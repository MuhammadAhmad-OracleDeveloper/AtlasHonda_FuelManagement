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
// ---    Mon Jul 27 11:46:28 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblFmlabTestRepDImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        FmlabTestRepDId,
        FmlabTestRepMId,
        FmlabtestId,
        Remarks,
        CreatedBy,
        CreatedDate,
        UpdatedBy,
        UpdatedDate,
        TblFmlabTestRepM;
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
    public static final int FMLABTESTREPDID = AttributesEnum.FmlabTestRepDId.index();
    public static final int FMLABTESTREPMID = AttributesEnum.FmlabTestRepMId.index();
    public static final int FMLABTESTID = AttributesEnum.FmlabtestId.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int TBLFMLABTESTREPM = AttributesEnum.TblFmlabTestRepM.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblFmlabTestRepDImpl() {
    }

    /**
     * Gets the attribute value for FmlabTestRepDId, using the alias name FmlabTestRepDId.
     * @return the value of FmlabTestRepDId
     */
    public BigDecimal getFmlabTestRepDId() {
        return (BigDecimal) getAttributeInternal(FMLABTESTREPDID);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmlabTestRepDId.
     * @param value value to set the FmlabTestRepDId
     */
    public void setFmlabTestRepDId(BigDecimal value) {
        setAttributeInternal(FMLABTESTREPDID, value);
    }

    /**
     * Gets the attribute value for FmlabTestRepMId, using the alias name FmlabTestRepMId.
     * @return the value of FmlabTestRepMId
     */
    public BigDecimal getFmlabTestRepMId() {
        return (BigDecimal) getAttributeInternal(FMLABTESTREPMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmlabTestRepMId.
     * @param value value to set the FmlabTestRepMId
     */
    public void setFmlabTestRepMId(BigDecimal value) {
        setAttributeInternal(FMLABTESTREPMID, value);
    }

    /**
     * Gets the attribute value for FmlabtestId, using the alias name FmlabtestId.
     * @return the value of FmlabtestId
     */
    public BigDecimal getFmlabtestId() {
        return (BigDecimal) getAttributeInternal(FMLABTESTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmlabtestId.
     * @param value value to set the FmlabtestId
     */
    public void setFmlabtestId(BigDecimal value) {
        setAttributeInternal(FMLABTESTID, value);
    }

    /**
     * Gets the attribute value for Remarks, using the alias name Remarks.
     * @return the value of Remarks
     */
    public String getRemarks() {
        return (String) getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Remarks.
     * @param value value to set the Remarks
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
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
    public EntityImpl getTblFmlabTestRepM() {
        return (EntityImpl) getAttributeInternal(TBLFMLABTESTREPM);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblFmlabTestRepM(EntityImpl value) {
        setAttributeInternal(TBLFMLABTESTREPM, value);
    }

    /**
     * @param fmlabTestRepDId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal fmlabTestRepDId) {
        return new Key(new Object[] { fmlabTestRepDId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.TblFmlabTestRepD");
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

