import com.yxz.studyforspring.bean.ColdKill;
import com.yxz.studyforspring.bean.SaveFlower;
import org.junit.Test;

/**
 * Created by YUEXINGZHONG on 2020/8/19 16:01
 */

public class IocTest {

    @Test
    public void test(){
        ColdKill coldKill = new ColdKill(new SaveFlower());
        coldKill.play();
    }


}
