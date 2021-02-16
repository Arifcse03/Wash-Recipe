package mnj.mfg.model.views;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Nov 06 15:10:02 PKT 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class LinePopUpRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        LineId {
            public Object get(LinePopUpRowImpl obj) {
                return obj.getLineId();
            }

            public void put(LinePopUpRowImpl obj, Object value) {
                obj.setLineId((Number)value);
            }
        }
        ,
        HeaderId {
            public Object get(LinePopUpRowImpl obj) {
                return obj.getHeaderId();
            }

            public void put(LinePopUpRowImpl obj, Object value) {
                obj.setHeaderId((Number)value);
            }
        }
        ,
        MinorOperations {
            public Object get(LinePopUpRowImpl obj) {
                return obj.getMinorOperations();
            }

            public void put(LinePopUpRowImpl obj, Object value) {
                obj.setMinorOperations((String)value);
            }
        }
        ,
        MajorOperations {
            public Object get(LinePopUpRowImpl obj) {
                return obj.getMajorOperations();
            }

            public void put(LinePopUpRowImpl obj, Object value) {
                obj.setMajorOperations((String)value);
            }
        }
        ,
        MajorOpId {
            public Object get(LinePopUpRowImpl obj) {
                return obj.getMajorOpId();
            }

            public void put(LinePopUpRowImpl obj, Object value) {
                obj.setMajorOpId((Number)value);
            }
        }
        ,
        Smv {
            public Object get(LinePopUpRowImpl obj) {
                return obj.getSmv();
            }

            public void put(LinePopUpRowImpl obj, Object value) {
                obj.setSmv((Number)value);
            }
        }
        ,
        Temperature {
            public Object get(LinePopUpRowImpl obj) {
                return obj.getTemperature();
            }

            public void put(LinePopUpRowImpl obj, Object value) {
                obj.setTemperature((String)value);
            }
        }
        ,
        Water {
            public Object get(LinePopUpRowImpl obj) {
                return obj.getWater();
            }

            public void put(LinePopUpRowImpl obj, Object value) {
                obj.setWater((String)value);
            }
        }
        ,
        MinTime {
            public Object get(LinePopUpRowImpl obj) {
                return obj.getMinTime();
            }

            public void put(LinePopUpRowImpl obj, Object value) {
                obj.setMinTime((Number)value);
            }
        }
        ,
        Seq {
            public Object get(LinePopUpRowImpl obj) {
                return obj.getSeq();
            }

            public void put(LinePopUpRowImpl obj, Object value) {
                obj.setSeq((Number)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(LinePopUpRowImpl object);

        public abstract void put(LinePopUpRowImpl object, Object value);

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
    public static final int LINEID = AttributesEnum.LineId.index();
    public static final int HEADERID = AttributesEnum.HeaderId.index();
    public static final int MINOROPERATIONS = AttributesEnum.MinorOperations.index();
    public static final int MAJOROPERATIONS = AttributesEnum.MajorOperations.index();
    public static final int MAJOROPID = AttributesEnum.MajorOpId.index();
    public static final int SMV = AttributesEnum.Smv.index();
    public static final int TEMPERATURE = AttributesEnum.Temperature.index();
    public static final int WATER = AttributesEnum.Water.index();
    public static final int MINTIME = AttributesEnum.MinTime.index();
    public static final int SEQ = AttributesEnum.Seq.index();

    /**
     * This is the default constructor (do not remove).
     */
    public LinePopUpRowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute LineId.
     * @return the LineId
     */
    public Number getLineId() {
        return (Number) getAttributeInternal(LINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute LineId.
     * @param value value to set the  LineId
     */
    public void setLineId(Number value) {
        setAttributeInternal(LINEID, value);
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
     * Gets the attribute value for the calculated attribute MinorOperations.
     * @return the MinorOperations
     */
    public String getMinorOperations() {
        return (String) getAttributeInternal(MINOROPERATIONS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute MinorOperations.
     * @param value value to set the  MinorOperations
     */
    public void setMinorOperations(String value) {
        setAttributeInternal(MINOROPERATIONS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute MajorOperations.
     * @return the MajorOperations
     */
    public String getMajorOperations() {
        return (String) getAttributeInternal(MAJOROPERATIONS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute MajorOperations.
     * @param value value to set the  MajorOperations
     */
    public void setMajorOperations(String value) {
        setAttributeInternal(MAJOROPERATIONS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute MajorOpId.
     * @return the MajorOpId
     */
    public Number getMajorOpId() {
        return (Number) getAttributeInternal(MAJOROPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute MajorOpId.
     * @param value value to set the  MajorOpId
     */
    public void setMajorOpId(Number value) {
        setAttributeInternal(MAJOROPID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Smv.
     * @return the Smv
     */
    public Number getSmv() {
        return (Number) getAttributeInternal(SMV);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Smv.
     * @param value value to set the  Smv
     */
    public void setSmv(Number value) {
        setAttributeInternal(SMV, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Temperature.
     * @return the Temperature
     */
    public String getTemperature() {
        return (String) getAttributeInternal(TEMPERATURE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Temperature.
     * @param value value to set the  Temperature
     */
    public void setTemperature(String value) {
        setAttributeInternal(TEMPERATURE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Water.
     * @return the Water
     */
    public String getWater() {
        return (String) getAttributeInternal(WATER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Water.
     * @param value value to set the  Water
     */
    public void setWater(String value) {
        setAttributeInternal(WATER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute MinTime.
     * @return the MinTime
     */
    public Number getMinTime() {
        return (Number) getAttributeInternal(MINTIME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute MinTime.
     * @param value value to set the  MinTime
     */
    public void setMinTime(Number value) {
        setAttributeInternal(MINTIME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Seq.
     * @return the Seq
     */
    public Number getSeq() {
        return (Number) getAttributeInternal(SEQ);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Seq.
     * @param value value to set the  Seq
     */
    public void setSeq(Number value) {
        setAttributeInternal(SEQ, value);
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
