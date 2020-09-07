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
// ---    Sat Jul 25 16:48:14 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblFmrnDImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        FmrnDId,
        FmrnMId,
        FmitemsId,
        FmrnQty,
        FmrnRate,
        FmrnGamt,
        FmrnStPerc,
        FmrnStAmt,
        FmrnNetAmt,
        FmrnGWeight,
        FmrnTWeight,
        FmrnNWeight,
        FmrnVtWeight,
        FmrnVnWeight,
        FmrnDip1,
        FmrnDip2,
        FmrnDip3,
        FmbayId,
        FmtanksId,
        CompSize,
        Shortage,
        ShortPerChart,
        CreatedBy,
        CreatedDate,
        UpdatedBy,
        UpdatedDate,
        TblFmbay,
        TblFmitems,
        TblFmrnM,
        TblFmtanks;
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
    public static final int FMRNDID = AttributesEnum.FmrnDId.index();
    public static final int FMRNMID = AttributesEnum.FmrnMId.index();
    public static final int FMITEMSID = AttributesEnum.FmitemsId.index();
    public static final int FMRNQTY = AttributesEnum.FmrnQty.index();
    public static final int FMRNRATE = AttributesEnum.FmrnRate.index();
    public static final int FMRNGAMT = AttributesEnum.FmrnGamt.index();
    public static final int FMRNSTPERC = AttributesEnum.FmrnStPerc.index();
    public static final int FMRNSTAMT = AttributesEnum.FmrnStAmt.index();
    public static final int FMRNNETAMT = AttributesEnum.FmrnNetAmt.index();
    public static final int FMRNGWEIGHT = AttributesEnum.FmrnGWeight.index();
    public static final int FMRNTWEIGHT = AttributesEnum.FmrnTWeight.index();
    public static final int FMRNNWEIGHT = AttributesEnum.FmrnNWeight.index();
    public static final int FMRNVTWEIGHT = AttributesEnum.FmrnVtWeight.index();
    public static final int FMRNVNWEIGHT = AttributesEnum.FmrnVnWeight.index();
    public static final int FMRNDIP1 = AttributesEnum.FmrnDip1.index();
    public static final int FMRNDIP2 = AttributesEnum.FmrnDip2.index();
    public static final int FMRNDIP3 = AttributesEnum.FmrnDip3.index();
    public static final int FMBAYID = AttributesEnum.FmbayId.index();
    public static final int FMTANKSID = AttributesEnum.FmtanksId.index();
    public static final int COMPSIZE = AttributesEnum.CompSize.index();
    public static final int SHORTAGE = AttributesEnum.Shortage.index();
    public static final int SHORTPERCHART = AttributesEnum.ShortPerChart.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int TBLFMBAY = AttributesEnum.TblFmbay.index();
    public static final int TBLFMITEMS = AttributesEnum.TblFmitems.index();
    public static final int TBLFMRNM = AttributesEnum.TblFmrnM.index();
    public static final int TBLFMTANKS = AttributesEnum.TblFmtanks.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblFmrnDImpl() {
    }

    /**
     * Gets the attribute value for FmrnDId, using the alias name FmrnDId.
     * @return the value of FmrnDId
     */
    public BigDecimal getFmrnDId() {
        return (BigDecimal) getAttributeInternal(FMRNDID);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmrnDId.
     * @param value value to set the FmrnDId
     */
    public void setFmrnDId(BigDecimal value) {
        setAttributeInternal(FMRNDID, value);
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
     * Gets the attribute value for FmrnQty, using the alias name FmrnQty.
     * @return the value of FmrnQty
     */
    public BigDecimal getFmrnQty() {
        return (BigDecimal) getAttributeInternal(FMRNQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmrnQty.
     * @param value value to set the FmrnQty
     */
    public void setFmrnQty(BigDecimal value) {
        setAttributeInternal(FMRNQTY, value);
    }

    /**
     * Gets the attribute value for FmrnRate, using the alias name FmrnRate.
     * @return the value of FmrnRate
     */
    public BigDecimal getFmrnRate() {
        return (BigDecimal) getAttributeInternal(FMRNRATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmrnRate.
     * @param value value to set the FmrnRate
     */
    public void setFmrnRate(BigDecimal value) {
        setAttributeInternal(FMRNRATE, value);
    }

    /**
     * Gets the attribute value for FmrnGamt, using the alias name FmrnGamt.
     * @return the value of FmrnGamt
     */
    public BigDecimal getFmrnGamt() {
        return (BigDecimal) getAttributeInternal(FMRNGAMT);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmrnGamt.
     * @param value value to set the FmrnGamt
     */
    public void setFmrnGamt(BigDecimal value) {
        setAttributeInternal(FMRNGAMT, value);
    }

    /**
     * Gets the attribute value for FmrnStPerc, using the alias name FmrnStPerc.
     * @return the value of FmrnStPerc
     */
    public BigDecimal getFmrnStPerc() {
        return (BigDecimal) getAttributeInternal(FMRNSTPERC);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmrnStPerc.
     * @param value value to set the FmrnStPerc
     */
    public void setFmrnStPerc(BigDecimal value) {
        setAttributeInternal(FMRNSTPERC, value);
    }

    /**
     * Gets the attribute value for FmrnStAmt, using the alias name FmrnStAmt.
     * @return the value of FmrnStAmt
     */
    public BigDecimal getFmrnStAmt() {
        return (BigDecimal) getAttributeInternal(FMRNSTAMT);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmrnStAmt.
     * @param value value to set the FmrnStAmt
     */
    public void setFmrnStAmt(BigDecimal value) {
        setAttributeInternal(FMRNSTAMT, value);
    }

    /**
     * Gets the attribute value for FmrnNetAmt, using the alias name FmrnNetAmt.
     * @return the value of FmrnNetAmt
     */
    public BigDecimal getFmrnNetAmt() {
        return (BigDecimal) getAttributeInternal(FMRNNETAMT);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmrnNetAmt.
     * @param value value to set the FmrnNetAmt
     */
    public void setFmrnNetAmt(BigDecimal value) {
        setAttributeInternal(FMRNNETAMT, value);
    }

    /**
     * Gets the attribute value for FmrnGWeight, using the alias name FmrnGWeight.
     * @return the value of FmrnGWeight
     */
    public BigDecimal getFmrnGWeight() {
        return (BigDecimal) getAttributeInternal(FMRNGWEIGHT);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmrnGWeight.
     * @param value value to set the FmrnGWeight
     */
    public void setFmrnGWeight(BigDecimal value) {
        setAttributeInternal(FMRNGWEIGHT, value);
    }

    /**
     * Gets the attribute value for FmrnTWeight, using the alias name FmrnTWeight.
     * @return the value of FmrnTWeight
     */
    public BigDecimal getFmrnTWeight() {
        return (BigDecimal) getAttributeInternal(FMRNTWEIGHT);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmrnTWeight.
     * @param value value to set the FmrnTWeight
     */
    public void setFmrnTWeight(BigDecimal value) {
        setAttributeInternal(FMRNTWEIGHT, value);
    }

    /**
     * Gets the attribute value for FmrnNWeight, using the alias name FmrnNWeight.
     * @return the value of FmrnNWeight
     */
    public BigDecimal getFmrnNWeight() {
        return (BigDecimal) getAttributeInternal(FMRNNWEIGHT);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmrnNWeight.
     * @param value value to set the FmrnNWeight
     */
    public void setFmrnNWeight(BigDecimal value) {
        setAttributeInternal(FMRNNWEIGHT, value);
    }

    /**
     * Gets the attribute value for FmrnVtWeight, using the alias name FmrnVtWeight.
     * @return the value of FmrnVtWeight
     */
    public BigDecimal getFmrnVtWeight() {
        return (BigDecimal) getAttributeInternal(FMRNVTWEIGHT);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmrnVtWeight.
     * @param value value to set the FmrnVtWeight
     */
    public void setFmrnVtWeight(BigDecimal value) {
        setAttributeInternal(FMRNVTWEIGHT, value);
    }

    /**
     * Gets the attribute value for FmrnVnWeight, using the alias name FmrnVnWeight.
     * @return the value of FmrnVnWeight
     */
    public BigDecimal getFmrnVnWeight() {
        return (BigDecimal) getAttributeInternal(FMRNVNWEIGHT);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmrnVnWeight.
     * @param value value to set the FmrnVnWeight
     */
    public void setFmrnVnWeight(BigDecimal value) {
        setAttributeInternal(FMRNVNWEIGHT, value);
    }

    /**
     * Gets the attribute value for FmrnDip1, using the alias name FmrnDip1.
     * @return the value of FmrnDip1
     */
    public BigDecimal getFmrnDip1() {
        return (BigDecimal) getAttributeInternal(FMRNDIP1);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmrnDip1.
     * @param value value to set the FmrnDip1
     */
    public void setFmrnDip1(BigDecimal value) {
        setAttributeInternal(FMRNDIP1, value);
    }

    /**
     * Gets the attribute value for FmrnDip2, using the alias name FmrnDip2.
     * @return the value of FmrnDip2
     */
    public BigDecimal getFmrnDip2() {
        return (BigDecimal) getAttributeInternal(FMRNDIP2);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmrnDip2.
     * @param value value to set the FmrnDip2
     */
    public void setFmrnDip2(BigDecimal value) {
        setAttributeInternal(FMRNDIP2, value);
    }

    /**
     * Gets the attribute value for FmrnDip3, using the alias name FmrnDip3.
     * @return the value of FmrnDip3
     */
    public BigDecimal getFmrnDip3() {
        return (BigDecimal) getAttributeInternal(FMRNDIP3);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmrnDip3.
     * @param value value to set the FmrnDip3
     */
    public void setFmrnDip3(BigDecimal value) {
        setAttributeInternal(FMRNDIP3, value);
    }

    /**
     * Gets the attribute value for FmbayId, using the alias name FmbayId.
     * @return the value of FmbayId
     */
    public BigDecimal getFmbayId() {
        return (BigDecimal) getAttributeInternal(FMBAYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for FmbayId.
     * @param value value to set the FmbayId
     */
    public void setFmbayId(BigDecimal value) {
        setAttributeInternal(FMBAYID, value);
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
     * Gets the attribute value for CompSize, using the alias name CompSize.
     * @return the value of CompSize
     */
    public String getCompSize() {
        return (String) getAttributeInternal(COMPSIZE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CompSize.
     * @param value value to set the CompSize
     */
    public void setCompSize(String value) {
        setAttributeInternal(COMPSIZE, value);
    }

    /**
     * Gets the attribute value for Shortage, using the alias name Shortage.
     * @return the value of Shortage
     */
    public String getShortage() {
        return (String) getAttributeInternal(SHORTAGE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Shortage.
     * @param value value to set the Shortage
     */
    public void setShortage(String value) {
        setAttributeInternal(SHORTAGE, value);
    }

    /**
     * Gets the attribute value for ShortPerChart, using the alias name ShortPerChart.
     * @return the value of ShortPerChart
     */
    public String getShortPerChart() {
        return (String) getAttributeInternal(SHORTPERCHART);
    }

    /**
     * Sets <code>value</code> as the attribute value for ShortPerChart.
     * @param value value to set the ShortPerChart
     */
    public void setShortPerChart(String value) {
        setAttributeInternal(SHORTPERCHART, value);
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
     * Sets <code>value</code> as the attribute value for CreatedDate.
     * @param value value to set the CreatedDate
     */
    public void setCreatedDate(Timestamp value) {
        setAttributeInternal(CREATEDDATE, value);
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
     * Sets <code>value</code> as the attribute value for UpdatedDate.
     * @param value value to set the UpdatedDate
     */
    public void setUpdatedDate(Timestamp value) {
        setAttributeInternal(UPDATEDDATE, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getTblFmbay() {
        return (EntityImpl) getAttributeInternal(TBLFMBAY);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblFmbay(EntityImpl value) {
        setAttributeInternal(TBLFMBAY, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getTblFmitems() {
        return (EntityImpl) getAttributeInternal(TBLFMITEMS);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblFmitems(EntityImpl value) {
        setAttributeInternal(TBLFMITEMS, value);
    }

    /**
     * @return the associated entity TblFmrnMImpl.
     */
    public TblFmrnMImpl getTblFmrnM() {
        return (TblFmrnMImpl) getAttributeInternal(TBLFMRNM);
    }

    /**
     * Sets <code>value</code> as the associated entity TblFmrnMImpl.
     */
    public void setTblFmrnM(TblFmrnMImpl value) {
        setAttributeInternal(TBLFMRNM, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getTblFmtanks() {
        return (EntityImpl) getAttributeInternal(TBLFMTANKS);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblFmtanks(EntityImpl value) {
        setAttributeInternal(TBLFMTANKS, value);
    }

    /**
     * @param fmrnDId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal fmrnDId) {
        return new Key(new Object[] { fmrnDId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.TblFmrnD");
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
