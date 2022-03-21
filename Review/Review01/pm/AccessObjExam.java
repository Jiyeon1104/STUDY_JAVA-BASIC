package pm;

public class AccessObjExam{
    public static void main(String[] args) {
        AccessObj obj = new AccessObj();
        System.out.println(obj.p);
        System.out.println(obj.p2);     // 컴파일 오류 발생
        // System.out.println(obj.i);   // 컴파일 오류 발생
        System.out.println(obj.k);      // 컴파일 오류 발생
    }
}