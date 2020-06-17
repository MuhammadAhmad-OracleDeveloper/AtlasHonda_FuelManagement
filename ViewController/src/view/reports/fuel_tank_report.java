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

public class fuel_tank_report {
    public fuel_tank_report() {
        System.out.println("Fuel Tank Report");
    }

    private RichInputDate fromDateParam;
    private RichInputDate toDateParam;
    private RichSelectOneChoice fromTankParam;
    private RichSelectOneChoice toTankParam;
    private RichSelectOneChoice format_type;
    
    private static Number  gotfromTank;
    private static Number  gottoTank;
    private static String gotFormat = "";

    public String get_report() {
        // Add event code here...
        gotfromTank = (Number)this.getfromTankParam().getValue();
        gottoTank = (Number)this.gettoTankParam().getValue();
        gotFormat = (String)this.getFormat_type().getValue();
        
        DatabaseConnection dbconnect = new DatabaseConnection();
        OracleReportBean reportBean = new OracleReportBean(dbconnect.getUipReport(), dbconnect.getUportReport(), null);
        String url = "";
        
                if(getFromDate() != ""){
                reportBean.setReportParameter("P_STDT", getFromDate());
                }
                if(getToDate() != ""){
                reportBean.setReportParameter("P_ENDT", getToDate());
                }
        if(gotfromTank != null){
            reportBean.setReportParameter("P_STTANK", gotfromTank.toString());
        }
        if(gottoTank != null){
            reportBean.setReportParameter("P_ENTANK", gottoTank.toString());
        }
        
        if (gotFormat == "" || gotFormat == null) {
            showMessage("Please Select Report Format");
        } else {
        reportBean.setReportURLName("userid=ahfm/ahfm@orcl&domain=classicdomain&report=C:/ahfm_reports/Reports/FM_TANK_CLQTY&");
        
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
    
    public void setfromTankParam(RichSelectOneChoice fromTankParam) {
        this.fromTankParam = fromTankParam;
    }

    public RichSelectOneChoice getfromTankParam() {
        return fromTankParam;
    }

    public void settoTankParam(RichSelectOneChoice toTankParam) {
        this.toTankParam = toTankParam;
    }

    public RichSelectOneChoice gettoTankParam() {
        return toTankParam;
    }

    public void setFormat_type(RichSelectOneChoice format_type) {
        this.format_type = format_type;
    }

    public RichSelectOneChoice getFormat_type() {
        return format_type;
    }
}
