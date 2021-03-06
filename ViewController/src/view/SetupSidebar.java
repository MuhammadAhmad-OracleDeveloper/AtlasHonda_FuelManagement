package view;

import javax.faces.event.ActionEvent;

import java.io.Serializable;

import oracle.adf.controller.TaskFlowId;

public class SetupSidebar implements Serializable {
    private String taskFlowId = "/WEB-INF/Task_Flows/Modules/Setup/Setup_TaskFlow.xml#Setup_TaskFlow";

    public SetupSidebar() {
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
        link.append("/WEB-INF/Task_Flows/Modules/Setup/");
        link.append(action);
        link.append(".xml#");
        link.append(action);
        setDynamicTaskFlowId(link.toString());
    }
}
