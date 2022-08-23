import java.util.*;

public class TestMap {
    public static void main(String[] args) {

//        Map<String, Integer> hashMap = new HashMap<>();
//        hashMap.put("Smith", 30);
//        hashMap.put("Anderson", 31);
//        hashMap.put("Lewis", 29);
//        hashMap.put("Cook", 29);
//        System.out.println("Display entries in HashMap");
//        System.out.println(hashMap + "\n");

//        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
//        System.out.println("Display entries in ascending order of key");
//        System.out.println(treeMap);

//        Student student1 = new Student("Nam",20, "HN");
//        Student student2 = new Student("Hung",21, "HN");
//        Student student3 = new Student("Ha",22, "HN");
//        // write your code here
//        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
//        studentMap.put(1,student1);
//        studentMap.put(2,student2);
//        studentMap.put(3,student3);
//        studentMap.put(4,student1);
//
//        for(Map.Entry<Integer, Student> student : studentMap.entrySet()){
//            System.out.println(student.toString());
//        }
//        System.out.println("...........Set");
//        Set<Student> students = new HashSet<Student>();
//        students.add(student1);
//        students.add(student2);
//        students.add(student3);
//        students.add(student1);
//
//        for(Student student : students){
//            System.out.println(student.toString());
//        }
        Student student = new Student("Kien", 30, "HT");
        Student student1 = new Student("Nam", 26, "HN");
        Student student2 = new Student("Anh", 38, "HT" );
        Student student3 = new Student("Tung", 38, "HT" );

        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for(Student st : lists){
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(Student st : lists){
            System.out.println(st.toString());
        }


    }
}
