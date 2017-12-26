package actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import forms.HelloWorldForm;

public class HelloWorldAction extends Action {
   
    private final static String SUCCESS = "success";
   
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        HelloWorldForm helloWorldForm = (HelloWorldForm) form;
        helloWorldForm.setMessage("Hello World!");
        return mapping.findForward(SUCCESS);
    }
}
