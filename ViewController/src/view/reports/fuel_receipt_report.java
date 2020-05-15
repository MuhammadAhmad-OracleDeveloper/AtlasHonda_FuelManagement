package view.reports;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Locale;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;

import view.DatabaseConnection.DatabaseConnection;

public class fuel_receipt_report {
    public fuel_receipt_report() {
        System.out.println("Fuel Receipt Report");
    }

    
    private RichSelectOneChoice fromVendor;    
    private RichSelectOneChoice toVendor;    
    private RichSelectOneChoice fromLocation;    
    private RichSelectOneChoice toLocation;    
    private RichSelectOneChoice fromitems;    
    private RichSelectOneChoice toitems;
    private RichInputDate fromDateParam;
    private RichInputDate toDateParam;
    private RichSelectOneChoice format_type;

    private static Number  gotFromVendor;
    private static Number  gotToVendor;
    private static Number  gotFromLocation;
    private static Number  gotToLocation;
    private static Number  gotFromItems;
    private static Number  gotToItems;
    private static String gotFormat = "";

    public String get_report() {
        // Add event code here...
        gotFromVendor = (Number)this.getFromVendor().getValue(); // To recieve value from UI InputText Component
        gotToVendor = (Number)this.getToVendor().getValue();
        gotFromLocation = (Number)this.getFromLocation().getValue();
        gotToLocation = (Number)this.getToLocation().getValue();
        gotFromItems = (Number)this.getFromitems().getValue();
        gotToItems = (Number)this.getToitems().getValue();
        gotFormat = (String)this.getFormat_type().getValue();
        
        DatabaseConnection dbconnect = new DatabaseConnection();
        OracleReportBean reportBean = new OracleReportBean(dbconnect.getUipReport(), dbconnect.getUportReport(), null);
        String url = "";
        
            if(gotFromVendor != null){
                reportBean.setReportParameter("P_STVENDOR_ID", gotFromVendor.toString());
            }
        if(gotToVendor != null){
            reportBean.setReportParameter("P_ENVENDOR_ID", gotToVendor.toString());
        }
        if(gotFromLocation != null){
            reportBean.setReportParameter("P_STLOCATION_ID", gotFromLocation.toString());
        }
        if(gotToLocation != null){
            reportBean.setReportParameter("P_ENLOCATION_ID", gotToLocation.toString());
        }
        if(gotFromItems != null){
            reportBean.setReportParameter("P_STITEM_ID", gotFromItems.toString());
        }
        if(gotToItems != null){
            reportBean.setReportParameter("P_ENITEM_ID", gotToItems.toString());
        }
        if(getFromDate() != ""){
        reportBean.setReportParameter("P_STDT", getFromDate());
        }
        if(getToDate() != ""){
        reportBean.setReportParameter("P_ENDT", getToDate());
        }
        
        
        if (gotFormat == "" || gotFormat == null) {
            showMessage("Please Select Report Format");
        } else {
        reportBean.setReportURLName("userid=ahfm/ahfm@orcl&domain=classicdomain&report=C:/ahfm_reports/Reports/FUEL_RECEIPT&");
        
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        gotFormat); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
        }
        return null;
    }
    

    public String showMessage(String msgs) {
        String messageText = msgs;
        FacesMessage fm = new FacesMessage(messageText);
        /**
             * set the type of the message.
             * Valid types: error, fatal,info,warning
             */
        fm.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, fm);
        return null;
    }
    
    private String getFromDate() {
        if(fromDateParam.getValue() != null && fromDateParam.getValue() != "") {
            try {
                DateFormat sdf = new SimpleDateFormat("EE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
                Date parsedDate = sdf.parse(fromDateParam.getValue().toString());
                SimpleDateFormat print = new SimpleDateFormat("dd-MMM-yy");
                return (print.format(parsedDate));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return "";
    }
    
    private String getToDate() {
        if(toDateParam.getValue() != null && toDateParam.getValue() != "") {
            try {
                DateFormat sdf = new SimpleDateFormat("EE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
                Date parsedDate = sdf.parse(toDateParam.getValue().toString());
                SimpleDateFormat print = new SimpleDateFormat("dd-MMM-yy");
                return (print.format(parsedDate));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return "";
    }


    public void setFromVendor(RichSelectOneChoice fromVendor) {
        this.fromVendor = fromVendor;
    }

    public RichSelectOneChoice getFromVendor() {
        return fromVendor;
    }

    public void setToVendor(RichSelectOneChoice toVendor) {
        this.toVendor = toVendor;
    }

    public RichSelectOneChoice getToVendor() {
        return toVendor;
    }

    public void setFromLocation(RichSelectOneChoice fromLocation) {
        this.fromLocation = fromLocation;
    }

    public RichSelectOneChoice getFromLocation() {
        return fromLocation;
    }

    public void setToLocation(RichSelectOneChoice toLocation) {
        this.toLocation = toLocation;
    }

    public RichSelectOneChoice getToLocation() {
        return toLocation;
    }

    public void setFromitems(RichSelectOneChoice fromitems) {
        this.fromitems = fromitems;
    }

    public RichSelectOneChoice getFromitems() {
        return fromitems;
    }

    public void setToitems(RichSelectOneChoice toitems) {
        this.toitems = toitems;
    }

    public RichSelectOneChoice getToitems() {
        return toitems;
    }

    public void setFromDateParam(RichInputDate fromDateParam) {
        this.fromDateParam = fromDateParam;
    }

    public RichInputDate getFromDateParam() {
        return fromDateParam;
    }

    public void setToDateParam(RichInputDate toDateParam) {
        this.toDateParam = toDateParam;
    }

    public RichInputDate getToDateParam() {
        return toDateParam;
    }

    public void setFormat_type(RichSelectOneChoice format_type) {
        this.format_type = format_type;
    }

    public RichSelectOneChoice getFormat_type() {
        return format_type;
    }
}
