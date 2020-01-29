package view.backing.Main_Pages;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

import java.util.Map;

import javax.faces.application.FacesMessage;

import javax.faces.context.FacesContext;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.nav.RichLink;

import oracle.adf.view.rich.component.rich.output.RichImage;

import view.DatabaseConnection.DatabaseConnection;

public class Login {
    
    private static String role_master_id;
    private static String user_master_id;
    private static String sessUName;
    
    private RichForm f1;
    private RichDocument d1;
    private RichInputText it1;
    private RichInputText it2;
    private RichLink l1;
    private RichImage i1;

    public void setF1(RichForm f1) {
        this.f1 = f1;
    }

    public RichForm getF1() {
        return f1;
    }

    public void setD1(RichDocument d1) {
        this.d1 = d1;
    }

    public RichDocument getD1() {
        return d1;
    }

    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }

    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }

    public void setL1(RichLink l1) {
        this.l1 = l1;
    }

    public RichLink getL1() {
        return l1;
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
    public static void storeOnSession(String key, Object object) {
        FacesContext ctx = FacesContext.getCurrentInstance();
        Map sessionState = ctx.getExternalContext().getSessionMap();
        sessionState.put(key, object);
    }

    //user logging in
    public String login_action() {
        // Add event code here...
        //SETTING VALUE PROGRAMMATICALLY IN PASSWORD FIELD,,,,ONLY TESTING
        //  //          it2.setValue("bla bla bla");
        String username = this.getIt1().getValue().toString();
        String password = this.getIt2().getValue().toString();

        sessUName = username;
        storeOnSession("sessUName", sessUName);
        System.out.println("value for session..............." + sessUName);

        System.out.println(".......................................................................");
        System.out.println(".......................................................................");
        System.out.println("Entered username is : " + username + "....and password is : " + password);
        System.out.println(".......................................................................");
        System.out.println(".......................................................................");


        Connection conn;

        try {
            conn = DatabaseConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rset =
                stmt.executeQuery("SELECT * FROM tbl_user_master where user_master_name = '" + username +
                                  "' and user_master_pwd = '" + password + "'");

            if (rset.next()) {
                //                conn.close();
                //getting data against column from table
                role_master_id = (rset.getString("role_master_id")).toString();
                user_master_id = (rset.getString("user_master_id")).toString();
                //Storing value in session username from input text field and role_master_id from DB

                System.out.println(".........User Name stored in session is :..." + username + "...");
    //                System.out.println(".........User Password stored in session is :..." + password + "...");
                System.out.println(".........User Role stored in session is :..." + role_master_id + "...");
                System.out.println(".........User Master ID stored in session is :..." + user_master_id + "...");

                //Redirecting to home page after successfull authentication
                //System.out.println("....... here we go /// you are redirecting now to DASHBOARD ......");
                //                return "good";
    //                get_module_view_rights();
                                
                storeOnSession("sessRMID", role_master_id);                
                storeOnSession("sessUMID", user_master_id);
                
                conn.close();
                return "/faces/Main_Pages/Dashboard.jsf?faces-redirect=true";
            } else {
                showMessage("Wrong Login Credentials");
                conn.close();
                System.out.println("........wrong login credentials........");
                //return "/faces/Main_Pages/Login.jsf?faces-redirect=true";
                return "false";

            }


        } catch (SQLException e) {
            System.out.println(e);
        }

        return role_master_id;
        //        return "/faces/Main_Pages/Dashboard.jsf?faces-redirect=true";
        //        return "good";
    }

    //Logout > session cleared and session variable cleared
    public String logout_action() {
        System.out.println("logout called");
        sessUName = "";
        role_master_id = "";
        storeOnSession("sessUName", "");
        storeOnSession("sessRMID", "");
        storeOnSession("sessUMID", "");
        //        return "good";
        return "/faces/Main_Pages/Login.jsf?faces-redirect=true";
    }

    public void setI1(RichImage i1) {
        this.i1 = i1;
    }

    public RichImage getI1() {
        return i1;
    }
}
