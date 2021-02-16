package mnj.mfg.view.baking_bean;

import java.sql.SQLException;

import java.text.DecimalFormat;

import javax.faces.application.FacesMessage;

import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputText;

import javax.faces.context.FacesContext;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.adf.view.rich.event.DialogEvent;
import oracle.adf.view.rich.event.PopupCanceledEvent;
import oracle.adf.view.rich.event.PopupFetchEvent;

import oracle.adfinternal.view.faces.model.binding.FacesCtrlHierNodeBinding;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.ApplicationModule;
import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.Number;


public class Main {
    private RichInputText lineID;
    private RichInputText totalCons;
    private RichInputText perBatchQty;
    private RichInputText perBatchCons;
    private RichInputListOfValues stnNo;
    private RichInputText quantity;
    private RichInputText noOfBatches;
    private RichInputText resultQty;
    private RichInputListOfValues searchSTN;
    private RichInputText headerId;
    private RichInputText headerIdTemp;
    private RichTable operationsTable;
    private RichTable subProcessTable;
    private RichInputText detailLevelDosage;
    private RichInputText detailLevelDosagePerc;
    private RichInputText detailLevelWaterRatio;
    private RichInputText headerPerBatchWeight;
    private RichTable searchPageTable;
    private RichInputText actualReceiptQuantity;
    private RichTable chemicalsTable;
    private RichInputText detailLevelUom;
    private RichInputText detailLevelPcsPerItem;
    private RichTable fillDataPopupTable;
    private RichInputText perBatchQuantity_L;
    private RichInputText numberBatches_L;

    public Main() {
        super();
    }
    static DecimalFormat format = new DecimalFormat("0");

    public String fillOperations() {

        BindingContext bctx = BindingContext.getCurrent();
        BindingContainer bindings = bctx.getCurrentBindingsEntry();
        OperationBinding operationBinding =
            bindings.getOperationBinding("fetchMethod");
        operationBinding.getParamsMap().put("lineId", getStnNo().getValue());

        Object execute = operationBinding.execute();
        return null;
    }

    public void setLineID(RichInputText lineID) {
        this.lineID = lineID;
    }

    public RichInputText getLineID() {
        return lineID;
    }

    public void setTotalCons(RichInputText totalCons) {
        this.totalCons = totalCons;
    }

    public RichInputText getTotalCons() {
        return totalCons;
    }

    public void setPerBatchQty(RichInputText perBatchQty) {
        this.perBatchQty = perBatchQty;
    }

    public RichInputText getPerBatchQty() {
        return perBatchQty;
    }

    public void setPerBatchCons(RichInputText perBatchCons) {
        this.perBatchCons = perBatchCons;
    }

    public RichInputText getPerBatchCons() {
        return perBatchCons;
    }

    //    public void commonAction(ValueChangeEvent valueChangeEvent) {
    //        // Add event code here...
    //        double qtyVal = 0;
    //        double consQtyVal = 0;
    //        double NoOfBatches = 0;
    //
    //        try {
    //            qtyVal =
    //                    Double.parseDouble(getPerBatchQty().getValue().toString());
    //        } catch (Exception e) {
    //            ;
    //        }
    //        try {
    //            NoOfBatches =
    //                    Double.parseDouble(getNoofBatches_Line().getValue().toString());
    //            //  Double.parseDouble(getResultQty().getValue().toString());
    //        } catch (Exception e) {
    //            NoOfBatches = 0.0;
    //        }
    //
    //
    //        if (NoOfBatches == 0.0) {
    //
    //            BindingContext bindingContext1 = BindingContext.getCurrent();
    //            DCDataControl dc1 =
    //                bindingContext1.findDataControl("AppModuleDataControl"); //
    //            ApplicationModule am = dc1.getApplicationModule();
    //            ViewObject vo = am.findViewObject("MnjMfgWashRecipeLView1");
    //            try {
    //                NoOfBatches =
    //                        Double.parseDouble(vo.getCurrentRow().getAttribute("NumberBatches").toString());
    //            } catch (Exception e) {
    //                // TODO: Add catch code
    //                e.printStackTrace();
    //                NoOfBatches = 0.0;
    //            }
    //            System.out.println("No Of Batches through VO ..... is......... >>>> " +
    //                               NoOfBatches);
    //        }
    //
    //        try {
    //            consQtyVal =
    //                    Double.parseDouble(getPerBatchCons().getValue().toString());
    //        } catch (Exception e) {
    //            ;
    //        }
    //        //double total = qtyVal*consQtyVal;
    //        double total = NoOfBatches * consQtyVal;
    //
    //        DecimalFormat format = new DecimalFormat("##.00");
    //        total = Double.parseDouble(format.format(total));
    //        try {
    //            totalCons.setValue(new oracle.jbo.domain.Number(total));
    //        } catch (SQLException e) {
    //            ;
    //        }
    //        AdfFacesContext.getCurrentInstance().addPartialTarget(totalCons);
    //
    //
    //    }
    //
    //
    //    public void commonActionNew() {
    //        // Add event code here...
    //        //      double qtyVal = 0;
    //        //      double consQtyVal = 0;
    //        double NoOfBatches = 0;
    //
    //        try {
    //            NoOfBatches =
    //                    Double.parseDouble(getNoofBatches_Line().getValue().toString());
    //            //                    Double.parseDouble(getResultQty().getValue().toString());
    //        } catch (Exception e) {
    //            NoOfBatches = 0.0;
    //        }
    //
    //        if (NoOfBatches == 0.0) {
    //
    //            BindingContext bindingContext1 = BindingContext.getCurrent();
    //            DCDataControl dc1 =
    //                bindingContext1.findDataControl("AppModuleDataControl"); //
    //            ApplicationModule am = dc1.getApplicationModule();
    //            ViewObject vo = am.findViewObject("MnjMfgWashRecipeLView1");
    //            try {
    //                NoOfBatches =
    //                        Double.parseDouble(vo.getCurrentRow().getAttribute("NumberBatches").toString());
    //            } catch (Exception e) {
    //                // TODO: Add catch code
    //                e.printStackTrace();
    //                NoOfBatches = 0.0;
    //            }
    //            System.out.println("No Of Batches through VO ..... is......... >>>> " +
    //                               NoOfBatches);
    //        }
    //
    //
    //        BindingContext bindingContext = BindingContext.getCurrent();
    //        DCDataControl dc =
    //            bindingContext.findDataControl("AppModuleDataControl"); //
    //        ApplicationModule am = dc.getApplicationModule();
    //        ViewObject findViewObject =
    //            am.findViewObject("MnjMfgWashRecipeDView1"); //ImpSaleContractDetailEOView1
    //
    //        RowSetIterator it = findViewObject.createRowSetIterator("tt");
    //        double PerBatchCons = 0.0;
    //        while (it.hasNext()) {
    //
    //            Row r = it.next();
    //            try {
    //                PerBatchCons =
    //                        Double.parseDouble(r.getAttribute("PerBatchCons").toString());
    //            } catch (Exception e) {
    //                ;
    //            }
    //
    //            double total = NoOfBatches * PerBatchCons;
    //
    //            try {
    //
    //                r.setAttribute("TotalCons", total);
    //
    //            } catch (Exception e) {
    //                ;
    //            }
    //
    //        } //end of while loop
    //        it.closeRowSetIterator();
    //
    //        AdfFacesContext.getCurrentInstance().addPartialTarget(chemicalsTable);
    //
    //
    //    }


