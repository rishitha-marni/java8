package studentSchoolMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchoolStudentIdMapping {
  public static void main(String[] args) {
	 
	  List<Student> students1 = new ArrayList<>();
      students1.add(new Student(1, "A", "Red"));
      students1.add(new Student(2, "B", "Blue"));

      // Create Student objects for school 2
      List<Student> students2 = new ArrayList<>();
      students2.add(new Student(3, "A", "Green"));
      students2.add(new Student(4, "C", "Yellow"));

      // Create School objects with Student lists
      School school1 = new School(1, "Greenwood High", students1);
      School school2 = new School(2, "Sunrise School", students2);
      
      Map<String, List<Integer>> mm=new HashMap<>();
      mm.put(school1.getSchoolName(), school1.getStudentId());
      mm.put(school2.getSchoolName(), school2.getStudentId());
	  
      for(Map.Entry<String, List<Integer>>  ent: mm.entrySet()) {
    	  System.out.println(ent.getKey()+"   "+ent.getValue());
      }
}
}
