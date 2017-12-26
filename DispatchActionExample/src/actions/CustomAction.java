package actions;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.*;
import org.apache.struts.action.*;
import org.apache.struts.actions.*;

import forms.CustomForm;

public class CustomAction extends LookupDispatchAction {

    private final static String SUCCESS = "success";

    protected Map getKeyMethodMap() {
        Map map = new HashMap();
        map.put("User.add", "add");
        map.put("User.update", "update");
        map.put("User.delete", "delete");
        return map;
    }

    public ActionForward add(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        CustomForm userForm = (CustomForm) form;
        userForm.setMessage("Inside add user method.");
        return mapping.findForward(SUCCESS);
    }

    public ActionForward update(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        CustomForm userForm = (CustomForm) form;
        userForm.setMessage("Inside update user method.");
        return mapping.findForward(SUCCESS);
    }

    public ActionForward delete(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        CustomForm userForm = (CustomForm) form;
        userForm.setMessage("Inside delete user method.");
        return mapping.findForward(SUCCESS);
    }

}