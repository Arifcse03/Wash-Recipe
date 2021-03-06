package mnj.mfg.model.views;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Nov 06 15:09:19 PKT 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class HederPopUpRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        HeaderId {
            public Object get(HederPopUpRowImpl obj) {
                return obj.getHeaderId();
            }

            public void put(HederPopUpRowImpl obj, Object value) {
                obj.setHeaderId((Number)value);
            }
        }
        ,
        DocNumber {
            public Object get(HederPopUpRowImpl obj) {
                return obj.getDocNumber();
            }

            public void put(HederPopUpRowImpl obj, Object value) {
                obj.setDocNumber((String)value);
            }
        }
        ,
        DocDate {
            public Object get(HederPopUpRowImpl obj) {
                return obj.getDocDate();
            }

            public void put(HederPopUpRowImpl obj, Object value) {
                obj.setDocDate((Date)value);
            }
        }
        ,
        SaleOrderId {
            public Object get(HederPopUpRowImpl obj) {
                return obj.getSaleOrderId();
            }

            public void put(HederPopUpRowImpl obj, Object value) {
                obj.setSaleOrderId((Number)value);
            }
        }
        ,
        SoLineId {
            public Object get(HederPopUpRowImpl obj) {
                return obj.getSoLineId();
            }

            public void put(HederPopUpRowImpl obj, Object value) {
                obj.setSoLineId((Number)value);
            }
        }
        ,
        Season {
            public Object get(HederPopUpRowImpl obj) {
                return obj.getSeason();
            }

            public void put(HederPopUpRowImpl obj, Object value) {
                obj.setSeason((String)value);
            }
        }
        ,
        CustomerId {
            public Object get(HederPopUpRowImpl obj) {
                return obj.getCustomerId();
            }

            public void put(HederPopUpRowImpl obj, Object value) {
                obj.setCustomerId((Number)value);
            }
        }
        ,
        Brand {
            public Object get(HederPopUpRowImpl obj) {
                return obj.getBrand();
            }

            public void put(HederPopUpRowImpl obj, Object value) {
                obj.setBrand((String)value);
            }
        }
        ,
        StyleName {
            public Object get(HederPopUpRowImpl obj) {
                return obj.getStyleName();
            }

            public void put(HederPopUpRowImpl obj, Object value) {
                obj.setStyleName((String)value);
            }
        }
        ,
        Qty {
            public Object get(HederPopUpRowImpl obj) {
                return obj.getQty();
            }

            public void put(HederPopUpRowImpl obj, Object value) {
                obj.setQty((Number)value);
            }
        }
        ,
        RecipeType {
            public Object get(HederPopUpRowImpl obj) {
                return obj.getRecipeType();
            }

            public void put(HederPopUpRowImpl obj, Object value) {
                obj.setRecipeType((String)value);
            }
        }
        ,
        SampleType {
            public Object get(HederPopUpRowImpl obj) {
                return obj.getSampleType();
            }

            public void put(HederPopUpRowImpl obj, Object value) {
                obj.setSampleType((String)value);
            }
        }
        ,
        Shade {
            public Object get(HederPopUpRowImpl obj) {
                return obj.getShade();
            }

            public void put(HederPopUpRowImpl obj, Object value) {
                obj.setShade((String)value);
            }
        }
        ,
        StnNo {
            public Object get(HederPopUpRowImpl obj) {
                return obj.getStnNo();
            }

            public void put(HederPopUpRowImpl obj, Object value) {
                obj.setStnNo((String)value);
            }
        }
        ,
        OrgId {
            public Object get(HederPopUpRowImpl obj) {
                return obj.getOrgId();
            }

            public void put(HederPopUpRowImpl obj, Object value) {
                obj.setOrgId((Number)value);
            }
        }
        ,
        PerBatchWeight {
            public Object get(HederPopUpRowImpl obj) {
                return obj.getPerBatchWeight();
            }

            public void put(HederPopUpRowImpl obj, Object value) {
                obj.setPerBatchWeight((String)value);
            }
        }
        ,
        WorkableQuantity {
            public Object get(HederPopUpRowImpl obj) {
                return obj.getWorkableQuantity();
            }

            public void put(HederPopUpRowImpl obj, Object value) {
                obj.setWorkableQuantity((String)value);
            }
        }
        ,
        ExcessCuttingPercent {
            public Object get(HederPopUpRowImpl obj) {
                return obj.getExcessCuttingPercent();
            }

            public void put(HederPopUpRowImpl obj, Object value) {
                obj.setExcessCuttingPercent((String)value);
            }
        }
        ,
        Color {
            public Object get(HederPopUpRowImpl obj) {
                return obj.getColor();
            }

            public void put(HederPopUpRowImpl obj, Object value) {
                obj.setColor((String)value);
            }
        }
        ,
        Wash {
            public Object get(HederPopUpRowImpl obj) {
                return obj.getWash();
            }

            public void put(HederPopUpRowImpl obj, Object value) {
                obj.setWash((String)value);
            }
        }
        ,
        FebricType {
            public Object get(HederPopUpRowImpl obj) {
                return obj.getFebricType();
            }

            public void put(HederPopUpRowImpl obj, Object value) {
                obj.setFebricType((String)value);
            }
        }
        ,
        OrderNumber {
            public Object get(HederPopUpRowImpl obj) {
                return obj.getOrderNumber();
            }

            public void put(HederPopUpRowImpl obj, Object value) {
                obj.setOrderNumber((String)value);
            }
        }
        ,
        CustomerName {
            public Object get(HederPopUpRowImpl obj) {
                return obj.getCustomerName();
            }

            public void put(HederPopUpRowImpl obj, Object value) {
                obj.setCustomerName((String)value);
            }
        }
        ,
        NumberBatches {
            public Object get(HederPopUpRowImpl obj) {
                return obj.getNumberBatches();
            }

            public void put(HederPopUpRowImpl obj, Object value) {
                obj.setNumberBatches((Number)value);
            }
        }
        ,
        PerBatchQuantity {
            public Object get(HederPopUpRowImpl obj) {
                return obj.getPerBatchQuantity();
            }

            public void put(HederPopUpRowImpl obj, Object value) {
                obj.setPerBatchQuantity((Number)value);
            }
        }
        ,
        Division {
            public Object get(HederPopUpRowImpl obj) {
                return obj.getDivision();
            }

            public void put(HederPopUpRowImpl obj, Object value) {
                obj.setDivision((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(HederPopUpRowImpl object);

        public abstract void put(HederPopUpRowImpl object, Object value);

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


    public static final int HEADERID = AttributesEnum.HeaderId.index();
    public static final int DOCNUMBER = AttributesEnum.DocNumber.index();
    public static final int DOCDATE = AttributesEnum.DocDate.index();
    public static final int SALEORDERID = AttributesEnum.SaleOrderId.index();
    public static final int SOLINEID = AttributesEnum.SoLineId.index();
    public static final int SEASON = AttributesEnum.Season.index();
    public static final int CUSTOMERID = AttributesEnum.CustomerId.index();
    public static final int BRAND = AttributesEnum.Brand.index();
    public static final int STYLENAME = AttributesEnum.StyleName.index();
    public static final int QTY = AttributesEnum.Qty.index();
    public static final int RECIPETYPE = AttributesEnum.RecipeType.index();
    public static final int SAMPLETYPE = AttributesEnum.SampleType.index();
    public static final int SHADE = AttributesEnum.Shade.index();
    public static final int STNNO = AttributesEnum.StnNo.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int PERBATCHWEIGHT = AttributesEnum.PerBatchWeight.index();
    public static final int WORKABLEQUANTITY = AttributesEnum.WorkableQuantity.index();
    public static final int EXCESSCUTTINGPERCENT = AttributesEnum.ExcessCuttingPercent.index();
    public static final int COLOR = AttributesEnum.Color.index();
    public static final int WASH = AttributesEnum.Wash.index();
    public static final int FEBRICTYPE = AttributesEnum.FebricType.index();
    public static final int ORDERNUMBER = AttributesEnum.OrderNumber.index();
    public static final int CUSTOMERNAME = AttributesEnum.CustomerName.index();
    public static final int NUMBERBATCHES = AttributesEnum.NumberBatches.index();
    public static final int PERBATCHQUANTITY = AttributesEnum.PerBatchQuantity.index();
    public static final int DIVISION = AttributesEnum.Division.index();

    /**
     * This is the default constructor (do not remove).
     */
    public HederPopUpRowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute HeaderId.
     * @return the HeaderId
     */
    public Number getHeaderId() {
        return (Number) getAttributeInternal(HEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute HeaderId.
     * @param value value to set the  HeaderId
     */
    public void setHeaderId(Number value) {
        setAttributeInternal(HEADERID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute DocNumber.
     * @return the DocNumber
     */
    public String getDocNumber() {
        return (String) getAttributeInternal(DOCNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute DocNumber.
     * @param value value to set the  DocNumber
     */
    public void setDocNumber(String value) {
        setAttributeInternal(DOCNUMBER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute DocDate.
     * @return the DocDate
     */
    public Date getDocDate() {
        return (Date) getAttributeInternal(DOCDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute DocDate.
     * @param value value to set the  DocDate
     */
    public void setDocDate(Date value) {
        setAttributeInternal(DOCDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute SaleOrderId.
     * @return the SaleOrderId
     */
    public Number getSaleOrderId() {
        return (Number) getAttributeInternal(SALEORDERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SaleOrderId.
     * @param value value to set the  SaleOrderId
     */
    public void setSaleOrderId(Number value) {
        setAttributeInternal(SALEORDERID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute SoLineId.
     * @return the SoLineId
     */
    public Number getSoLineId() {
        return (Number) getAttributeInternal(SOLINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SoLineId.
     * @param value value to set the  SoLineId
     */
    public void setSoLineId(Number value) {
        setAttributeInternal(SOLINEID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Season.
     * @return the Season
     */
    public String getSeason() {
        return (String) getAttributeInternal(SEASON);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Season.
     * @param value value to set the  Season
     */
    public void setSeason(String value) {
        setAttributeInternal(SEASON, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CustomerId.
     * @return the CustomerId
     */
    public Number getCustomerId() {
        return (Number) getAttributeInternal(CUSTOMERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CustomerId.
     * @param value value to set the  CustomerId
     */
    public void setCustomerId(Number value) {
        setAttributeInternal(CUSTOMERID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Brand.
     * @return the Brand
     */
    public String getBrand() {
        return (String) getAttributeInternal(BRAND);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Brand.
     * @param value value to set the  Brand
     */
    public void setBrand(String value) {
        setAttributeInternal(BRAND, value);
    }

    /**
     * Gets the attribute value for the calculated attribute StyleName.
     * @return the StyleName
     */
    public String getStyleName() {
        return (String) getAttributeInternal(STYLENAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute StyleName.
     * @param value value to set the  StyleName
     */
    public void setStyleName(String value) {
        setAttributeInternal(STYLENAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Qty.
     * @return the Qty
     */
    public Number getQty() {
        return (Number) getAttributeInternal(QTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Qty.
     * @param value value to set the  Qty
     */
    public void setQty(Number value) {
        setAttributeInternal(QTY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute RecipeType.
     * @return the RecipeType
     */
    public String getRecipeType() {
        return (String) getAttributeInternal(RECIPETYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute RecipeType.
     * @param value value to set the  RecipeType
     */
    public void setRecipeType(String value) {
        setAttributeInternal(RECIPETYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute SampleType.
     * @return the SampleType
     */
    public String getSampleType() {
        return (String) getAttributeInternal(SAMPLETYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SampleType.
     * @param value value to set the  SampleType
     */
    public void setSampleType(String value) {
        setAttributeInternal(SAMPLETYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Shade.
     * @return the Shade
     */
    public String getShade() {
        return (String) getAttributeInternal(SHADE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Shade.
     * @param value value to set the  Shade
     */
    public void setShade(String value) {
        setAttributeInternal(SHADE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute StnNo.
     * @return the StnNo
     */
    public String getStnNo() {
        return (String) getAttributeInternal(STNNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute StnNo.
     * @param value value to set the  StnNo
     */
    public void setStnNo(String value) {
        setAttributeInternal(STNNO, value);
    }

    /**
     * Gets the attribute value for the calculated attribute OrgId.
     * @return the OrgId
     */
    public Number getOrgId() {
        return (Number) getAttributeInternal(ORGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute OrgId.
     * @param value value to set the  OrgId
     */
    public void setOrgId(Number value) {
        setAttributeInternal(ORGID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute PerBatchWeight.
     * @return the PerBatchWeight
     */
    public String getPerBatchWeight() {
        return (String) getAttributeInternal(PERBATCHWEIGHT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute PerBatchWeight.
     * @param value value to set the  PerBatchWeight
     */
    public void setPerBatchWeight(String value) {
        setAttributeInternal(PERBATCHWEIGHT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute WorkableQuantity.
     * @return the WorkableQuantity
     */
    public String getWorkableQuantity() {
        return (String) getAttributeInternal(WORKABLEQUANTITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute WorkableQuantity.
     * @param value value to set the  WorkableQuantity
     */
    public void setWorkableQuantity(String value) {
        setAttributeInternal(WORKABLEQUANTITY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ExcessCuttingPercent.
     * @return the ExcessCuttingPercent
     */
    public String getExcessCuttingPercent() {
        return (String) getAttributeInternal(EXCESSCUTTINGPERCENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ExcessCuttingPercent.
     * @param value value to set the  ExcessCuttingPercent
     */
    public void setExcessCuttingPercent(String value) {
        setAttributeInternal(EXCESSCUTTINGPERCENT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Color.
     * @return the Color
     */
    public String getColor() {
        return (String) getAttributeInternal(COLOR);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Color.
     * @param value value to set the  Color
     */
    public void setColor(String value) {
        setAttributeInternal(COLOR, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Wash.
     * @return the Wash
     */
    public String getWash() {
        return (String) getAttributeInternal(WASH);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Wash.
     * @param value value to set the  Wash
     */
    public void setWash(String value) {
        setAttributeInternal(WASH, value);
    }

    /**
     * Gets the attribute value for the calculated attribute FebricType.
     * @return the FebricType
     */
    public String getFebricType() {
        return (String) getAttributeInternal(FEBRICTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute FebricType.
     * @param value value to set the  FebricType
     */
    public void setFebricType(String value) {
        setAttributeInternal(FEBRICTYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute OrderNumber.
     * @return the OrderNumber
     */
    public String getOrderNumber() {
        return (String) getAttributeInternal(ORDERNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute OrderNumber.
     * @param value value to set the  OrderNumber
     */
    public void setOrderNumber(String value) {
        setAttributeInternal(ORDERNUMBER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CustomerName.
     * @return the CustomerName
     */
    public String getCustomerName() {
        return (String) getAttributeInternal(CUSTOMERNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CustomerName.
     * @param value value to set the  CustomerName
     */
    public void setCustomerName(String value) {
        setAttributeInternal(CUSTOMERNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute NumberBatches.
     * @return the NumberBatches
     */
    public Number getNumberBatches() {
        return (Number) getAttributeInternal(NUMBERBATCHES);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute NumberBatches.
     * @param value value to set the  NumberBatches
     */
    public void setNumberBatches(Number value) {
        setAttributeInternal(NUMBERBATCHES, value);
    }

    /**
     * Gets the attribute value for the calculated attribute PerBatchQuantity.
     * @return the PerBatchQuantity
     */
    public Number getPerBatchQuantity() {
        return (Number) getAttributeInternal(PERBATCHQUANTITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute PerBatchQuantity.
     * @param value value to set the  PerBatchQuantity
     */
    public void setPerBatchQuantity(Number value) {
        setAttributeInternal(PERBATCHQUANTITY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Division.
     * @return the Division
     */
    public String getDivision() {
        return (String) getAttributeInternal(DIVISION);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Division.
     * @param value value to set the  Division
     */
    public void setDivision(String value) {
        setAttributeInternal(DIVISION, value);
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
