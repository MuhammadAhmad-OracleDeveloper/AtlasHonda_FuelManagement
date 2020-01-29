package view;

import javax.faces.event.ActionEvent;

import java.io.Serializable;

import oracle.adf.controller.TaskFlowId;

public class FuelManagementSidebar implements Serializable {
    private String taskFlowId =
        "/WEB-INF/Task_Flows/Modules/Fuel_Management/Fuel_Management_TaskFlow.xml#Fuel_Management_TaskFlow";

    public FuelManagementSidebar() {
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }

    public void setDynamicTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
    }
    
    public void fragmentCall(ActionEvent actionEvent) {
        // Add event code here...
        String action = (String)actionEvent.getComponent().getAttributes().get("link");
        StringBuilder link = new StringBuilder();
        link.append("/WEB-INF/Task_Flows/Modules/Fuel_Management/");
        link.append(action);
        link.append(".xml#");
        link.append(action);
        setDynamicTaskFlowId(link.toString());
    }
}