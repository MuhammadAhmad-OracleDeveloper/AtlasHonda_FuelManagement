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
// ---    Mon Jul 27 11:44:09 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblFmitemsImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        FmitemsId,
        FmitemsName,
        Ast,
        FmuomId,
        FmminLvl,
        FmmaxLvl,
        FmreordLvl,
        Remarks,
        CreatedBy,
        CreatedDate,
        UpdatedBy,
        UpdatedDate,
        TblFmpoD,
        TblFmrates,
        TblFmrnD,
        TblFmuom;
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
    public static final int FMITEMSID = AttributesEnum.FmitemsId.index();
    public static final int FMITEMSNAME = AttributesEnum.FmitemsName.index();
    public static final int AST = AttributesEnum.Ast.index();
    public static final int FMUOMID = AttributesEnum.FmuomId.index();
    public static final int FMMINLVL = AttributesEnum.FmminLvl.index();
    public static final int FMMAXLVL = AttributesEnum.FmmaxLvl.index();
    public static final int FMREORDLVL = AttributesEnum.FmreordLvl.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int TBLFMPOD = AttributesEnum.TblFmpoD.index();
    public static final int TBLFMRATES = AttributesEnum.TblFmrates.index();
    public static final int TBLFMRND = AttributesEnum.TblFmrnD.index();
    public static final int TBLFMUOM = AttributesEnum.TblFmuom.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblFmitemsImpl() {
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
     * Gets the attribute value for FmitemsName, using the alias name FmitemsName.
     * @return the value of FmitemsName
     */
    public String getFmitemsName() {
        return (String) getAttributeInternal(FMITEMSNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmitemsName.
     * @param value value to set the FmitemsName
     */
    public void setFmitemsName(String value) {
        setAttributeInternal(FMITEMSNAME, value);
    }

    /**
     * Gets the attribute value for Ast, using the alias name Ast.
     * @return the value of Ast
     */
    public String getAst() {
        return (String) getAttributeInternal(AST);
    }

    /**
     * Sets <code>value</code> as the attribute value for Ast.
     * @param value value to set the Ast
     */
    public void setAst(String value) {
        setAttributeInternal(AST, value);
    }

    /**
     * Gets the attribute value for FmuomId, using the alias name FmuomId.
     * @return the value of FmuomId
     */
    public BigDecimal getFmuomId() {
        return (BigDecimal) getAttributeInternal(FMUOMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmuomId.
     * @param value value to set the FmuomId
     */
    public void setFmuomId(BigDecimal value) {
        setAttributeInternal(FMUOMID, value);
    }

    /**
     * Gets the attribute value for FmminLvl, using the alias name FmminLvl.
     * @return the value of FmminLvl
     */
    public BigDecimal getFmminLvl() {
        return (BigDecimal) getAttributeInternal(FMMINLVL);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmminLvl.
     * @param value value to set the FmminLvl
     */
    public void setFmminLvl(BigDecimal value) {
        setAttributeInternal(FMMINLVL, value);
    }

    /**
     * Gets the attribute value for FmmaxLvl, using the alias name FmmaxLvl.
     * @return the value of FmmaxLvl
     */
    public BigDecimal getFmmaxLvl() {
        return (BigDecimal) getAttributeInternal(FMMAXLVL);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmmaxLvl.
     * @param value value to set the FmmaxLvl
     */
    public void setFmmaxLvl(BigDecimal value) {
        setAttributeInternal(FMMAXLVL, value);
    }

    /**
     * Gets the attribute value for FmreordLvl, using the alias name FmreordLvl.
     * @return the value of FmreordLvl
     */
    public BigDecimal getFmreordLvl() {
        return (BigDecimal) getAttributeInternal(FMREORDLVL);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmreordLvl.
     * @param value value to set the FmreordLvl
     */
    public void setFmreordLvl(BigDecimal value) {
        setAttributeInternal(FMREORDLVL, value);
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
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblFmpoD() {
        return (RowIterator) getAttributeInternal(TBLFMPOD);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblFmrates() {
        return (RowIterator) getAttributeInternal(TBLFMRATES);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblFmrnD() {
        return (RowIterator) getAttributeInternal(TBLFMRND);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getTblFmuom() {
        return (EntityImpl) getAttributeInternal(TBLFMUOM);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblFmuom(EntityImpl value) {
        setAttributeInternal(TBLFMUOM, value);
    }

    /**
     * @param fmitemsId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal fmitemsId) {
        return new Key(new Object[] { fmitemsId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.TblFmitems");
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

