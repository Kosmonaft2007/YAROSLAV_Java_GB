//package src.seminars.Kata.Block_2;
//
//public class Ex_2_5_7_1 {
//}
//
////    public Label checkLabels(final TextAnalyzer[] analyzers, final String text) {
////        for (int i = 0; i < analyzers.length; i++) {
////            final Label value = analyzers[i].processText(text);
////            if (value != Label.OK) {
////                return value;
////            }
////        }
////        return Label.OK;
////    }
//
//
//public abstract class KeywordAnalyzer implements TextAnalyzer {
//    protected abstract String[] getKeywords();
//
//    protected abstract Label getLabel();
//
//    public Label processText(String text) {
//        String[] keywords = getKeywords();
//        for (String keyword : keywords) {
//            if (text.contains(keyword)) {
//                return getLabel();
//            }
//        }
//        return Label.OK;
//    }
//}
//
//public class SpamAnalyzer extends KeywordAnalyzer {
//    private String[] keywords;
//
//    public SpamAnalyzer(String[] keywords) {
//        this.keywords = keywords;
//    }
//
//    @Override
//    protected String[] getKeywords() {
//        return keywords;
//    }
//
//    @Override
//    protected Label getLabel() {
//        return Label.SPAM;
//    }
//}
//
//public class NegativeTextAnalyzer extends KeywordAnalyzer {
//    private final String[] KEYWORDS = {":(", "=(", ":|"};
//
//    @Override
//    protected String[] getKeywords() {
//        return KEYWORDS;
//    }
//
//    @Override
//    protected Label getLabel() {
//        return Label.NEGATIVE_TEXT;
//    }
//}
//
//public class TooLongTextAnalyzer implements TextAnalyzer {
//    private int maxLength;
//
//    public TooLongTextAnalyzer(int limit) {
//        this.maxLength = limit;
//    }
//
//    @Override
//    public Label processText(String text) {
//        if (text.length() > maxLength) {
//            return Label.TOO_LONG;
//        } else {
//            return Label.OK;
//        }
//    }
//
//}