    public void setStnNo(RichInputListOfValues stnNo) {
        this.stnNo = stnNo;
    }

    public RichInputListOfValues getStnNo() {
        return stnNo;
    }

    public void setQuantity(RichInputText quantity) {
        this.quantity = quantity;
    }

    public RichInputText getQuantity() {
        return quantity;
    }

    public void setNoOfBatches(RichInputText noOfBatches) {
        this.noOfBatches = noOfBatches;
    }

    public RichInputText getNoOfBatches() {
        return noOfBatches;
    }

    public void setResultQty(RichInputText resultQty) {
        this.resultQty = resultQty;
    }

    public RichInputText getResultQty() {
        return resultQty;
    }

    public static double round(double val) {


        double rounded = 0.00;
        try {
            format.setMinimumFractionDigits(0);
            rounded = Double.parseDouble(format.format(val));
        } catch (Exception e) {
            ;
        }
        return rounded;
    }


    public static double numeric(RichInputText ob) {


        try {
            if (ob != null)
                return Double.parseDouble(String.valueOf(ob.getValue()));

            else
                return 0;
        } catch (Exception e) {
            ;
        }

        return 0;
    }

    public static Number toNumber(double n) {


        try {
            return new Number(n);
        } catch (SQLException e) {
            ;
        }
        return new Number(0);
    }

    public void commonListener(ValueChangeEvent valueChangeEvent) {
        // Add event code here...


        double qtyVal = round(numeric(getQuantity()));
        double ActualReciptQty = round(numeric(getActualReceiptQuantity()));
        double perBatchesVal = round(numeric(getNoOfBatches()));

        try {


            //       resultQty.setValue(new oracle.jbo.domain.Number(round(qtyVal/perBatchesVal)));
            resultQty.setValue(new oracle.jbo.domain.Number(round(ActualReciptQty /
                                                                  perBatchesVal)));

            AdfFacesContext.getCurrentInstance().addPartialTarget(resultQty);

        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }

        OperationBinding operationBinding =
            executeOperation("Copy_Fields_To_Lines");
        operationBinding.getParamsMap().put("PerBatchQty", perBatchesVal);
        operationBinding.getParamsMap().put("NumberOfBatches",
                                            resultQty.getValue());
        operationBinding.execute();
        AdfFacesContext.getCurrentInstance().addPartialTarget(operationsTable);


    }

    public void setSearchSTN(RichInputListOfValues searchSTN) {
        this.searchSTN = searchSTN;
    }

    public RichInputListOfValues getSearchSTN() {
        return searchSTN;
    }

    public String CopyAction() {
        // Add event code here...

        System.out.println("STN Numebr in Bean -->" +
                           getSearchSTN().getValue());
        return null;
    }

    public void setHeaderId(RichInputText headerId) {
        this.headerId = headerId;
    }

    public RichInputText getHeaderId() {
        return headerId;
    }

    public void setHeaderIdTemp(RichInputText headerIdTemp) {
        this.headerIdTemp = headerIdTemp;
    }

    public RichInputText getHeaderIdTemp() {
        return headerIdTemp;
    }


    /// Code For Operations Pop - Up Sabih - 27-10-2016

    public void editPopupFetchListenerRec(PopupFetchEvent popupFetchEvent) {
        // Add event code here...setPopUpWhereClause
        BindingContext bindingContext = BindingContext.getCurrent();
        BindingContainer bindingContainer =
            bindingContext.getCurrentBindingsEntry();
        OperationBinding operationBinding =
            bindingContainer.getOperationBinding("popupDeselectActionListener");
        System.out.println("OK....");
        operationBinding.execute();
        /*
         AdfFacesContext Object contain the all the facet and Components on the current page.
        */
        AdfFacesContext adfFaces = AdfFacesContext.getCurrentInstance();
        /*
         addPartialTarget("") Method of AdfFacesContext object Refresh the component.
         Accepts String in parameter (Name of the bean of component).
        */
        adfFaces.addPartialTarget(fillDataPopupTable);
        ;
    }


    public void editDialogListenerRec(DialogEvent dialogEvent) {
        // Add event code here...
        if (dialogEvent.getOutcome().name().equals("ok")) {
            OperationBinding operationBinding =
                executeOperation("populateOperations");
            operationBinding.execute();
            AdfFacesContext.getCurrentInstance().addPartialTarget(operationsTable); // Bind of Table where you are populating data
        }

    }


