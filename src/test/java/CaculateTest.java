import com.tree.util.Calculate;
import com.tree.util.FileUtil;
import org.junit.jupiter.api.Test;

/**
 * @author lucifer
 */
public class CaculateTest {

    /**
     *  测试与自身查重
     */
    @Test
    public void orig(){
        String source = FileUtil.fileToString("/Users/maple/Desktop/test/orig.txt");
        String fake = FileUtil.fileToString("/Users/maple/Desktop/test/orig.txt");
        double res = Calculate.caculate(source,fake);
        assert res == 1;
    }

    /**
     *  测试与增加版查重
     */
    @Test
    public void orig_add(){
        String source = FileUtil.fileToString("/Users/maple/Desktop/test/orig.txt");
        String fake = FileUtil.fileToString("/Users/maple/Desktop/test/orig_0.8_add.txt");
        double res = Calculate.caculate(source,fake);
        assert res <= 1;
    }

    /**
     *  测试与删减版查重
     */
    @Test
    public void orig_del(){
        String source = FileUtil.fileToString("/Users/maple/Desktop/test/orig.txt");
        String fake = FileUtil.fileToString("/Users/maple/Desktop/test/orig_0.8_del.txt");
        double res = Calculate.caculate(source,fake);
        assert res <= 1;
    }

    /**
     *  测试
     */
    @Test
    public void orig_dis(){
        String source = FileUtil.fileToString("/Users/maple/Desktop/test/orig.txt");
        String fake = FileUtil.fileToString("/Users/maple/Desktop/test/orig_0.8_dis_1.txt");
        double res = Calculate.caculate(source,fake);
        assert res <= 1;
    }

}
