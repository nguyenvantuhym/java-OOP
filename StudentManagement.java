class Student{
    private String name, ID, group, email;

    public Student()
    {
        name ="Student";
        ID = "000";
        group = "k59CB";
        email =  "uet@vnu.edu.vn";
    }

    public Student(String _name, String _id, String _email)
    {
        name =_name;
        ID = _id;
        group = "k59CB";
        email =  _email;
    }
    public Student (Student s)
    {
        name= s.getName();
        ID = s.getID();
        group = s.getEmail();
        email = s.getEmail();
    }

    public void setName(String _name)
    {
        name = _name;
        return;
    }
    public String getName()
    {
        return name;
    }

    public void setID(String _ID)
    {
        ID = _ID;
        
    }
    public String getID()
    {
        return ID;
    }

    public void setGroup(String _group)
    {
        group = _group;
    }
    public String getGroup()
    {
        return group;
    }

    public void setEmail(String _email)
    {
        email = _email;
        
    }
    public String getEmail()
    {
        return email;
    }

    public void getInfo()
    {
        System.out.print("\nten :" + name + "\nID : "+ ID + "\ngroup : "+group + "\nemail : "+email);
    }

    public boolean checkSameGroup(Student s1, Student s2)
    {
        if(s1.group==s2.group) return true; else return false;
    }
   
}
class StudentManagement
{
    Student students [] = new Student[100];
    public static void main(String args[])
    {
        
    }
    void studentByGroup(string nameGroup)
    {
        for(int i = 0; i < students.length;i++)
        {
            if(students[i].getGroup() == nameGroup){
               students[i].getInfo();
            }
        }
    }
    void removeStudent(String id)
    {
        int i =0;
        while(i < students.length&&students[i].getID() != id)  i++;
        while(i < students.length)
        {
            students[i] = students[i+1];
        }
        return;
    }
}