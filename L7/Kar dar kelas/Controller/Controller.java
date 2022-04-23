package kardarclass.controller;

import kardarclass.model.Model;

public class Controller {
    Model model=new Model();
    public void setModelUsername(String username)
    {
        model.setUsername(username);
    }
    public void setModelPassword(String password)
    {
        model.setPass(password);
    }
    public void setModelEmail(String Email)
    {
        model.setEmail(Email);
    }
    public void setModelName(String name)
    {
        model.setName(name);
    }
    public void setModelAction(String action)
    {
        model.setAction(action);
    }
    public String getModelAction(){
        return model.getAction();
    }
    public boolean getModelSwtch()
    {
        return model.getSwtch();
    }
    public String getModelcheck_Username()
    {
        return model.getCheck_Username();
    }
    public String getModelcheck_Password()
    {
        return model.getCheck_Password();
    }
    public String getModelUsername()
    {
        return model.getUsername();
    }
    public String getModelPassword()
    {
        return model.getPass();
    }
    public void Action()
    {
        model.Action();
    }
}
