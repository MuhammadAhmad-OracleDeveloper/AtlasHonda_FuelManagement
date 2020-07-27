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
// ---    Mon Jul 27 12:08:35 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblFmpdcMImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        FmpdcMId,
        FmpdcMDate,
        FmvendorsId,
        FmpdcMRemarks,
        FromDate,
        ToDate,
        CreatedBy,
        CreatedDate,
        UpdatedBy,
        UpdatedDate,
        TblFmpdcD,
        TblFmpdcDD;
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
    public static final int FMPDCMID = AttributesEnum.FmpdcMId.index();
    public static final int FMPDCMDATE = AttributesEnum.FmpdcMDate.index();
    public static final int FMVENDORSID = AttributesEnum.FmvendorsId.index();
    public static final int FMPDCMREMARKS = AttributesEnum.FmpdcMRemarks.index();
    public static final int FROMDATE = AttributesEnum.FromDate.index();
    public static final int TODATE = AttributesEnum.ToDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int TBLFMPDCD = AttributesEnum.TblFmpdcD.index();
    public static final int TBLFMPDCDD = AttributesEnum.TblFmpdcDD.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblFmpdcMImpl() {
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
     * Gets the attribute value for FmpdcMDate, using the alias name FmpdcMDate.
     * @return the value of FmpdcMDate
     */
    public Timestamp getFmpdcMDate() {
        return (Timestamp) getAttributeInternal(FMPDCMDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmpdcMDate.
     * @param value value to set the FmpdcMDate
     */
    public void setFmpdcMDate(Timestamp value) {
        setAttributeInternal(FMPDCMDATE, value);
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
     * Gets the attribute value for FmpdcMRemarks, using the alias name FmpdcMRemarks.
     * @return the value of FmpdcMRemarks
     */
    public String getFmpdcMRemarks() {
        return (String) getAttributeInternal(FMPDCMREMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmpdcMRemarks.
     * @param value value to set the FmpdcMRemarks
     */
    public void setFmpdcMRemarks(String value) {
        setAttributeInternal(FMPDCMREMARKS, value);
    }

    /**
     * Gets the attribute value for FromDate, using the alias name FromDate.
     * @return the value of FromDate
     */
    public Timestamp getFromDate() {
        return (Timestamp) getAttributeInternal(FROMDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for FromDate.
     * @param value value to set the FromDate
     */
    public void setFromDate(Timestamp value) {
        setAttributeInternal(FROMDATE, value);
    }

    /**
     * Gets the attribute value for ToDate, using the alias name ToDate.
     * @return the value of ToDate
     */
    public Timestamp getToDate() {
        return (Timestamp) getAttributeInternal(TODATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ToDate.
     * @param value value to set the ToDate
     */
    public void setToDate(Timestamp value) {
        setAttributeInternal(TODATE, value);
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
    public RowIterator getTblFmpdcD() {
        return (RowIterator) getAttributeInternal(TBLFMPDCD);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblFmpdcDD() {
        return (RowIterator) getAttributeInternal(TBLFMPDCDD);
    }

    /**
     * @param fmpdcMId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal fmpdcMId) {
        return new Key(new Object[] { fmpdcMId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.TblFmpdcM");
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