    public void editPopupCancelListener(PopupCanceledEvent popupCanceledEvent) {
        // Add event code here...
    }


    public void setOperationsTable(RichTable operationsTable) {
        this.operationsTable = operationsTable;
    }

    public RichTable getOperationsTable() {
        return operationsTable;
    }

    /*****Generic Method to Get BindingContainer**/
    public BindingContainer getBindingsCont() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    /**
     * Generic Method to execute operation
     * */
    public OperationBinding executeOperation(String operation) {
        OperationBinding createParam =
            getBindingsCont().getOperationBinding(operation);
        return createParam;

    }


    /// Code For Sub ProcessOperations Pop - Up Sabih - 07-112016

    public void editPopupFetchListenerSubPro(PopupFetchEvent popupFetchEvent) {
        // Add event code here...setPopUpWhereClause
        OperationBinding operationBinding =
            executeOperation("WhereClauseSubProcess");
        operationBinding.execute();
        ;
    }


    public void editDialogListenerSubPro(DialogEvent dialogEvent) {
        // Add event code here...
        if (dialogEvent.getOutcome().name().equals("ok")) {
            OperationBinding operationBinding =
                executeOperation("populateSubProcess");
            operationBinding.execute();
            AdfFacesContext.getCurrentInstance().addPartialTarget(subProcessTable); // Bind of Table where you are populating data
        }

    }

    public void setSubProcessTable(RichTable subProcessTable) {
        this.subProcessTable = subProcessTable;
    }

    public RichTable getSubProcessTable() {
        return subProcessTable;
    }

    public void setDetailLevelDosage(RichInputText detailLevelDosage) {
        this.detailLevelDosage = detailLevelDosage;
    }

    public RichInputText getDetailLevelDosage() {
        return detailLevelDosage;
    }

    public void setDetailLevelDosagePerc(RichInputText detailLevelDosagePerc) {
        this.detailLevelDosagePerc = detailLevelDosagePerc;
    }

    public RichInputText getDetailLevelDosagePerc() {
        return detailLevelDosagePerc;
    }

    public void setDetailLevelWaterRatio(RichInputText detailLevelWaterRatio) {
        this.detailLevelWaterRatio = detailLevelWaterRatio;
    }

    public RichInputText getDetailLevelWaterRatio() {
        return detailLevelWaterRatio;
    }

    public void DosagePerValueChanger(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        Double PerBatchWeight;
        Double DosagePercentage = 0.0;
        Double NoBatches = 0.0;
        Double TotConsumption = 0.0;

        oracle.adf.view.rich.component.UIXTable table = getOperationsTable();
        java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
        while (selectionIt.hasNext()) {
            Object rowKey = selectionIt.next();
            table.setRowKey(rowKey);
            int index = table.getRowIndex();
            FacesCtrlHierNodeBinding row =
                (FacesCtrlHierNodeBinding)table.getRowData(index);
            Row selectedRow = row.getRow();
            try {
                DosagePercentage =
                        Double.parseDouble(valueChangeEvent.getNewValue().toString());
            } catch (Exception e) {
                DosagePercentage = 0.0;
            }

            try {
                NoBatches =
                        Double.parseDouble(selectedRow.getAttribute("NumberBatches").toString());
            } catch (Exception e) {
                // TODO: Add catch code
                e.printStackTrace();
                NoBatches = 0.0;
            }

            Double PerBatchConsumption;
            String Uom;

            System.out.println("DosagePercentage    " + DosagePercentage);

            try {

                PerBatchWeight =
                        Double.parseDouble(headerPerBatchWeight.getValue().toString());

            } catch (Exception e) {
                // TODO: Add catch code

                PerBatchWeight = 0.0;
                e.printStackTrace();
            }

            System.out.println("PerBatchWeight    " + PerBatchWeight);

            PerBatchConsumption = (DosagePercentage * PerBatchWeight) / 100;

            try {
                Uom = getDetailLevelUom().getValue().toString();
            } catch (Exception e) {
                // TODO: Add catch code
                e.printStackTrace();
                Uom = "Null";
            }

            if (Uom.equals("Null")) {

                BindingContext bindingContext1 = BindingContext.getCurrent();
                DCDataControl dc1 =
                    bindingContext1.findDataControl("AppModuleDataControl"); //
                ApplicationModule am = dc1.getApplicationModule();
                ViewObject vo = am.findViewObject("MnjMfgWashRecipeDView1");
                try {
                    Uom = vo.getCurrentRow().getAttribute("Uom").toString();
                } catch (Exception e) {
                    // TODO: Add catch code
                    e.printStackTrace();
                    Uom = "Null";
                }
                System.out.println("UOM through VO ..... is......... >>>> " +
                                   Uom);


            }


            if (Uom.equals("Kilogram")) {
                System.out.println("In if of .........Kilogram");

                PerBatchConsumption = PerBatchConsumption / 1000;
            }

            System.out.println("PerBatchConsumption    " +
                               PerBatchConsumption);


            try {

                perBatchCons.setValue(new oracle.jbo.domain.Number(PerBatchConsumption));

            } catch (Exception e) {
                // TODO: Add catch code

                e.printStackTrace();
            }

            System.out.println("PerBatchConsumption    " +
                               PerBatchConsumption);

            TotConsumption = NoBatches * PerBatchConsumption;

            try {

                totalCons.setValue(new oracle.jbo.domain.Number(TotConsumption));

            } catch (Exception e) {
                // TODO: Add catch code

                e.printStackTrace();
            }

            AdfFacesContext.getCurrentInstance().addPartialTarget(perBatchCons); // Bind of Table where you are populating data
            AdfFacesContext.getCurrentInstance().addPartialTarget(totalCons);
            AdfFacesContext.getCurrentInstance().addPartialTarget(chemicalsTable);

        } //end of while

    }

