package tamrin2;

public class Controller {
    Model model=new Model();
    public void setModel2Username(String username)
    {
        model.setUsername(username);
    }
    public void setModel2Password(String password)
    {
        model.setPassword(password);
    }
    public void Database()
    {
        model.Database();
    }
    public boolean Check()
    {
        return model.Check();
    }
    public void setModelId(String Id)
    {
        model.setId(Integer.parseInt(Id));
    }
    public void setModelName(String name)
    {
        model.setName(name);
    }
    public void setModelFamily(String family)
    {
        model.setFamily(family);
    }
    public void setModelAge(String age)
    {
        model.setAge(Integer.parseInt(age));
    }
    public void setModelFather(String father)
    {
        model.setFather(father);
    }
    public void setModelJob(String job)
    {
        model.setJob(job);
    }
    public void setModelAddress(String address)
    {
        model.setAddress(address);
    }
    public void setModelPhone(String phone)
    {
        model.setPhone(phone);
    }
    public void setModel2Edit_Id(String edit_id)
    {
        model.setEdit_Id(Integer.parseInt(edit_id));
    }
    public void Database2()
    {
        model.Database2();
    }
}
