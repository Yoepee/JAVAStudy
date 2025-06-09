public class BizExam {
    public static void main(String[] args) {
        BizService biz = new BizService();

        try {
            biz.bizMethod(5);
            biz.bizMethod(-3);
        } catch (BizException e) {
            System.out.println(e.getMessage());
        }
    }
}
