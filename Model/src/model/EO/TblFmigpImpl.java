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
// ---    Mon Jul 27 11:37:04 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblFmigpImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        FmigpId,
        FmigpDate,
        FmtokenId,
        FmigpRemarks,
        CreatedBy,
        CreatedDate,
        UpdatedBy,
        UpdatedDate,
        TblFmtoken;
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
    public static final int FMIGPID = AttributesEnum.FmigpId.index();
    public static final int FMIGPDATE = AttributesEnum.FmigpDate.index();
    public static final int FMTOKENID = AttributesEnum.FmtokenId.index();
    public static final int FMIGPREMARKS = AttributesEnum.FmigpRemarks.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int TBLFMTOKEN = AttributesEnum.TblFmtoken.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblFmigpImpl() {
    }

    /**
     * Gets the attribute value for FmigpId, using the alias name FmigpId.
     * @return the value of FmigpId
     */
    public BigDecimal getFmigpId() {
        return (BigDecimal) getAttributeInternal(FMIGPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmigpId.
     * @param value value to set the FmigpId
     */
    public void setFmigpId(BigDecimal value) {
        setAttributeInternal(FMIGPID, value);
    }

    /**
     * Gets the attribute value for FmigpDate, using the alias name FmigpDate.
     * @return the value of FmigpDate
     */
    public Timestamp getFmigpDate() {
        return (Timestamp) getAttributeInternal(FMIGPDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmigpDate.
     * @param value value to set the FmigpDate
     */
    public void setFmigpDate(Timestamp value) {
        setAttributeInternal(FMIGPDATE, value);
    }

    /**
     * Gets the attribute value for FmtokenId, using the alias name FmtokenId.
     * @return the value of FmtokenId
     */
    public BigDecimal getFmtokenId() {
        return (BigDecimal) getAttributeInternal(FMTOKENID);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmtokenId.
     * @param value value to set the FmtokenId
     */
    public void setFmtokenId(BigDecimal value) {
        setAttributeInternal(FMTOKENID, value);
    }

    /**
     * Gets the attribute value for FmigpRemarks, using the alias name FmigpRemarks.
     * @return the value of FmigpRemarks
     */
    public String getFmigpRemarks() {
        return (String) getAttributeInternal(FMIGPREMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmigpRemarks.
     * @param value value to set the FmigpRemarks
     */
    public void setFmigpRemarks(String value) {
        setAttributeInternal(FMIGPREMARKS, value);
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
    public EntityImpl getTblFmtoken() {
        return (EntityImpl) getAttributeInternal(TBLFMTOKEN);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblFmtoken(EntityImpl value) {
        setAttributeInternal(TBLFMTOKEN, value);
    }

    /**
     * @param fmigpId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal fmigpId) {
        return new Key(new Object[] { fmigpId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.TblFmigp");
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
