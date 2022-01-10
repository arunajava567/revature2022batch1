
//Message Passing Demo
class Student
{
  String getSessionDay(Faculty f, String course)
  {
    return f.getSession(course);
  }
}

class Faculty
{
  String name;
  String course;
  String day;
  
  Faculty(String name,String course,String day)
  {
    this.name=name;
    this.course=course;
    this.day=day;
  }
  String getSession(String course)
  {
    if (this.course.equals(course))
      return day;
    else
      return "Not my course";
  }
}
public class MessagePassingDemo
{
  public static void main(String[] args)
  {
    Student s = new Student();
    Faculty f = new Faculty("Ravi","Java","Friday");
    System.out.println(s.getSessionDay(f,"Java"));
  }
}