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
// ---    Mon Jul 27 11:27:30 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblFmdailyConEngMImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        FmdailyConEngMId,
        ReadingDate,
        CreatedBy,
        CreatedDate,
        UpdatedBy,
        UpdatedDate,
        TblFmdailyConEngBoilerD,
        TblFmdailyConEngD;
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
    public static final int FMDAILYCONENGMID = AttributesEnum.FmdailyConEngMId.index();
    public static final int READINGDATE = AttributesEnum.ReadingDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int TBLFMDAILYCONENGBOILERD = AttributesEnum.TblFmdailyConEngBoilerD.index();
    public static final int TBLFMDAILYCONENGD = AttributesEnum.TblFmdailyConEngD.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblFmdailyConEngMImpl() {
    }

    /**
     * Gets the attribute value for FmdailyConEngMId, using the alias name FmdailyConEngMId.
     * @return the value of FmdailyConEngMId
     */
    public BigDecimal getFmdailyConEngMId() {
        return (BigDecimal) getAttributeInternal(FMDAILYCONENGMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmdailyConEngMId.
     * @param value value to set the FmdailyConEngMId
     */
    public void setFmdailyConEngMId(BigDecimal value) {
        setAttributeInternal(FMDAILYCONENGMID, value);
    }

    /**
     * Gets the attribute value for ReadingDate, using the alias name ReadingDate.
     * @return the value of ReadingDate
     */
    public Timestamp getReadingDate() {
        return (Timestamp) getAttributeInternal(READINGDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ReadingDate.
     * @param value value to set the ReadingDate
     */
    public void setReadingDate(Timestamp value) {
        setAttributeInternal(READINGDATE, value);
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
    public RowIterator getTblFmdailyConEngBoilerD() {
        return (RowIterator) getAttributeInternal(TBLFMDAILYCONENGBOILERD);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblFmdailyConEngD() {
        return (RowIterator) getAttributeInternal(TBLFMDAILYCONENGD);
    }

    /**
     * @param fmdailyConEngMId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal fmdailyConEngMId) {
        return new Key(new Object[] { fmdailyConEngMId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.TblFmdailyConEngM");
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

