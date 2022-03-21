package pm;

public class AccessObj {
    public int p = 3;       // 다 접근 가능
    protected int p2 = 4;   // 같은 패키지 내에서만 접근 가능, 단 다른 패키지라도 상속 받은 경우에는 접근 허용
    int k = 2;              // default, 같은 패키지에서만 접근 가능
    private int i = 1;      // 자기 자신 클래스에서만 접근 가능
    // public > protected > default > private
}
