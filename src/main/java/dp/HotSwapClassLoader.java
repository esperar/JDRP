package dp;

/**
 * 실행 클래스를 여러 번 로드하기 위한 클래스 로더
 * defineClass() 메서드를 공개하는 역할의 loadByte() 메서드는 외부에서 명시적으로 호출시에만 사용
 * 가상 머신에서 호출할 때는 여전히 loadClass() 메서드를 이용
 * 부모 위임 모델의 규칙에 따라 클래스 로드
 */
public class HotSwapClassLoader extends ClassLoader {

    public HotSwapClassLoader() {
        super(HotSwapClassLoader.class.getClassLoader());
    }

    public Class loadByte(byte[] classByte) {
        return defineClass(null, classByte, 0, classByte.length);
    }

}
