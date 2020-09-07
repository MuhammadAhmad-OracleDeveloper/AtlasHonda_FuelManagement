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
// ---    Mon Jul 27 11:53:39 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblFmlabTestRepMImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        FmlabTestRepMId,
        FmreportDate,
        FmgatePass,
        FmvendorsId,
        FmlocationId,
        FmitemsId,
        FmbatchNo,
        CreatedBy,
        CreatedDate,
        UpdatedBy,
        UpdatedDate,
        TblFmlabTestRepD;
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
    public static final int FMLABTESTREPMID = AttributesEnum.FmlabTestRepMId.index();
    public static final int FMREPORTDATE = AttributesEnum.FmreportDate.index();
    public static final int FMGATEPASS = AttributesEnum.FmgatePass.index();
    public static final int FMVENDORSID = AttributesEnum.FmvendorsId.index();
    public static final int FMLOCATIONID = AttributesEnum.FmlocationId.index();
    public static final int FMITEMSID = AttributesEnum.FmitemsId.index();
    public static final int FMBATCHNO = AttributesEnum.FmbatchNo.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int TBLFMLABTESTREPD = AttributesEnum.TblFmlabTestRepD.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblFmlabTestRepMImpl() {
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
     * Gets the attribute value for FmreportDate, using the alias name FmreportDate.
     * @return the value of FmreportDate
     */
    public Timestamp getFmreportDate() {
        return (Timestamp) getAttributeInternal(FMREPORTDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmreportDate.
     * @param value value to set the FmreportDate
     */
    public void setFmreportDate(Timestamp value) {
        setAttributeInternal(FMREPORTDATE, value);
    }

    /**
     * Gets the attribute value for FmgatePass, using the alias name FmgatePass.
     * @return the value of FmgatePass
     */
    public String getFmgatePass() {
        return (String) getAttributeInternal(FMGATEPASS);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmgatePass.
     * @param value value to set the FmgatePass
     */
    public void setFmgatePass(String value) {
        setAttributeInternal(FMGATEPASS, value);
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
     * Gets the attribute value for FmbatchNo, using the alias name FmbatchNo.
     * @return the value of FmbatchNo
     */
    public BigDecimal getFmbatchNo() {
        return (BigDecimal) getAttributeInternal(FMBATCHNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmbatchNo.
     * @param value value to set the FmbatchNo
     */
    public void setFmbatchNo(BigDecimal value) {
        setAttributeInternal(FMBATCHNO, value);
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
    public RowIterator getTblFmlabTestRepD() {
        return (RowIterator) getAttributeInternal(TBLFMLABTESTREPD);
    }

    /**
     * @param fmlabTestRepMId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal fmlabTestRepMId) {
        return new Key(new Object[] { fmlabTestRepMId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.TblFmlabTestRepM");
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