    public void WaterRatioValueChanger(ValueChangeEvent valueChangeEvent) {
        // Add event code here...

        Double Dosage = 0.0;
        //     Double WaterRatio = Double.parseDouble(valueChangeEvent.getNewValue().toString());
        Double PerBatchConsumption = 0.0;
        Double WaterRatio = 0.0;
        String Uom;
        String MinorOperation;
        String MajorOperation;
        // Double PcsPerItem = 0.0;
        Double PerBatchQuantity = 0.0;
        Double NoBatches = 0.0;
        Double TotConsumption = 0.0;


        oracle.adf.view.rich.component.UIXTable table = getOperationsTable();
        java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
        while (selectionIt.hasNext()) {
            Object rowKey = selectionIt.next();
            table.setRowKey(rowKey);
            int index = table.getRowIndex();
            FacesCtrlHierNodeBinding row =
                (FacesCtrlHierNodeBinding)table.getRowData(index);
            Row selectedRow = row.getRow();

            try {
                WaterRatio =
                        Double.parseDouble(selectedRow.getAttribute("Water").toString());
            } catch (Exception e) {
                // TODO: Add catch code
                e.printStackTrace();
                WaterRatio = 0.0;
            }


            try {
                MajorOperation =
                        selectedRow.getAttribute("MajorOperations").toString();
            } catch (Exception e) {
                // TODO: Add catch code
                e.printStackTrace();
                MajorOperation = null;
            }

            try {
                MinorOperation =
                        selectedRow.getAttribute("MinorOperations").toString();
            } catch (Exception e) {
                // TODO: Add catch code
                e.printStackTrace();
                MinorOperation = null;
            }
            //        }

            try {
                NoBatches =
                        Double.parseDouble(selectedRow.getAttribute("NumberBatches").toString());
            } catch (Exception e) {
                // TODO: Add catch code
                e.printStackTrace();
                NoBatches = 0.0;
            }

            System.out.println("Number of Batches is ....... " + NoBatches);


            try {

                Dosage =
                        Double.parseDouble(detailLevelDosage.getValue().toString());

            } catch (Exception e) {
                // TODO: Add catch code

                Dosage = 0.0;
                e.printStackTrace();
            }

            BindingContext bindingContextt = BindingContext.getCurrent();
            DCDataControl dc2 =
                bindingContextt.findDataControl("AppModuleDataControl"); //
            ApplicationModule am = dc2.getApplicationModule();
            ViewObject vo = am.findViewObject("MnjMfgWashRecipeDView1");

            try {
                PerBatchQuantity =
                        Double.parseDouble(selectedRow.getAttribute("PerBatchQuantity").toString());
            } catch (Exception e) {
                // TODO: Add catch code
                e.printStackTrace();
                PerBatchQuantity = 0.0;
            }

            System.out.println("Per Batch Quantity is ....... " +
                               PerBatchQuantity);

            PerBatchConsumption = Dosage * WaterRatio;

            try {
                Uom = getDetailLevelUom().getValue().toString();
            } catch (Exception e) {
                // TODO: Add catch code
                e.printStackTrace();
                Uom = "Null";
            }


            if (Uom.equals("Null")) {


                try {
                    Uom = vo.getCurrentRow().getAttribute("Uom").toString();
                } catch (Exception e) {
                    // TODO: Add catch code
                    e.printStackTrace();
                    Uom = "Null";
                }
                System.out.println("UOM through VO ..... is......... >>>> " +
                                   Uom);


            }


            System.out.println("UOM is......... >>>> " + Uom);

            if (Uom.equals("Kilogram")) {
                //Wet Process
                if (MajorOperation.equals("Wet Process") ||
                    (MajorOperation.equals("Dry Process") &&
                     (MinorOperation.equals("PP Spray")) ||
                     (MinorOperation.equals("3D")))) {
                    System.out.println("In First If .................. ");
                    System.out.println("Major Operation is .................. " +
                                       MajorOperation);
                    System.out.println("Minor Operation is .................. " +
                                       MinorOperation);

                    System.out.println("In if of .........Kilogram");

                    PerBatchConsumption = PerBatchConsumption / 1000;
                    System.out.println("PerBatchConsumption at first if is..... " +
                                       PerBatchConsumption);
                }

                //                else if (MajorOperation.equals("Dry Process") &&
                //                         ((!MinorOperation.equals("PP Spray")) ||
                //                          (!MinorOperation.equals("3D")))) {
                //                    System.out.println("In second If .................. ");
                //                    System.out.println("Major Operation is .................. " +
                //                                       MajorOperation);
                //                    System.out.println("Minor Operation is .................. " +
                //                                       MinorOperation);
                //
                //                    PerBatchConsumption = PerBatchQuantity / PcsPerItem;
                //                }

                else
                    PerBatchConsumption = 0.0;
            }

            System.out.println("PerBatchConsumption    " +
                               PerBatchConsumption);

            TotConsumption = NoBatches * PerBatchConsumption;

            System.out.println("Total Consumption is............." +
                               TotConsumption);


            try {

                perBatchCons.setValue(new oracle.jbo.domain.Number(PerBatchConsumption));

            } catch (Exception e) {
                // TODO: Add catch code

                e.printStackTrace();
            }


            try {

                totalCons.setValue(new oracle.jbo.domain.Number(TotConsumption));

            } catch (Exception e) {
                // TODO: Add catch code

                e.printStackTrace();
            }

            AdfFacesContext.getCurrentInstance().addPartialTarget(perBatchCons); // Bind of Table where you are populating data
            AdfFacesContext.getCurrentInstance().addPartialTarget(totalCons);
            AdfFacesContext.getCurrentInstance().addPartialTarget(chemicalsTable);

        } // end of While

    }

    public void setHeaderPerBatchWeight(RichInputText headerPerBatchWeight) {
        this.headerPerBatchWeight = headerPerBatchWeight;
    }

    public RichInputText getHeaderPerBatchWeight() {
        return headerPerBatchWeight;
    }

