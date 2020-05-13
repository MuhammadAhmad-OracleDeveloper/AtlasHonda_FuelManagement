package view.reports;

import view.DatabaseConnection.DatabaseConnection;

public class tanker_sumary_report {
    public tanker_sumary_report() {
        System.out.println("Tanker Sumary Report");
    }

    public String get_report() {
        // Add event code here...
        DatabaseConnection dbconnect = new DatabaseConnection();
        OracleReportBean reportBean = new OracleReportBean(dbconnect.getUipReport(), dbconnect.getUportReport(), null);
        String url = "";
        
        reportBean.setReportURLName("userid=ahfm/ahfm@orcl&domain=classicdomain&report=C:/ahfm_reports/Reports/TANKER_SUMRY&");
        
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
        return null;
    }
}
