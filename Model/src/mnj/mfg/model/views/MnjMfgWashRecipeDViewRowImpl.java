package mnj.mfg.model.views;

import mnj.mfg.model.entities.MnjMfgWashRecipeDImpl;

import oracle.jbo.RowSet;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Oct 11 22:10:28 PKT 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MnjMfgWashRecipeDViewRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        DetailId {
            public Object get(MnjMfgWashRecipeDViewRowImpl obj) {
                return obj.getDetailId();
            }

            public void put(MnjMfgWashRecipeDViewRowImpl obj, Object value) {
                obj.setDetailId((Number)value);
            }
        }
        ,
        LineId {
            public Object get(MnjMfgWashRecipeDViewRowImpl obj) {
                return obj.getLineId();
            }

            public void put(MnjMfgWashRecipeDViewRowImpl obj, Object value) {
                obj.setLineId((Number)value);
            }
        }
        ,
        InventoryItemId {
            public Object get(MnjMfgWashRecipeDViewRowImpl obj) {
                return obj.getInventoryItemId();
            }

            public void put(MnjMfgWashRecipeDViewRowImpl obj, Object value) {
                obj.setInventoryItemId((Number)value);
            }
        }
        ,
        Uom {
            public Object get(MnjMfgWashRecipeDViewRowImpl obj) {
                return obj.getUom();
            }

            public void put(MnjMfgWashRecipeDViewRowImpl obj, Object value) {
                obj.setUom((String)value);
            }
        }
        ,
        PerBatchQty {
            public Object get(MnjMfgWashRecipeDViewRowImpl obj) {
                return obj.getPerBatchQty();
            }

            public void put(MnjMfgWashRecipeDViewRowImpl obj, Object value) {
                obj.setPerBatchQty((Number)value);
            }
        }
        ,
        PerBatchCons {
            public Object get(MnjMfgWashRecipeDViewRowImpl obj) {
                return obj.getPerBatchCons();
            }

            public void put(MnjMfgWashRecipeDViewRowImpl obj, Object value) {
                obj.setPerBatchCons((Number)value);
            }
        }
        ,
        ItemCode {
            public Object get(MnjMfgWashRecipeDViewRowImpl obj) {
                return obj.getItemCode();
            }

            public void put(MnjMfgWashRecipeDViewRowImpl obj, Object value) {
                obj.setItemCode((String)value);
            }
        }
        ,
        Description {
            public Object get(MnjMfgWashRecipeDViewRowImpl obj) {
                return obj.getDescription();
            }

            public void put(MnjMfgWashRecipeDViewRowImpl obj, Object value) {
                obj.setDescription((String)value);
            }
        }
        ,
        TotalCons {
            public Object get(MnjMfgWashRecipeDViewRowImpl obj) {
                return obj.getTotalCons();
            }

            public void put(MnjMfgWashRecipeDViewRowImpl obj, Object value) {
                obj.setTotalCons((Number)value);
            }
        }
        ,
        Dosage {
            public Object get(MnjMfgWashRecipeDViewRowImpl obj) {
                return obj.getDosage();
            }

            public void put(MnjMfgWashRecipeDViewRowImpl obj, Object value) {
                obj.setDosage((String)value);
            }
        }
        ,
        DosagePerc {
            public Object get(MnjMfgWashRecipeDViewRowImpl obj) {
                return obj.getDosagePerc();
            }

            public void put(MnjMfgWashRecipeDViewRowImpl obj, Object value) {
                obj.setDosagePerc((Number)value);
            }
        }
        ,
        PhValue {
            public Object get(MnjMfgWashRecipeDViewRowImpl obj) {
                return obj.getPhValue();
            }

            public void put(MnjMfgWashRecipeDViewRowImpl obj, Object value) {
                obj.setPhValue((String)value);
            }
        }
        ,
        WaterRatio {
            public Object get(MnjMfgWashRecipeDViewRowImpl obj) {
                return obj.getWaterRatio();
            }

            public void put(MnjMfgWashRecipeDViewRowImpl obj, Object value) {
                obj.setWaterRatio((String)value);
            }
        }
        ,
        PcsPerItem {
            public Object get(MnjMfgWashRecipeDViewRowImpl obj) {
                return obj.getPcsPerItem();
            }

            public void put(MnjMfgWashRecipeDViewRowImpl obj, Object value) {
                obj.setPcsPerItem((Number)value);
            }
        }
        ,
        Remarks {
            public Object get(MnjMfgWashRecipeDViewRowImpl obj) {
                return obj.getRemarks();
            }

            public void put(MnjMfgWashRecipeDViewRowImpl obj, Object value) {
                obj.setRemarks((String)value);
            }
        }
        ,
        TotalConsumption {
            public Object get(MnjMfgWashRecipeDViewRowImpl obj) {
                return obj.getTotalConsumption();
            }

            public void put(MnjMfgWashRecipeDViewRowImpl obj, Object value) {
                obj.setTotalConsumption((Number)value);
            }
        }
        ,
        Unit {
            public Object get(MnjMfgWashRecipeDViewRowImpl obj) {
                return obj.getUnit();
            }

            public void put(MnjMfgWashRecipeDViewRowImpl obj, Object value) {
                obj.setUnit((String)value);
            }
        }
        ,
        ItemLov1 {
            public Object get(MnjMfgWashRecipeDViewRowImpl obj) {
                return obj.getItemLov1();
            }

            public void put(MnjMfgWashRecipeDViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(MnjMfgWashRecipeDViewRowImpl object);

        public abstract void put(MnjMfgWashRecipeDViewRowImpl object,
                                 Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int DETAILID = AttributesEnum.DetailId.index();
    public static final int LINEID = AttributesEnum.LineId.index();
    public static final int INVENTORYITEMID = AttributesEnum.InventoryItemId.index();
    public static final int UOM = AttributesEnum.Uom.index();
    public static final int PERBATCHQTY = AttributesEnum.PerBatchQty.index();
    public static final int PERBATCHCONS = AttributesEnum.PerBatchCons.index();
    public static final int ITEMCODE = AttributesEnum.ItemCode.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int TOTALCONS = AttributesEnum.TotalCons.index();
    public static final int DOSAGE = AttributesEnum.Dosage.index();
    public static final int DOSAGEPERC = AttributesEnum.DosagePerc.index();
    public static final int PHVALUE = AttributesEnum.PhValue.index();
    public static final int WATERRATIO = AttributesEnum.WaterRatio.index();
    public static final int PCSPERITEM = AttributesEnum.PcsPerItem.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int TOTALCONSUMPTION = AttributesEnum.TotalConsumption.index();
    public static final int UNIT = AttributesEnum.Unit.index();
    public static final int ITEMLOV1 = AttributesEnum.ItemLov1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MnjMfgWashRecipeDViewRowImpl() {
    }

    /**
     * Gets MnjMfgWashRecipeD entity object.
     * @return the MnjMfgWashRecipeD
     */
    public MnjMfgWashRecipeDImpl getMnjMfgWashRecipeD() {
        return (MnjMfgWashRecipeDImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for DETAIL_ID using the alias name DetailId.
     * @return the DETAIL_ID
     */
    public Number getDetailId() {
        return (Number) getAttributeInternal(DETAILID);
    }

    /**
     * Sets <code>value</code> as attribute value for DETAIL_ID using the alias name DetailId.
     * @param value value to set the DETAIL_ID
     */
    public void setDetailId(Number value) {
        setAttributeInternal(DETAILID, value);
    }

    /**
     * Gets the attribute value for LINE_ID using the alias name LineId.
     * @return the LINE_ID
     */
    public Number getLineId() {
        return (Number) getAttributeInternal(LINEID);
    }

    /**
     * Sets <code>value</code> as attribute value for LINE_ID using the alias name LineId.
     * @param value value to set the LINE_ID
     */
    public void setLineId(Number value) {
        setAttributeInternal(LINEID, value);
    }

    /**
     * Gets the attribute value for INVENTORY_ITEM_ID using the alias name InventoryItemId.
     * @return the INVENTORY_ITEM_ID
     */
    public Number getInventoryItemId() {
        return (Number) getAttributeInternal(INVENTORYITEMID);
    }

    /**
     * Sets <code>value</code> as attribute value for INVENTORY_ITEM_ID using the alias name InventoryItemId.
     * @param value value to set the INVENTORY_ITEM_ID
     */
    public void setInventoryItemId(Number value) {
        setAttributeInternal(INVENTORYITEMID, value);
    }

    /**
     * Gets the attribute value for UOM using the alias name Uom.
     * @return the UOM
     */
    public String getUom() {
        return (String) getAttributeInternal(UOM);
    }

    /**
     * Sets <code>value</code> as attribute value for UOM using the alias name Uom.
     * @param value value to set the UOM
     */
    public void setUom(String value) {
        setAttributeInternal(UOM, value);
    }

    /**
     * Gets the attribute value for PER_BATCH_QTY using the alias name PerBatchQty.
     * @return the PER_BATCH_QTY
     */
    public Number getPerBatchQty() {
        return (Number) getAttributeInternal(PERBATCHQTY);
    }

    /**
     * Sets <code>value</code> as attribute value for PER_BATCH_QTY using the alias name PerBatchQty.
     * @param value value to set the PER_BATCH_QTY
     */
    public void setPerBatchQty(Number value) {
        setAttributeInternal(PERBATCHQTY, value);
    }

    /**
     * Gets the attribute value for PER_BATCH_CONS using the alias name PerBatchCons.
     * @return the PER_BATCH_CONS
     */
    public Number getPerBatchCons() {
        return (Number) getAttributeInternal(PERBATCHCONS);
    }

    /**
     * Sets <code>value</code> as attribute value for PER_BATCH_CONS using the alias name PerBatchCons.
     * @param value value to set the PER_BATCH_CONS
     */
    public void setPerBatchCons(Number value) {
        setAttributeInternal(PERBATCHCONS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ItemCode.
     * @return the ItemCode
     */
    public String getItemCode() {
        return (String) getAttributeInternal(ITEMCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ItemCode.
     * @param value value to set the  ItemCode
     */
    public void setItemCode(String value) {
        setAttributeInternal(ITEMCODE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Description.
     * @return the Description
     */
    public String getDescription() {
        return (String) getAttributeInternal(DESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Description.
     * @param value value to set the  Description
     */
    public void setDescription(String value) {
        setAttributeInternal(DESCRIPTION, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TotalCons.
     * @return the TotalCons
     */
    public Number getTotalCons() {
        return (Number) getAttributeInternal(TOTALCONS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TotalCons.
     * @param value value to set the  TotalCons
     */
    public void setTotalCons(Number value) {
        setAttributeInternal(TOTALCONS, value);
    }

    /**
     * Gets the attribute value for DOSAGE using the alias name Dosage.
     * @return the DOSAGE
     */
    public String getDosage() {
        return (String) getAttributeInternal(DOSAGE);
    }

    /**
     * Sets <code>value</code> as attribute value for DOSAGE using the alias name Dosage.
     * @param value value to set the DOSAGE
     */
    public void setDosage(String value) {
        setAttributeInternal(DOSAGE, value);
    }

    /**
     * Gets the attribute value for DOSAGE_PERC using the alias name DosagePerc.
     * @return the DOSAGE_PERC
     */
    public Number getDosagePerc() {
        return (Number) getAttributeInternal(DOSAGEPERC);
    }

    /**
     * Sets <code>value</code> as attribute value for DOSAGE_PERC using the alias name DosagePerc.
     * @param value value to set the DOSAGE_PERC
     */
    public void setDosagePerc(Number value) {
        setAttributeInternal(DOSAGEPERC, value);
    }

    /**
     * Gets the attribute value for PH_VALUE using the alias name PhValue.
     * @return the PH_VALUE
     */
    public String getPhValue() {
        return (String) getAttributeInternal(PHVALUE);
    }

    /**
     * Sets <code>value</code> as attribute value for PH_VALUE using the alias name PhValue.
     * @param value value to set the PH_VALUE
     */
    public void setPhValue(String value) {
        setAttributeInternal(PHVALUE, value);
    }

    /**
     * Gets the attribute value for WATER_RATIO using the alias name WaterRatio.
     * @return the WATER_RATIO
     */
    public String getWaterRatio() {
        return (String) getAttributeInternal(WATERRATIO);
    }

    /**
     * Sets <code>value</code> as attribute value for WATER_RATIO using the alias name WaterRatio.
     * @param value value to set the WATER_RATIO
     */
    public void setWaterRatio(String value) {
        setAttributeInternal(WATERRATIO, value);
    }

    /**
     * Gets the attribute value for the calculated attribute PcsPerItem.
     * @return the PcsPerItem
     */
    public Number getPcsPerItem() {
        return (Number) getAttributeInternal(PCSPERITEM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute PcsPerItem.
     * @param value value to set the  PcsPerItem
     */
    public void setPcsPerItem(Number value) {
        setAttributeInternal(PCSPERITEM, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Remarks.
     * @return the Remarks
     */
    public String getRemarks() {
        return (String) getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Remarks.
     * @param value value to set the  Remarks
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TotalConsumption.
     * @return the TotalConsumption
     */
    public Number getTotalConsumption() {
        return (Number) getAttributeInternal(TOTALCONSUMPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TotalConsumption.
     * @param value value to set the  TotalConsumption
     */
    public void setTotalConsumption(Number value) {
        setAttributeInternal(TOTALCONSUMPTION, value);
    }

    /**
     * Gets the attribute value for UNIT using the alias name Unit.
     * @return the UNIT
     */
    public String getUnit() {
        return (String) getAttributeInternal(UNIT);
    }

    /**
     * Sets <code>value</code> as attribute value for UNIT using the alias name Unit.
     * @param value value to set the UNIT
     */
    public void setUnit(String value) {
        setAttributeInternal(UNIT, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ItemLov1.
     */
    public RowSet getItemLov1() {
        return (RowSet)getAttributeInternal(ITEMLOV1);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}