    public void VersionCreation(ActionEvent actionEvent) {
        // Add event code here...

        System.out.println("In Version Creation");
        OperationBinding operationBinding =
            executeOperation("VersionCreation");
        operationBinding.execute();

        if (!operationBinding.getErrors().isEmpty()) {
            System.out.println("if errors-->");
            // List errors = operationBinding.getErrors();
        }
        //optional
        Object methodReturnValue = operationBinding.getResult();
        int value = Integer.parseInt(methodReturnValue.toString());
        //     return value;

        if (value == 1) {

            /* Message Printing */

            FacesContext context = FacesContext.getCurrentInstance();
            FacesMessage message =
                new FacesMessage("Version Created Scuccesfully");
            context.addMessage(null, message);


            /* End Message */
        }

        if (value > 1) {

            /* Message Printing */

            FacesContext context = FacesContext.getCurrentInstance();
            FacesMessage message = new FacesMessage("Version Not Created");
            context.addMessage(null, message);


            /* End Message */
        }

        AdfFacesContext.getCurrentInstance().addPartialTarget(searchPageTable); // Bind of Table where you are populating data


    }


    public void setSearchPageTable(RichTable searchPageTable) {
        this.searchPageTable = searchPageTable;
    }

    public RichTable getSearchPageTable() {
        return searchPageTable;
    }

    public void setActualReceiptQuantity(RichInputText actualReceiptQuantity) {
        this.actualReceiptQuantity = actualReceiptQuantity;
    }

