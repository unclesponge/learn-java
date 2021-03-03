import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Students> studentList = new ArrayList<Students>();
        System.out.println("------欢迎来到学生管理系统------");
        Scanner sc = new Scanner(System.in);
        while (true){
            // 输入指令
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看所有学生");
            System.out.println("5.退出");
            System.out.print("请输入你的选择:");
            int order = sc.nextInt();
            if (order == 5){
                break;
            }
            switch (order){
                case 1:
                    // 添加学生
                    Students newStudent = new Students();
                    System.out.print("请输入学生学号:");
                    String sid = sc.next();
                    boolean isExist = checkSid(studentList, sid);
                    if (isExist){
                        System.out.println("已存在相同学号学生");
                        break;
                    }
                    newStudent.setSid(sid);
                    System.out.print("请输入学生姓名:");
                    String name = sc.next();
                    newStudent.setName(name);
                    System.out.print("请输入学生年龄:");
                    int age = sc.nextInt();
                    newStudent.setAge(age);
                    System.out.print("请输入学生居住地:");
                    String address = sc.next();
                    newStudent.setAddress(address);
                    studentList.add(newStudent);
                    System.out.println("添加成功");
                    System.out.printf("学号:%s | 姓名:%s | 年龄:%d岁 | 居住地:%s \n",
                            newStudent.getSid(), newStudent.getName(),
                            newStudent.getAge(), newStudent.getAddress());
                    break;
                case 2:
                    // 删除学生
                    System.out.print("请输入要删除的学生的学号:");
                    String delSid = sc.next();
                    if (studentList.size() == 0){
                        System.out.println("系统中无学生信息");
                        break;
                    }
                    for (int i=0; i<studentList.size(); i++){
                        Students delStudent = studentList.get(i);
                        if (delStudent.getSid().equals(delSid)){
                            studentList.remove(delStudent);
                            System.out.println("已删除");
                        } else {
                            System.out.println("输入错误");
                        }
                    }
                    break;
                case 3:
                    // 修改学生
                    System.out.print("请输入要删除的学生的学号:");
                    String updateSid = sc.next();
                    if (studentList.size() == 0){
                        System.out.println("系统中无学生信息");
                    }
                    if (checkSid(studentList, updateSid)){
                        for (Students updateStudent : studentList) {
                            if (updateStudent.getSid().equals(updateSid)) {
                                System.out.print("请输入学生姓名:");
                                String updateName = sc.next();
                                updateStudent.setName(updateName);
                                System.out.print("请输入学生年龄:");
                                int updateAge = sc.nextInt();
                                updateStudent.setAge(updateAge);
                                System.out.print("请输入学生居住地:");
                                String updateAddress = sc.next();
                                updateStudent.setAddress(updateAddress);
                                System.out.println("已修改");
                                break;
                            }
                        }}else {
                        System.out.println("输入错误,无此学生");
                    }
                    break;
                case 4:
                    // 查看所有学生
                    if (studentList.size() == 0){
                        System.out.println("系统中无学生信息");
                    }
                    for (Students printStudent : studentList) {
                        System.out.printf("| 学号:%s | 姓名:%s | 年龄:%d岁 | 居住地:%s |\n",
                                printStudent.getSid(), printStudent.getName(),
                                printStudent.getAge(), printStudent.getAddress());
                    }
                    break;
                default:
                    // 退出
                    System.out.println("无效的输入,请重新输入");
                    break;
            }
        }
    }
    private static boolean checkSid(ArrayList<Students> studentsArrayList, String sid){
        if (studentsArrayList.size() > 0){
            for (Students checkStudent : studentsArrayList){
                if (checkStudent.getSid().equals(sid)) {
                    return true;
                }
            }
        }
        return false;
    }
}
