package tamrin1;

public class Controller {
    Model model=new Model();
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
    public void Database()
    {
        model.Database();
    }
}