    public RichInputText getActualReceiptQuantity() {
        return actualReceiptQuantity;
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public String SaveButton() {
        //Save();
        //commonActionNew();

        // Save();
        //        BindingContext bindingContext1 = BindingContext.getCurrent();
        //        BindingContainer bindingContainer1 =bindingContext1.getCurrentBindingsEntry();
        //        OperationBinding operationBinding1 =bindingContainer1.getOperationBinding("validateIssueRecDate");
        //        operationBinding1.execute();
        //        Object result = operationBinding1.getResult();
        //        if(result != null){
        //            if(result.toString().equals("true")){
        BindingContext bindingContext = BindingContext.getCurrent();
        BindingContainer bindingContainer =
            bindingContext.getCurrentBindingsEntry();
        OperationBinding operationBinding =
            bindingContainer.getOperationBinding("Qty_Calculation");
        operationBinding.execute();
        Save();
        //           }
        //       }

        return null;
    }

    public void Save() {
        BindingContainer bindings = getBindings();
        OperationBinding result = bindings.getOperationBinding("Commit");
        result.execute();
        
        BindingContext bindingContextt = BindingContext.getCurrent();
        DCDataControl dc2 =
            bindingContextt.findDataControl("AppModuleDataControl"); //
        ApplicationModule am = dc2.getApplicationModule();
        ViewObject vo = am.findViewObject("MnjMfgWashRecipeHView1");
        vo.clearCache();

        
        
        
        
    }


    public void setChemicalsTable(RichTable chemicalsTable) {
        this.chemicalsTable = chemicalsTable;
    }

    public RichTable getChemicalsTable() {
        return chemicalsTable;
    }

    public void setDetailLevelUom(RichInputText detailLevelUom) {
        this.detailLevelUom = detailLevelUom;
    }

    public RichInputText getDetailLevelUom() {
        return detailLevelUom;
    }

    public void setDetailLevelPcsPerItem(RichInputText detailLevelPcsPerItem) {
        this.detailLevelPcsPerItem = detailLevelPcsPerItem;
    }

    public RichInputText getDetailLevelPcsPerItem() {
        return detailLevelPcsPerItem;
    }

    public void selectAllButtonAction(ActionEvent actionEvent) {
        // Add event code here...
        System.out.println(" Action Source " + actionEvent.getSource());
        BindingContext bindingContext = BindingContext.getCurrent();
        BindingContainer bindingContainer =
            bindingContext.getCurrentBindingsEntry();
        System.out.println("OK");
        OperationBinding ob =
            bindingContainer.getOperationBinding("popupSelectActionListener");
        ob.execute();
        AdfFacesContext adfFaceContext = AdfFacesContext.getCurrentInstance();
        adfFaceContext.addPartialTarget(fillDataPopupTable);
    }

    public void deselectAllButtonAction(ActionEvent actionEvent) {
        // Add event code here...
        BindingContext bindingContext = BindingContext.getCurrent();
        BindingContainer bindingContainer =
            bindingContext.getCurrentBindingsEntry();
        OperationBinding operationBinding =
            bindingContainer.getOperationBinding("popupDeselectActionListener");
        System.out.println("OK....");
        operationBinding.execute();
        /*
         AdfFacesContext Object contain the all the facet and Components on the current page.
        */
        AdfFacesContext adfFaces = AdfFacesContext.getCurrentInstance();
        /*
         addPartialTarget("") Method of AdfFacesContext object Refresh the component.
         Accepts String in parameter (Name of the bean of component).
        */
        adfFaces.addPartialTarget(fillDataPopupTable);
    }

    public void setFillDataPopupTable(RichTable fillDataPopupTable) {
        this.fillDataPopupTable = fillDataPopupTable;
    }

    public RichTable getFillDataPopupTable() {
        return fillDataPopupTable;
    }

    public void DeleteHeader(ActionEvent actionEvent) {
        // Add event code here...

        BindingContext bindingContext1 = BindingContext.getCurrent();
        DCDataControl dc1 =
            bindingContext1.findDataControl("AppModuleDataControl"); //
        ApplicationModule am = dc1.getApplicationModule();
        ViewObject var_vo = am.findViewObject("MnjMfgWashRecipeHView1");

        ViewObject vo1 = am.findViewObject("MnjMfgWashRecipeLView1");
        ViewObject vo2 = am.findViewObject("MnjMfgShadeLVO1");

        System.out.println("Row Count Lines = " + vo1.getRowCount());
        System.out.println("Row Count Lines at Shades = " + vo2.getRowCount());

        if (vo1.getRowCount() > 0 || vo2.getRowCount() > 0) {

            FacesContext context = FacesContext.getCurrentInstance();
            FacesMessage message =
                new FacesMessage("Please Delete Child Record First!!");
            context.addMessage(null, message);

        } else {

            OperationBinding operationBinding =
                executeOperation("Delete_Header");
            operationBinding.execute();


            FacesContext context = FacesContext.getCurrentInstance();
            FacesMessage message = new FacesMessage("Record Deleted..");
            context.addMessage(null, message);

        }
    }

    public void setPerBatchQuantity_L(RichInputText perBatchQuantity_L) {
        this.perBatchQuantity_L = perBatchQuantity_L;
    }

    public RichInputText getPerBatchQuantity_L() {
        return perBatchQuantity_L;
    }

    public void setNumberBatches_L(RichInputText numberBatches_L) {
        this.numberBatches_L = numberBatches_L;
    }

    public RichInputText getNumberBatches_L() {
        return numberBatches_L;
    }

    //    public void QuantityBatch(ValueChangeEvent valueChangeEvent) {
    //        // Add event code here...
    //        Double Dosage = 0.0;
    //        //     Double WaterRatio = Double.parseDouble(valueChangeEvent.getNewValue().toString());
    //        Double PerBatchConsumption = 0.0;
    //        Double WaterRatio = 0.0;
    //        String Uom;
    //        String MinorOperation;
    //        String MajorOperation;
    //        Double PcsPerItem = 0.0;
    //        Double PerBatchQuantity = 0.0;
    //        Double NoBatches = 0.0;
    //        Double TotConsumption = 0.0;
    //
    //        Save();
    //        AdfFacesContext faces = AdfFacesContext.getCurrentInstance();
    //        faces.addPartialTarget(operationsTable);
    //
    //        oracle.adf.view.rich.component.UIXTable table = getOperationsTable();
    //        java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
    //        while (selectionIt.hasNext()) {
    //            Object rowKey = selectionIt.next();
    //            table.setRowKey(rowKey);
    //            int index = table.getRowIndex();
    //            FacesCtrlHierNodeBinding row =
    //                (FacesCtrlHierNodeBinding)table.getRowData(index);
    //            Row selectedRow = row.getRow();
    //
    //            try {
    //                WaterRatio =
    //                        Double.parseDouble(selectedRow.getAttribute("Water").toString());
    //            } catch (Exception e) {
    //                // TODO: Add catch code
    //                e.printStackTrace();
    //                WaterRatio = 0.0;
    //            }
    //
    //
    //            try {
    //                MajorOperation =
    //                        selectedRow.getAttribute("MajorOperations").toString();
    //            } catch (Exception e) {
    //                // TODO: Add catch code
    //                e.printStackTrace();
    //                MajorOperation = null;
    //            }
    //
    //            try {
    //                MinorOperation =
    //                        selectedRow.getAttribute("MinorOperations").toString();
    //            } catch (Exception e) {
    //                // TODO: Add catch code
    //                e.printStackTrace();
    //                MinorOperation = null;
    //            }
    //            //        }
    //
    //            try {
    //                NoBatches =
    //                        Double.parseDouble(selectedRow.getAttribute("NumberBatches").toString());
    //            } catch (Exception e) {
    //                // TODO: Add catch code
    //                e.printStackTrace();
    //                NoBatches = 0.0;
    //            }
    //
    //            System.out.println("Number of Batches is ....... " + NoBatches);
    //
    //
    //            try {
    //
    //                Dosage =
    //                        Double.parseDouble(detailLevelDosage.getValue().toString());
    //
    //            } catch (Exception e) {
    //                // TODO: Add catch code
    //
    //                Dosage = 0.0;
    //                e.printStackTrace();
    //            }
    //
    //            System.out.println("Dosage    " + Dosage);
    //
    //            try {
    //
    //                PcsPerItem =
    //                        Double.parseDouble(detailLevelPcsPerItem.getValue().toString());
    //
    //            } catch (Exception e) {
    //                // TODO: Add catch code
    //
    //                PcsPerItem = 0.0;
    //                e.printStackTrace();
    //            }
    //
    //            System.out.println("Pcs Per Item ..... is......... >>>> " +
    //                               PcsPerItem);
    //
    //
    //            if (PcsPerItem == 0.0) {
    //
    //                BindingContext bindingContext1 = BindingContext.getCurrent();
    //                DCDataControl dc1 =
    //                    bindingContext1.findDataControl("AppModuleDataControl"); //
    //                ApplicationModule am = dc1.getApplicationModule();
    //                ViewObject vo = am.findViewObject("MnjMfgWashRecipeDView1");
    //                try {
    //                    PcsPerItem =
    //                            Double.parseDouble(vo.getCurrentRow().getAttribute("PcsPerItem").toString());
    //                } catch (Exception e) {
    //                    // TODO: Add catch code
    //                    e.printStackTrace();
    //                    PcsPerItem = 0.0;
    //                }
    //                System.out.println("Pcs Per Item through VO ..... is......... >>>> " +
    //                                   PcsPerItem);
    //
    //
    //            }
    //
    //            try {
    //                PerBatchQuantity =
    //                        Double.parseDouble(selectedRow.getAttribute("PerBatchQuantity").toString());
    //            } catch (Exception e) {
    //                // TODO: Add catch code
    //                e.printStackTrace();
    //                PerBatchQuantity = 0.0;
    //            }
    //
    //            System.out.println("Per Batch Quantity is ....... " +
    //                               PerBatchQuantity);
    //
    //            PerBatchConsumption = Dosage * WaterRatio;
    //
    //            try {
    //                Uom = getDetailLevelUom().getValue().toString();
    //            } catch (Exception e) {
    //                // TODO: Add catch code
    //                e.printStackTrace();
    //                Uom = "Null";
    //            }
    //
    //
    //            if (Uom.equals("Null")) {
    //
    //                BindingContext bindingContext1 = BindingContext.getCurrent();
    //                DCDataControl dc1 =
    //                    bindingContext1.findDataControl("AppModuleDataControl"); //
    //                ApplicationModule am = dc1.getApplicationModule();
    //                ViewObject vo = am.findViewObject("MnjMfgWashRecipeDView1");
    //                try {
    //                    Uom = vo.getCurrentRow().getAttribute("Uom").toString();
    //                } catch (Exception e) {
    //                    // TODO: Add catch code
    //                    e.printStackTrace();
    //                    Uom = "Null";
    //                }
    //                System.out.println("UOM through VO ..... is......... >>>> " +
    //                                   Uom);
    //
    //
    //            }
    //
    //
    //            System.out.println("UOM is......... >>>> " + Uom);
    //
    //            if (Uom.equals("Kilogram")) {
    //                //Wet Process
    //                if (MajorOperation.equals("Wet Process") ||
    //                    (MajorOperation.equals("Dry Process") &&
    //                     (MinorOperation.equals("PP Spray")) ||
    //                     (MinorOperation.equals("3D")))) {
    //                    System.out.println("In First If .................. ");
    //                    System.out.println("Major Operation is .................. " +
    //                                       MajorOperation);
    //                    System.out.println("Minor Operation is .................. " +
    //                                       MinorOperation);
    //
    //                    System.out.println("In if of .........Kilogram");
    //
    //                    PerBatchConsumption = PerBatchConsumption / 1000;
    //                    System.out.println("PerBatchConsumption at first if is..... " +
    //                                       PerBatchConsumption);
    //                }
    //
    //                else if (MajorOperation.equals("Dry Process") &&
    //                         ((!MinorOperation.equals("PP Spray")) ||
    //                          (!MinorOperation.equals("3D")))) {
    //                    System.out.println("In second If .................. ");
    //                    System.out.println("Major Operation is .................. " +
    //                                       MajorOperation);
    //                    System.out.println("Minor Operation is .................. " +
    //                                       MinorOperation);
    //
    //                    PerBatchConsumption = PerBatchQuantity / PcsPerItem;
    //                }
    //
    //                else
    //                    PerBatchConsumption = 0.0;
    //            }
    //
    //            System.out.println("PerBatchConsumption    " +
    //                               PerBatchConsumption);
    //
    //            TotConsumption = NoBatches * PerBatchConsumption;
    //
    //            System.out.println("Total Consumption is............." +
    //                               TotConsumption);
    //
    //
    //            try {
    //
    //                perBatchCons.setValue(new oracle.jbo.domain.Number(PerBatchConsumption));
    //
    //            } catch (Exception e) {
    //                // TODO: Add catch code
    //
    //                e.printStackTrace();
    //            }
    //
    //
    //            try {
    //
    //                totalCons.setValue(new oracle.jbo.domain.Number(TotConsumption));
    //
    //            } catch (Exception e) {
    //                // TODO: Add catch code
    //
    //                e.printStackTrace();
    //            }
    //
    //            AdfFacesContext.getCurrentInstance().addPartialTarget(perBatchCons); // Bind of Table where you are populating data
    //            AdfFacesContext.getCurrentInstance().addPartialTarget(totalCons);
    //
    //
    //        } // end of While
    //        Save();
    //    }

    public void PcsPerItemValueChanger(ValueChangeEvent valueChangeEvent) {
        // Add event code here...

        Double PerBatchConsumption = 0.0;
        Double PcsPerItem = 0.0;
        Double PerBatchQuantity = 0.0;
        Double NoBatches = 0.0;
        Double TotConsumption = 0.0;

        oracle.adf.view.rich.component.UIXTable table = getOperationsTable();
        java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
        while (selectionIt.hasNext()) {
            Object rowKey = selectionIt.next();
            table.setRowKey(rowKey);
            int index = table.getRowIndex();
            FacesCtrlHierNodeBinding row =
                (FacesCtrlHierNodeBinding)table.getRowData(index);
            Row selectedRow = row.getRow();


            try {
                PcsPerItem =
                        Double.parseDouble(detailLevelPcsPerItem.getValue().toString());

            } catch (Exception e) {
                // TODO: Add catch code

                PcsPerItem = 0.0;
                e.printStackTrace();
            }

            System.out.println("Pcs Per Item ..... is......... >>>> " +
                               PcsPerItem);

            BindingContext bindingContextt = BindingContext.getCurrent();
            DCDataControl dc2 =
                bindingContextt.findDataControl("AppModuleDataControl"); //
            ApplicationModule am = dc2.getApplicationModule();
            ViewObject vo = am.findViewObject("MnjMfgWashRecipeDView1");


            if (PcsPerItem == 0.0) {

                try {
                    PcsPerItem =
                            Double.parseDouble(vo.getCurrentRow().getAttribute("PcsPerItem").toString());
                } catch (Exception e) {
                    // TODO: Add catch code
                    e.printStackTrace();
                    PcsPerItem = 0.0;
                }
                System.out.println("Pcs Per Item through VO ..... is......... >>>> " +
                                   PcsPerItem);
            }

            try {
                NoBatches =
                        Double.parseDouble(selectedRow.getAttribute("NumberBatches").toString());
            } catch (Exception e) {
                // TODO: Add catch code
                e.printStackTrace();
                NoBatches = 0.0;
            }

            System.out.println("Number of Batches is ....... " + NoBatches);

            try {
                PerBatchQuantity =
                        Double.parseDouble(selectedRow.getAttribute("PerBatchQuantity").toString());
            } catch (Exception e) {
                // TODO: Add catch code
                e.printStackTrace();
                PerBatchQuantity = 0.0;
            }

            System.out.println("Per Batch Quantity is ....... " +
                               PerBatchQuantity);


            PerBatchConsumption = PerBatchQuantity / PcsPerItem;

            System.out.println("PerBatchConsumption    " +
                               PerBatchConsumption);

            TotConsumption = NoBatches * PerBatchConsumption;

            System.out.println("Total Consumption is............." +
                               TotConsumption);


            try {

                perBatchCons.setValue(new oracle.jbo.domain.Number(PerBatchConsumption));

            } catch (Exception e) {
                // TODO: Add catch code

                e.printStackTrace();
            }


            try {

                totalCons.setValue(new oracle.jbo.domain.Number(TotConsumption));

            } catch (Exception e) {
                // TODO: Add catch code

                e.printStackTrace();
            }

            AdfFacesContext.getCurrentInstance().addPartialTarget(perBatchCons); // Bind of Table where you are populating data
            AdfFacesContext.getCurrentInstance().addPartialTarget(totalCons);
            AdfFacesContext.getCurrentInstance().addPartialTarget(chemicalsTable);


        } // end of While

    }

    public void perBatchQuantityValueChanger(ValueChangeEvent vce) {
        Save();
        // Add event code here...

        Double ActualReceiptQty = 0.0;
        Double PerBatchQuantity = 0.0;
        Double NoofBatches = 0.0;
        BindingContext bindingContextt = BindingContext.getCurrent();
        DCDataControl dc2 =
            bindingContextt.findDataControl("AppModuleDataControl"); //
        ApplicationModule am = dc2.getApplicationModule();
        ViewObject vo = am.findViewObject("MnjMfgWashRecipeHView1");
        try {
            ActualReceiptQty =
                    Double.parseDouble(vo.getCurrentRow().getAttribute("ActualReceiptQty").toString());
        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
            ActualReceiptQty = 0.0;
        }
        oracle.adf.view.rich.component.UIXTable table = getOperationsTable();
        java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
        while (selectionIt.hasNext()) {
            Object rowKey = selectionIt.next();
            table.setRowKey(rowKey);
            int index = table.getRowIndex();
            FacesCtrlHierNodeBinding row =
                (FacesCtrlHierNodeBinding)table.getRowData(index);
            Row selectedRow = row.getRow();

            try {
                PerBatchQuantity =
                        Double.parseDouble(vce.getNewValue().toString());
                System.out.println("Per Batch Quantity through Event ..... is......... >>>> " +
                                   PerBatchQuantity);

            } catch (Exception e) {
                // TODO: Add catch code
                e.printStackTrace();
                PerBatchQuantity = 0.0;
            }


            if (PerBatchQuantity == 0.0) {

                try {
                    PerBatchQuantity =
                            Double.parseDouble(selectedRow.getAttribute("PerBatchQuantity").toString());
                } catch (Exception e) {
                    // TODO: Add catch code
                    e.printStackTrace();
                    PerBatchQuantity = 0.0;
                }
                System.out.println("Per Batch Quantity through VO ..... is......... >>>> " +
                                   PerBatchQuantity);
            }

            NoofBatches = ActualReceiptQty / PerBatchQuantity;

            System.out.println("No. of Batches is   " + NoofBatches);

            try {

                numberBatches_L.setValue(new oracle.jbo.domain.Number(NoofBatches));

            } catch (Exception e) {
                // TODO: Add catch code

                e.printStackTrace();
            }


            AdfFacesContext.getCurrentInstance().addPartialTarget(numberBatches_L); // Bind of Table where you are populating data
            //AdfFacesContext.getCurrentInstance().addPartialTarget(operationsTable);


        } // end of While

    }

    public void ReCalculate_Fields(ActionEvent actionEvent) {
        // Add event code here...

        OperationBinding operationBinding =
            executeOperation("ReCalculate_Fields");
        operationBinding.execute();

        AdfFacesContext.getCurrentInstance().addPartialTarget(operationsTable);
        AdfFacesContext.getCurrentInstance().addPartialTarget(perBatchCons);
        AdfFacesContext.getCurrentInstance().addPartialTarget(totalCons);
        AdfFacesContext.getCurrentInstance().addPartialTarget(chemicalsTable);

        FacesContext context = FacesContext.getCurrentInstance();
        FacesMessage message =
            new FacesMessage("Fields Re-Calculated Successfully..");
        context.addMessage(null, message);


    }

    public void DeleteOperations(ActionEvent actionEvent) {
        // Add event code here...
        OperationBinding operationBinding =
            executeOperation("DeleteOperations");
        operationBinding.execute();
    }

    public void DeleteChemicals(ActionEvent actionEvent) {
        // Add event code here...
        OperationBinding operationBinding =
            executeOperation("DeleteChemicals");
        operationBinding.execute();
    }

    public void DeleteSubProcess(ActionEvent actionEvent) {
        // Add event code here...
        OperationBinding operationBinding =
            executeOperation("DeleteSubProcess");
        operationBinding.execute();
    }

    public void Copy(ActionEvent actionEvent) {
        // Add event code here...

        System.out.println("In Copy Creation");
        OperationBinding operationBinding = executeOperation("CopyCreation");
        operationBinding.execute();

        if (!operationBinding.getErrors().isEmpty()) {
            System.out.println("if errors-->");
            // List errors = operationBinding.getErrors();
        }
        //optional
        Object methodReturnValue = operationBinding.getResult();
        int value = Integer.parseInt(methodReturnValue.toString());
        //     return value;

        if (value > 0) {

            /* Message Printing */

            FacesContext context = FacesContext.getCurrentInstance();
            FacesMessage message =
                new FacesMessage("Copy Created Scuccesfully and Document Number is " +
                                 value);
            context.addMessage(null, message);


            /* End Message */
        }

        if (value == 0) {

            /* Message Printing */

            FacesContext context = FacesContext.getCurrentInstance();
            FacesMessage message = new FacesMessage("Copy Not Created");
            context.addMessage(null, message);


            /* End Message */
        }


    }

}
